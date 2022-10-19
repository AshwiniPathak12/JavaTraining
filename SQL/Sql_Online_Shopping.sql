#Question1
use estore;
SELECT customer.customer_id ,customer.customer_email, bill.cid
FROM customer
LEFT JOIN bill ON customer.customer_id = bill.cid
where bill.cid is null;

# question 2
SELECT pname,price
FROM product ORDER BY price DESC,pname limit 1;

#question 3
SELECT pname,price
FROM product ORDER BY price,pname limit 1;

#Question 4
use estore;
select product.pid,pname,catgory.catname from catgory INNER JOIN product ON catgory.catid=product.pid ;

#Question 5
use estore;
select customer.customer_id,customer_email,bill.billdate from customer INNER JOIN bill ON customer.customer_id=bill.billno ;

#Question 6

select customer.first_name,billitem.price,sum(billitem.price*qty) from customer join bill on 
bill.cid=customer.customer_id join billitem on billitem.billitem_id=bill.billno group by bill.billdate;

#Question 7
select company.compname,catgory.catname,count(*) from product join
catgory on product.id2=catgory.catid join company on company.compid=product.comid  group by company.compname;

#Question 8
select company.compname,catgory.catname,count(*) from product join
catgory on product.id2=catgory.catid join company on company.compid=product.comid  group by company.compname;


#Question 9
alter table estore.billitem add column return_value varchar (233) ;
select * from  estore.billitem;

select * from  billitem;
select customer.First_name,count(*) from billitem  join bill on billitem.billitem_id=bill.billno
join product  on product.pid=billitem.pid2 join customer
on bill.cid=customer.Customer_Id where billitem.return_value=1 group by product.pname;

#Question 10
#select customer.customer_id,bill.billdate from customer join bill on customer.customer_id=bill.billno;
select bill.billdate,count(*) from billitem join bill on bill.billno=billitem.billn group by billdate;

#question11
use estore;
select * from product
where exparedate >= cast((now()) as date) and exparedate < cast((now() + interval 15 day) as date);


#Question 12
use estore;
select customer.first_name,billitem.qty from bill join billitem on bill.billno=billitem.billn join customer on customer.customer_id=bill.billno; 


#Question 13
select bill.billdate,billitem.price,count(*) from
bill join billitem on billitem.billn=bill.billno group by billitem.price;


#Question 14
select product.discount from product order by discount desc limit 0,1;

#Question 15
select bill.billdate,count(*) from
billitem join bill on bill.billno=billitem.billn group by bill.billdate;