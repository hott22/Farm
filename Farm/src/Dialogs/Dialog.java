package Dialogs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dialog {

    Scanner sc = new Scanner(System.in);
    public String[] printDialog(){
        String [] dataArray = new String[3];
        System.out.println("����� ���: ");
        dataArray[0] = sc.nextLine();
        System.out.println("������� ���� �������� � ������� '����-��-��': ");
        dataArray[1] = sc.nextLine();
        System.out.println("������� ����: ");
        dataArray[2] = sc.nextLine();
        return dataArray;
    }
}
