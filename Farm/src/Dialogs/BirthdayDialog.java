package Dialogs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthdayDialog implements IDialog<Date> {
    @Override
    public Date showDialog() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи дату рождения в формате 'гггг-мм-дд': ");

        return new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine());
    }
}
