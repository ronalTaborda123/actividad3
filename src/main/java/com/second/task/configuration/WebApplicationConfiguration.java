package com.second.task.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;

import com.google.gson.Gson;


@Configuration
public class WebApplicationConfiguration implements WebMvcConfigurer {

    private final Gson gson;

    @Autowired
    public WebApplicationConfiguration(Gson gson) {
        this.gson = gson;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        GsonHttpMessageConverter messageConverter = new GsonHttpMessageConverter(gson);
        converters.add(messageConverter);
    }

}
