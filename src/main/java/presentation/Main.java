package presentation;

import config.AppConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import unitecentrale.UniteCentrale;
import usb.USB;
import vga.VGA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Récupération de l'instance de l'unité centrale à partir du contexte
        UniteCentrale uniteCentrale = context.getBean("uniteCentrale", UniteCentrale.class);

        // Utilisation de l'unité centrale
        uniteCentrale.printData("Données à afficher");
        int data = uniteCentrale.readData();
        System.out.println("Données lues : " + data);

        // Fermeture du contexte Spring
        ((ClassPathXmlApplicationContext) context).close();


/*        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UniteCentrale uniteCentrale = context.getBean(UniteCentrale.class);

        uniteCentrale.printData("Donnée à afficher");
        int data = uniteCentrale.readData();*/
    }
}
