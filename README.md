# Product Listing API

Spring Boot REST API for managing products with PostgreSQL, Swagger UI, and Basic Authentication.

--------------------------------------------------

TECH STACK
- Java 17+
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Swagger OpenAPI
- Spring Security (Basic Auth)
- Maven

--------------------------------------------------

PROJECT STRUCTURE

src/main/java/com/example/ProductListing

- controller
- service
- repository
- model
- exception
- security

--------------------------------------------------

SETUP INSTRUCTIONS

1. Clone Repository

git clone https://github.com/YOUR_USERNAME/product-listing-api.git
cd product-listing-api

--------------------------------------------------

2. Configure Database

Open application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/productdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Create database in PostgreSQL:

  CREATE DATABASE ProductListing;

--------------------------------------------------

3. Run Application

mvn spring-boot:run

Server runs on:
http://localhost:8080

--------------------------------------------------

SWAGGER API DOCS

Open in browser:

http://localhost:8080/swagger-ui/index.html

--------------------------------------------------

LOGIN (Basic Auth)

username: admin  
password: admin123

Click Authorize in Swagger and enter credentials.

--------------------------------------------------

API ENDPOINTS

Create Product  
POST /api/v1/products

{
  "productName": "Laptop",
  "createdBy": "Sumit"
}

Get All Products  
GET /api/v1/products

Get Product By ID  
GET /api/v1/products/{id}

Update Product  
PUT /api/v1/products/{id}

Delete Product  
DELETE /api/v1/products/{id}

--------------------------------------------------

BUILD JAR

mvn clean package

Run jar:

java -jar target/ProductListing-0.0.1-SNAPSHOT.jar

--------------------------------------------------

AUTHOR
Sumit Haral

--------------------------------------------------

NOTES

- Swagger enabled for API testing
- Uses Basic Authentication
- PostgreSQL required
- Tables auto-created via JPA

--------------------------------------------------

HOW TO USE

1. Clone project  
2. Setup PostgreSQL DB  
3. Run app  
4. Open Swagger  
5. Login using admin/admin123  
6. Test APIs

--------------------------------------------------

RESULT

The application was successfully developed and tested.
All REST APIs are working as expected with:
1. Basic Authentication
2. CRUD operations on Products
3. PostgreSQL database integration
4. Swagger UI documentation support
API testing results and execution outputs can be viewed in the Screenshot folder available in the main branch of this repository.
