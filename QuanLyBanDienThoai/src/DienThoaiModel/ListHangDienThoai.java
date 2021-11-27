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
public class ListHangDienThoai {
    ArrayList<String> listHang=new ArrayList<>();
    
    public ArrayList<String> getList(){
        listHang.add("SamSung");
        listHang.add("Apple");
        listHang.add("Realme");
        listHang.add("Xiaome");
        listHang.add("Vsmart");
        
        return listHang;
    }
    
    public int Add(String hang){
        listHang.add(hang);
        return 1;
    }
   
    
}
