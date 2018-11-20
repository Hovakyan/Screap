package Textreader;

import javax.swing.table.TableCellEditor;
import java.io.IOException;
import java.util.Scanner;

public class Controller {

public  void control() throws IOException {

    String control = "";
    while (!control.equals("0")) {
        System.out.println("chois function");
        System.out.println("1: for add");
        System.out.println("2: for edite or remuve");
        System.out.println("0: close programe");
        Scanner in = new Scanner(System.in);
        control = in.next();
        Textedit editor = new Logic();

        switch (control) {

            case "1":
                editor.add(editor);
                editor.check(editor);
                break;

            case "2":
                editor.edit(editor);
                break;
            case "0":
                System.out.println("goodbay");
            default:
                System.out.println("chois 1 ir 2");
        }


    }






}




}

