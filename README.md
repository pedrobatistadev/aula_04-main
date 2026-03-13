# aula_04-main
# Gerenciador de Tarefas

Aplicação web desenvolvida com **Spring Boot** e **Thymeleaf** para gerenciamento de tarefas.
O sistema permite criar, visualizar, editar, excluir e marcar tarefas como concluídas.

## Funcionalidades

* Criar nova tarefa
* Listar tarefas cadastradas
* Editar tarefas
* Excluir tarefas
* Alternar status da tarefa (pendente / concluída)
* Filtrar tarefas por status (todas, pendentes ou concluídas)
* Visualizar contador de tarefas

## Tecnologias Utilizadas

* Java
* Spring Boot
* Thymeleaf
* Maven

## Como executar o projeto

### 1. Clonar o repositório

```bash
git clone <URL_DO_REPOSITORIO>
```

### 2. Acessar a pasta do projeto

```bash
cd aula_04-main
```

### 3. Compilar o projeto com Maven

```bash
mvn clean install
```

### 4. Executar a aplicação

```bash
mvn spring-boot:run
```

### 5. Acessar no navegador

Abrir o navegador e acessar:

```
http://localhost:8080/tarefas
```

## Estrutura do Projeto

```
src/main/java/com/biopark/tarefas
 ├── controller
 ├── service
 ├── repository
 └── model

src/main/resources/templates
 └── tarefas
      ├── lista.html
      └── formulario.html
```

## Autor

Pedro Batista


