----------Homework1-------
#1
-- It displays the related columns.
SELECT title, description
FROM film;
--It sorts the rows primarily with the title then the description.
Select *
From film
Order by title, description;

#2
Select *
From film
Where length > 60 and length <75;

#3
Select *
From film
Where rental_rate = 0.99 And (replacement_cost = 12.99 Or replacement_cost = 28.99);

#4
Select last_name
From customer
Where first_name = 'Mary';

#5
Select *
From film
Where length<=50 And Not In(2.99, 4.99);
-----------Homework 2------
#1
Select *
From film
Where replacement_cost Between 12.99 And 16.98;

#2
Select first_name, last_name
From actor
Where first_name In ('Penelope', 'Nick', 'Ed');

#3
Select *
From film
Where rental_rate In(0.99, 2.99, 4.99) And replacement_cost In (12.99, 15.99, 28,99);

--------Homework 3----------
#1
Select country
From country
Where country like ('A%a');

#2
Select c.country
From country c
Where country like ('_____%n');

#3
Select title
From film
Where title ilike ('%t%t%t%t%');

#4
Select *
From film
Where title like 'C%' And length >90 And rental_rate = 2.99;

---------Homework4-----------

#1
Select distinct(replacement_cost) As replacement_cost
From film;

#2
Select count(distinct replacement_cost) As unique_count
From film;

#3
Select count(title)
From film
Where title like 'T%' And rating = 'G';

#4
Select count(country)
From country
Where length(country)=5;

#5
Select count(city)
From city
Where city like '%r' Or city like'%R';
----------------------------------------------------
