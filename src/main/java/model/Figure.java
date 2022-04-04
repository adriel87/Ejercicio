package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="figure")
public class Figure {

    private String  collection;
    private String  name;
    private int     number;
    private int     size;
    private double  price;
    private boolean isLimitedEdition;

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLimitedEdition() {
        return isLimitedEdition;
    }

    public void setLimitedEdition(boolean limitedEdition) {
        isLimitedEdition = limitedEdition;
    }
}
