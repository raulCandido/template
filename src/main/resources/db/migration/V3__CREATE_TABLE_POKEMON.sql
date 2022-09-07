CREATE TABLE public."language" (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	url VARCHAR(255) NOT NULL,
	CONSTRAINT language_pk PRIMARY KEY (id)
);

CREATE TABLE public."pokemon_specie" (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	url VARCHAR(255) NOT NULL,
	CONSTRAINT pokemon_specie_pk PRIMARY KEY (id)
);

CREATE TABLE public."pokemon_specie" (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	url VARCHAR(255) NOT NULL,
	CONSTRAINT pokemon_specie_pk PRIMARY KEY (id)
);

CREATE TABLE public."name" (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	language_id bigserial NOT NULL,
	CONSTRAINT pokemon_specie_pk PRIMARY KEY (id)
	CONSTRAINT language_fk FOREIGN KEY (language_id) REFERENCES "language"(id)
);