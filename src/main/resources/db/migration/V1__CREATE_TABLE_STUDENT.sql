CREATE TABLE public.student (
	id bigserial NOT NULL,
	cod_enroll VARCHAR(36) NOT NULL,
	birth_date DATE NULL,
	name varchar(255) NULL,
	CONSTRAINT student_pk PRIMARY KEY (id)
);