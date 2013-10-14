package com.dynastymasra.domain;

/**
 * User : Dynastymasra
 * Name : Dimas Ragil T
 * Email: dynastymasra@gmail.com
 * Date : 10/14/13
 * Time : 9:51 PM
 */

public class Mahasiswa {
    private String nim;
    private String name;
    private String email;
    private String jurusan;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
