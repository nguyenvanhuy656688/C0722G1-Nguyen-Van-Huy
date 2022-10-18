create database exercise2;
use exercise2;
CREATE TABLE customer (
    c_id INT PRIMARY KEY,
    name VARCHAR(25),
    c_age INT
);

CREATE TABLE product (
    p_id INT PRIMARY KEY,
    p_name VARCHAR(25),
    p_price INT
);

CREATE TABLE _order (
    o_id INT PRIMARY KEY,
    c_id INT,
    o_date DATETIME,
    o_total_price INT,
    FOREIGN KEY (c_id)
        REFERENCES customer (c_id)
);

CREATE TABLE order_detail (
    o_id INT,
    p_id INT,
    PRIMARY KEY (o_id , p_id),
    FOREIGN KEY (o_id)
        REFERENCES _order (o_id),
    FOREIGN KEY (p_id)
        REFERENCES product (p_id),
    o_dqty INT
);

INSERT INTO customer 
VALUES(1,'Minh Quân',10),
	  (2,'Ngọc Oanh',20),
      (3,'Hồng Hà',50);
      
INSERT INTO product
VALUES(1,'may giat', 3),
      (2,'tu lanh', 5),
      (3,'dieu hoa', 7),
      (4,'quat',1),
      (5,'bep dien',2);
      
INSERT INTO _order
VALUES(1, 1, '2006-03-26', NULL),
      (2, 2, '2006-03-23', NULL),
      (3, 1, '2006-03-16', NULL);
      
INSERT INTO order_detail
VALUES(1,1,3),
	 (3,3,7),
     (1,4,2),
     (2,1,1),
     (3,1,8),
     (2,5,4),
     (2,3,3);

#Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select o_id,o_date,o_total_price from _order ;
#Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.name,product.p_name from customer
join _order on customer.c_id = _order.c_id
join _order on _order.o_id = order_detail.o_id
join product on product.p_id = order_detail.p_id;
#Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer.c_id,customer.name,customer.c_age, _order.o_id
from customer join _order on _order.c_id=customer.c_id
where _order.c_id is null ;
#Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
select _order.o_id, _order.o_date, order_detail.o_dqty * product.p_price as tatol
from _order
join order_detail on _order.o_id = order_detail.o_id
join product on order_detail.p_id = product.p_id;

