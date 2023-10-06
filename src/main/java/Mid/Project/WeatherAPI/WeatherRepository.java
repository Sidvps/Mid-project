//Author: Siddhartha V
package Mid.Project.WeatherAPI;

import org.springframework.data.jpa.repository.JpaRepository;
//defining repository, in this case we are using JPA repository and other alternative would be CRUD Repository
public interface WeatherRepository extends JpaRepository<WeatherData, Long> {
}