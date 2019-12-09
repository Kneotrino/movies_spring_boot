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
