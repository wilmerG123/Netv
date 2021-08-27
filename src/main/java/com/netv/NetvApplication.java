package com.netv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@SpringBootApplication
@Configuration
public class NetvApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetvApplication.class, args);
	}

	/**
	 * metodo agregado para solucionar el: Could not write JSON: could not initialize proxy no Session; nested exception is
	 * com.fasterxml.jackson.databind.JsonMappingException: could not initialize proxy
	 * 
	 * solucion segun https://programmer.group/solution-of-spring-boot-jpa-entity-jackson-serialization-triggering-lazy-load.html
	 * 
	 * @return
	 */
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		ObjectMapper mapper = converter.getObjectMapper();
		Hibernate5Module hibernate5Module = new Hibernate5Module();
		mapper.registerModule(hibernate5Module);
		return converter;
	}

}
