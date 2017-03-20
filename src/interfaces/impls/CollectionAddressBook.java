package interfaces.impls;

import interfaces.AddressBook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import objects.Person;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by alex on 10.09.2016.
 */
public class CollectionAddressBook implements AddressBook { //наследуемя от итерфейса адресбук что бы реализовать его методы

    private ObservableList<Person> personList = FXCollections.observableArrayList(); //создание коллекции

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

}
