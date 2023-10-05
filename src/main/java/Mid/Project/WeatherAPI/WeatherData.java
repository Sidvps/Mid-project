package Mid.Project.WeatherAPI;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "weather_data")
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String weatherDescription;
    private Double temperature;
    private Double humidity;
}