package Screaping;

import java.io.*;
import java.util.*;




public class Overview  extends Model{

    // TODO anhrajesht e BufferedReader i hasceov unenal txt doc url i verjin ID nerov:
    // example
    //SC532834
    //SC532835
    //SC532836
    //SC532837
    //SC532838
    //SC532839

    public static void  overviewAll() throws IOException {

        List<Officers> officersarr = new ArrayList<Officers>();
        List<Company> companyarr = new ArrayList<Company>();


        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/info/info1.txt"));
        Scanner scanner = null;
        try {
            scanner = new Scanner(bufferedReader);
         while (scanner.hasNextLine()) {
            String x = scanner.nextLine();
            Company.companyBackup(x,companyarr);
            Officers.officerBackup(x,officersarr);
            Baza.bazaco(officersarr,companyarr);
         }
        } catch (Exception e) {


        }

    }

}
