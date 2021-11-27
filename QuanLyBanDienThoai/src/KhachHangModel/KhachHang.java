
package KhachHangModel;

/**
 *
 * @author ADMIN
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ten;
    private String diachi;
    private String sdt;
    private String tendt;
    private String hang;
    private String baohanh;
    private Long thanhtien;
    private String thoigian;
    private long soluong;
    public KhachHang() {
    }

    public KhachHang(String ten, String diachi, String sdt, String Tendt, String hang, String baohanh, Long thanhtien, String thoigian,long soluong) {
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tendt = Tendt;
        this.hang = hang;
        this.baohanh = baohanh;
        this.thanhtien = thanhtien;
        this.thoigian = thoigian;
        this.soluong=soluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTendt() {
        return tendt;
    }

    public void setTendt(String Tendt) {
        this.tendt = Tendt;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getBaohanh() {
        return baohanh;
    }

    public void setBaohanh(String baohanh) {
        this.baohanh = baohanh;
    }

    public Long getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(Long thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public long getSoluong() {
        return soluong;
    }

    public void setSoluong(long soluong) {
        this.soluong = soluong;
    }
    
    public String toString(){
        return ten+" "+sdt+" "+diachi+" - "+tendt+" "+hang+" "+baohanh+" "+thanhtien+" - "+thoigian+" "+soluong;
    }
    public int compareTo(KhachHang x){
        return this.ten.compareTo(x.ten);
    }
}
