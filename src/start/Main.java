package start;

import interfaces.impls.CollectionAddressBook;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objects.Person;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
        primaryStage.setTitle("Телефонная книга");
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(root, 400, 474));
        primaryStage.show();
    }
   /** private void testData(){
        CollectionAddressBook addressBook = new CollectionAddressBook();
        Person person = new Person();
        person.setFio("Ололошка");
        person.setPhone("546169");

        Person person2 = new Person();
        person2.setFio("Мариюшка");
        person2.setPhone("6666666");

        addressBook.add(person);
        addressBook.add(person2);

        person.setFio("Леша");
        //addressBook.update(person);
        addressBook.delete(person);
    } //метод для тестирования кода, проверил все ли работает */



    public static void main(String[] args) {
        launch(args);
    }
}