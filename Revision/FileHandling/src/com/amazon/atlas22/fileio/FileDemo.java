package com.amazon.atlas22.fileio;
/*
*  1. Work with files.
*  2. Java 8 features. -- Important for interviews.
*
* */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

    public static void main(String[] args) {

        //File IO APIs will throw checked exceptions. Hence, it's better to code them in try catch block by default.
        try{
            // API --> Application Programming Interfaces
            // It's a program, which we can use to solve our problem. It can be Internal or External.

            File file = new File("C:\\Users\\dholsoha\\Documents\\ATLAS Java\\Revision\\FileHandling\\src\\com\\amazon\\atlas22\\fileio\\student.txt");
            System.out.println(file.getName());

            if(file.exists()){
                System.out.println(file.getName()+" File exists");
                System.out.println(file.getPath());

                SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
                Date date = new Date(file.lastModified());
                String dateTimeStamp = formatter.format(date);
                System.out.println("Last Modified: "+dateTimeStamp);

                System.out.println(file.getTotalSpace());
                System.out.println("File Properties RWX: "+file.canRead()+" "+file.canWrite()+" "+file.canExecute());

            }else{
                System.err.println(file.getName()+" File does not exist");
            }

            File myFile = new File("C:\\Users\\dholsoha\\Documents\\ATLAS Java\\Revision\\FileHandling\\src\\com\\amazon\\atlas22\\fileio\\student1.txt");
            if(!myFile.exists()){
                myFile.createNewFile();

            }
        } catch (Exception e){


            System.err.println("Something went wrong: "+e);
            e.printStackTrace();

        }
    }


}
