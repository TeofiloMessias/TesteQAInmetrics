#language: pt
#Version: 1.0
#Author:Teofilo Messias
@Login
Funcionalidade: Login

  @loginSucesso
  Cenario: Fazer login com credenciais validas
    Dado que o usuario esteja na pagina de login Task it!
    Quando o usuario preerncher os seus dados para um novo acesso
       | username    | login           | password 	|
       | Teofilo     | Teomefi5   		 | teo123456	|
       | Teofilo1    | Teomefi111		   | teo1234567	|
    Então o usuario estará logado 


    
   
    	
    
