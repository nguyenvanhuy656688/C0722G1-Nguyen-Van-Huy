CREATE DATABASE mananger_sales;
USE mananger_sales;
CREATE TABLE customer (
    c_id INT PRIMARY KEY,
    c_name VARCHAR(10),
    c_age INT
);

CREATE TABLE oder (
    o_id INT PRIMARY KEY,
    c_id INT,
    FOREIGN KEY (c_id) REFERENCES customer (c_id),
    o_date DATE,
    o_total_price VARCHAR(10)
);

CREATE TABLE product (
    p_id INT PRIMARY KEY,
    p_name VARCHAR(10),
    p_price VARCHAR(10)
);

CREATE TABLE oderDetail(
o_id INT,
p_id INT,
PRIMARY KEY(o_id,p_id),
FOREIGN KEY(o_id) REFERENCES oder(o_id),
FOREIGN KEY(p_id) REFERENCES product(p_id),
od_qty VARCHAR(10)
);