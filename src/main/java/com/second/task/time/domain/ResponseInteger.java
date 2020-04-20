package com.second.task.time.domain;

import com.second.task.common.Preconditions;
import com.second.task.time.serialization.IntegerSerializable;
import lombok.Value;

@Value(staticConstructor = "of")
public class ResponseInteger implements IntegerSerializable {
    Integer value;

    private ResponseInteger(Integer value){
        Preconditions.checkNotNull(value);
        this.value = value;
    }

    @Override
    public Integer valuInteger() {
        return value;
    }
}
