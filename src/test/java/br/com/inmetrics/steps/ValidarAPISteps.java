package br.com.inmetrics.steps;

import br.com.inmetrics.util.BaseRestService;
import groovyjarjarasm.asm.commons.Method;
import io.cucumber.java.en.Given;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ValidarAPISteps {
	private String endpoint;
	BaseRestService baseRestService = new BaseRestService();

	@Dado("o endpoint films API")
	public void o_endpoint_films_API() {

		endpoint = "http://swapi.co/api/films/";
	}

	@Quando("o usuario buscar o todos os filmes")
	public void o_usuario_buscar_o_todos_os_filmes() {

		baseRestService.response = RestAssured.request(Method.GET, "http://swapi.co/api/films/");
		System.out.println(Response.statusCode() == 200);

		ValidatableResponse validacao = Response.then();
		validacao.statusCode(200);
	}

	@Então("o endpointfilmes retorara apenas os filmes que o George Lucas o diretor")
	public void o_endpointfilmes_retorara_apenas_os_filmes_que_o_George_Lucas_é_diretor(
			io.cucumber.datatable.DataTable dataTable) {
			given()
			.when()
				.get("http://swapi.co/api/films/")
			.then()
				.statusCode(200)
			.body("director", containsString("George Lucas"))
			;
			

	}

	@Então("o endpointfilmes retorara apenas os filmes que o Rick McCallum e produtor")
	public void o_endpointfilmes_retorara_apenas_os_filmes_que_o_Rick_McCallum_é_produtor(
			io.cucumber.datatable.DataTable dataTable) {
			given()
			.when()
				.get("http://swapi.co/api/films/")
			.then()
				.statusCode(200)
			.body("producer", containsString("Rick McCallum"))
			;
	}
}
