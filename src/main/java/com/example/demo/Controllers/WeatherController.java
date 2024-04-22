package com.example.demo.Controllers;

import com.example.demo.Serivce.WeatherService.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WeatherController {

    private static final Logger log = LoggerFactory.getLogger(WeatherController.class);
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/summary")
    public ResponseEntity<String> getForecastSummaryByLocationName(@RequestParam String locationName) {
        try {
            String forecastSummary = weatherService.getForecastSummaryByLocationName(locationName);
            return ResponseEntity.ok(forecastSummary);

        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }


    @GetMapping("/weather/hourly")
    public ResponseEntity<String> getHourlyWeatherForecast(@RequestParam String locationName) {
        try {
            String forecast = weatherService.getHourlyWeatherForecast(locationName);
            return ResponseEntity.ok(forecast);
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

}
