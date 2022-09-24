package com.example.example_app.model;

import javax.persistence.*;

@Entity
@Table(name = "Adaylar")
public class UserInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "ad_soyad")
    private String fullName;

    @Column(name = "tc_kimlik_no")
    private long citizenId;

    @Column(name = "adres")
    private String address;

    @Column(name = "telefon_no")
    private long phoneNumber;

    @Column(name = "mail")
    private String mail;

    @Column(name = "dogum_tarihi")
    private String birthDate;

    @Column(name = "perakende_tic_yapıldı_mı")
    private String soru1;

    @Column(name = "lokumcu_baba_tercih_sebebi")
    private String soru2;

    @Column(name = "il_ilce_semt")
    private String soru3;

    @Column(name = "yatırım_miktarı")
    private String soru4;

    @Column(name = "eklemek_istedikleriniz")
    private String eklemekIstedikleriniz;

    public UserInformation() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSoru1() {
        return soru1;
    }

    public void setSoru1(String soru1) {
        this.soru1 = soru1;
    }

    public String getSoru2() {
        return soru2;
    }

    public void setSoru2(String soru2) {
        this.soru2 = soru2;
    }

    public String getSoru3() {
        return soru3;
    }

    public void setSoru3(String soru3) {
        this.soru3 = soru3;
    }

    public String getSoru4() {
        return soru4;
    }

    public void setSoru4(String soru4) {
        this.soru4 = soru4;
    }

    public String getEklemekIstedikleriniz() {
        return eklemekIstedikleriniz;
    }

    public void setEklemekIstedikleriniz(String eklemekIstedikleriniz) {
        this.eklemekIstedikleriniz = eklemekIstedikleriniz;
    }

    public long getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(long citizenId) {
        this.citizenId = citizenId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "fullName='" + fullName + '\'' +
                ", citizenId=" + citizenId +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", mail='" + mail + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", soru1='" + soru1 + '\'' +
                ", soru2='" + soru2 + '\'' +
                ", soru3='" + soru3 + '\'' +
                ", soru4='" + soru4 + '\'' +
                ", eklemekIstedikleriniz='" + eklemekIstedikleriniz + '\'' +
                '}';
    }
}
