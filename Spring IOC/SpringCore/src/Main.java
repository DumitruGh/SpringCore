import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //numele bean-ului este id-ul pe care i l-am dat bean-ului in file-ul beans.xml.

                                             //Varianta I - folosind casting din Object in Airtel
        Airtel air = (Airtel)context.getBean("airtel");
        air.calling();
        air.data();

                                            //Varianta II = folosing id-ul din beans.xml si numele clasei

         Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
         voda.calling();
         voda.data();


                           //Folosirea polimorfismului ca sa nu schimbam codul sursa mereu

        //daca vrem sa schimbam obiectul, doar schimbab denumirea clasei din bean-ul din beans.xml, din Airtel in Vodaphone

        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
}
}
