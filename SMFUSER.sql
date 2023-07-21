DROP TABLE product; 
DROP TABLE customers;

CREATE TABLE product
(
    CODE VARCHAR2(4) CONSTRAINT PK_PRODUCT PRIMARY KEY,    -- 제품코드
    PNAME VARCHAR2(50), -- 제품명
    MANAGER VARCHAR2(20), -- 작성자
    REGISTER_DATE DATE     -- 등록일자
);


CREATE TABLE customers
(
    CUSTOMER VARCHAR2(20),
    ADDRESS VARCHAR2(20),
    CONTACT VARCHAR2(20)
);

INSERT INTO product (code, pname, manager, register_date) VALUES ('1231', 'Product', 'Kim', SYSDATE);
INSERT INTO customers (customer, address, contact) VALUES ('Customer A', 'Address A', 'Contact A');

SELECT * FROM product;
SELECT * FROM customers;

SELECT p.code, p.pname, p.manager, p.register_date,
       c.customer, c.address, c.contact
       
FROM product p
JOIN customers c ON p.code = c.code;

SELECT * FROM product;

COMMIT;







