# Planner To Travels API

## Table of Contents

- [Overview](#overview)
- [Important Learnings](#important-learnings)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies](#technologies)
- [License](#license)
- [Contact](#contact)

## Overview

Backend of Planner, an application of travel management.

- You can ask to create a trip.
- List the place and possible activities you would like to do on this trip.
- You can invite your friends through their email, and also receive their confirmation.
- Enter the website where you made the reservation, and also include any other website such as the tour website.

## Important Learnings

- Creation of a Rest API using Spring Initializr
- Use of Insomnia
- Learned how to manage the H2 database
- Various lessons learned about Spring Boot

## Installation

### Prerequisites

- Java\jdk-17
- Maven
- IntelliJ IDEA
- Insomnia

### Steps


1. **Clone the repository:**
    ```bash
    $ git clone https://github.com/llucashenrique/Planner.git
    ```

2. **Navigate to the project directory:**
    ```bash
    $ cd src
    ```

3. **Install dependencies**
    ```bash
    $ npm install
    ```

4. **Compile the project:**
    ```bash
    $ javac Main.java
    ```

5. **Run the application:**
    ```bash
    $ java Main
    ```
    
 ```
# The API will be available at: localhost:8080.
```

### Usage 

#### Commands 

Open Insomnia to manipulate the database at http://localhost:8080

- Create a trip
- Confirm the trip
- Invite participant
- Confirm participant
- Register the link
- Retrieve the link

### Rest API

The client.http file contains calls to the endpoints, in case you have the REST Client extension installed.

### Technologies

- Java
- Spring Boot
- H2 Database
- Insomnia
- Maven

### License

This project is licensed under the MIT License.

### Contact

- Email: [lucasperes1591@gmail.com](mailto:lucasperes1591@gmail.com)
- GitHub: [llucashenrique](https://github.com/llucashenrique)
- Linkedin: [Lucas Lino](https://www.linkedin.com/in/lucas-linoo/)


 
