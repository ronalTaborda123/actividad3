package com.second.task.time.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.task.time.domain.*;
import com.second.task.time.services.TimeServices;

@RestController
@RequestMapping("/api/v1")
public class HourController {

    private final TimeServices services;

    public HourController(TimeServices services) {
        this.services = services;
    }

    @GetMapping("/hora")
    public List<DayTime> getHora() {

        return services.getDayTime();
    }

    @PostMapping
    public ResponseInteger addDayTime(){

        LocalTime date = LocalTime.now();
        Hour hour = Hour.of(date.getHour());
        Minute minute = Minute.of(date.getMinute());
        Second second = Second.of(date.getSecond());

        return ResponseInteger.of(services.addDayTime(DayTime.from(hour, minute,second )));
    }
}

