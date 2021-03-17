# Criação Banco de Dados com docker
**COMO CRIAR O BANCO**

~~~
docker run --name db_seguradora -d -p 5432:5432 -e POSTGRES_PASSWORD=root -e POSTGRES_DB=seguradora postgres
~~~

**COMO ACESSAR O BANCO VIA TERMINAL**

~~~
docker exec -it db_seguradora psql -U postgres -h localhost -W
~~~
**POPULANDO BANCO DE DADOS**

acessar arqui database.sql no diretório resources
