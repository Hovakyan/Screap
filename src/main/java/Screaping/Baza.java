package Screaping;

import javafx.scene.shape.ClosePath;
import org.jsoup.select.Evaluator;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Baza  {



    public static void bazaco(List<Officers> of,List<Company> co) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
            PreparedStatement ps = con.prepareStatement("INSERT into company values  (?,?,?,?,?,?,?,?)");


            ps.setString(1, co.get(0).getCompanyName());
            ps.setString(2, co.get(0).getCompany_ID());
            ps.setString(3, co.get(0).getCompany_Registeredofficaddress());
            ps.setString(4, co.get(0).getCompany_Status());
            ps.setString(5, co.get(0).getCompany_Type());
            ps.setString(6, co.get(0).getCompany_Accounts());
            ps.setString(7, co.get(0).getCompany_NatureOf_BusinessSIC());
            ps.setString(8, co.get(0).getPrevious_company_names());
            ps.executeUpdate();



            for (Officers f :
                    of) {
                PreparedStatement pm = con.prepareStatement("INSERT into officers values  (?,?,?,?,?,?,?,?,?)");
                pm.setString(1, co.get(0).getCompanyName());
                pm.setString(2,  f.getPeople_Name());
                pm.setString(3, f.getPeople__Adres());
                pm.setString(4, f.getPeople_Role());
                pm.setString(5, f.getPeople_Date_of_birth());
                pm.setString(6, f.getPeople_Appointed_on());
                pm.setString(7, f.getPeople_Nationality());
                pm.setString(8, f.getPeople_Country_of_residence());
                pm.setString(9, f.getPeople_Occupation());

pm.execute();

            }
            of.clear();
            co.clear();
            }  catch(ClassNotFoundException e){
                e.printStackTrace();
            } catch(SQLException e){
                e.printStackTrace();
            }


        System.out.println("finish");
    }



}
