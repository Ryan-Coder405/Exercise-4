package hellofx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Created labels and textfields
        Label studentName = new Label("Student Name:");
        TextField studentNameTextField = new TextField();
        Label courseCode = new Label("Course Code:");
        TextField courseCodeTextField = new TextField();
        Label status = new Label("");
        // Created button
        Button register = new Button("Register");
        // Implemented button
        register.setOnAction((event) -> {

            System.out.println("cool");
            if(studentNameTextField.getText()!= null && courseCodeTextField.getText() != null){
                status.setText("Registration Successful for " + studentNameTextField.getText() + " in " + courseCodeTextField.getText());
            }

        });

        //student Name addition
        GridPane.setConstraints(studentName, 0, 0);
        grid.getChildren().add(studentName);
        //Student Name textfield addition
        studentNameTextField.setPrefColumnCount(1);
        GridPane.setConstraints(studentNameTextField, 1, 0);
        grid.getChildren().add(studentNameTextField);
        //course code addition
        GridPane.setConstraints(courseCode, 0, 1);
        grid.getChildren().add(courseCode);
        //course code text field addition
        GridPane.setConstraints(courseCodeTextField, 1, 1);
        grid.getChildren().add(courseCodeTextField);
        //register addition
        GridPane.setConstraints(register, 0, 2);
        grid.getChildren().add(register);
        //status addition plus the column span which is very important
        GridPane.setConstraints(status, 0, 3);
        GridPane.setColumnSpan(status, 3);
        grid.getChildren().add(status);

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setTitle("Lehman Course Registration");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

