package com.company;

public class User {
    private String userName;
    private String password;
    public Boolean statusAkun;

    private boolean cekAkun(String parUsername, String parPassword) {
        userName = "RizkiAdam";
        password = "terbaikselalu";
        statusAkun = parPassword.equals(password) && parUsername.equals(userName);
        return statusAkun;


    }

    private void hasilLogin(Boolean parStatusAkun, String parUsername) {
        if (parStatusAkun == true) {
            System.out.println("\n******HALLO " + parUsername.toUpperCase()
                    + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("\nOoops, Username atau Password Anda Salah");
        }
    }

    public void pengecekkanLogin(String parUsername, String parPassword) {
        cekAkun(parUsername, parPassword);
        hasilLogin(statusAkun, parUsername);
    }
}
