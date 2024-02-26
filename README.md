# SpringBoot-Basic-Knowledge
This small project was made to show a basic example of a SpringBoot project and how it works.

---

**Steps to make**

1. Build the Spring project
2. Change the application.properties in src/main/resources to adapt it to you
3. Create the the */controller*, */entities*, */repository* and */service* packages from the parent one
4. Create your entities and the relation between them
5. Create the repositories extending form JpaRepository
6. Create your services (or a generic one)
7. Implement your services in the classes
8. Create your controllers
9. Run the project and check if the tables and columns have been built correctly
10. Enter data
11. Check if the controllers work using Postman or other tool

---

>[!NOTE]
>This project was made using Spring Tool Suite 4 in Eclipse.
>The Database used was MySQL executed in a local machine.

>[!IMPORTANT]
>In order to make build the project correctly you need to use the next dependencies:
>Lombok.
>MySQL Driver.
>Spring Boot DevTools.
>Spring Data JPA.
>Spring Web.

>[!TIP]
>If you dont want to create a a Service interface for each entity,
>you can create a Generic one like the one that is in the /service folder.
>But make sure you implement it correctly in the class replacing <T> with
>the name of the entity used.

