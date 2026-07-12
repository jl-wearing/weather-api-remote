# **Weather-API Project**
<img width="3460" height="2036" alt="weather-api" alt="System Design" src="https://github.com/user-attachments/assets/52f296cd-47b0-4935-9d2d-c487defaa9bb" />

## **Outcomes for the project**
- To build a working weather-api
- To handle exceptions for the common cases
- To apply logging on method execution
- To test the endpoints through Postman
- To learn and apply Docker concepts
- *To implement test cases using JUnit


## **API Specification** ##
### GET /api/weather/{city}
Returns the weather as application/json.

Things to consider:

- what if the city doesn't exist?
- what if there are more cities with the same name?
- what if either external api is down?
- what if the format of the request is incorrect? (e.g. wrongly formatted, incorrect data types, etc.)

### GET http://api.openweathermap.org/geo/1.0/direct 
Returns the latitudes and longitudes for the given city.

Request Parameters:
- q as the city
- limit as the number of results we want to obtain, mainly because there may be numerous cities with the same name.
- appid as the api-key

Things to consider:

- what if the openweather api is down?
- what if the format of the request is incorrect?

### GET https://api.openweathermap.org/data/2.5/weather
Returns the weather for that city.

Request parameters:
- lat represents the latitudes
- lon represents the longitudes
- appid as the api-key