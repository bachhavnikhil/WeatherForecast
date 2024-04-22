package com.example.demo.Serivce.WeatherService;

import org.springframework.stereotype.Service;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class WeatherService {

    OkHttpClient client = new OkHttpClient();

    public String getForecastSummaryByLocationName(String locationName) throws IOException {


        Request request = new Request.Builder()
                .url("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + locationName + "/summary/")
                .get()
                .addHeader("X-RapidAPI-Key", "fe0895cc13mshc1b349eaae16619p19baabjsnc9458615c6ad")
                .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }

    public String getHourlyWeatherForecast(String location) throws IOException {
        Request request = new Request.Builder()
                .url("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + location + "/hourly/")
                .get()
                .addHeader("X-RapidAPI-Key", "fe0895cc13mshc1b349eaae16619p19baabjsnc9458615c6ad")
                .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }
}
