//Author: Siddhartha V
package Mid.Project.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//path/mapping given to the whole controller
@RequestMapping("/weather")
public class WeatherController {
	private final WeatherService weatherService;
	@Autowired
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	//path/mapping given to the Get method
	@GetMapping("/current/{location}")
	public String getCurrentWeather(@PathVariable String location) {
		//this is defined in the service class to fetch and save data
		weatherService.fetchAndSaveWeatherData(location);
		return "Weather data for location " + location + " fetched and saved.";//response when a request is sent(in this project we use postman to send request)
	}
}