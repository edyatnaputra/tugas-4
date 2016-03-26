package praktikum;

public class Bukualamat {
    
    private String nama;
    private String alamat;
    private String nope;
    private String email;
    
    
    public Bukualamat(){
        nama="";
        alamat="";
        nope="";
        email="";
    }
    
    

    public String getNama() {
        return nama;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNope() {
        return nope;
    }

    public void setNope(String nope) {
        this.nope = nope;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display (){
        System.out.println("Nama      :"+nama);
        System.out.println("Alamat    :"+alamat);
        System.out.println("Nope      :"+nope);
        System.out.println("Email     :"+email);
        
    }
    
}
