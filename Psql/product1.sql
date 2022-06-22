
//tabels:

CREATE TABLE Unit (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) UNIQUE
);

CREATE TABLE ProductCategory (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL  
);

CREATE TABLE Product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    unit int REFERENCES Unit(id),
    unit_price SMALLINT,
    product_category int REFERENCES ProductCategory(id)
);


CREATE TABLE SaleOrderLine (
    id SERIAL PRIMARY KEY,
    product INT REFERENCES Product(id),
    sale_price SMALLINT
);


ALTER TABLE ProductCategory
add code int ;

ALTER TABLE ProductCategory
add UNIQUE (code);





//Inserting values to the tables:-

INSERT INTO unit(name) values
('hadleigh'),
('zendaya'),
('lusia'),
('dixie'),
('ariadne'),
('stone'),
('seven'),
('dhruv'),
('dharshik'),
('lion');

select * from unit;


insert into ProductCategory (name,code) values
('aa', '101'),
('bb', '102'),
('cc', '103'),
('dd', '104'),
('ee', '105'),
('ff', '106'),
('gg', '107'),
('hh', '108'),
('ii', '109'),
('jj', '110');




select * from ProductCategory;

insert into Product(name, unit, unit_price, Product_Category) values
('bat',2,800,2),
('ball',4,400,1),
('wickets',6,500,2),
('bell',4,200,5),
('jersey',2,700,2),
('helmet',1,100,7),
('Drinks',8,500,9)
('kit',1,2000,6);


select * from Product;


insert into SaleOrderLine(Product, sale_price) values
(1,123),
(2,234),
(3,324),
(4,456),
(5,567),
(6,678),
(7,789),
(8,890);

select * FROM SaleOrderLine;

//Queries : 

SELECT p.name AS Product_name , u.name AS Unit_name pc.name AS Product_Category , p.unit_price AS Price From Product p
LEFT JOIN Unit u
ON p.unit=u.id
LEFT JOIN ProductCategory pc
ON p.product_category=pc.id;

select py.code as product_category_code, max(n) As Max_Qty_Sold
from    
(select s.product as pdt, count(s.product)
as n 
from saleorderline s GROUP BY product) as pc 
join Product p 
on pc.pdt=p.id
join productcategory py 
on p.Product_Category=py.id  
group by py.code 
order by max(n) desc 
LIMIT 1;



SELECT pc.name from ProductCategory pc 
WHERE pc.id NOT IN (SELECT p.Product_Category FROM Product p);




