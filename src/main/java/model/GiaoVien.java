package model;

public class GiaoVien {
    private int maGV;
    private String tenGV;
    private String number;

    public GiaoVien(int maGV, String tenGV, String number) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.number = number;
    }

    public GiaoVien() {
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
