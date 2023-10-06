//Author: Siddhartha V
package Mid.Project.WeatherAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherInfo {
	private String description;

	// Getters and setters

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}