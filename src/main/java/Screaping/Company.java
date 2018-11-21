package Screaping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company extends Model {


    public static void companyBackup(String kay, List<Company> co) throws IOException {

        Company company = new Company();
        co.add(company);
        String url = "https://beta.companieshouse.gov.uk/company/" + kay;

        Document doc = Jsoup.connect(url).get();
        Elements elements3 = doc.getAllElements();
        company.setCompanyName(elements3.get(0).getElementById("company-name").text());
        company.setCompany_ID(elements3.get(0).getElementById("company-number").text());
        company.setCompany_Registeredofficaddress(elements3.get(0).getElementsByAttributeValue("class", "text data").text());
        company.setCompany_Status(elements3.get(0).getElementsByAttributeValue("class", "grid-row").get(0).text());
        company.setCompany_Type(elements3.get(0).getElementsByAttributeValue("class", "grid-row").get(1).text());
        company.setCompany_Accounts(elements3.get(0).getElementsByAttributeValue("class", "grid-row").get(2).text());
        try {
            company.setCompany_NatureOf_BusinessSIC(elements3.get(0).getElementById("sic-title").text() + "\t" +
                    elements3.get(0).getElementById("sic0").text());
        } catch (Error | Exception e) {

        }
        try {
            company.setPrevious_company_names(elements3.get(1).getElementById("previousNameTable").text());

        } catch (Exception | Error e) {

        }


    }


}



