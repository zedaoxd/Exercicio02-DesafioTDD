# Desafio TDD

## Sobre o projeto
Este é o segundo desafio do **Bootcamp Spring** da [DevSuperior](https://devsuperior.com.br/cursos) cuja aulas estão sendo ministradas pelo profeddor [Nelio Alves](https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br).
O presente desafio consistia em implementar todas as funcionalidades necessárias para que os teses já implementados passassem no projeto. 

Tem 7 testes diferentes impletados, dentre os quais foi testado: 
- Se a busca estava vindo ordenada através do metódo findAll, retornando Ok (200);
- Se o insert estava inserindo dados no banco quando o Id era null, retornando Created (201);
- Se o delete deletava corretamente retornando No Content (204);
- Se o delete retornava o erro Not Found (404), quando tentava deletar algo que não existia no banco;
- Se o delete retornava o erro Bad Request (400), quando tentava deletar algo que estava sendo referenciado por outra chave estrangeira;
- Se o update fazia o update quando o Id existia no banco, retornando Ok (200);
- Se o update retornava Not Found (404) quando o id não existia.

## Modelo Conceitual
![Screenshot_1](https://user-images.githubusercontent.com/55067151/190511364-22fcc1f8-badd-49fc-a3d7-3129fbef944d.png)

## Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Como executar o projeto

Pré-requisitos: Java 11
- Clone o projeto
```bash
# clonar repositório
git clone https://github.com/zedaoxd/Exercicio02-DesafioTDD.git
```
- Importe na sua IDE Java
- Clique em Run Tests

## Autor

[Bruno Lessa Ferraz](https://www.linkedin.com/in/bruno-lessa-ferraz/)

