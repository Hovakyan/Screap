package Screaping;

import java.io.*;
import java.util.*;




public class Overview  extends Model{





    public static void  overviewAll() throws IOException {

        List<Officers> officersarr = new ArrayList<Officers>();
        List<Company> companyarr = new ArrayList<Company>();


        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/info/info1.txt"));
        Scanner scanner = null;
        try {
            scanner = new Scanner(bufferedReader);

            Model of = new Officers();
         while (scanner.hasNextLine()) {
            String x = scanner.nextLine();
            Company.companyBackup(x,companyarr);
            Officers.officerBackup(x,officersarr);
            Baza.bazacf(officersarr,companyarr);
         }


        } catch (Exception e) {


        }

    }

}
