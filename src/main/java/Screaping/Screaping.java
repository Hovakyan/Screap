package Screaping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class Screaping {


    public void info() throws IOException, InterruptedException {
        int x = 0;
        for (int i = 128; i < 90000; i++) {
//            Thread.sleep(2000);
            for (int j = 0; j < 52; j++) {

                try {
                    Document doc = Jsoup.connect("https://beta.companieshouse.gov.uk/search/companies?q=" + i + "&page=" + j).get();
                    Thread.sleep(5000);
                    System.out.println(i);
                    Elements elementsurl = doc.getElementsByAttributeValue("class", "type-company");

                    elementsurl.forEach(elementt -> {
                        Element element9 = elementt.child(0);
                        String url1 = element9.child(0).attr("href");


                        String Companyname = element9.child(0).text();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if ((url1.substring(url1.lastIndexOf("/") + 1).length() == 8) &&
                                url1.substring(url1.lastIndexOf("/") + 1).charAt(0) != '#') {

                            System.out.println(url1.substring(url1.lastIndexOf("/") + 1));


                            try {
                                FileWriter fileWriter = new FileWriter("C:/info/info1.text", true);
//                            fileWriter.write("<a href=" + url + ">" + Companyname + "</a>" + "<br>");
                                fileWriter.write(url1.substring(url1.lastIndexOf("/") + 1));
                                fileWriter.write("\n");
                                fileWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } catch (Error | Exception e) {
                    System.out.println("kakachka");
                }
            }

        }
    }

}
