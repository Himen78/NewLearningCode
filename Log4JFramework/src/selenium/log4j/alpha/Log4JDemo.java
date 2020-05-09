package selenium.log4j.alpha;

import org.apache.logging.log4j.*;

public class Log4JDemo {
	
	private static Logger log = LogManager.getLogger(Log4JDemo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		log.debug("This is debug Message");
		log.info("This is infromation message in Log4J");
		log.error("This is error message in log4j");
		log.fatal("This is fatal error message");
		
	}

}
