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
