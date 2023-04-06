package com.example.myapplication;

import java.io.Serializable;

public class username1 implements Serializable {
    private String namadepan;
    private String namabelakang;
    private String nomorhp;


    public username1(String namadepan, String namabelakang, String nomorhp) {
        this.namadepan = namadepan;
        this.namabelakang = namabelakang;
        this.nomorhp = nomorhp;
    }

    public String getNamadepan() {
        return namadepan;
    }

    public void setNamadepan(String namadepan) {
        this.namadepan = namadepan;
    }

    public String getNamabelakang() {
        return namabelakang;
    }

    public void setNamabelakang(String namabelakang) {
        this.namabelakang = namabelakang;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }
}
