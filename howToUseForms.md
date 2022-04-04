# Using Forms whit intelliJ
Vamos a ver como usar los archivos generados por el IDE intelliJ IDEA para la generacion de vistas


## crear la vista
primero creamos una nueva vista

pulsamos con boton derecho sobre nuestro paquete de vistas y `new/swing UI designer/GUI form`

esto nos abrira un menu para crear nuestras vistas, siempre es aconsejable que una vez terminemos con la vista vayamos a la clase y generemos los getter y los setter

## instanciando la vista

### que nos hace falta??

pues normalmente estas vistas, si estas usando MVC, vas instanciarlas en un controllador

pues es controlador va a necesitar un Frame para poder contener la vista

veamos un ejemplo:
```java
public class MainController {

    private JFrame frame;
    private ToysEntrance toysEntrance;
} 
```
como vemos tenemos 2 propiedades. Por un lado tenemos el `frame` y por otro lado tenemos nuestra vista creada en el primer apartado

ahora veamos el constructor
```java
public MainController(){
        // instanciamos nuestra vista
        toysEntrance = new ToysEntrance();
        
        //ahora nuestro frame
        //el parametro del constructor es el titulo que aparecera en la ventana
        frame = new JFrame("view");
        
        //ahora le adjuntamos el panel principal de nuestra vista
        frame.setContentPane(toysEntrance.getToysPanel());
        
        //establecemos las propiedades por defecto de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //asociamos nuestros listeners y sus correspondientes acciones
        toysEntrance.getAddButton().addActionListener(new AddNewFunko(this.toysEntrance));
        toysEntrance.getSaveFunkosButton().addActionListener(new SaveListOfFunkos(this.toysEntrance));

        //empaquetamos todo
        frame.pack();
        
        //por ultimo y si simepre lo ultimo hacer visible la vista
        frame.setVisible(true);


        }
```

## Probando la vista

ahora lo que nos queda seria probar y ver como se ve la pantalla. Para eso solo tenemos que instanciar nuestro controlador que normalmente lo haremos dentro de un main

# y ahora q ?
si crees que me he equivocado en algo o piensas que lo actual se puede mejorar porfa deja una PR o mandame un mensaje para verlo
