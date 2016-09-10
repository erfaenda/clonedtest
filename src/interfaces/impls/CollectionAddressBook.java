package interfaces.impls;

import interfaces.AddressBook;
import objects.Person;

import java.util.ArrayList;

/**
 * Created by alex on 10.09.2016.
 */
public class CollectionAddressBook implements AddressBook {

    private ArrayList<Person> personList = new ArrayList<Person>();

    @Override
    public void add(Person person) {personList.add(person);}

    @Override
    public void update(Person person) {
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

}
