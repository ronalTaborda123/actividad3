package com.second.task.time.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.second.task.time.domain.DayTime;

@Repository
public class InmemoryDayTimeRepository implements TimeRepository{

    private final List<DayTime> listDayTime=new ArrayList<>();
    private Integer id = 0;

    @Override
    public Integer insertOneDayTime(DayTime dayTime) {
        if(!listDayTime.isEmpty()){
            id =listDayTime.size();
        }
        listDayTime.add(id, dayTime);
        return id;
    }

    @Override
    public List<DayTime> findAllDayTime() {
        return listDayTime;
    }
}
