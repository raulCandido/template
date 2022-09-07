CREATE TABLE public."language" (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	url VARCHAR(255) NOT NULL,
	CONSTRAINT language_pk PRIMARY KEY (id)
);

CREATE TABLE public.pokemon_shape (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	language_id bigserial not null,
	CONSTRAINT pokemon_shape_pk PRIMARY KEY (id),
	CONSTRAINT language_fk FOREIGN KEY (language_id) REFERENCES "language"(id)
);

CREATE TABLE public.awesome_name (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	language_id bigserial NOT NULL,
	Pokemon_shape_id bigserial NOT NULL,
	CONSTRAINT awesome_name_pk PRIMARY KEY (id),
	CONSTRAINT Pokemon_shape_fk FOREIGN KEY (Pokemon_shape_id) REFERENCES pokemon_shape(id),
	CONSTRAINT language_fk FOREIGN KEY (language_id) REFERENCES "language"(id)
);



CREATE TABLE public.pokemon_specie (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	url VARCHAR(255) NOT NULL,
	Pokemon_shape_id bigserial NOT NULL,
	CONSTRAINT Pokemon_shape_fk FOREIGN KEY (Pokemon_shape_id) REFERENCES pokemon_shape(id),
	CONSTRAINT pokemon_specie_pk PRIMARY KEY (id)
);

CREATE TABLE public.name (
	id bigserial NOT NULL,
	name VARCHAR(255) NOT NULL,
	language_id bigserial NOT NULL,
	Pokemon_shape_id bigserial NOT NULL,
	CONSTRAINT name_pk PRIMARY KEY (id),
	CONSTRAINT Pokemon_shape_fk FOREIGN KEY (Pokemon_shape_id) REFERENCES pokemon_shape(id),
	CONSTRAINT language_fk FOREIGN KEY (language_id) REFERENCES "language"(id)
);


