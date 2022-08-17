abstract class Cab{
    String source;
    String destination;
    double distance;

    Cab(){
        source="Null";
        destination="Null";
        distance=0.0;
    }

    public Cab(String source, String destination, double distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    void showCab(){
        System.out.println("Cab details: Source "+source+" Destination "+destination+" Distance= "+distance);
    }

    abstract void bookCab(String source, String destination, double distance);

}

class MiniCab extends Cab{
    String cabType = "Mini";
    double ratePerKm=9.5;

    void bookCab(String source, String destination, double distance){
        System.out.println("-------------------------------");
        System.out.println("OlaMini Cab booking");
        System.out.println("Cab booked");
        System.out.println("Cab details: Source "+source+" Destination "+destination+" Distance= "+distance+" Cab type: "+cabType);
        System.out.println("Cab fare: \u20b9 "+distance*ratePerKm);

    }
}

class SedanCab extends Cab{
    String cabType = "Sedan";
    double ratePerKm = 12;

    void bookCab(String source, String destination, double distance){
        System.out.println("-------------------------------");
        System.out.println("OlaSedan Cab booking");
        System.out.println("Cab booked");
        System.out.println("Cab details: Source "+source+" Destination "+destination+" Distance= "+distance+" Cab type: "+cabType);
        System.out.println("Cab fare: \u20b9 "+distance*ratePerKm);
    }
}

class luxuryCab extends Cab{
    String cabType = "Luxury Cab";
    double ratePerKm = 18;

    void bookCab(String source, String destination, double distance){
        System.out.println("-------------------------------");
        System.out.println("Ola Luxury Cab booking");
        System.out.println("Cab booked");
        System.out.println("Cab details: Source "+source+" Destination "+destination+" Distance= "+distance+" Cab type: "+cabType);
        System.out.println("Cab fare: \u20b9 "+distance*ratePerKm);
    }
}
public class OlaApp {

    public static void main(String[] args) {


        OlaApp app = new OlaApp();

        Cab cab1 = new SedanCab();
        cab1.bookCab("Home", "Office", 15.2);


    }



}
