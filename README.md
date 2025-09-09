# SysManTel - API de Gerenciamento para Telecomunicações - Backend

O **SysManTel** é o back-end de um Sistema de Gerenciamento de Ordens de Serviço, projetado especificamente para empresas de telecomunicações. Esta API RESTful foi construída como um projeto de portfólio para demonstrar competências em desenvolvimento back-end com Java e Spring Boot, aplicando conceitos de modelagem de dados, lógica de negócio e criação de endpoints.

## Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.5-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)

* **Java 17**
*  **Spring Boot 3.5.5**
    * Spring Web: Para criação dos controllers e endpoints REST.
    * Spring Data JPA: Para persistência de dados de forma simplificada.
* **Hibernate:** Implementação da JPA para mapeamento objeto-relacional.
* **MySQL:** Banco de dados relacional para armazenamento dos dados.
* **Maven:** Gerenciador de dependências e build do projeto.

## Sobre o Projeto
Este projeto nasceu de uma transição de carreira, unindo 9 anos de experiência em gestão de telecomunicações com o desenvolvimento de software moderno. O objetivo é criar uma ferramenta que resolve problemas reais do dia a dia de uma operação de telecom, como o gerenciamento de clientes, técnicos e ordens de serviço.

A API é a fundação deste sistema, responsável por toda a lógica de negócio e persistência de dados.

## Principais Funcionalidades
✅ Gerenciamento completo (CRUD) de Clientes, Usuários (Técnicos/Gestores) e Tipos de Serviço.

✅ Criação e atualização de Ordens de Serviço, com lógica para atribuição de status e data de abertura automáticos.

✅ Estrutura de dados relacional que conecta Ordens de Serviço a Clientes, Técnicos e Tipos de Serviço.

✅ API RESTful com endpoints claros e padronizados para todas as operações.

## Modelo de Dados
O sistema é modelado em quatro entidades principais:

User: Representa os funcionários que usam o sistema, com papéis de MANAGER ou TECHNICIAN.

Customer: Armazena os dados dos clientes da empresa.

ServiceType: Um catálogo dos tipos de serviço oferecidos (ex: Instalação, Reparo).

ServiceOrder: A entidade central que representa um chamado ou ordem de serviço, conectando um Customer, um User (técnico) e um ServiceType.

## Estrutura do Projeto
```bash
┣ 📂main
┃ ┣ 📂java
┃ ┃ ┗ 📂com
┃ ┃   ┗ 📂kadudev
┃ ┃     ┗ 📂SysManTel
┃ ┃       ┣ 📂Controller
┃ ┃       ┃ ┣ 📜CustomerController.java
┃ ┃       ┃ ┣ 📜ServiceOrderController.java
┃ ┃       ┃ ┣ 📜ServiceTypeController.java
┃ ┃       ┃ ┗ 📜UserController.java
┃ ┃       ┣ 📂Entities
┃ ┃       ┃ ┣ 📜Customer.java
┃ ┃       ┃ ┣ 📜ServiceOrder.java
┃ ┃       ┃ ┣ 📜ServiceOrderRole.java
┃ ┃       ┃ ┣ 📜ServiceType.java
┃ ┃       ┃ ┣ 📜User.java
┃ ┃       ┃ ┗ 📜UserRole.java
┃ ┃       ┣ 📂Repository
┃ ┃       ┃ ┣ 📜CustomerRepository.java
┃ ┃       ┃ ┣ 📜ServiceOrderRepository.java
┃ ┃       ┃ ┣ 📜ServiceTypeRepository.java
┃ ┃       ┃ ┗ 📜UserRepository.java
┃ ┃       ┣ 📂Service
┃ ┃       ┃ ┣ 📜CustomerService.java
┃ ┃       ┃ ┣ 📜ServiceOrderService.java
┃ ┃       ┃ ┣ 📜ServiceTypeService.java
┃ ┃       ┃ ┗ 📜UserService.java
┃ ┃       ┗ 📜SysManTelApplication.java
┃ ┗ 📂resources
┃   ┗ 📜application.properties
┗ 📂test
  ┗ 📂java
    ┗ 📂com
      ┗ 📂kadudev
        ┗ 📂SysManTel
          ┗ 📜SysManTelApplicationTests.java
```
## Endpoints da API

A seguir, a documentação dos principais endpoints disponíveis

### **Clientes** (/customers)
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET    | /customers | Retorna a lista de todos os clientes. |
| GET    | /customers/{id} | Busca um cliente pelo seu ID. |
| POST   | /customers | Cria um novo cliente. |
| PUT    | /customers/{id} | Atualiza os dados de um cliente existente. |
| DELETE | /customers/{id} | Remove um cliente pelo seu ID. |

### **Usuários** (/users)
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET    | /users | Retorna a lista de todos os usuários. |
| GET    | /users/{id} | Busca um usuário pelo seu ID. |
| POST   | /users | Cria um novo usuário. |
| PUT    | /users/{id} | Atualiza os dados de um usuário existente. |
| DELETE | /users/{id} | Remove um usuário pelo seu ID. |

### **Tipos de Serviço** (/servicetypes)
| Método | Endpoint | Descrição |
|--------|----------|----------|
| GET    | /servicetypes | Retorna a lista de todos os tipos de serviço. |
| GET    | /servicetypes/{id} | Busca um tipo de serviço pelo seu ID. |
| POST   | /servicetypes | Cria um novo tipo de serviço. |
| PUT    | /servicetypes/{id} | Atualiza os dados de um tipo de serviço existente.
| DELETE | /servicetypes/{id} | Remove um tipo de serviço pelo seu ID. |

### **Ordens de Serviço**  (/serviceorders)
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET    | /serviceorders | Retorna a lista de todas as ordens de serviço. |
| GET    | /serviceorders/{id} | Busca uma ordem de serviço pelo seu ID. |
| POST   | /serviceorders | Cria uma nova ordem de serviço. |
| PUT    | /serviceorders/{id} | Atualiza os dados de uma ordem de serviço existente. |
| DELETE | /serviceorders/{id} | Remove uma ordem de serviço pelo seu ID.

## Como Executar o Projeto

**Pré-requisitos**
* JDK 17
* Maven
* MySQL 8

**Instalação**

### 1. Clone o repositório:
```bash
git clone https://github.com/KaduSR/SysManTel
cd SysManTel
```
### 2. Configure o banco de dados:
* Crie um banco de dados no MySQL com o nome **SysManTel**
* Atualize as credenciais de acesso no arquivo ```src/main/resources/application.properties```:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/SysManTel
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
### 3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```
A API estará disponível para acesso em ```http://localhost:8080```.

## Próximos Passos

* [ ] Desenvolvimento do front-end em React com TypeScript.

* [ ] Implementação de um sistema de autenticação e autorização com Spring Security.

* [ ] Criação de endpoints de relatório (Fase 2).

* [ ] Escrever testes unitários e de integração.

## Autor

**Carlos Eduardo da Silva Ribeiro**

<a href="https://www.linkedin.com/in/kaduesr" target="_blank">
    <img src="https://img.shields.io/static/v1?message=LinkedIn&logo=linkedin&label=&color=0077B5&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="linkedin logo"  />
  </a>
    <a href="mailto:kaduesr@gmail.com" target="_blank">
    <img src="https://img.shields.io/static/v1?message=Gmail&logo=gmail&label=&color=D14836&logoColor=white&labelColor=&style=for-the-badge" height="25" alt="gmail logo"  />
  </a>