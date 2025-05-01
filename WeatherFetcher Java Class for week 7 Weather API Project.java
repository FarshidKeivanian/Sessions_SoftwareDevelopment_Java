package com.example.weatherapiproject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class WeatherFetcher {
    public static void main(String[] args) {
        String apiKey = "e36feeb00537ef8418081042e6d0fc66"; // Replace with your actual OpenWeatherMap API key
        String city = "Sydney,AU";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());

            double temp = json.getJSONObject("main").getDouble("temp");
            double wind = json.getJSONObject("wind").getDouble("speed");
            String weather = json.getJSONArray("weather").getJSONObject(0).getString("description");

            System.out.println("Sydney Weather:");
            System.out.println("Temperature: " + temp + " °C");
            System.out.println("Wind Speed: " + wind + " m/s");
            System.out.println("Condition: " + weather);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
