/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVienModel;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class NhanVienDao {
    ArrayList<NhanVien> A= ConnectNV.getAll();
    public int add(NhanVien nv){
        A.add(nv);
        ConnectNV.insert(nv);
        return 1;
    }
    public ArrayList<NhanVien> getAllNhanVien(){
        return A;
    }
    public int delByMnvVaName(String ma,String name){
        for(NhanVien nv:A){
            if(nv.getMa().equalsIgnoreCase(ma) && nv.getName().equalsIgnoreCase(name)){
                A.remove(nv);
                ConnectNV.dele(ma, name);
                return 1;
            }      
        }
        
        return -1;
    }
    public NhanVien getNhanVienByMnv(String ma){
        for(NhanVien nv:A){
            if(nv.getMa().equalsIgnoreCase(ma))
                return nv;          
        }
        return null;
    }
    public void Update(NhanVien nv){
        for(NhanVien n:A){
            if(n.getMa().equals(nv.getMa())){
                n.setName(nv.getName());
                n.setDiachi(nv.getDiachi());
                n.setGioitinh(nv.getGioitinh());
                n.setHinhanh(nv.getHinhanh());
                n.setLuong(nv.getLuong());
                n.setNgaysinh(nv.getNgaysinh());
                n.setSdt(nv.getSdt());
                ConnectNV.Update(nv);
            }
        }
    }
}

