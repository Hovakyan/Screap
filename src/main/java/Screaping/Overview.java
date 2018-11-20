package Screaping;

import java.io.*;
import java.util.*;

public class Overview extends Model {

    @Override
    public void writecompany(Company c) throws IOException {

    }

    @Override
    public void writeoffocers(Officers f) throws IOException {

    }

    @Override
    public void companyBackup(String kay) throws IOException {

    }


    @Override
    public void officerBackup(String kay) throws IOException {

    }
    @Override
    public void overviewAll() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/info/info1.txt"));
        Scanner scanner = null;
        try {
            scanner = new Scanner(bufferedReader);

         while (scanner.hasNextLine()) {
            String x = scanner.nextLine();

                Model company = new Company();
                company.companyBackup(x);

                Thread.sleep(1000);
                Model officers = new Officers();
                officers.officerBackup(x);
          }

        } catch (Exception e) {

        }

    }

}
