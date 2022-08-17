public class Flight {

    String comapny;
    String fromLocation;
    String toLocation;
    double duration;
    int price;

    public Flight(){ this("NA","NA","NA",0,0);}

    public Flight(String comapny, String fromLocation, String toLocation, double duration, int price) {
        this.comapny = comapny;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.duration = duration;
        this.price = price;
    }

    void showFlight(){
        System.out.println("--------------------------");
        System.out .println("Company: "+comapny);
        System.out .println("From: "+fromLocation);
        System.out .println("To: "+toLocation);
        System.out .println("Flight Duration: "+duration);
        System.out .println("Price: "+price);
        System.out.println("--------------------------");

    }
}
