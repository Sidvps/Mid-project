package Mid.Project.WeatherAPI;
//Author: Siddhartha V
import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "weather_data") //the name of the table in which the data is stored
public class WeatherData {
    @Id
    //Generated value is used to automatically initialise the primary key value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String weatherDescription;
    private Double temperature;
    private Double humidity;
}