package Screaping;

import java.io.IOException;

public abstract class Model {


    private  String companyName;
    private  String company_ID;
    private  String company_Registeredofficaddress;
    private  String company_Status;
    private  String company_Type;
    private  String company_Accounts;
    private  String company_NatureOf_BusinessSIC;
    private  String Previous_company_names;


    private  String people_Name;
    private  String people__Adres;
    private  String people_Role;
    private  String people_Date_of_birth;
    private  String people_Appointed_on;
    private  String people_Nationality;
    private  String people_Country_of_residence;
    private  String people_Occupation;


    public  abstract void companyBackup(String kay ) throws IOException;
    public  abstract void officerBackup(String kay) throws IOException;
    public  abstract void overviewAll() throws IOException, InterruptedException;
    public  abstract void writecompany(Company c) throws IOException;
    public  abstract void writeoffocers(Officers f) throws IOException;




    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompany_ID() {
        return company_ID;
    }

    public void setCompany_ID(String company_ID) {
        this.company_ID = company_ID;
    }

    public String getCompany_Registeredofficaddress() {
        return company_Registeredofficaddress;
    }

    public void setCompany_Registeredofficaddress(String company_Registeredofficaddress) {
        this.company_Registeredofficaddress = company_Registeredofficaddress;
    }

    public String getCompany_Accounts() {
        return company_Accounts;
    }

    public void setCompany_Accounts(String company_Accounts) {
        this.company_Accounts = company_Accounts;
    }

    public String getCompany_NatureOf_BusinessSIC() {
        return company_NatureOf_BusinessSIC;
    }

    public void setCompany_NatureOf_BusinessSIC(String company_NatureOf_BusinessSIC) {
        this.company_NatureOf_BusinessSIC = company_NatureOf_BusinessSIC;
    }

    public String getPeople_Name() {
        return people_Name;
    }

    public void setPeople_Name(String people_Name) {
        this.people_Name = people_Name;
    }

    public String getPeople__Adres() {
        return people__Adres;
    }

    public void setPeople__Adres(String people__Adres) {
        this.people__Adres = people__Adres;
    }

    public String getPeople_Role() {
        return people_Role;
    }

    public void setPeople_Role(String people_Role) {
        this.people_Role = people_Role;
    }

    public String getPeople_Date_of_birth() {
        return people_Date_of_birth;
    }

    public void setPeople_Date_of_birth(String people_Date_of_birth) {
        this.people_Date_of_birth = people_Date_of_birth;
    }

    public String getPeople_Appointed_on() {
        return people_Appointed_on;
    }

    public void setPeople_Appointed_on(String people_Appointed_on) {
        this.people_Appointed_on = people_Appointed_on;
    }

    public String getPeople_Nationality() {
        return people_Nationality;
    }

    public void setPeople_Nationality(String people_Nationality) {
        this.people_Nationality = people_Nationality;
    }

    public String getPeople_Country_of_residence() {
        return people_Country_of_residence;
    }

    public void setPeople_Country_of_residence(String people_Country_of_residence) {
        this.people_Country_of_residence = people_Country_of_residence;
    }

    public String getPeople_Occupation() {
        return people_Occupation;
    }

    public void setPeople_Occupation(String people_Occupation) {
        this.people_Occupation = people_Occupation;
    }
    public String getCompany_Status() {
        return company_Status;
    }

    public void setCompany_Status(String company_Status) {
        this.company_Status = company_Status;
    }

    public String getCompany_Type() {
        return company_Type;
    }

    public void setCompany_Type(String company_Type) {
        this.company_Type = company_Type;
    }

    public String getPrevious_company_names() {
        return Previous_company_names;
    }

    public void setPrevious_company_names(String previous_company_names) {
        Previous_company_names = previous_company_names;
    }



}
