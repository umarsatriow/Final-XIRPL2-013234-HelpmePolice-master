package id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Model;

/**
 * Created by Umar on 26/4/2018.
 */

public class User {
    private String email, password, nama, phone, AvatarUrl, Nip, Asal, Jabatan;

    public User() {
    }

    public User(String email, String password, String nama, String phone, String avatarUrl, String nip, String asal, String jabatan) {
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.phone = phone;
        AvatarUrl = avatarUrl;
        Nip = nip;
        Asal = asal;
        Jabatan = jabatan;


    }

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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatarUrl() {
        return AvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        AvatarUrl = avatarUrl;
    }

    public String getNip() {
        return Nip;
    }

    public void setNip(String nip) {
        Nip = nip;
    }

    public String getAsal() {
        return Asal;
    }

    public void setAsal(String asal) {
        Asal = asal;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String jabatan) {
        Jabatan = jabatan;
    }
}
