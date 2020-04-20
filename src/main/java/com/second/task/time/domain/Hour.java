package com.second.task.time.domain;

import com.second.task.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hour {
    Integer value;

    private Hour(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 23);
        this.value = value;
    }
}
