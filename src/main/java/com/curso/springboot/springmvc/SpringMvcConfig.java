package com.curso.springboot.springmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({	
	@PropertySource(value="classpath:config/values.properties", encoding="UTF-8")
})
public class SpringMvcConfig {

}
