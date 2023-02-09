package instances;

import java.util.Date;

public class Dog extends Pet{


    public Dog(String name, Date birthdate, String color) {
        super(name, birthdate, color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", color='" + color + '\'' +
                ", commands=" + commands +
                "}\n";
    }
}
