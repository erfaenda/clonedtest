package interfaces;

import objects.Person;

/**
 * Created by alex on 10.09.2016.
 */
public interface AddressBook {

    //add zapis =)
    void add(Person person);

    //внести измененные значения (подтвердить измененные данные)
    void update(Person person);

    //Удалить запить
    void delete(Person person);


}
