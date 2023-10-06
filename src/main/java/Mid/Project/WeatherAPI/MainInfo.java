//Author: Siddhartha V
package Mid.Project.WeatherAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainInfo {
	private Double temp;
	//default unit of temperature the api gives is in kelvin (celsius can also be selected)
	private Double humidity;

	// Getters and setters

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}
}