# Museu - Tópicos Especiais de Banco de Dados

EP da disciplina Tópicos Especiais de Banco de Dados: criação de um modelo de Museu; utilizando Maven, ORM com hibernate.

## Estrutura do projeto

- `model`: camada que possui a lógica da aplicação
    - `bean`: classes que são as entidades do escopo do trabalho
    - `repository`: responsável por trocar informações com o SGBD e fornecer operações CRUD e de pesquisas
- `main`: manipulação livre do ORM
- `test`: possuem os testes que atestam o funcionamento do código
