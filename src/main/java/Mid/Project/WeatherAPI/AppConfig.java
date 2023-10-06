//Author: Siddhartha V
package Mid.Project.WeatherAPI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	//this is the bean definition-RestTemplate
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}