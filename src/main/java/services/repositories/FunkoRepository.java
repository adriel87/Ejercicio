package services.repositories;

import model.Figure;
import model.ToysStore;
import model.dto.FigureDTO;

import java.util.ArrayList;
import java.util.List;

import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class FunkoRepository {

    private static List<Figure> funkoList;

    public static List<Figure> getFunkoList() {
        if (funkoList == null) {
            new FunkoRepository();
            System.out.println("Repository created");
        }
        System.out.println("get list of funkos\nwe have actually " + funkoList.size());
        return funkoList;
    }

    private FunkoRepository() {
        funkoList = new ArrayList<Figure>();
    }

    public static void showFunkos() {
        funkoList.forEach(element -> System.out.println(element.getName()));
    }

    public static void addFunko(FigureDTO figure) {
        funkoList.add(figure);
    }

    public static void saveInFile() {
        var toyStore = new ToysStore();
        toyStore.setCode("1122");
        toyStore.setName("la tiendita");
        toyStore.setFunkoList(getFunkoList());
        try {

            JAXBContext context = JAXBContext.newInstance(ToysStore.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(toyStore, System.out);
            m.marshal(toyStore, new File("./funkitos.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }
}
