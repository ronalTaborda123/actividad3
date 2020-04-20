package com.second.task.time.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.second.task.time.domain.DayTime;

@Repository
public interface TimeRepository {
    Integer insertOneDayTime(DayTime dayTime);
    List<DayTime>findAllDayTime();
}
