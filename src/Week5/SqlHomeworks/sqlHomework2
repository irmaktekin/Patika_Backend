#1
Select *
From film
Where title like '%n'
Order by length desc
Limit 5;

#2
Select *
From film
Where title like '%n'
Order By Length
Limit 5
Offset 5;

#3
Select *
From customer
Where store_id = 1
Order by last_name desc
Limit 4;

####################

#1
Select round(avg(rental_rate),2) as avg_rate
From film;

#2
Select count(*)
From film
Where title like 'C%';

#3
Select max(length)
From film
Where rental_rate = 0.99;

#4
Select count(distinct replacement_cost) as count_distinct_cost
From film
Where length > 150;

############################

#1
-- It also finds the count for the individual rating group.
Select rating, count(*) as rating_count
From film
Group by rating;

--It sorts the films according to film count desc also.
#2
Select count(title) as film_count,replacement_cost
From film
Group by replacement_cost
Having count(title)>50
Order by film_count desc;

#3
Select count(*) as count_customer, store_id
From customer
Group by store_id
Order by count_customer;

#4
Select count(*) as count_city, country_id
From city
Group by country_id
Order By count_city desc
Limit 1;
