package Rest;

import org.apache.commons.lang3.RandomStringUtils;

public class RESTUtils {
	
	public static String getFirstname() {
		String generateString = RandomStringUtils.randomAlphabetic(1);
		return ("morpheus" +generateString);
	}

	public static String getLastname() {
		String generateString = RandomStringUtils.randomAlphabetic(1);
		return ("morpheus" +generateString);
	}

	public static String getEmail() {
		String generateString = RandomStringUtils.randomAlphabetic(1);
		return ("morpheus" +generateString);
	}

	
	public static String getjob() {
		String generateString = RandomStringUtils.randomAlphabetic(1);
		return ("morpheus" +generateString);
	}
    
	public static String getid() {
		String generateString = RandomStringUtils.randomNumeric(1);
		return ("morpheus" +generateString);
	}

	
	}

