package com.amazon.atlas22.fileio;

import java.io.File;
import java.io.FileWriter;

public class FIleIO {
    public FIleIO(){}

    public void writeInFile(String data){
        try {
            File file = new File("C:\\Users\\dholsoha\\Documents\\ATLAS Java\\Revision\\FileHandling\\src\\com\\amazon\\atlas22\\fileio\\student.txt");

            FileWriter writer = new FileWriter(file, true);
            writer.write(data);
            writer.close();

            System.out.println("Write operation finished");
            System.out.println("Written the data: ");
            System.out.println("data");

        } catch (Exception e){
            System.err.println("Something went wrong: "+e);
        }
    }
}
