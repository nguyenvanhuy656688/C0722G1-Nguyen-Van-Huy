package service;

import model.BenhAn;
import repository.benh_an.BenhAnRepository;
import repository.benh_an.IBenhAnRepository;

import java.util.List;

public class BenhAnService implements IBenhAnService {
    IBenhAnRepository iBenhAnRepository = new BenhAnRepository();

    @Override
    public void sua(BenhAn benhAn) {
        iBenhAnRepository.sua(benhAn);
    }

    @Override
    public List<BenhAn> hienThiTatCa() {
        return iBenhAnRepository.hienThiTatCa();
    }

    @Override
    public List<BenhAn> danhSachSauXoa() {
        return iBenhAnRepository.danhSachSauXoa();
    }

    @Override
    public  BenhAn suaBangMa(String ma) {
       return iBenhAnRepository.suaBangMa(ma);
    }

    @Override
    public void xoa(String ma) {

    }
}
