package Mid.Project.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	private final WeatherService weatherService;

	@Autowired
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@GetMapping("/current/{location}")
	public String getCurrentWeather(@PathVariable String location) {
		weatherService.fetchAndSaveWeatherData(location);
		return "Weather data for location " + location + " fetched and saved.";
	}
}