#1
-- It also finds the count for the individual rating group.
Select rating, count(*) as film_count
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
