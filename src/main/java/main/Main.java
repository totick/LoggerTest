package main;

import org.apache.log4j.Logger;

public class Main {

	private final static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		String message = "Could not find user in cockpit";
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug: " + message);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info: " + message);
		}
		
		logger.warn("This is warn: " + message);
		logger.error("This is error: " + message);
		logger.fatal("This is fatal: " + message);
	}

}
