package com.solvd.onlineShop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    private final static Logger LOGGER = LogManager.getLogger(Logging.class);

    public static void main(String[] args){
        LOGGER.info("INFO MESSAGE");
    }
}
