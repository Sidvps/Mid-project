package Mid.Project.WeatherAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherApiResponse {
	private List<WeatherInfo> weather;
	private MainInfo main;

	// Getters and setters for weather and main

	public List<WeatherInfo> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherInfo> weather) {
		this.weather = weather;
	}

	public MainInfo getMain() {
		return main;
	}

	public void setMain(MainInfo main) {
		this.main = main;
	}
}