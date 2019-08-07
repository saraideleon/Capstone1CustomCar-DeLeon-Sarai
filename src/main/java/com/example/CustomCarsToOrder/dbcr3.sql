CREATE DATABASE custom_car_db;
select * from supplier_master;
select * from parts_type;
select * from orders_master;
select * from individual_parts;
select * from orders_inventory;

insert into individual_parts(prtid,serialno,prtstat,prtprice) values(1,'Tyre10001','AVAILABLE',500);
ALTER TABLE table_name RENAME COLUMN old_col_name TO supplier_id;

--USE custom_car_db;
--alter table supplier_master;


CREATE TABLE supplier_master(
	supplier_Id INTEGER AUTO_INCREMENT PRIMARY KEY,
	supp_email VARCHAR(20) NOT NULL,
	supp_name VARCHAR(60) NOT NULL,
	supp_phone VARCHAR(20) NOT NULL
	);
CREATE TABLE parts_type(
	Prtid INTEGER AUTO_INCREMENT PRIMARY KEY,
	Prtname VARCHAR(60) NOT NULL,
	supplier_Id INTEGER, 
	INDEX prttypeindex1 (supplier_Id),
    FOREIGN KEY (supplier_Id)
        REFERENCES supplier_master(supplier_Id)
        ON DELETE CASCADE
	);
	
CREATE TABLE orders_master(
	Ordid INTEGER AUTO_INCREMENT PRIMARY KEY,
	Ordstartdate DATE NOT NULL,
	Ordcompletiondate DATE NOT NULL,
	Ordstatus DATE NOT NULL
	);
	
CREATE TABLE individual_parts(
	IndPrtid INTEGER AUTO_INCREMENT PRIMARY KEY,
    Prtid INTEGER, 
	Serialno VARCHAR(30) NOT NULL ,
	PrtStatus VARCHAR(30) NOT NULL ,
	Prtprice DOUBLE NOT NULL,
	INDEX ind_prt_ind2 (prtid),
    FOREIGN KEY (prtid)
        REFERENCES parts_type(prtid)
        ON DELETE CASCADE
	);
		
CREATE TABLE orders_inventory(
	Orddetailid INTEGER AUTO_INCREMENT PRIMARY KEY,
	Ordid INTEGER NOT NULL,
	IndPrtid INTEGER NOT NULL,
	INDEX ord_ind3 (Ordid),
    FOREIGN KEY (Ordid)
        REFERENCES orders_master(Ordid)
        ON DELETE CASCADE,
	INDEX ord_ind4 (IndPrtid),
    FOREIGN KEY (IndPrtid)
        REFERENCES individual_parts(IndPrtid)
        ON DELETE CASCADE
	);
    