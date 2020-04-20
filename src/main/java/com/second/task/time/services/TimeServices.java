package com.second.task.time.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.task.time.domain.DayTime;
import com.second.task.time.repositories.TimeRepository;

@Service
public class TimeServices {

    private final TimeRepository timeRepository;

    @Autowired
    public TimeServices(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public Integer addDayTime(DayTime dayTime){
        return this.timeRepository.insertOneDayTime(dayTime);
    }

    public List<DayTime> getDayTime() {
        return timeRepository.findAllDayTime();
    }

}
