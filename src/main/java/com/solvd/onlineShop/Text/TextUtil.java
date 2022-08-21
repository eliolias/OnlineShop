package com.solvd.onlineShop.Text;

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


    public static void processFile() throws IOException {
        File readFile = new File("src/main/resources/article.txt");
        File writeFile = new File("src/main/resources/result.txt");
        String fileContents = FileUtils.readFileToString(readFile, StandardCharsets.UTF_8.name());
        List<String> fileWords = Arrays.asList(fileContents.split(" "));
        //Could use a set to avoid duplication??
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < fileWords.size(); i++) {
            int count = 0;
            String temp = null;
            for (int j = 0; j < fileWords.size(); j++) {
                if (fileWords.get(i).equals(fileWords.get(j))) {
                    temp = fileWords.get(i);
                    count++;
                }
            }
            if (count > 1) {
                lines.add(temp + "  " + count);
            }

        }
        FileUtils.writeLines(writeFile, lines);
        LOGGER.info("WRITING");
    }

    public static void main(String[] args) throws IOException {
        TextUtil.processFile();
    }
}
