package com.second.task.time.domain;

import com.second.task.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Second {
    Integer value;

    private Second(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 59);
        this.value = value;
    }
}
