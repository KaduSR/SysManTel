# SysManTel - Backend

Este repositório contém o backend do **SysManTel**, um Sistema de Gerenciamento para Telecomunicações.

**Status:** Projeto em fase inicial de desenvolvimento. O frontend será construído em um repositório separado.

## Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.5-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)

## Como Executar o Projeto

### Pré-requisitos

* JDK 17
* Maven
* MySQL 8

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/KaduSR/SysManTel
    cd SysManTel
    ```

2.  **Configure o banco de dados:**
    * Crie um banco de dados no MySQL com o nome `SysManTel`.
    * Atualize as credenciais de acesso no arquivo `src/main/resources/application.properties`:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/SysManTel
        spring.datasource.username=seu_usuario
        spring.datasource.password=sua_senha
        ```
    > **Aviso de Segurança:** Nunca envie suas credenciais para o repositório. Em produção, use variáveis de ambiente ou um cofre de segredos.

3.  **Execute a aplicação:**
    ```bash
    ./mvnw spring-boot:run
    ```

A API estará disponível para acesso em `http://localhost:8080`.

---
