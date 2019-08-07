CREATE DATABASE custom_car_db;
USE custom_car_db;

CREATE TABLE supplier_master(
	Supp_id INTEGER AUTO_INCREMENT PRIMARY KEY,
	Supp_name VARCHAR(20) NOT NULL,
	Supp_email VARCHAR(60) NOT NULL,
	Supp_phone VARCHAR(20) NOT NULL
	);
CREATE TABLE parts_master(
	Prt_id INTEGER AUTO_INCREMENT PRIMARY KEY,
	Prt_name VARCHAR(60) NOT NULL,
	Supp_id INTEGER, 
	INDEX prt_mst_ind1 (supp_id),
    FOREIGN KEY (Supp_id)
        REFERENCES supplier_master(Supp_id)
        ON DELETE CASCADE
	);
	
CREATE TABLE orders_master(
	Ord_id INTEGER AUTO_INCREMENT PRIMARY KEY,
	Ord_start_date DATE NOT NULL,
	Ord_completion_date DATE NOT NULL,
	Ord_status DATE NOT NULL
	);
	
CREATE TABLE parts_detail(
	Prt_id INTEGER NOT NULL,
	Serial_no VARCHAR(30) not null ,
	Prt_Status VARCHAR(30) NOT NULL ,
	Prt_price DOUBLE NOT NULL,
	Prt_received_date DATE NOT NULL,	
	INDEX prt_det_ind1 (prt_id,serial_no),
    FOREIGN KEY (Prt_id)
        REFERENCES parts_master(Prt_id)
        ON DELETE CASCADE
	);
		
CREATE TABLE orders_detail(
	Ord_id INTEGER NOT NULL,
	Prt_id INTEGER NOT NULL,
	Serial_no VARCHAR(30) NOT NULL,
	INDEX ord_ind1 (Serial_no),
    FOREIGN KEY (Ord_id)
        REFERENCES orders_master(Ord_id)
        ON DELETE CASCADE,
	INDEX ord_ind2 (Prt_id)
	);