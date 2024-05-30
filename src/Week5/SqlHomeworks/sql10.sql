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
