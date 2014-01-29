package id.go.kemenkeu.djpk.usermanagement.service;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import java.util.List;

public interface UserManagementService {
    // method untuk class Pemda
    public void simpan(Pemda p);
    public void hapus(Pemda p);
    public Pemda cariById(Integer id);
    public List<Pemda> cariSemua(Integer start, Integer rows);
    
    // method untuk class Profile
    
    // method untuk class User
    
    // method untuk class Tahun
    
    // method untuk class Provinsi
}
