package pe.edu.galaxy.training.java.ms.sc.ventas.msventasgestiondescuentos.configuration;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfigutation {

	public GlobalConfigutation() {
		
	}
	
	@Bean
	public JsonMapper getJsonMapper() {
		return new JsonMapper();
	}

}
