package com.solvd.onlineShop.Text;

import java.nio.charset.Charset;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.solvd.onlineShop.Main;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextUtil {
    private final static Logger LOGGER = LogManager.getLogger(TextUtil.class);

    public static void processFile(String countedWord) throws IOException {
        File readFile = new File("src/main/resources/article.txt");
        File writeFile = new File("src/main/resources/result.txt");
        String fileContents = FileUtils.readFileToString(readFile, StandardCharsets.UTF_8.name());
        List<String> fileWords = Arrays.asList(fileContents.split(" "));
        List<String> lines = new ArrayList<>();
        long count = fileWords.stream().filter(word -> {
            String fixedWord = word
                    .replaceAll("!", "")
                    .replaceAll("`", "")
                    .replaceAll(",", "")
                    .replaceAll("'", "")
                    .replaceAll("\\.", "")
                    .replaceAll("\\?", "")
                    .toLowerCase();
            return fixedWord.equals(countedWord.toLowerCase());


        }).count();
        String result = countedWord + " - " + count;
        FileUtils.writeStringToFile(writeFile, result, (Charset) null);
        LOGGER.info("WRITING");
    }

    public static void main(String[] args) throws IOException {
        TextUtil.processFile("it");
    }
}
