package com.second.task.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.second.task.time.domain.DayTime;
import com.second.task.time.domain.ResponseInteger;
import com.second.task.time.serialization.HourAdapter;
import com.second.task.time.serialization.IntegerValueAdapter;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){

        return  new GsonBuilder()
                .registerTypeAdapter(DayTime.class, new HourAdapter())
                .registerTypeAdapter(ResponseInteger.class, new IntegerValueAdapter<>(ResponseInteger::of))
                .create();
    }
}
