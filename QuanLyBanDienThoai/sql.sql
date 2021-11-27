CREATE TABLE demo.account (
  taikhoan varchar(50) ,
  matkhau varchar(50), 
  checkAdmin int ,
  checkOnline int ,
  tennguoidung varchar(50) ,
  PRIMARY KEY (taikhoan)
);
INSERT INTO demo.account VALUES ('admin','123456',1,1,'Admin'),
('hoanganh','123456',0,0,'Nguyễn Hoàng Anh'),
('quanghai','123456',0,0,'Nguyễn Quang Hải'),
('thinhung','123456',0,0,'Nguyễn Thị Nhung');

CREATE TABLE demo.banhang (
  ten varchar(50) NOT NULL,
  soluong long,
  thu long,
  PRIMARY KEY (ten)
);
INSERT INTO demo.banhang VALUES ('Apple','0','0'),
('Realme','0','0'),
('SamSung','0','0'),
('Vsmart','0','0'),
('Xiaome','0','0');


CREATE TABLE demo.dienthoai (
	ma varchar(20) ,
  ten varchar(50) ,
  hang varchar(50) ,
  hinhanh varchar(200) ,
  gia long,
  soluong long,
  PRIMARY KEY (ma)
);
INSERT INTO demo.dienthoai VALUES ('a1','Iphone 8','Apple','No avatar','30000','10'),
('a2','Iphone X','Apple','No avatar','25000','10'),
('r1','Realme 6','Realme','No avatar','25000','10'),
('ss1','SamSung s1','SamSung','No avatar','20000','10'),
('ss2','SamSung s2','SamSung','No avatar','25000','10'),
('v1','Vsmart 5G','Vsmart','No avatar','25000','10'),
('x1','poco x1','Xiaome','No avatar','20000','10'),
('x2','K30 5G','Xiaome','No avatar','20000','10');


CREATE TABLE demo.khachhang (
  ten varchar(50) ,
  diachi varchar(50) ,
  sdt varchar(20) ,
  tendt varchar(30) ,
  hang varchar(20) ,
  baohanh varchar(20) ,
  thanhtien long,
  thoigian varchar(50) ,
  soluong long,
  PRIMARY KEY (sdt)
);
CREATE TABLE demo.nhanvien (
  ma varchar(20) ,
  ten varchar(50) ,
  luong long,
  ngaysinh varchar(20) ,
  gioitinh varchar(10) ,
  diachi varchar(50),
  hinhanh varchar(200) ,
  sdt varchar(20),
  PRIMARY KEY (ma)
);
INSERT INTO nhanvien VALUES ('nv01','Admin','25000','14/04/2001','Nam','Hà Nội','No avatar','01234567'),
('nv02','Admin','25000','30/05/2001','Nam','Phú Thọ','No avatar','01234567'),
('nv03','Nguyễn Quang Hải','22000','04/04/2001','Nam','Ba Vì','No avatar','036894'),
('nv04','Nguyễn Hoàng Anh','20000','30/05/2001','Nam','Hà Nội','No avatar','8274825'),
('nv05','Nguyễn Thị Nhung','20000','12/12/2001','Nam','Hà Nội','No avatar','34535');