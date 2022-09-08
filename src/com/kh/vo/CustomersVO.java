package com.kh.vo;

public class CustomersVO {
    private int csNumber;
    private String csName;
    private String csPWD;
    private String tel;
    private String email;
    private String gender;
    private String address;
    private String birthdate;
    private String join_date;
    private String last_login;

    public CustomersVO(int csNumber, String csName, String csPWD, String tel, String email, String gender, String address, String birthdate, String join_date, String last_login) {
        this.csNumber = csNumber;
        this.csName = csName;
        this.csPWD = csPWD;
        this.tel = tel;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.birthdate = birthdate;
        this.join_date = join_date;
        this.last_login = last_login;
    }

    public int getCsNumber() {
        return csNumber;
    }

    public void setCsNumber(int csNumber) {
        this.csNumber = csNumber;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public String getCsPWD() {
        return csPWD;
    }

    public void setCsPWD(String csPWD) {
        this.csPWD = csPWD;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }
}
