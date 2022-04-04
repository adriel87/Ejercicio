package controller;

import controller.handler.AddNewFunko;
import controller.handler.SaveListOfFunkos;
import model.dto.FigureDTO;
import view.ToysEntrance;

import javax.swing.*;

public class MainController {

private JFrame frame;
private ToysEntrance toysEntrance;

public MainController(){

    toysEntrance = new ToysEntrance();

    frame = new JFrame("view");
    frame.setContentPane(toysEntrance.getToysPanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    toysEntrance.getAddButton().addActionListener(new AddNewFunko(this.toysEntrance));
    toysEntrance.getSaveFunkosButton().addActionListener(new SaveListOfFunkos(this.toysEntrance));

    frame.pack();




    frame.setVisible(true);


}

public static FigureDTO getDataFromView(ToysEntrance toysEntrance){
    FigureDTO figure = new FigureDTO(
            toysEntrance.getTFCollection().getText(),
            toysEntrance.getTFName().getText(),
            Integer.parseInt(toysEntrance.getTFNumber().getText()),
            Integer.parseInt(toysEntrance.getTFSize().getText()),
            Double.parseDouble(toysEntrance.getTFPrice().getText()),
            toysEntrance.getCBisLimited().isSelected()
    );
    System.out.println(figure.getName());
    System.out.println(toysEntrance.getTFCollection().getText());
    System.out.println(figure.getCollection());
    return figure;
}

public static void Clean(ToysEntrance entrance){
    entrance.getTFCollection().setText("");
    entrance.getTFName().setText("");
    entrance.getTFNumber().setText("");
    entrance.getTFSize().setText("");
    entrance.getTFPrice().setText("");
    entrance.getCBisLimited().setSelected(false);
}


}
