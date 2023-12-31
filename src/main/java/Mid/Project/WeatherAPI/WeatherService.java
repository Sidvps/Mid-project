//Author: Siddhartha V
package Mid.Project.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	@Value("${openweathermap.api.key}") //api key that is given in the application properties
	private String apiKey;

	private final WeatherRepository weatherRepository;
	//RestTemplate is used for HTTP requests
	private final RestTemplate restTemplate;
	
	@Autowired
	public WeatherService(WeatherRepository weatherDataRepository, RestTemplate restTemplate) {
		this.weatherRepository = weatherDataRepository;
		this.restTemplate = restTemplate;
	}

	public void fetchAndSaveWeatherData(String location) {
		String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + apiKey;
		//exception handling if there is an exception is fetching the data from the api
		try {
			ResponseEntity<WeatherApiResponse> responseEntity = restTemplate.getForEntity(apiUrl,
					WeatherApiResponse.class);

			if (responseEntity.getStatusCode().is2xxSuccessful()) {
				WeatherApiResponse response = responseEntity.getBody();

				if (response != null) {
					WeatherData weatherData = new WeatherData();
					weatherData.setLocation(location);
					weatherData.setWeatherDescription(response.getWeather().get(0).getDescription());
					weatherData.setTemperature(response.getMain().getTemp());
					weatherData.setHumidity(response.getMain().getHumidity());
					weatherRepository.save(weatherData);
				}
			} else {
				//err is the error message shown in case of a error to fetch the data
				System.err.println(
						"Error: Unable to fetch weather data. Status code: " + responseEntity.getStatusCodeValue());
			}
		} catch (Exception e) {
			System.err.println("Error: An exception occurred while fetching weather data: " + e.getMessage());
		}
	}
}