create database if not exists `ecommerce-db`;

use `ecommerce-db`;

create table supplier(supp_id int primary key,
                     supp_name varchar(50) not null,
                     supp_city varchar(50) not null,
                     supp_phone varchar(50)not null);
                     
create table customer(cus_id int primary key,
                     cus_name varchar(20)not null,
                     cus_phone varchar(10)not null,
                     cus_city varchar(30)not null,
                     cus_gender char);
                     
create table category(cat_id int primary key,
                     cat_name varchar(20)not null);
                     
create table product(pro_id int primary key,
                     pro_name varchar(20) default "Dummy", 
                     pro_desc varchar(60),
                     cat_id int, 
                     Foreign key(cat_id) references category(cat_id));
create table supplier_pricing(pricing_id int primary key,
                             prod_id int,
                             supp_id int,
                             supp_price int default 0,
                             Foreign key (supp_id) references supplier(supp_id),
                             Foreign key(pro_id) references  product(pro_id));
create table `order`(ord_id int primary key,
				  ord_amount int not null,
                  ord_date date not null,
                  cus_id int,
                  pricing_id int,
                  Foreign key(cus_id) references  customer(cus_id),
                  Foreign key(pricing_id) references supplier_pricing(pricing_id));
create table rating(rat_id int primary key,
                   ord_id int,
                   rat_ratstars int not null,
                   Foreign key(ord_id) references  `order`(ord_id));

INSERT INTO SUPPLIER VALUES(1,"Rajesh Retails","Delhi",'1234567890');
INSERT INTO SUPPLIER VALUES(2,"Appario Ltd.","Mumbai",'2589631470');
INSERT INTO SUPPLIER VALUES(3,"Knome products","Banglore",'9785462315');
INSERT INTO SUPPLIER VALUES(4,"Bansal Retails","Kochi",'8975463285');
INSERT INTO SUPPLIER VALUES(5,"Mittal Ltd.","Lucknow",'7898456532');

INSERT INTO CUSTOMER VALUES(1,"AAKASH",'9999999999',"DELHI",'M');
INSERT INTO CUSTOMER VALUES(2,"AMAN",'9785463215',"NOIDA",'M');
INSERT INTO CUSTOMER VALUES(3,"NEHA",'9999999999',"MUMBAI",'F');
INSERT INTO CUSTOMER VALUES(4,"MEGHA",'9994562399',"KOLKATA",'F');
INSERT INTO CUSTOMER VALUES(5,"PULKIT",'7895999999',"LUCKNOW",'M');

INSERT INTO CATEGORY VALUES( 1,"BOOKS");
INSERT INTO CATEGORY VALUES(2,"GAMES");
INSERT INTO CATEGORY VALUES(3,"GROCERIES");
INSERT INTO CATEGORY VALUES (4,"ELECTRONICS");
INSERT INTO CATEGORY VALUES(5,"CLOTHES");

INSERT INTO PRODUCT VALUES(1,"GTA V","Windows 7 and above with i5 processor and 8GB RAM",2);
INSERT INTO PRODUCT VALUES(2,"TSHIRT","SIZE-L with Black, Blue and White variations",5);
INSERT INTO PRODUCT VALUES(3,"ROG LAPTOP","Windows 10 with 15inch screen, i7 processor, 1TB SSD",4);
INSERT INTO PRODUCT VALUES(4,"OATS","Highly Nutritious from Nestle",3);
INSERT INTO PRODUCT VALUES(5,"HARRY POTTER","Best Collection of all time by J.K Rowling",1);
INSERT INTO PRODUCT VALUES(6,"MILK","1L Toned MIlk",3);
INSERT INTO PRODUCT VALUES(7,"Boat EarPhones","1.5Meter long Dolby Atmos",4);
INSERT INTO PRODUCT VALUES(8,"Jeans","Stretchable Denim Jeans with various sizes and color",5);
INSERT INTO PRODUCT VALUES(9,"Project IGI","compatible with windows 7 and above",2);
INSERT INTO PRODUCT VALUES(10,"Hoodie","Black GUCCI for 13 yrs and above",5);
INSERT INTO PRODUCT VALUES(11,"Rich Dad Poor Dad","Written by RObert Kiyosaki",1);
INSERT INTO PRODUCT VALUES(12,"Train Your Brain","By Shireen Stephen",1);

INSERT INTO SUPPLIER_PRICING VALUES(1,1,2,1500);
INSERT INTO SUPPLIER_PRICING VALUES(2,3,5,30000);
INSERT INTO SUPPLIER_PRICING VALUES(3,5,1,3000);
INSERT INTO SUPPLIER_PRICING VALUES(4,2,3,2500);
INSERT INTO SUPPLIER_PRICING VALUES(5,4,1,1000);
INSERT INTO SUPPLIER_PRICING VALUES(6,12,2,780);
INSERT INTO SUPPLIER_PRICING VALUES(7,12,4,789);
INSERT INTO SUPPLIER_PRICING VALUES(8,3,1,31000);
INSERT INTO SUPPLIER_PRICING VALUES(9,1,5,1450);
INSERT INTO SUPPLIER_PRICING VALUES(10,4,2,999);
INSERT INTO SUPPLIER_PRICING VALUES(11,7,3,549);
INSERT INTO SUPPLIER_PRICING VALUES(12,7,4,529);
INSERT INTO SUPPLIER_PRICING VALUES(13,6,2,105);
INSERT INTO SUPPLIER_PRICING VALUES(14,6,1,99);
INSERT INTO SUPPLIER_PRICING VALUES(15,2,5,2999);
INSERT INTO SUPPLIER_PRICING VALUES(16,5,2,2999);

INSERT INTO `ORDER` VALUES (101,1500,"2021-10-06",2,1);
INSERT INTO `ORDER` VALUES(102,1000,"2021-10-12",3,5);
INSERT INTO `ORDER` VALUES(103,30000,"2021-09-16",5,2);
INSERT INTO `ORDER` VALUES(104,1500,"2021-10-05",1,1);
INSERT INTO `ORDER` VALUES(105,3000,"2021-08-16",4,3);
INSERT INTO `ORDER` VALUES(106,1450,"2021-08-18",1,9);
INSERT INTO `ORDER` VALUES(107,789,"2021-09-01",3,7);
INSERT INTO `ORDER` VALUES(108,780,"2021-09-07",5,6);
INSERT INTO `ORDER` VALUES(109,3000,"2021-09-10",5,3);
INSERT INTO `ORDER` VALUES(110,2500,"2021-09-10",2,4);
INSERT INTO `ORDER` VALUES(111,1000,"2021-09-15",4,5);
INSERT INTO `ORDER` VALUES(112,789,"2021-09-16",4,7);
INSERT INTO `ORDER` VALUES(113,31000,"2021-09-16",1,8);
INSERT INTO `ORDER` VALUES(114,1000,"2021-09-16",3,5);
INSERT INTO `ORDER` VALUES(115,3000,"2021-09-16",5,3);
INSERT INTO `ORDER` VALUES(116,99,"2021-09-17",2,14);

INSERT INTO RATING VALUES(1,101,4);
INSERT INTO RATING VALUES(2,102,3);
INSERT INTO RATING VALUES(3,103,1);
INSERT INTO RATING VALUES(4,104,2);
INSERT INTO RATING VALUES(5,105,4);
INSERT INTO RATING VALUES(6,106,3);
INSERT INTO RATING VALUES(7,107,4);
INSERT INTO RATING VALUES(8,108,4);
INSERT INTO RATING VALUES(9,109,3);
INSERT INTO RATING VALUES(10,110,5);
INSERT INTO RATING VALUES(11,111,3);
INSERT INTO RATING VALUES(12,112,4);
INSERT INTO RATING VALUES(13,113,2);
INSERT INTO RATING VALUES(14,114,1);
INSERT INTO RATING VALUES(15,115,1);
INSERT INTO RATING VALUES(16,116,0);

# Q 3)	Display the total number of customers based on gender 
#       who have placed orders of worth at least Rs.3000.          
Select count(p.cus_gender) as "Number of Customers", p.cus_gender from
(Select c.cus_id, c.cus_name, c.cus_gender, o.ord_id, o.ord_amount
from customer as c, `order` as o where o.cus_id=c.cus_id and o.ord_amount>=3000 group by c.cus_id) as p
group by cus_gender;                             
                             
# Q 4)	Display all the orders along with product name ordered by a customer having Customer_Id=2.
select pr.pro_name,p.ord_id,p.ord_date,p.cus_id,p.ord_amount from product pr inner join
(select o.ord_id, o.pricing_id, o.ord_date,o.cus_id,o.ord_amount, s.pro_id from `order` O, supplier_pricing S
where cus_id=2 and o.pricing_id=s.pricing_id) as P on p.pro_id=pr.pro_id;

# Q 5)	Display the Supplier details who can supply more than one product.

select * from Supplier having Supp_id in
(select supp_id from supplier_pricing group by supp_id having count(pro_id)>1 );
                     
 # Q 6)	Find the least expensive product from each category and print the table with category id, name, product name and price of the product.                    
  
Select c.cat_id,c.cat_Name,Q.pro_name, min(Q.supp_price) as Price_of_Product from
 category c inner join
 (select s.pro_id, cat_id, supp_price, p.pro_name from supplier_pricing S, product P
 where s.pro_id=p.pro_id) as Q on c.cat_id=Q.cat_id group by cat_id;

# Q 7)	Display the Id and Name of the Product ordered after “2021-10-05”.

Select p.pro_id, p.pro_name from product P inner join
(select s.pro_id,o.pricing_id from `order` o,supplier_pricing S 
 where ord_date > "2021-10-05"  and o.pricing_id=s.pricing_id) as Q on q.pro_id=p.pro_id;
 
 # Q 8)	Display customer name and gender whose names start or end with character 'A'.
 
 Select cus_name,cus_gender from Customer where cus_name like 'A%' or cus_name like '%A';
 
 # Q 9)	Create a stored procedure to display supplier id, name, rating and Type_of_Service. 
 #      For Type_of_Service, If rating =5, print “Excellent Service”,If rating >4 print “Good Service”, 
 #      If rating >2 print “Average Service” else print “Poor Service”.
 delimiter &&
 create procedure Display_Supplier_Value()
 begin
 select s.supp_id as Supplier_Id, s.supp_name as Supplier_Name, avg(a.rat_ratstars) as Rating,
 case
     when avg(a.rat_ratstars)=5 then "Excellent Service"
     when avg(a.rat_ratstars)>4 then "Good Service"
     when avg(a.rat_ratstars)>2 then "Avg Service"
     else "Poor Service" end
     as Type_of_service from Supplier S inner join
 (select q.ord_id,q.pricing_id,s.Supp_id, q.rat_ratstars from supplier_pricing s inner join
 (select o.pricing_id,r.rat_ratstars,r.ord_id from rating r, `order` o where r.ord_id=o.ord_id)
 as Q on q.pricing_id=s.pricing_id order by ord_id) as A on a.supp_id=s.supp_id group by Supplier_Id;
 end &&
 
 call Display_Supplier_Value;