create database trans_erd_to_database;
use trans_erd_to_database;
create table phieu_xuat(
                    so_phieu_xuat int primary key,
                    ngay_xuat datetime
                    );
create table vat_tu(
                    ma_vat_tu int primary key,
                    ten_vat_tu varchar(20)
);
create table chi_tiet_phieu_xuat(
                    so_phieu_xuat int,
                    ma_vat_tu int,
                    primary key(so_phieu_xuat,ma_vat_tu),
                    foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
                    foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
                    don_gia_xuat int,
                    so_luong_xuat int
                    
);
create table phieu_nhap(
					so_phieu_nhap int primary key,
                    ngay_nhap int
);
 create table chi_tiet_phieu_nhap(
                    don_gia_nhap int,
                    so_luong_nhap int,
                    ma_vat_tu int,
                    so_phieu_nhap int,
                    primary key(ma_vat_tu,so_phieu_nhap),
                    foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
                    foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
 );

 create table chi_tiet_don_dat_hang(
					so_don_hang int,
                    ma_vat_tu int,
                    primary key (so_don_hang,ma_vat_tu),
                    foreign key(so_don_hang) references don_dat_hang(so_don_hang),
                    foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
 );
 create table nha_cung_cap(
                    ma_nha_cung_cap int primary key,
                    ten_nha_cung_cap varchar(20),
                    dia_chi varchar(40)
 );
 create table don_dat_hang(
                    so_don_hang int primary key,
                    ngay_dat_hang int,
                    ma_nha_cung_cap int,
                    foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
 );
 create table so_dien_thoai(
                   so_dien_thoai int primary key,
                   ma_nha_cung_cap int,
                   foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
 )
                    