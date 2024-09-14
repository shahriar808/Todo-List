# To-Do List Application

A simple to-do list application built with Spring Boot and Thymeleaf. This application allows users to manage tasks, including adding new tasks, editing existing tasks, viewing task details, and deleting tasks. Additionally, tasks can be marked as completed or remaining, and users can view filtered lists of all, completed, or remaining tasks.

## Features

- **Add a New Task**: Users can add new tasks with details like name, description, priority, and completion status.
- **Edit an Existing Task**: Users can edit the details of a task and update its completion status.
- **View Task Details**: View detailed information for individual tasks.
- **Delete a Task**: Remove a task from the list.
- **View All Tasks**: Display a list of all tasks, with options to edit, delete, or view details.
- **View Completed Tasks**: Filter and view a list of completed tasks.
- **View Remaining Tasks**: Filter and view a list of tasks that are yet to be completed.

## Technology Stack

- **Backend**: Spring Boot
- **Frontend**: Thymeleaf, Bootstrap
- **Database**: H2 (In-memory)
- **Java Version**: 21+
- **Build Tool**: Maven

## Prerequisites

- Java 21 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse) with Spring Boot support

## Setup and Installation

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/your-username/todo-list-app.git
    cd todo-list-app
    ```

2. **Build the Project**:
    Navigate to the project's root directory and run:
    ```bash
    mvn clean install
    ```

3. **Run the Application**:
    Execute the following command to start the application:
    ```bash
    mvn spring-boot:run
    ```
    The application will start on `http://localhost:8080`.

4. **Access the Application**:
    - Open a web browser and go to `http://localhost:8080/tasks` to view the list of tasks.


## Usage

- **Add a New Task**: Navigate to `/tasks/add` to add a new task.
- **Edit a Task**: On the tasks list page (`/tasks`), click "Edit" next to a task to modify its details.
- **View Task Details**: Click "View" on the tasks list page to see detailed information about a task.
- **Delete a Task**: Click "Delete" to remove a task from the list.
- **Filter Tasks**: Use the buttons on the `/tasks` page to filter between all tasks, completed tasks, and remaining tasks.

## REST Endpoints

| Method | Endpoint              | Description                   |
|--------|-----------------------|-------------------------------|
| GET    | `/tasks`              | View all tasks                |
| GET    | `/tasks/completed`    | View completed tasks          |
| GET    | `/tasks/remaining`    | View remaining tasks          |
| GET    | `/tasks/add`          | Add a new task                |
| POST   | `/tasks/save`         | Save a new task               |
| GET    | `/tasks/edit/{id}`    | Edit an existing task         |
| POST   | `/tasks/save-update`  | Update an existing task       |
| GET    | `/tasks/{id}`         | View task details             |
| GET    | `/tasks/delete/{id}`  | Delete a task                 |

## Customization

- **Database**: The application currently uses H2 (in-memory) for simplicity. You can change the database in the `application.properties` file if needed.
- **Styling**: The front end uses Bootstrap for styling. You can modify the styles in the HTML files located in the `src/main/resources/templates` directory.





