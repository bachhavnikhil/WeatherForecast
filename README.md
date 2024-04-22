# WeatherForecast
Added Forecast API's with JWT Token.

# Description
This project integrates a weather forecast functionality using a third-party API to provide real-time weather information for various locations. The application allows users to access weather forecast summaries and hourly details for specific Locations.

# Features
1.Weather Forecast Summary: Retrieve a summary of the weather forecast for a specific location.
2.Hourly Weather Forecast Details: Get detailed hourly weather forecast information for a particular location.

# Third-Party API Integration
The weather forecast functionality is implemented using a third-party API to fetch weather data. The API provides endpoints for retrieving weather forecast summaries and hourly details based on location.

# JWT Authentication
This project implements JWT (JSON Web Token) authentication to secure the weather forecast endpoints. Users are required to authenticate themselves by providing valid credentials to access the weather forecast functionality.

# Endpoints

# Summary Endpoint
  URL: http://localhost:8081/weather/summary?locationName= 
  Method: GET
  Description: Retrieves a summary of the weather forecast for a specific Location.
  Authentication: JWT token required.
  
# Hourly Forecast Endpoint
  URL: http://localhost:8080/weather/hourly?locationName=
  Method: GET
  Description: Provides hourly weather forecast details for a particular location.
  Authentication: JWT token required.

# Generating JWT token
  URL: http://localhost:8081/auth/generateToken
  Method: POST
  Description: Can generate the jwt with proper username and password.
  Authentication: User credentials are required.

# Usage

1.Authentication: Users need to authenticate themselves by logging in and obtaining a JWT token.
2.Accessing Weather Forecast:
  Use the JWT token obtained during authentication to access the weather forecast endpoints.
  Provide the required parameters to retrieve the desired weather forecast information.


  
 

  
