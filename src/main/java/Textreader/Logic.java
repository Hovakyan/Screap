package Textreader;

import sun.util.resources.CalendarData;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.*;

public class Logic extends Textedit {


    @Override
    public void add(Textedit xl) {
        Scanner in = new Scanner(System.in);

        System.out.println("input name");
        xl.setName(in.next());
        System.out.println("input surname");
        xl.setSurname(in.next());
        try {
            System.out.println("input age");
            xl.setAge(in.next());
        } catch (Exception e) {
            System.out.println("insert value");
        }

        System.out.println("input email");
        xl.setEmail(in.next());
        if (!xl.getEmail().contains(".") || !xl.getEmail().contains("@")) {
            System.out.println("incorrect input");
            return;
        }
    }


    @Override
    public void check(Textedit xl) {
        Calendar calendar = Calendar.getInstance();

        File file = new File(xl.getLocation());
        if (!file.exists()) {
            file.mkdir();
        }

        File filechackname = new File(xl.getLocation() + xl.getName() + "_" + xl.getEmail() + ".text");
        if (filechackname.isFile()) {
            System.out.println("name repeats");

        } else {

            PrintWriter fileWriter = null;

            try {
                fileWriter = new PrintWriter(xl.getLocation() + xl.getName() + "_" + xl.getEmail() + ".text");
                fileWriter.println("---info--- ");
                fileWriter.println(("last change" + " " + calendar.getTime())+" ");
                fileWriter.println("name " + xl.getName()+" ");
                fileWriter.println("surname " + xl.getSurname()+" ");
                fileWriter.println("age " + xl.getAge()+" ");
                fileWriter.println("email " + xl.getEmail()+" ");
                fileWriter.println("-------------- ");
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("error");
            }


        }
    }

    @Override
    public void edit(Textedit xl) throws IOException {

        File file = null;

        file = new File(xl.getLocation());
        File[] listOfFiles = file.listFiles();
        System.out.println("All names in Directory");
        System.out.println("------------------");
        if (file.isDirectory()) {
            for (int i = 0; i < listOfFiles.length; i++) {

                if (listOfFiles[i].isFile()) {
                    System.out.println(listOfFiles[i].getName());
                }

            }
            System.out.println("------------------");
        } else {
            System.out.println("folder Isempty");
            return;
        }


        System.out.println("return back '1' for edit '2'");
        System.out.println("****************************************");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toUpperCase();
        if (input.equals("1")) {
            return;
        } else {
            if (input.equals("2")) {
                System.out.println("for edite pleas insert login & password");
                String user = "admin";
                String password = "admin";

                System.out.print("USER\n");
                String input1 = in.next().toLowerCase();
                System.out.print("PASSWORD\n");
                String input2 = in.next();


                if (user.equals(input1) && password.equals(input2)) {
                    System.out.println("choec by email");
                    String input3 = in.next();
                    System.out.println("chois 'edit / remuve'");
                    String choise = in.next();

                    if (choise.equals("edit")) {
                        for (int i = 0; i < listOfFiles.length; i++) {

                            if (listOfFiles[i].getName().contains("_") && listOfFiles[i].getName().contains(".")) {
                                String mail = (listOfFiles[i].getName().substring(listOfFiles[i].getName().lastIndexOf('_') + 1, listOfFiles[i].getName().lastIndexOf('.')));


                                if (mail.equals(input3)) {



                                    Calendar calendar = Calendar.getInstance();
                                    PrintWriter writer = null;
                                    try {
                                        writer = new PrintWriter(xl.getLocation() + listOfFiles[i].getName());
                                        writer.println("---info--- ");
                                        writer.println("last change" + calendar.getTime()+" ");

                                        System.out.println("input new name");
                                        String input5 = in.next();
                                            xl.setName(input5+" ");
                                            writer.println("name " + xl.getName());

                                        System.out.println("input new surname, else input 'next' ");
                                        String input6 = in.next();

                                            xl.setSurname(input6+" ");
                                            writer.println("surname " + xl.getSurname());

                                        System.out.println("input new age, else input 'next' ");
                                        String input7 = in.next();

                                            xl.setAge(input7+" ");
                                            writer.println("age " + xl.getAge());


                                        System.out.println("input new email, else input 'next' ");
                                        String input8 = in.next();

                                            xl.setEmail(input8);
                                            if (!xl.getEmail().contains(".") || !xl.getEmail().contains("@")) {
                                                System.out.println("incorrect input");
                                                return;
                                            }
                                            writer.println("email " + xl.getEmail());

                                        writer.println("-------------- ");
                                        System.out.println("proces is soccet");
                                        writer.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println(getLocation() + listOfFiles[i].getName());
                                    File fileold = new File(getLocation() + listOfFiles[i].getName());
                                    File newfile = new File(getLocation() + xl.getName() + "_" + xl.getEmail() + ".text");
                                    fileold.renameTo(newfile);

                                    xl.setName("");
                                    xl.setSurname("");
                                    xl.setAge("");
                                    xl.setEmail("");
                                }


                            } else {
                                System.out.println("file is no found");
                            }
                        }

                    } else {

                        if (choise.equals("remuve")) {
                            String mail = "";

                            for (int i = 0; i < listOfFiles.length; i++) {
                                if (listOfFiles[i].getName().contains("_") && listOfFiles[i].getName().contains(".")) {
                                    mail = (listOfFiles[i].getName().substring(listOfFiles[i].getName().lastIndexOf('_') + 1, listOfFiles[i].getName().lastIndexOf('.')));

                                    if (mail.equals(input3)) {
                                        File fileold = new File(getLocation() + listOfFiles[i].getName());
                                        fileold.delete();
                                        System.out.println(mail + " is REMUVED");
                                        return;
                                    }
                                }

                            }
                        }

                    }

                } else {
                    System.out.println("incorrect user or password");
                }

            } else {
                System.out.println("pleas insert yes or no");
            }
        }

    }


}
