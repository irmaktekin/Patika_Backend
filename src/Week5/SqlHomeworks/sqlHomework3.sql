--city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
select city as city_name, country as country_name
from city
Join country on city.country_id = country.country_id;

-----------------------------------
--customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

select customer.first_name as name, customer.last_name as surname, payment.payment_id
from payment
Join customer on customer.customer_id = payment.customer_id;
----------------------------------------------------------------
---customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
select customer.first_name as name, customer.last_name as surname, rental.rental_id
from customer
Join rental on customer.customer_id = rental.customer_id;

---------------
---city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
Select city, country
From city
Left Join country on city.country_id = country.country_id;
-----------
--customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
Select customer.first_name as name, customer.last_name as surname, payment.payment_id
From payment
Right Join customer on customer.customer_id = payment.customer_id;
-----------
---customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
Select customer.first_name, customer.last_name, rental.rental_id
From customer
Full Join rental on customer.customer_id = rental.rental_id;
------------------
-------------------------------------------

---actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
(Select first_name From actor)
Union
(Select first_name From customer);
-------------------------------
---actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
(Select first_name From actor)
Intersect
(Select first_name From customer);
--------------------------------
----actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
(Select first_name From actor)
Except
(Select first_name From customer);

-----------------------------
----- FOR REPEATED -------------
---actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
(Select first_name From actor)
Union All
(Select first_name From customer);
-------------------------------
---actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
(Select first_name From actor)
Intersect All
(Select first_name From customer);
--------------------------------
----actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
(Select first_name From actor)
Except All
(Select first_name From customer);