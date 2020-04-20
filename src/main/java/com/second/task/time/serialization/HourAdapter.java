package com.second.task.time.serialization;

import java.lang.reflect.Type;

import com.google.gson.*;
import com.second.task.time.domain.DayTime;

public class HourAdapter implements JsonSerializer<DayTime> {


    @Override
    public JsonElement serialize(DayTime dayTime, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonMerchant = new JsonObject();

        jsonMerchant.addProperty("Hour", dayTime.getHour().getValue());
        jsonMerchant.addProperty("Minute", dayTime.getMinute().getValue());
        jsonMerchant.addProperty("Second", dayTime.getSecond().getValue());
        return jsonMerchant;
    }

}
