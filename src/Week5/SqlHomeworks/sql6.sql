
#1
#It is rounded to two digits.

Select round(avg(rental_rate),2) as avg_rate
From film;

#2
Select count(*)
From film
Where title like 'C%';

#3
Select max(length) as max_length
From film
Where rental_rate = 0.99;

#4
Select count(distinct replacement_cost) as count_distinct_cost
From film
Where length > 150;
