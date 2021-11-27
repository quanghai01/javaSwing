
package BanHang;


public class BanHang {
    private String ten;
    private long soluong;
    private long thu;
    public BanHang(String ten, long soluong,long thu) {
        this.ten = ten;
        this.soluong = soluong;
        this.thu=thu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public long getSoluong() {
        return soluong;
    }

    public void setSoluong(long soluong) {
        this.soluong = soluong;
    }

    public long getThu() {
        return thu;
    }

    public void setThu(long thu) {
        this.thu = thu;
    }
    
    public String toString(){
        return ten+" "+soluong+" "+thu;
    }
    
}
