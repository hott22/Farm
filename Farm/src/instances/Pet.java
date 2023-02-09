package instances;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public abstract class Pet {
    protected String name;
    protected Date birthdate;
    protected String color;

    protected List<String> commands;


    public Pet(String name, Date birthdate, String color) {
        this.name = name;
        this.birthdate = birthdate;
        this.color = color;
        this.commands = commands();
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> commands() {
        List<String> commandsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            commandsList.add(String.format("%s команда", i + 1));
        }

        Random random = new Random();
        int choice = random.nextInt(10);

        for (int i = 0; i < choice; i++) {
            commandsList.remove(9 - i);
        }


        return commandsList;
    }

    public void train(Pet pet){
        pet.getCommands().add(String.format("%s команда", pet.getCommands().size() + 1));
    }

/*    public List<String> training(Pet pet){
         pet.getCommands().add(String.format("%s команда", pet.getCommands().size() + 1));
        return pet.getCommands();
    }*/

}
