package interfaces;

import instances.Pet;

import java.util.Collection;
import java.util.Date;

public interface Repository {
    void add(Pet pet);
    void delete(Pet pet);
    Pet getById(int id);
    Collection<Pet> getAll();
    void addPet(int petType, String name, Date birthday, String color);
    void viewCommands(int i);
    void train(int i);
}
