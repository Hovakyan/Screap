package Screaping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;
import java.util.Set;


public class Officers extends Model {


    public static void officerBackup(String kay ,List<Officers> of) throws IOException {


        String url = "https://beta.companieshouse.gov.uk/company/" + kay + "/officers";
        Document doc = Jsoup.connect(url).get();
        Element elcount = doc.getElementById("company-appointments");

        int count = 0;
        try {

            count = Integer.parseInt(elcount.text().substring(0, 1).trim());

        } catch (Error | Exception e) {

        }


        for (int i = 1; i <= count; i++) {
            Officers officers = new Officers();
            of.add(officers);


            try {
                Element name = doc.getElementById("officer-name-" + i);
                officers.setPeople_Name(name.text());
            } catch (Exception e) {
                           }
            try {
                Element adres = doc.getElementById("officer-address-value-" + i);
                officers.setPeople__Adres(adres.text());
            } catch (Exception | Error e) {

            }
            try {
                Element rol = doc.getElementById("officer-role-" + i);
                officers.setPeople_Role(rol.text());
            } catch (Error | Exception e) {

            }
            try {

                Element Occupation = doc.getElementById("officer-occupation-" + i);
                officers.setPeople_Occupation(Occupation.text());
            } catch (Error | Exception e) {

            }
            try {
                Element Country_of_residence = doc.getElementById("officer-country-of-residence-" + i);
                officers.setPeople_Country_of_residence(Country_of_residence.text());
            } catch (Exception | Error e) {

            }
            try {
                Element Nationality = doc.getElementById("officer-nationality-" + i);
                officers.setPeople_Nationality(Nationality.text());
            } catch (Error | Exception e) {

            }
            try {

                Element Appointed_on = doc.getElementById("officer-appointed-on-" + i);
                officers.setPeople_Appointed_on(Appointed_on.text());
            } catch (Exception | Error e) {

            }
            try {
                Element Date_of_birth = doc.getElementById("officer-date-of-birth-" + i);
                officers.setPeople_Date_of_birth(Date_of_birth.text());
            } catch (Error | Exception e) {

            }


        }
    }
}
