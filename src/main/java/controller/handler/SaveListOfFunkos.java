package controller.handler;

import view.ToysEntrance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static services.repositories.FunkoRepository.saveInFile;

public class SaveListOfFunkos implements ActionListener {
    ToysEntrance entrance;
    public SaveListOfFunkos(ToysEntrance toysEntrance){
        this.entrance = toysEntrance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        saveInFile();
    }
}
