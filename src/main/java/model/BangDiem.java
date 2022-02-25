package model;

public class BangDiem {
    private int maHS;
    private String maMH;
    private int diemThi;
    private String ngayKT;

    public BangDiem(int maHS, String maMH, int diemThi, String ngayKT) {
        this.maHS = maHS;
        this.maMH = maMH;
        this.diemThi = diemThi;
        this.ngayKT = ngayKT;
    }

    public BangDiem() {
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }
}
