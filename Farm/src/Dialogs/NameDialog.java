package Dialogs;

import java.util.Scanner;

public class NameDialog implements IDialog<String>{

    @Override
    public String showDialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬веди им€: ");
        return scanner.nextLine();
    }
}
