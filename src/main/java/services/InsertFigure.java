package services;

import model.dto.FigureDTO;

import static services.repositories.FunkoRepository.getFunkoList;

public class InsertFigure {

    public boolean insertFigure(FigureDTO figure){
        if(figure.isValidFigure()){

            getFunkoList().add(figure);

            return true;
        }
        return false;
    }


}
