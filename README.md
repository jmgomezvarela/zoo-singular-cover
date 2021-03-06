# zoo-singular-cover exercise (SOLID & JUnit & Jacoco & Dessign patterns)

Based on the SOLID principles and TDD the project allows to simulate a Zoo where animals do and break friendship every day.

## Technologies

* Java 1.8

```
It give me the chance to use Lambda expressions and the Stream API.
```

* LogBack 1.2.3

```
To add logging in the application, note: The logback.xml is configured just to write on the Java Console, 
but it is simple to change to write to a file.
```

* JUnit 4.12

```
To Perform the unit tests.
```

* Jacoco 0.7.9

```
Jacoco provides tools to messure the code coverage and also create repots about the status of each Java
method, the idea is a coverage ratio better than the project have today, but the idea of coverage all the classes method does not give more value to the project at the moment. I know in a real project this is really important.
```


## Design

The Challenge is to design a solution adaptable to future changes and reusable but in a simple design. Using the SOLID principles and TDD, thinking in a posible future change that the model have to be stored in a database and also a chance of new user cases or changes in the bussiness scale, with the idea to minimize the impact of future changes, the animals class like Dog, Chicken and Parrot extends from Animal class and implements the IPrintable class. The model was thinking in the code reuse and a adaptive software development, programming agaist interfaces and with an logic hierarchy.

## Developed practices

The combination of 3 patterns had been used to development the app.

* Factory 
```
To provide differents intances of Dog, Chicken and Parrot depending of the request from the client.
```

* Singleton
```
To have only one instance of the class Util in the whole project.
```

* Strategy

```
To apply the relationship change in case the context indicates the conditions goes to add a new animal friend or break the friendship. If tomorrow the rules in the zoo change the impact of the change will be minimal for the project and easy to change the app behavior. The Single 
responsibility principle and the open/closed principle are guaranteed.
```


## Running the app and the tests

I used Maven, for this reason to run the test is a mandatory tool.

### Steps to run the app:

1. Clone or Download the repo
2. Navigate to the root folder of the repo
3. Using a terminal run the command (or any IDE configuration): **mvn package exec:java -D"exec.mainClass=com.es.singular.cover.zoo.use.ZooUseMain"**

The Main menu will show up:

![alt text](https://github.com/jmgomezvarela/zoo-singular-cover/blob/master/src/resources/menuExample.png)


### Steps to run the tests and get the test coverage report:

1. Navigate to the root folder of the repo
2. Using a terminal run the command (or any IDE configuration): **mvn clean test**
3. The reports will be generated in zoo-singular-cover/target/site/jacoco-unittest/index.html
