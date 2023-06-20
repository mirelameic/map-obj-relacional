# Museu - Tópicos Especiais de Banco de Dados

EP da disciplina Tópicos Especiais de Banco de Dados: criação de um modelo de Museu; utilizando Maven, ORM com hibernate.

## Estrutura do projeto

- `src/main/java/com/museubd`
    - `model`: camada que possui a lógica da aplicação
        - `bean/*.java`: classes que são as entidades do escopo do trabalho
        - `repository/Repository.java`: responsável por trocar informações com o SGBD e fornecer operações CRUD e de pesquisas
    - `Main.java`: manipulação livre do ORM

- `src/main/resources/META-INF`
    - persistence.xml: arquivo de configuração do Hibernate, JPA e banco de dados (H2) utilizado.

- `src/test/com/museubd/model/repository`
    - `RepositoryTest.java`: possuem os testes que atestam o funcionamento do código

## Modelo entidade relacionamento
![der](https://github.com/mirelameic/map-obj-relacional/assets/44716827/c5ef24bf-00ae-4421-8a94-418b8d7c4dce)
