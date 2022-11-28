package service;

import model.BenhAn;

import java.util.List;

public interface IBenhAnService {
    void sua(BenhAn benhAn);

    List<BenhAn> hienThiTatCa();

    List<BenhAn> danhSachSauXoa();

    BenhAn suaBangMa(String ma);

    void xoa(String ma);
}
