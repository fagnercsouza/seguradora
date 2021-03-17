# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postgre

## Front end
- HTML / CSS / JS / TypeScript
- Angular

# Como executar o projeto

## Banco de Dado
Pré-requisito: Docker

```bash
docker run --name db_seguradora -d -p 5432:5432 -e POSTGRES_PASSWORD=root -e POSTGRES_DB=seguradora postgres
```

## Back end
Pré-requisitos: Java 8

```bash
# clonar repositório
git clone https://github.com/fagnercsouza/seguradora.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm

```bash
# entrar na pasta do projeto front end web
cd frontend

# instalar dependências
npm install

# executar o projeto
npm start
```
http://localhost:4200/

# Autor

Fagner Cicero de Souza

https://www.linkedin.com/in/fagner-souza/
