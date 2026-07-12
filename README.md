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

