create database task_case_study;
use case_study;

#2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự
SELECT *FROM nhan_vien
WHERE
    (ho_ten LIKE 'H%') OR (ho_ten LIKE 'T%')
	OR (ho_ten LIKE 'K%')
	AND CHAR_LENGTH(ho_ten) <= 15;
#3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”
select *from khach_hang
WHERE
			YEAR(CURDATE()) - YEAR(ngay_sinh) >= 18
            AND YEAR(CURDATE()) - YEAR(ngay_sinh) <= 50
            AND( dia_chi LIKE '%Quảng Trị')
            OR (dia_chi LIKE '%Đà Nẵng');
#4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng(Diamond)
SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    COUNT(hop_dong.ma_khach_hang) AS so_lan_dat_phong
FROM khach_hang
JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
JOIN loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
WHERE
    (loai_khach.ten_loai_khach = 'Diamond')
GROUP BY hop_dong.ma_khach_hang
ORDER BY so_lan_dat_phong;

#5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
SELECT
 kh.ma_khach_hang,kh.ho_ten,lk.ten_loai_khach,hd.ma_hop_dong,dv.ten_dich_vu,hd.ngay_lam_hop_dong,hd.ngay_ket_thuc,
    (IFNULL(dv.chi_phi_thue, 0) + SUM(IFNULL(hdct.so_luong, 0) * IFNULL(dvdk.gia, 0))) AS tong_tien
FROM
    hop_dong hd
        LEFT JOIN
    khach_hang kh ON kh.ma_khach_hang = hd.ma_khach_hang
        LEFT JOIN
    dich_vu dv ON dv.ma_dich_vu = hd.ma_dich_vu
        LEFT JOIN
    hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
        LEFT JOIN
    loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
        LEFT JOIN
    dich_vu_di_kem dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
GROUP BY hd.ma_hop_dong
ORDER BY kh.ma_khach_hang;

#6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu
-- của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
SELECT 
    dv.ma_dich_vu,
    dv.ten_dich_vu,
    dv.dien_tich,
    dv.chi_phi_thue,
    ldv.ten_loai_dich_vu
FROM
    dich_vu dv
        JOIN
    loai_dich_vu ldv ON dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
WHERE
    dv.ma_dich_vu NOT IN (SELECT 
            hd.ma_dich_vu
        FROM
            hop_dong hd
        WHERE
            hd.ngay_lam_hop_dong BETWEEN '2021-01-01' AND '2021-03-31');
       
#7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021
SELECT 
    dv.ma_dich_vu,
    dv.ten_dich_vu,
    dv.dien_tich,
    dv.so_nguoi_toi_da,
    dv.chi_phi_thue,
    ldv.ten_loai_dich_vu
FROM
    dich_vu dv
        JOIN
    loai_dich_vu ldv ON ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
		join
	hop_dong hd on dv.ma_dich_vu = hd.ma_dich_vu
WHERE
    dv.ma_dich_vu NOT IN (SELECT 
            hd.ma_dich_vu
        FROM
            hop_dong hd
        WHERE
            YEAR(ngay_lam_hop_dong) IN (2021)) and year(ngay_lam_hop_dong) = 2020 group by dv.ma_dich_vu;
       
#8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- cách 1:
SELECT DISTINCT
    kh.ho_ten
FROM
    khach_hang kh;
-- cách 2:
SELECT 
    kh.ho_ten
FROM
    khach_hang kh
GROUP BY kh.ho_ten;
-- cach 3:
SELECT 
    kh.ho_ten
FROM
    khach_hang kh 
UNION SELECT 
    kh.ho_ten
FROM
    khach_hang kh;

#9. mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
SELECT 
    MONTH(hop_dong.ngay_lam_hop_dong) AS month,
    COUNT(hop_dong.ma_hop_dong) AS so_luong_khach_hang
FROM
    hop_dong
WHERE
    YEAR(hop_dong.ngay_lam_hop_dong) = 2021
GROUP BY MONTH(hop_dong.ngay_lam_hop_dong)
ORDER BY MONTH(hop_dong.ngay_lam_hop_dong);

#10	Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
SELECT
	hop_dong.ma_hop_dong,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    hop_dong.tien_dat_coc,
    sum(ifnull(hop_dong_chi_tiet.so_luong,0)) AS so_luong_dich_vu_di_kem
FROM
	hop_dong LEFT JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
GROUP BY
	hop_dong.ma_hop_dong;
#11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dvdk.ten_dich_vu_di_kem from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem 
join hop_dong hd on hd.ma_hop_dong = hdct.ma_hop_dong 
join khach_hang kh on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach
where (lk.ten_loai_khach = 'Diamond') and kh.dia_chi like '%Vinh' or kh.dia_chi like '%Quảng Ngãi';

#12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem),
 -- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021
 select hop_dong.ma_hop_dong, nhan_vien.ho_ten,khach_hang.ho_ten ,khach_hang.so_dien_thoai,dich_vu.ten_dich_vu ,
 sum(ifnull(hop_dong_chi_tiet.so_luong,0)) AS so_luong_dich_vu_di_kem from hop_dong
 join khach_hang on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
 join nhan_vien on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
 join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
 join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
 where hop_dong.ngay_lam_hop_dong not in (
                 select hop_dong_chi_tiet.ma_hop_dong  from hop_dong_chi_tiet 
                 join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
                 where hop_dong.ngay_lam_hop_dong between '2021-01-01'and '2021-06-30'
 )
 and (year(ngay_lam_hop_dong) = 2020 and month(ngay_lam_hop_dong) in (10,11,12)) group by hop_dong.ma_hop_dong
 ;
 
# 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng
select dvdk.*, SUM(hdct.so_luong) AS so_luong_dich_vu_di_kem
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem
having so_luong_dich_vu_di_kem >= all (select sum(hdct.so_luong)
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem);



 #14.  Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
select hop_dong.ma_hop_dong, loai_dich_vu.ten_loai_dich_vu, dich_vu_di_kem.ten_dich_vu_di_kem, count(hop_dong_chi_tiet.ma_dich_vu_di_kem) as so_lan_su_dung 
from hop_dong
join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
join loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group by hop_dong_chi_tiet.ma_dich_vu_di_kem
having so_lan_su_dung = 1
order by hop_dong.ma_hop_dong;

#15. Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select nhan_vien.ma_nhan_vien, nhan_vien.ho_ten, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan, nhan_vien.so_dien_thoai, nhan_vien.dia_chi
from nhan_vien
join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do
join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan
join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
where year(hop_dong.ngay_lam_hop_dong) between 2020 and 2021 group by nhan_vien.ma_nhan_vien having count(hop_dong.ma_hop_dong) <= 3 order by nhan_vien.ma_nhan_vien
;

#16. Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
select  nhan_vien.ho_ten as nhan_vien_can_xoa
from nhan_vien
left join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
where nhan_vien.ma_nhan_vien not in (
                   select  nhan_vien.ma_nhan_vien
                   from nhan_vien
                   inner join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
				   where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021
)
group by  nhan_vien.ma_nhan_vien;

#17. Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ

set sql_safe_updates = 0;
UPDATE loai_khach
join khach_hang on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
SET
    loai_khach.ten_loai_khach = 'Diamond' 
WHERE khach_hang.ma_loai_khach = 
            (
            select ma_loai_khach from (
            SELECT khach_hang.ma_loai_khach,
                    IFNULL(dich_vu.chi_phi_thue, 0) + SUM(IFNULL(hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia, 0)) AS tong_tien
            FROM
                khach_hang
            JOIN loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
            JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
            JOIN hop_dong_chi_tiet ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
            JOIN dich_vu_di_kem ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
            JOIN dich_vu ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
            WHERE YEAR(hop_dong.ngay_lam_hop_dong) = 2021 AND loai_khach.ten_loai_khach ='Platinum'
            GROUP BY hop_dong.ma_hop_dong , khach_hang.ma_loai_khach
            HAVING tong_tien >= 1000000
            ) abc
            );
 #18. Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
set sql_safe_updates = 0;
delete from khach_hang 
where
    ma_khach_hang IN (SELECT 
        hop_dong.ma_khach_hang
    from
        hop_dong
    where
        year(hop_dong.ngay_lam_hop_dong) < 2021);
        
 #19.  Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi. 
set SQL_SAFE_UPDATES = 0;
update dich_vu_di_kem set dich_vu_di_kem.gia = dich_vu_di_kem.gia*2
where dich_vu_di_kem.ten_dich_vu_di_kem in (
select 
ten_dich_vu_di_kem from(
select 
    dich_vu_di_kem.ten_dich_vu_di_kem,
    sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem,
    hop_dong.ngay_lam_hop_dong
from dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2020
GROUP BY hop_dong_chi_tiet.ma_dich_vu_di_kem
HAVING so_luong_dich_vu_di_kem>10) as zxc);

#20. Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id 
-- (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select nhan_vien.ma_nhan_vien,nhan_vien.ho_ten,nhan_vien.email,
       nhan_vien.so_dien_thoai,nhan_vien.ngay_sinh,nhan_vien.dia_chi 
       FROM nhan_vien 
union
select khach_hang.ma_khach_hang,khach_hang.ho_ten,khach_hang.email,
	   khach_hang.so_dien_thoai,khach_hang.ngay_sinh,khach_hang.dia_chi 
       FROM khach_hang;
#21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Đà Nẵng” và 
-- đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.

create view v_nhan_vien as
select nv.*,
       hd.ngay_lam_hop_dong
from hop_dong hd 
join nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
where nv.dia_chi LIKE '%Đà Nẵng%'
and month(hd.ngay_lam_hop_dong) = 4
and year(hd.ngay_lam_hop_dong) = 2021;

# 22.Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.
SET sql_safe_updates = 0;
update v_nhan_vien
set  dia_chi = 'Liên Chiểu'
where (
SELECT*from (
SELECT nhan_vien.ma_nhan_vien from v_nhan_vien)
 as a);
-- dia_chi = regexp_replace(dia_chi, 'Đà Nẵng', 'Liên Chiểu')

#23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với 
-- ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang.
DELIMITER //
CREATE PROCEDURE sp_xoa_khach_hang(IN p_id INT)
BEGIN
delete from khach_hang
WHERE khach_hang.ma_khach_hang = p_id;
end//
DELIMITER //;
CALL sp_xoa_khach_hang(5) ;

-- 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với
--  yêu cầu sp_them_moi_hop_dong phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung,
--  với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
DELIMITER //
create procedure sp_them_moi_hop_dong( ma_hop_dong int, ngay_lam_hop_dong DATETIME, ngay_ket_thuc  DATETIME, tien_dat_coc DOUBLE, ma_nhan_vien int, ma_khach_hang int, ma_dich_vu INT)
BEGIN
insert into hop_dong
values(ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu);
end //
DELIMITER // ;
call sp_them_moi_hop_dong(1000, '2020-09-25', '2022-09-25', 1540000, 1, 1, 1);







