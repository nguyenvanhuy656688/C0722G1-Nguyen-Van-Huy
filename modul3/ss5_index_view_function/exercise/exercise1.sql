create database product;
use product;
 # bước 1:
create table product  (
               id int primary key,
               product_code int,
               product_name varchar(50),
               product_price int,
               product_amount int,
               product_descrip varchar(50),
               product_status varchar(50)
 );
 # Bước 2: thêm dữ liệu vào
 insert into product(id ,product_code,product_name,product_price ,product_amount ,product_descrip ,product_status ) 
 values (1,5,'kẹo',5000,5,'ok','ok'),
		(2,6,'uy',6000,8,'ok','ok'),
        (3,7,'ca',6000,9,'ok','ok');
# bước 3: Tạo index với product_code,prduct_price,product_status
select product_code, product_price , product_status from product ;
explain select product_code from product;
create unique index i_product on product(product_code,product_price , product_status);
select * from i_product;
# Bước 4: Tạo,sửa,xóa view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng product
-- tạo view
create view w_product as 
select  product_code,product_name, product_price , product_status from product;
select*from w_product;
-- Tiến hành sửa đổi view
update w_produt set product_name = 'kẹo mạch nha' where product_name = 'uy';
-- Xóa view
delete product_code from w_product where product_code = 3;
# Bước 5: 
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
CREATE PROCEDURE sp_get_all_product()
begin
select product_code,product_name, product_price , product_status as class_prduct
from product  ;
end //
delimiter ;

-- Tạo store procedure thêm một sản phẩm mới
alter procedure sp_get_all_product() add color varchar(40);



