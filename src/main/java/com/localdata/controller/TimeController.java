package com.localdata.controller;

import com.localdata.service.CustomDataTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("/time")
    public CustomDataTime getCurrentDataTime() {
        return new CustomDataTime(LocalDateTime.now());
    }
}
