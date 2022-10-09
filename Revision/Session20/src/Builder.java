
class Button{
    String text;

    Button(String text){
        this.text = text;
    }

    void onClick(){
        System.out.println("Button Clicked");
    }

}

class AlertDialog{
    String title;
    String message;

    // Has-A relation
    Button okButton;
    Button cancelButton;

    // Nested Class
    class Builder{
        String title;
        String message;

        // Has-A relation
        Button okButton;
        Button cancelButton;
        void setTitle(String title){
            this.title = title;
        }
    }
}

public class Builder {


}
