package org.example;
import org.apache.log4j.helpers.Loader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private   static Logger logger = LoggerFactory.getLogger(Main.class);

   private static org.apache.log4j.Logger lg = org.apache.log4j.Logger.getLogger(org.apache.log4j.chainsaw.Main.class);
    public static void main(String[] args) {


        logger.info("Hello this is working");
        logger.debug("Debug is on");
        logger.warn("Read it carefully");
        logger.error("This is a test so chill out !!!");

        lg.info("Hello java");
        lg.error("ok");
        lg.trace("trace is done");
        System.out.printf("Hello and welcome!");
    }
}