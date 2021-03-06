package com.shiva.app;

import java.nio.charset.Charset;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@ComponentScan(
		basePackages="com.shiva.app", 
		excludeFilters=@ComponentScan.Filter(Configuration.class)
)
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
    	
    	SpringApplication app = new SpringApplication(Application.class);
    	app.setShowBanner(false);
    	app.run(args);
    }
    
    @Bean
    public HttpMessageConverter<String> responseBodyConverter(){
    	return new StringHttpMessageConverter(Charset.forName("UTF-8"));
    }
    
    @Bean
    public Filter characterEncodingFilter(){
    	CharacterEncodingFilter cFilter = new CharacterEncodingFilter();
    	cFilter.setEncoding("UTF-8");
    	cFilter.setForceEncoding(true);
    	return cFilter;
    }
}