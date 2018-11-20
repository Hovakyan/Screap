package Screaping;

import java.io.FileWriter;
import java.io.IOException;

public class Write extends Model {

    @Override
    public void companyBackup(String kay) throws IOException {

    }

    @Override
    public void officerBackup(String kay) throws IOException {

    }

    @Override
    public void overviewAll() throws IOException {

    }

    @Override
    public void writeoffocers(Officers f) throws IOException {

        FileWriter writer = new FileWriter("C:/info/out.txt", true);


        try {
            writer.write("officers------------------");
            writer.write("\n");
            writer.write("People_Name " + f.getPeople_Name());
            writer.write("\n");
            writer.write("People__Adres " + f.getPeople__Adres());
            writer.write("\n");
            writer.write("People_Date_of_birth " + f.getPeople_Date_of_birth());
            writer.write("\n");
            writer.write("People_Nationality " + f.getPeople_Nationality());
            writer.write("\n");
            writer.write("People_Country_of_residence " + f.getPeople_Country_of_residence());
            writer.write("\n");
            writer.write("People_Role " + f.getPeople_Role());
            writer.write("\n");
            writer.write("People_Occupation " + f.getPeople_Occupation());
            writer.write("\n");
            writer.write("People_Appointed_on " + f.getPeople_Appointed_on());
            writer.write("\n");


        } catch (Exception e) {

        } finally {
            writer.close();
        }

    }

    @Override
    public void writecompany(Company c) throws IOException {

        FileWriter writer = new FileWriter("C:/info/out.txt", true);

        try {
            writer.write("Company------------------");
            writer.write("\n");
            writer.write("CompanyName " + c.getCompanyName());
            writer.write("\n");
            writer.write(c.getCompany_ID());
            writer.write("\n");
            writer.write("Company_Registeredofficaddress " + c.getCompany_Registeredofficaddress());
            writer.write("\n");
            writer.write(c.getCompany_Status());
            writer.write("\n");
            writer.write(c.getCompany_Type());
            writer.write("\n");
            writer.write(c.getCompany_Accounts());
            writer.write("\n");
            writer.write(c.getCompany_NatureOf_BusinessSIC());
            writer.write("\n");
            writer.write(c.getPrevious_company_names());
            writer.write("\n");
        } catch (Exception e) {

        } finally {
            writer.close();
        }

    }
}
