# Prova substituta

## Desafio

Utilizando o conhecimento adquirido na disciplina de Engineering
Software Development, desenvolva um backend utilizando a ferramenta Spring.
Esse backend deverá possuir quatro (4) APIs:
- Retornar todos os alunos cadastrados;
- Criação de um aluno;
- Edição de um aluno;
- Exclusão de um aluno.
  Para desenvolver esse backend será necessário conectar com um banco
  de dados, que pode ser relacional ou documental.
  O código deverá estar funcional e ser publicado em um Github público.
  Adicione a URL do Github na resolução do exercício.


## Collection Postman
CRUD testado via Postman, arquivo: [FIAP.postman_collection.json](FIAP.postman_collection.json)

## Rodando banco MYSQL local
```
docker pull mysql
docker run --env=MYSQL_ROOT_PASSWORD=batata123 -p 3306:3306 -d mysql:latest
```
