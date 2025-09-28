# Tarefa API - Spring Boot + MySQL

[![Java](https://img.shields.io/badge/Java-21-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-brightgreen)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9.2-red)](https://maven.apache.org/)

## Resumo do Projeto
API REST para gerenciamento de tarefas, desenvolvida em Spring Boot com persistência em MySQL. Permite criar, listar, atualizar e deletar tarefas, servindo como base prática para desenvolvimento backend.

## Tecnologias Utilizadas
- Java 21  
- Spring Boot 3.5.6  
- Spring Data JPA  
- MySQL  
- Maven  

## Estrutura do Projeto
- `src/main/java` → código fonte da aplicação  
- `src/main/resources` → arquivos de configuração  
- `.gitignore` → evita subir arquivos desnecessários ou sensíveis  

## Como Rodar o Projeto
1. Configure seu banco MySQL local (`tarefasdb`) e usuário.  
2. Crie um arquivo `application.properties` com suas credenciais:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tarefasdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update


3. Execute a aplicação via Maven:

./mvnw spring-boot:run


4. A API estará disponível em: http://localhost:8080/api/tarefas

## Endpoints

GET /api/tarefas → Lista todas as tarefas

POST /api/tarefas → Cria uma nova tarefa

PUT /api/tarefas/{id} → Atualiza uma tarefa existente

DELETE /api/tarefas/{id} → Remove uma tarefa


**PROJETO TOTALMENTE ACADÉMICO E COM O INTUITO APENAS DE COLOCAR EM PRÁTICA O CONTEUDO VISTO EM AULA**

