package adidas;

import org.testng.annotations.BeforeClass;


import io.restassured.RestAssured;

public class FunctionalTest {

	    @BeforeClass
	    public static void setUp() {
	        String port = System.getProperty("server.port");
	        if (port == null) {
	            RestAssured.port = Integer.valueOf(8080);
	        }
	        else{
	            RestAssured.port = Integer.valueOf(port);
	        }
	        String basePath = System.getProperty("server.base");
	        if(basePath==null){
	            basePath = "/rest-garage-sample/";
	        }
	        RestAssured.basePath = basePath;

	        String baseHost = System.getProperty("server.host");
	        if(baseHost==null){
	            baseHost = "http://localhost";
	        }
	        RestAssured.baseURI = baseHost;

	    }

	}
