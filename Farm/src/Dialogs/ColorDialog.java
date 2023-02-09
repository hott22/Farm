package Dialogs;

import java.util.Scanner;

public class ColorDialog implements IDialog<String>{
    @Override
    public String showDialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬веди цвет: ");
        return scanner.nextLine();

    }
}
