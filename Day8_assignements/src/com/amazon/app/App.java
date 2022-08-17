/*Create a class User(name, phone, email, address) in package com.amazon.model
with protected attributes phone, email and address. Now, create a child class and
App with main method in package com.amazon.app and showcase how to access the
protected data.
*/

package com.amazon.app;

import com.amazon.model.User;

import java.util.SortedMap;

class Child extends User{
    public Child(String name, String phone, String email, String address) {
        super(name, phone, email, address);
    }

    void show(String name, String phone, String email, String address){
        System.out.println("Child Details: ");
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Email: "+email);
    }
}

public class App {

    public static void main(String[] args) {
        Child child = new Child("ChildName", "8909011331","child@example.com","child stays here");
        child.show("Abc","9888","90888@ymail","address of child");

    }
}
