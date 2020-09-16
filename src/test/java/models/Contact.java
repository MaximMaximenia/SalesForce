package models;

public class Contact {

    String phone;
    String mobile;
    String firstName;
    String salutation;
    String lastName;
    String email;
    String title;
    String mailingCity;
    String mailingStateProvince;
    String mailingZipPostalCode;
    String mailingCountry;
    String otherCity;
    String otherStateProvince;
    String otherZipPostalCode;
    String otherCountry;
    String fax;
    String homePhone;
    String otherPhone;

    public String getEmail() {
        return email;
    }

    public Contact(String phone, String mobile, String firstName, String salutation, String lastName, String email, String title,
                   String mailingCity, String mailingStateProvince, String mailingZipPostalCode, String mailingCountry, String otherCity,
                   String otherStateProvince, String otherZipPostalCode, String otherCountry, String fax, String homePhone, String otherPhone,
                   String asstPhone, String assistant, String department, String birthdate, String leadSource, String mailingStreet, String otherStreet,
                   String description, String accountName) {

        this.phone = phone;
        this.mobile = mobile;
        this.firstName = firstName;
        this.salutation = salutation;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.mailingCity = mailingCity;
        this.mailingStateProvince = mailingStateProvince;
        this.mailingZipPostalCode = mailingZipPostalCode;
        this.mailingCountry = mailingCountry;
        this.otherCity = otherCity;
        this.otherStateProvince = otherStateProvince;
        this.otherZipPostalCode = otherZipPostalCode;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.homePhone = homePhone;
        this.otherPhone = otherPhone;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.department = department;
        this.birthdate = birthdate;
        this.leadSource = leadSource;
        this.mailingStreet = mailingStreet;
        this.otherStreet = otherStreet;
        this.description = description;
        this.accountName = accountName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public void setMailingStateProvince(String mailingStateProvince) {
        this.mailingStateProvince = mailingStateProvince;
    }

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public void setMailingZipPostalCode(String mailingZipPostalCode) {
        this.mailingZipPostalCode = mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherStateProvince() {
        return otherStateProvince;
    }

    public void setOtherStateProvince(String otherStateProvince) {
        this.otherStateProvince = otherStateProvince;
    }

    public String getOtherZipPostalCode() {
        return otherZipPostalCode;
    }

    public void setOtherZipPostalCode(String otherZipPostalCode) {
        this.otherZipPostalCode = otherZipPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    String asstPhone;
    String assistant;
    String department;
    String birthdate;
    String leadSource;
    String mailingStreet;
    String otherStreet;
    String description;
    String accountName;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
