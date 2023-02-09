package instances;

import java.util.Date;

public class PetFactory {

    public Pet createPet(int petType, String name, Date birthday, String color){
        switch (petType){
            case 1 -> {
                return new Cat(name, birthday, color);
            }
            case 2 -> {
                return new Dog(name, birthday, color);
            }

            case 3 -> {
                return new Hamster(name,birthday,color);
            }
            //default: throw new IllegalStateException("UnExpected value" + petType);
        }

        return null;
    }


}
