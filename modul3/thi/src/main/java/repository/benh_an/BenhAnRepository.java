package repository.benh_an;

import model.BenhAn;
import repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepository implements IBenhAnRepository{
    private static final String HIEN_THI_SAU_XOA ="select * from benh_an";
    private static final String HIEN_THI =" select ba.*, bn.ten_benh_nhan as ten_benh_nhan from benh_an ba join benh_nhan bn on ba.ma_benh_nhan = bn.id";
    private static final String XOA ="delete from benh_an where ma_benh_nhan = ?;";


    @Override
    public void sua(BenhAn benhAn) {

    }

    @Override
    public List<BenhAn> hienThiTatCa() {
        List<BenhAn> benhAnList =new ArrayList<>();
        try {
            Connection connection = BaseRepository.ketNoiDB();
            PreparedStatement preparedStatement = connection.prepareStatement(HIEN_THI);
            ResultSet resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String tenBenhNhan = resultSet.getString("ten_benh_nhan");
                String ngayNhapVien = resultSet.getString("ngay_nhap_vien");
                String ngayRaVien = resultSet.getString("ngay_ra_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");
                benhAnList.add(new BenhAn(maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return benhAnList;
    }

    @Override
    public List<BenhAn> danhSachSauXoa() {
        List<BenhAn> benhAnList =new ArrayList<>();
        try {
            Connection connection = BaseRepository.ketNoiDB();
            PreparedStatement preparedStatement = connection.prepareStatement(HIEN_THI_SAU_XOA);
            ResultSet resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String tenBenhNhan = resultSet.getString("ten_benh_an");
                String ngayNhapVien = resultSet.getString("ngay_nhap_vien");
                String ngayRaVien = resultSet.getString("ngay_ra_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");
                benhAnList.add(new BenhAn(maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return benhAnList;
    }

    @Override
    public BenhAn suaBangMa(String ma) {

        return null;
    }

    @Override
    public void xoa(String ma) {
        boolean rowDeleted = false;
        Connection connection = BaseRepository.ketNoiDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(XOA);
            preparedStatement.setString(1, ma);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
