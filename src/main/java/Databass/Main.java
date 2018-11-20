package Databass;



//import Screaping.Company;
//import Screaping.Officers;

//import Screaping.Ufamanesime;
//import Screaping.scap.Artical;
//import Screaping.scap.Logicaaa;


import Screap.Company;
import Screap.Model;
import Screap.Officers;
import Screap.Overview;


import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

Model model = new Overview();
model.overviewAll();


    }


}