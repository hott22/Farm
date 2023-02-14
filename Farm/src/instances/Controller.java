package instances;

import Dialogs.Dialog;
import interfaces.IRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class Controller {


    IRepository repository;
    Dialog dialog;

    public Controller(IRepository repository, Dialog dialog) {
        this.repository = repository;
        this.dialog = dialog;
    }

    public void addPets(int petType) throws ParseException {
        String [] dialogs = dialog.printDialog();
        repository.addPet(petType, dialogs[0], new SimpleDateFormat("yyyy-MM-dd").parse(dialogs[1]), dialogs[2]);
    }

    public Collection<Pet> getAllPets(){
       return repository.getAll();
    }

    public void viewCommandsPets(int i){
        repository.viewCommands(i);
    }

    public void train(int id){
        repository.train(id);
    }


}
