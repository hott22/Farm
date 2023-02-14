import Dialogs.Dialog;
import View.View;
import instances.Controller;
import instances.Counter;
import instances.Repository;
import interfaces.IRepository;

import java.awt.*;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws Exception {

        View view = new View(new Controller(new Repository(), new Dialog()));
        try (Counter counter = new Counter();){
            while (true){
                view.showMenu();
                int choice = view.chooseAction("Your choice: ", 5);

                if(choice == 1){
                    view.viewAllPets();
                }

                if(choice == 2){
                    counter.riseSum();
                    view.showPets();
                    int petChoice = view.chooseAction("Your choice: ", 3);
                    view.showDialog(petChoice);
                }
                if(choice == 3){
                    view.viewAllPets();
                    int id = view.chooseAction("Your choice: ", view.allPetsCount());
                    view.viewCommandsPets(id - 1);
                }
                if(choice == 4){
                    view.viewAllPets();
                    int id = view.chooseAction("Your choice: ", view.allPetsCount());
                    view.trainPets(id - 1);

                }
                if (choice == 5){
                    break;
                }
            }
        }


    }
}
