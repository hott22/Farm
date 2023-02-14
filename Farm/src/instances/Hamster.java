package instances;

import java.util.Date;

public class Hamster extends Pet{


    public Hamster(String name, Date birthdate, String color) {
        super(name, birthdate, color);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", color='" + color + '\'' +
                "}\n";
    }
}
