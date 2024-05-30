---------film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
Select count(*) as film_count
From film
Where length >
(Select avg(length) From film);
-------------------------------------------
-------film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
Select count(*) as max_rental_count
From film
Where rental_rate = (Select max(rental_rate) From film);
-------------------
------film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
Select *
From film
Where rental_rate =(Select min(rental_rate) From film)
And replacement_cost = (Select min(replacement_cost) From film);
---------------------------------------------------------------------
--------------payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
SELECT c.first_name, c.last_name, COUNT(p.customer_id) AS payment_count
FROM customer c
JOIN payment p ON c.customer_id = p.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name
ORDER BY payment_count DESC;
