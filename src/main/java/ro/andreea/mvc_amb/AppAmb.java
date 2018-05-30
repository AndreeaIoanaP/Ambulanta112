package ro.andreea.mvc_amb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AppAmb  extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppAmb.class);
	}
	
	public static void main( String[] args )
    {
    	SpringApplication.run(AppAmb.class, args);
    }
}
