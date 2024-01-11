package BT_Locators;

public class LocatorsCRM {

    //1. Khai báo các locator trên trang Login
    private String email;
    private String password;
    private String buttonLogin;
    private String checkboxRemember;
    private String linkForgotPassword;

    //2. Khai báo các locator trên trang Customer
    private String menuCustomer;

    //3. Khai báo các locator trên trang add new customer
    private String company;
    private String vatNumber;
    private String phone;
    private String website;
    private String comboboxGroups;
    private String comboboxCurrency;
    private String comboboxDefaultLanguage;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String comboboxCountry;
    private String buttonSaveAndCreate;
    private String buttonSave;

    //4. Khai báo các locator Project
    private String menuProject;
    private String projectName;
    private String comboboxCustomer;
    private String checkboxCalculate;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
