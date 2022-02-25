package model;

public class MonHocKhac {
    private int maHS;
    private int maGV;
    private int maMH;
    private int id;

    public MonHocKhac(int maHS, int maGV, int maMH, int id) {
        this.maHS = maHS;
        this.maGV = maGV;
        this.maMH = maMH;
        this.id = id;
    }

    public MonHocKhac() {
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
