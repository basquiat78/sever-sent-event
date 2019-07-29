package io.basquiat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/**
 * CORS Configuration
 * created by basquiat
 *
 */
@Configuration
public class CORSConfiguration implements WebFluxConfigurer {

	/**
	 * 그냥 다 허용하자. 테스트니깐...
	 */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("*");
    }
    
}