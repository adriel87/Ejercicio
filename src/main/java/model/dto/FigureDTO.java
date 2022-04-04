package model.dto;

import model.Figure;

public class FigureDTO extends Figure {

    private String  collection;
    private String  name;
    private int     number;
    private int     size;
    private double  price;
    private boolean isLimitedEdition;

    public FigureDTO(String collection, String name, int number, int size, double price, boolean isLimitedEdition) {
        this.collection = collection;
        this.name = name;
        this.number = number;
        this.size = size;
        this.price = price;
        this.isLimitedEdition = isLimitedEdition;
    }

    //TODO validation method


    @Override
    public String getCollection() {
        return collection;
    }

    @Override
    public void setCollection(String collection) {
        this.collection = collection;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean isLimitedEdition() {
        return isLimitedEdition;
    }

    @Override
    public void setLimitedEdition(boolean limitedEdition) {
        isLimitedEdition = limitedEdition;
    }

    public boolean isValidFigure(){
        if(collection.length()<=0) return false;
        if(name.length()<=0) return false;
        if(number<=0) return false;
        if(price<=0) return false;
        return true;
    }
}
