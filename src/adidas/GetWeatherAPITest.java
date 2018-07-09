package adidas;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.given;

public class GetWeatherAPITest {

	@Test
	public void getWeaterForecastByCityID() {
		given().get("http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=2a6eeef29cb68ad9e69e4f19386869ae")
				.then().statusCode(200).log().all();
		System.out.println("GET request sent succesfully");
	}

	@Test
	public void getWeatherByCityID() {
		given().get("http://api.openweathermap.org/data/2.5/weather?id=2172797&APPID=2a6eeef29cb68ad9e69e4f19386869ae")
				.then().statusCode(200).log().all();
		System.out.println("Weather for Belgrade succesfully displayed");
	}

	@Test
	public void testWeatherInBelgrade() {
		given().get("http://api.openweathermap.org/data/2.5/weather?id=2172797&APPID=2a6eeef29cb68ad9e69e4f19386869ae")
				.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().all();
		System.out.println("Weather for Belgrade succesfully displayed");
	}

	@Test
	public void getWeatherDisplayed() {
		RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather?id=2172797&APPID=2a6eeef29cb68ad9e69e4f19386869ae";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();

		io.restassured.response.ResponseBody body = response.getBody();

		System.out.println("Response Body is: " + body.asString());
		if (body.asString().contains("Belgrade")) {
			System.out.println("Belgrade weather is displayed in JSON");
		}
	}
}
