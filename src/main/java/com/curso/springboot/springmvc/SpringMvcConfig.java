package com.curso.springboot.springmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({	
	@PropertySource("classpath:config/values.properties")
})
public class SpringMvcConfig {

}
