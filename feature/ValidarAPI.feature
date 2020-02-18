#language: pt
#Version: 1.0
#Author: Teofilo Messias
#Encoding: UTF-8
@API 
Funcionalidade: Filmes API - Status code 

 Cenario: Validar conteúdo do campo title trazendo apenas os filmes que contenha o George Lucas como diretor
    Dado o endpoint films API
    Quando o usuario buscar o todos os filmes
    Então o endpointfilmes retorará apenas os filmes que o George Lucas é diretor
      | director         | Status Code |
      | George Lucas     | GET  			 |

    Cenario: Validar conteúdo do campo title trazendo apenas os filmes que contenha o Rick McCallum como produtor
    Dado o endpoint films API
    Quando o usuario buscar o todos os filmes
    Então o endpointfilmes retorará apenas os filmes que o Rick McCallum é produtor
      | produtor         | Status Code |
      | Rick McCallums   | GET  			 |
     