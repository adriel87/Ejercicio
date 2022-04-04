package controller.handler;

import model.dto.FigureDTO;
import view.ToysEntrance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static controller.MainController.Clean;
import static controller.MainController.getDataFromView;
import static services.repositories.FunkoRepository.*;

public class AddNewFunko implements ActionListener {
    private FigureDTO figure;
    private ToysEntrance entrance;
    public AddNewFunko(ToysEntrance entrance){
       this.entrance = entrance;
//       this.figure= getDataFromView(this.entrance);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.figure = getDataFromView(entrance);
        getFunkoList();
        addFunko(figure);
        Clean(entrance);
    }
}
