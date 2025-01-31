# Spring Web Demo
### Development Environment
* Java JDK 1.8+ (java --version, javac --version)
* Maven 3.2.5+
### Spring Initializr
* Type: *Maven*
* JDK & Java: *check version installed on your PC*
* Packaging: *JAR*
* Spring Boot version: *last version without snapshot*
* Dependencies: *Spring Web, Spring Data JPA, H2 Database*
### Connect with GIT
* create repository on github & copy link HTTPS
* git init
* git add .
* git commit -m "initial commit"
* git branch -M main
* git remote add origin link-from-github
* git push -u origin main
### Update GIT
* git add .
* git commit -m "la la la"
* git push
### JPA
* add domain package and create Entity POJOs
* create empty constructor and full constructor
* create getters and setters 
* add @entity to POJO classes from jakarta.persistence
* add id to POJOs and add @Id and @GeneratedValue(strategy = GenerationType.AUTO)
* also add getters ans setters to id
* add ManyToMany to first object @ManyToMany(mappedBy = "authors")
* add ManyToMany to second object @ManyToMany @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
* if OneToMany, then add @OneToMany to first object, and @OneToMany @JoinColumn(name = "publisher_id") to the second object
### Equality in Hibernate
* add equals and hashCode - only for id 
* add toString method through generator 
### Repository
* create repository package
* create DomainRepository interfaces and extend from CrudRepository 
* create bootstrap package 
* create bootStrapData class and implement from CommandLineRunner
* create private final variables from repository entities & constructor 
* implement run method where create dummy data
* create domain entities and save them through constructor 
* run and check the app 
### H2 Database 
* add dependency H2 Database (if not added before)
* in application.properties add: spring.h2.console.enabled=true
* go localhost:8080/h2-console
* print in the form JDBC URL from terminal 
* connect and then run any query 
### MVC Controller
* create controllers package 
* crete EntityController POJO in it and put @Controller annotation 
* create private final EntityRepository & constructor for it
* create method - public String getBooks(Model model) with mapping @RequestMapping("/books")
* inside the method - model.addAttribute("books", bookRepository.findAll());
* return page from resources/templates
### Thyme Leaf
* add new dependency to POM & update maven
  * <groupId>org.springframework.boot</groupId>
  * <artifactId>spring-boot-starter-thymeleaf</artifactId>
* create html5 page in resources/templates
* add - html lang="en" xmlns:th="http://www.thymeleaf.org"
* iteration from data
  * tr th:each="book : ${books}"
    * td th:text="${book.id}" 
    * td th:text="${book.title}"
* check localhost:8080/books 



