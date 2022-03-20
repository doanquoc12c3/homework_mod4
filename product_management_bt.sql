create database product_management_bt;

use product_management_bt;

create table product(
                        id int primary key auto_increment,
                        name varchar(50),
                        price double,
                        description varchar(100),
                        imageURL varchar(100)
);

insert into product(name, price, description, imageURL)
VALUES('iphone',12000,'pro','https://cdn1.hoanghamobile.com/tin-tuc/wp-content/uploads/2021/05/maxresdefault-1.jpg'),
      ('iphone',12000,'pro','https://cdn1.hoanghamobile.com/tin-tuc/wp-content/uploads/2021/05/maxresdefault-1.jpg');

