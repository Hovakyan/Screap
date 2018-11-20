package Screaping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class  Company extends Model{
    @Override
    public void writeoffocers(Officers f) throws IOException {

    }

    @Override
    public void writecompany(Company c) throws IOException {

    }

    @Override
        public void overviewAll() throws IOException {

        }
        @Override
        public void officerBackup(String kay) {

        }
        @Override
        public   void companyBackup(String kay) throws IOException {


                String url = "https://beta.companieshouse.gov.uk/company/" + kay ;

                Document doc = Jsoup.connect(url).get();
                Elements elements3 = doc.getAllElements();
                Model company = new Company();
                company.setCompanyName( elements3.get(0).getElementById("company-name").text());
                company.setCompany_ID(elements3.get(0).getElementById("company-number").text());
                company.setCompany_Registeredofficaddress(elements3.get(0).getElementsByAttributeValue("class", "text data").text());
                company.setCompany_Status(elements3.get(0).getElementsByAttributeValue("class", "grid-row").get(0).text());
                company.setCompany_Type(elements3.get(0).getElementsByAttributeValue("class", "grid-row").get(1).text());
                company.setCompany_Accounts(elements3.get(0).getElementsByAttributeValue("class", "grid-row").get(2).text());
                try {
                    company.setCompany_NatureOf_BusinessSIC(elements3.get(0).getElementById("sic-title").text() + "\t" +
                            elements3.get(0).getElementById("sic0").text());
                }catch (Error | Exception e) {

                }
                try {
                    company.setPrevious_company_names(elements3.get(1).getElementById("previousNameTable").text());

                } catch (Exception | Error e){

                }



                Model write = new Write();
                write.writecompany((Company) company);
        }


}



