package com.second.task.time.domain;


import lombok.Value;


@Value(staticConstructor = "from")
public class DayTime {

    Hour hour;
    Minute minute;
    Second second;
}
