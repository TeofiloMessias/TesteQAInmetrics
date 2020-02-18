package br.com.inmetrics.util;

import org.openqa.selenium.remote.Response;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseRestService {
		public Response response;
		public RequestSpecification request;
		public BaseRestService() {
			super();
			request = RestAssured.given();
		}

}
