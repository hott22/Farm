import instances.Cat;
import instances.Pet;
import instances.PetFactory;
import instances.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        //PetFactory petFactory = new PetFactory();
        //Cat cat = (Cat) petFactory.createPet(1,"Catty", new SimpleDateFormat("yyyy-MM-dd").parse("2022-12-12"), "red");
        //System.out.println(cat);

        Repository repository = new Repository();
        repository.addPet(1,"Catty", new SimpleDateFormat("yyyy-MM-dd").parse("2022-12-12"), "red");
        //repository.addPet(2,"Doggy", new SimpleDateFormat("yyyy-MM-dd").parse("2020-11-11"), "black");

        //repository.getAll();
        repository.viewCommands(0);

     /*   for (Pet pet : repository.getAll()) {
            pet.training(pet);
        }*/

        repository.train(0);
        repository.viewCommands(0);
        //System.out.println(repository);


    }
}
