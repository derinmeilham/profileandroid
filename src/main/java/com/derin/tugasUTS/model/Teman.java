package com.derin.tugasUTS.model;

//NIM   : 10116004
//NAMA  : Derin Meilham
//Kelas : IF1
//Pengerjaan : 21 Mei 2019

public class Teman {

    private String name;
    private String nim;
    private String kelas;
    private String social;
    private String email;
    private String telepon;

    public String getNim()
    {
        return nim;
    }

    public void setNim(String nim)
    {
        this.nim = nim;
    }

    public String getKelas()
    {
        return kelas;
    }

    public void setKelas(String kelas)
    {
        this.kelas = kelas;
    }

    public String getSocial()
    {
        return social;
    }

    public void setSocial(String social)
    {
        this.social = social;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelepon()
    {
        return telepon;
    }

    public void setTelepon(String telepon)
    {
        this.telepon = telepon;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}