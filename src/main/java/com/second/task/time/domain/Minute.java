package com.second.task.time.domain;

import com.second.task.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minute {
    Integer value;

    private Minute(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 59);
        this.value = value;
    }
}
