package model;

public class HocSinh {
    private int maHS;
    private int tenHS;
    private String ngaySinh;
    private String lop;
    private String gt;

    public HocSinh(int maHS, int tenHS, String ngaySinh, String lop, String gt) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gt = gt;
    }

    public HocSinh() {
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public int getTenHS() {
        return tenHS;
    }

    public void setTenHS(int tenHS) {
        this.tenHS = tenHS;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }
}
