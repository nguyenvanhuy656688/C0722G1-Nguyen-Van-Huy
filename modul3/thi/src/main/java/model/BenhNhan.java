package model;

public class BenhNhan {
    String id ;
    String tenBenhNhan;

    public BenhNhan(String id, String tenBenhNhan) {
        this.id = id;
        this.tenBenhNhan = tenBenhNhan;
    }

    public BenhNhan() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }
}
