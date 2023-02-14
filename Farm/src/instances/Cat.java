package instances;

import java.util.Date;

public class Cat extends Pet{

    public Cat(String name, Date birthdate, String color) {
        super(name, birthdate, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", color='" + color + '\'' +
                "}\n";
    }
}
