package instances;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Repository implements interfaces.Repository {
    List<Pet> pets;
    PetFactory petFactory;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Repository() {
        pets = new ArrayList<>();
        petFactory = new PetFactory();
    }

    public void add(Pet pet){
        pets.add(pet);
    }

    public void delete(Pet pet){
        pets.remove(pet);
    }

    public Pet getById(int id){
        return pets.get(id);
    }

    public Collection<Pet> getAll(){
        return pets;
    }

    public void addPet(int petType, String name, Date birthday, String color){
        add(petFactory.createPet(petType, name, birthday, color));
    }

    public void viewCommands(int i){
        System.out.println(pets.get(i).getCommands());
    }

    public void train(int i){
        pets.get(i).train(pets.get(i));

    }

    @Override
    public String toString() {
        return "{" +
                "pets=" + pets +
                '}';
    }
}
