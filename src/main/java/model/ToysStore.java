package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(namespace = "FunkoStore")
public class ToysStore {

    @XmlElementWrapper(name = "funkoFigures")
    @XmlElement(name = "funkolist")
    private List<Figure> funkoList;
    private String name;
    private String code;

    //si el nombre del  metodo coincide de alguno forma con otro metodo de la clase da fallo
    //en este caso falla por el setFunkoList
//    public List<Figure> getFunkoList() {
//        return funkoList;
//    }

    public void setFunkoList(List<Figure> listita) {
        this.funkoList = listita;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getCode() {
//        return code;
//    }

    public void setCode(String code) {
        this.code = code;
    }
}
