package Dialogs;

import java.text.ParseException;

public interface IDialog<T> {
    T showDialog() throws ParseException;
}
