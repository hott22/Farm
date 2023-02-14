package View;

import instances.Controller;
import instances.Pet;
import instances.Repository;
import interfaces.IRepository;

import java.text.ParseException;
import java.util.Scanner;

public class View {
    Controller controller;

    public View(Controller controller ) {
        this.controller = controller;
    }

    public void showMenu(){
        System.out.println("""
                ������ ��������:
                1 - �������� ���� ��������.
                2 - ������� ����� ��������.
                3 - ������� ������ ������, ������� ��������� ��������.
                4 - ������� �������� ����� ��������.
                5 - �����.""");
    }

    public int chooseAction(String title, int choice){
        System.out.printf("%s", title);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number > choice || number < 1){
            System.out.printf("Enter no less than 1 and no more than %d\n", choice);
            number = scanner.nextInt();
        }
        return number;
    }

    public void showPets(){
        System.out.println("""
                ����� �������� �������:
                1 - ���.
                2 - ������.
                3 - �����.""");
    }
    
    
    public void viewAllPets(){
        for (Pet pet : controller.getAllPets()) {
            System.out.println(pet);
        }
    }

    public void showDialog(int petChoise) throws ParseException {
        controller.addPets(petChoise);
    }

    public int allPetsCount(){
        return controller.getAllPets().size();
    }

    public void viewCommandsPets(int i){
        controller.viewCommandsPets(i);
    }

    public void trainPets(int id){
        controller.train(id);
    }



}
