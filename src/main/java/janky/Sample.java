package janky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"janky"})
public class Sample {
	public static void main(String args[])
	{ 
		 SpringApplication.run(Sample.class,args);
	}
}
