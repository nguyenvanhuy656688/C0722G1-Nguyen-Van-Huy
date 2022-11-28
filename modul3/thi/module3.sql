drop database if exists module3;
create database module3;
use module3;

 
 create table benh_nhan(
 id varchar(50) primary key,
 ten_benh_nhan varchar(50)
 );
 
 create table benh_an (
 ma_benh_an varchar(50) primary key ,
 ma_benh_nhan varchar(50),
 ten_benh_nhan varchar(50),
 ngay_nhap_vien varchar(50),
 ngay_ra_vien varchar(50),
 ly_do_nhap_vien varchar(50),
 foreign key (ma_benh_nhan) references benh_nhan(id));
 
 insert into benh_nhan value("BN-435","Nguyễn Văn A"),
                            ("BN-123","Nguyễn Văn C"),
                            ("BN-984","Tôn Nữ D"),
                            ("BN-153","Đoàn Thị E");
 insert into benh_an value("BA-001","BN-435","Nguyễn Văn A","07-08-2016","08-08-2019","Ung thư gan giai đoạn cuối"),
                          ("BA-112","BN-123","Nguyễn Văn C","10-08-2019","10-08-2020","Suy thận mạn"),
                          ("BA-223","BN-984","Tôn Nữ D","11-01-2020","08-08-2020","Covid-2019"),
                          ("BA-444","BN-153","Đoàn Thị E","07-08-2017","08-08-2018","Ung thu phổi giai đoạn cuối");
 
 select ba.*, bn.ten_benh_nhan as ten_benh_nhan from benh_an ba join benh_nhan bn on ba.ma_benh_nhan = bn.id where bn.id like "BN-435";
 delete from benh_an where ma_benh_nhan = "BN-435";
 select * from benh_an;