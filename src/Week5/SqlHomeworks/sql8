--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50),
--birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee (
id SERIAL PRIMARY KEY,
name VARCHAR(50) NOT NULL,
birthday DATE,
email VARCHAR(100)
);

-----------------------
--Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into employee (name, birthday, email) values ('Vernen', '1979-06-14', 'vmilkins0@guardian.co.uk');
insert into employee (name, birthday, email) values ('Robers', '1934-11-19', 'rredier1@ezinearticles.com');
insert into employee (name, birthday, email) values ('Elisabetta', '1916-01-29', 'ecounihan2@ovh.net');
insert into employee (name, birthday, email) values ('Gerrard', '1980-06-20', 'gpowland3@prnewswire.com');
insert into employee (name, birthday, email) values ('Cindelyn', '1988-11-13', 'cgaddesby4@mit.edu');
insert into employee (name, birthday, email) values ('Jasper', '1918-12-10', 'jcousans5@xing.com');
insert into employee (name, birthday, email) values ('Hope', '1946-09-30', 'hjimson6@mozilla.com');
insert into employee (name, birthday, email) values ('Elysee', '1924-11-20', 'elisett7@theatlantic.com');
insert into employee (name, birthday, email) values ('Kellsie', '1993-03-02', null);
insert into employee (name, birthday, email) values ('Kikelia', '1938-07-07', 'kclitherow9@hubpages.com');
insert into employee (name, birthday, email) values ('Konstance', '1991-05-05', 'knazaretha@icq.com');
insert into employee (name, birthday, email) values ('Ralf', '1982-08-10', 'rgheorghieb@wufoo.com');
insert into employee (name, birthday, email) values ('Dosi', null, 'dpinsentc@tiny.cc');
insert into employee (name, birthday, email) values ('Gracie', null, 'gandererd@prweb.com');
insert into employee (name, birthday, email) values ('Clementia', '1909-03-11', 'cagerskowe@archive.org');
insert into employee (name, birthday, email) values ('Tori', '1996-12-23', 'tscurrahf@amazon.de');
insert into employee (name, birthday, email) values ('Ferrel', '1991-04-12', 'fdyballg@cbslocal.com');
insert into employee (name, birthday, email) values ('Tobiah', null, 'tquaintanceh@ameblo.jp');
insert into employee (name, birthday, email) values ('Brynna', '1960-05-17', 'bmcilhargai@un.org');
insert into employee (name, birthday, email) values ('Loise', '1988-10-08', 'lmacneillj@amazon.de');
insert into employee (name, birthday, email) values ('Dorthy', '1962-07-23', 'dkalfk@gizmodo.com');
insert into employee (name, birthday, email) values ('Orran', '1912-05-01', 'oburnhamsl@google.de');
insert into employee (name, birthday, email) values ('Cyrus', '1920-07-20', 'cgwillymm@sciencedirect.com');
insert into employee (name, birthday, email) values ('Briney', '1955-09-21', 'blegertonn@loc.gov');
insert into employee (name, birthday, email) values ('Roobbie', null, 'rivanikovo@github.io');
insert into employee (name, birthday, email) values ('Dore', '1918-12-05', 'dfechniep@prweb.com');
insert into employee (name, birthday, email) values ('Brigitte', '1943-08-06', 'bshuttleq@berkeley.edu');
insert into employee (name, birthday, email) values ('Daren', '1984-10-08', 'drignoldesr@mashable.com');
insert into employee (name, birthday, email) values ('Sherilyn', '1919-06-21', 'smarchents@imageshack.us');
insert into employee (name, birthday, email) values ('Marshall', '1975-06-16', 'mcruickshankst@studiopress.com');
insert into employee (name, birthday, email) values ('Perren', '1912-12-20', null);
insert into employee (name, birthday, email) values ('Torry', '1934-01-12', 'tmacnabv@cbslocal.com');
insert into employee (name, birthday, email) values ('Moritz', '1990-06-27', null);
insert into employee (name, birthday, email) values ('Derron', null, null);
insert into employee (name, birthday, email) values ('Cora', '1978-07-09', 'cpulleny@t-online.de');
insert into employee (name, birthday, email) values ('Kakalina', '1922-06-12', 'khrachovecz@whitehouse.gov');
insert into employee (name, birthday, email) values ('Madge', '1904-10-11', 'mbarmby10@comcast.net');
insert into employee (name, birthday, email) values ('Kettie', '1993-08-30', 'kglover11@pen.io');
insert into employee (name, birthday, email) values ('Buiron', '1951-04-22', 'bapted12@yellowpages.com');
insert into employee (name, birthday, email) values ('Tuckie', '1965-10-25', 'tmccleary13@mac.com');
insert into employee (name, birthday, email) values ('Pepita', null, null);
insert into employee (name, birthday, email) values ('Gayle', '1908-08-04', 'grichen15@people.com.cn');
insert into employee (name, birthday, email) values ('Desirae', '1976-11-10', 'dwagerfield16@ustream.tv');
insert into employee (name, birthday, email) values ('Sidonia', '1993-09-21', 'sjakubovits17@yolasite.com');
insert into employee (name, birthday, email) values ('Oby', '1993-05-18', 'oscholes18@youtu.be');
insert into employee (name, birthday, email) values ('Shermie', '1981-11-17', 'shubner19@homestead.com');
insert into employee (name, birthday, email) values ('Marietta', '1990-03-02', 'mlocard1a@mit.edu');
insert into employee (name, birthday, email) values ('Danny', '1907-02-22', 'ddimitriev1b@wikispaces.com');
insert into employee (name, birthday, email) values ('Lacie', '1957-06-22', 'lsenten1c@cornell.edu');
insert into employee (name, birthday, email) values ('Benton', '1983-10-07', 'bjankovsky1d@arizona.edu');

------
---Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
-------
Update employee
	set name = 'Irmak',
		email = 'irmak@test.com'
		Where id = 3;

Update employee
	set email = 'irmak@test.com'
		Where name = 'Sidonia';

Update employee
	Set name = 'Emma'
		Where birthday = '1979-06-14';

Update employee
	Set birthday = '1990-10-20'
		Where id = 8;


Update employee
	Set name = 'Jane Smith'
		Where email = 'irmak@test.com';


------
-----Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

Delete from employee
	Where id > 10;

Delete from employee
	Where email = 'irmak@test.com';

Delete from employee
	Where name = 'Robers';

Delete From employee
	Where birthday = '1980-06-20';

Delete From employee
	WHERE id = 2;
-------------------------------------------