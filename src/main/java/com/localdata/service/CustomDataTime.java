package com.localdata.service;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class CustomDataTime {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:dd'\u0023\u0023'HH:mm:ss:SSSS", locale = "ru-RU" )
    private LocalDateTime dataTime;

    public CustomDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }
    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }
}
