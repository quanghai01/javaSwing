/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DienThoaiModel;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ListDienThoai {
    ArrayList<DienThoai> A=ConnectDT.getAll();
    
    public ArrayList<DienThoai> getDienThoai(){
        return A;
    }
    
    public int Add(DienThoai dt){
        A.add(dt);
        ConnectDT.insert(dt);
        return 1;
    }

    public DienThoai showByMa(String ma){
        for(DienThoai x:A){
            if(x.getMa().equals(ma))
                return x;
        }
        return null;
    }
    public DienThoai showByName(String name){
        for(DienThoai x:A){
            if(x.getTen().equals(name))
                return x;
        }
        return null;
    }
    public void DelByMa(String ma){
        for (DienThoai dt:A){
            if(dt.getMa().equals(ma))
                A.remove(dt);
            ConnectDT.dele(ma);
        }
    }
    public void Update(DienThoai dt){
        for(DienThoai d:A){
            if(d.getMa().equals(dt.getMa())){
                d.setGia(dt.getGia());
                d.setHang(dt.getHang());
                d.setHinhanh(dt.getHinhanh());
                d.setSoluong(dt.getSoluong());
                d.setTen(dt.getTen());
                ConnectDT.Update(dt);
            }
        }
    }
    
}
