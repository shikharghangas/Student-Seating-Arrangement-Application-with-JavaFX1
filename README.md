Project Name: Student Seating Arrangement Application

Description:
The Student Seating Arrangement Application is a JavaFX-based project designed to manage classroom seating assignments dynamically. The application features a user-friendly interface that allows teachers to allocate seats to students and customize seat colors to avoid conflicts.

Key Features:

Student Name Input: A TextField for entering the name of the student.

Seat Color Picker: A ColorPicker to select the desired color for the student's seat.

Dynamic Seat Allocation: Nine seats represented by Rectangles in a GridPane, which are assigned randomly to students while ensuring no two students share the same seat or color.

Validation: The application includes validation to prevent duplicate student names, empty inputs, and color conflicts.
Error and Success Messages: Feedback is provided to the user with error messages in red and success messages in blue, ensuring clarity in operation.
The application is structured with a clear separation of concerns:

Controller (HelloController): Manages user interactions and seat allocation logic.

Model (Student): Represents the student entity with attributes for name, seat index, and seat color.

View (hello-view.fxml): Defines the graphical user interface layout using FXML.

This project demonstrates proficiency in JavaFX, object-oriented programming, event handling, and user interface design. It showcases the ability to create interactive and responsive applications for practical classroom management.
