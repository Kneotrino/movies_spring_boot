CREATE TABLE movie_details(
   id serial PRIMARY key,
   budget numeric(2),   
   company VARCHAR (50),
   country VARCHAR (50),
   director VARCHAR (50),
   genre VARCHAR (50),
   gross numeric(2),
   name VARCHAR (50),
   rating VARCHAR (50),
   released date,
   runtime smallint,
   score real,
   star VARCHAR (50),
   votes integer,
   writer VARCHAR (50),
   year smallint
);

ALTER TABLE movie_details OWNER TO kneotrino;

INSERT INTO public.movie_details (budget,company,country,director,genre,gross,"name",rating,released,runtime,score,star,votes,writer,"year") VALUES
(8000000.0,'Columbia Pictures Corporation','USA','Rob Reiner','Adventure',52287414.00,'Stand by Me','R','1986-08-22',89,8.1,'Wil Wheaton',299174,'Stephen King',1986)
,(6000000.0,'Paramount Pictures','USA','John Hughes','Comedy',70136369.00,'Ferris Bueller''s Day Off','PG-13','1986-06-11',103,7.8,'Matthew Broderick',264740,'John Hughes',1986)
,(15000000.0,'Paramount Pictures','USA','Tony Scott','Action',179800601.00,'Top Gun','PG','1986-05-16',110,6.9,'Tom Cruise',236909,'Jim Cash',1986)
,(18500000.0,'Twentieth Century Fox Film Corporation','USA','James Cameron','Action',85160248.00,'Aliens','R','1986-07-18',137,8.4,'Sigourney Weaver',540152,'James Cameron',1986)
,(9000000.0,'Walt Disney Pictures','USA','Randal Kleiser','Adventure',18564613.00,'Flight of the Navigator','PG','1986-08-01',90,6.9,'Joey Cramer',36636,'Mark H. Baker',1986)
,(6000000.0,'Hemdale','UK','Oliver Stone','Drama',138530565.00,'Platoon','R','1987-02-06',120,8.1,'Charlie Sheen',317585,'Oliver Stone',1986)
,(25000000.0,'Henson Associates (HA)','UK','Jim Henson','Adventure',12729917.00,'Labyrinth','PG','1986-06-27',101,7.4,'David Bowie',102879,'Dennis Lee',1986)
,(6000000.0,'De Laurentiis Entertainment Group (DEG)','USA','David Lynch','Drama',8551228.00,'Blue Velvet','R','1986-10-23',120,7.8,'Isabella Rossellini',146768,'David Lynch',1986)
,(9000000.0,'Paramount Pictures','USA','Howard Deutch','Comedy',40471663.00,'Pretty in Pink','PG-13','1986-02-28',96,6.8,'Molly Ringwald',60565,'John Hughes',1986)
,(15000000.0,'SLM Production Group','USA','David Cronenberg','Drama',40456565.00,'The Fly','R','1986-08-15',96,7.5,'Jeff Goldblum',129698,'George Langelaan',1986)
;

INSERT INTO public.movie_details (budget,company,country,director,genre,gross,"name",rating,released,runtime,score,star,votes,writer,"year") VALUES
(8800000.0,'Rimfire Films','Australia','Peter Faiman','Adventure',174635000.00,'Crocodile Dundee','PG-13','1986-09-26',97,6.5,'Paul Hogan',79465,'Ken Shadie',1986)
,(16000000.0,'Thorn EMI Screen Entertainment','UK','Russell Mulcahy','Action',5900000.00,'Highlander','R','1986-03-07',116,7.2,'Christopher Lambert',104860,'Gregory Widen',1986)
,(6000000.0,'Twentieth Century Fox Film Corporation','USA','David Seltzer','Comedy',8200000.00,'Lucas','PG-13','1986-03-28',100,6.8,'Corey Haim',12228,'David Seltzer',1986)
,(25000000.0,'Twentieth Century Fox Film Corporation','USA','John Carpenter','Action',11100000.00,'Big Trouble in Little China','PG-13','1986-07-02',99,7.3,'Kurt Russell',101678,'Gary Goldman',1986)
,(15000000.0,'De Laurentiis Entertainment Group (DEG)','USA','Michael Mann','Crime',8620929.00,'Manhunter','R','1986-08-15',120,7.2,'William Petersen',54000,'Thomas Harris',1986)
,(17000000.0,'Producers Sales Organization (PSO)','USA','Adrian Lyne','Drama',6734844.00,'9½ Weeks','R','1986-02-21',117,5.9,'Mickey Rourke',31798,'Elizabeth McNeill',1986)
,(10000000.0,'De Laurentiis Entertainment Group (DEG)','USA','Stephen King','Action',7433663.00,'Maximum Overdrive','R','1986-07-25',98,5.4,'Emilio Estevez',24881,'Stephen King',1986)
,(25000000.0,'Geffen Company, The','USA','Frank Oz','Comedy',38747385.00,'Little Shop of Horrors','PG-13','1986-12-19',94,6.9,'Rick Moranis',53327,'Howard Ashman',1986)
,(2700000.0,'New Century Entertainment Corporation','USA','Mike Marvin','Action',3500000.00,'The Wraith','PG-13','1986-11-21',93,5.9,'Charlie Sheen',11635,'Mike Marvin',1986)
,(35000000.0,'Universal Pictures','USA','Willard Huyck','Action',16295774.00,'Howard the Duck','PG','1986-08-01',110,4.6,'Lea Thompson',36020,'Steve Gerber',1986)
;

INSERT INTO public.movie_details (budget,company,country,director,genre,gross,"name",rating,released,runtime,score,star,votes,writer,"year") VALUES
(2000000.0,'New Line Cinema','USA','Stephen Herek','Action',13167232.00,'Critters','PG-13','1986-04-11',82,6.0,'Dee Wallace',25517,'Domonic Muir',1986)
,(11000000.0,'Orion Pictures','USA','Alan Metter','Comedy',91258000.00,'Back to School','PG-13','1986-06-13',96,6.6,'Rodney Dangerfield',23120,'Rodney Dangerfield',1986)
,(4700000.0,'Cannon Films','USA','Tobe Hooper','Comedy',8025872.00,'The Texas Chainsaw Massacre 2','UNRATED','1986-08-22',89,5.6,'Dennis Hopper',21253,'L.M. Kit Carson',1986)
,(15000000.0,'Jay Weston Productions','USA','Clint Eastwood','Action',42724017.00,'Heartbreak Ridge','R','1986-12-05',130,6.8,'Clint Eastwood',32954,'James Carabatsos',1986)
,(25000000.0,'Paramount Pictures','USA','Leonard Nimoy','Adventure',109713132.00,'Star Trek IV: The Voyage Home','PG','1986-11-26',119,7.3,'William Shatner',66366,'Gene Roddenberry',1986)
,(0.0,'TriStar Pictures','USA','John Badham','Comedy',40697761.00,'Short Circuit','PG','1986-05-09',98,6.6,'Ally Sheedy',47068,'S.S. Wilson',1986)
,(0.0,'Neue Constantin Film','Italy','Jean-Jacques Annaud','Crime',7153487.00,'The Name of the Rose','R','1986-09-24',130,7.8,'Sean Connery',86991,'Umberto Eco',1986)
,(0.0,'TriStar Pictures','USA','Sidney J. Furie','Action',24159872.00,'Iron Eagle','PG-13','1986-01-17',117,5.3,'Louis Gossett Jr.',11304,'Kevin Alyn Elders',1986)
,(25000000.0,'Paramount Pictures','USA','Michael Ritchie','Action',79817937.00,'The Golden Child','PG-13','1986-12-12',94,5.9,'Eddie Murphy',42997,'Dennis Feldman',1986)
,(1900000.0,'Hemdale','USA','Tim Hunter','Crime',4600000.00,'River''s Edge','R','1987-05-08',99,7.1,'Crispin Glover',12862,'Neal Jimenez',1986)
;
