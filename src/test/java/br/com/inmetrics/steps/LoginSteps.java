package br.com.inmetrics.steps;


import br.com.inmetrics.pageobjects.LoginPage;


import io.cucumber.java.pt.Dado;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	LoginPage Login = new LoginPage();
	LoginPage Realizarlogin = new LoginPage();
	LoginPage ValidarUsuario = new LoginPage();
	
	
	@Dado("que o usuario esteja na pagina de login Task it!")
	public void que_o_usuario_esteja_na_pagina_de_login_Task_it() {
		Login.toLogin();
	
	}

	@Quando("o usuario preerncher os seus dados para um novo acesso")
	public void o_usuario_preerncher_os_seus_dados_para_um_novo_acesso(io.cucumber.datatable.DataTable dataTable) {
	   Realizarlogin.toRealizaLogin("Teofilo", "teo123", "teo123456", "Hi, Teofilo");
	}

	@Então("o usuario estar� logado")
	public void o_usuario_estará_logado() {
		ValidarUsuario.toValidarUsuario();
	    
	}

}
