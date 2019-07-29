package io.basquiat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.ViewResolverRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.result.view.freemarker.FreeMarkerConfigurer;

/**
 * 
 * WebFlux FreeMarker Template 설정
 * 
 * created by basquiat
 *
 */
@Configuration
public class WebfluxConfiguration implements WebFluxConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.freeMarker();
	}

	@Bean
	public FreeMarkerConfigurer freeMarkerConfigurer() {
		FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
		configurer.setTemplateLoaderPath("classpath:/templates");
		return configurer;
	}

}
