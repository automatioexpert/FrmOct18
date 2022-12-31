package rough;

import java.util.Properties;

import org.selenium.utils.PropertyUtils;

public class PropTest {

	public static void main(String[] args) {
		
	Properties prp=	PropertyUtils.propertyLoader("./src/test/resources/properties/config.properties");
		
		System.out.println(prp.getProperty("browser"));
	}
}
