CREATE TABLE public.purchase (
	id bigserial NOT NULL,
	customer_id VARCHAR(36) NOT NULL,
	book_id VARCHAR(36) NOT NULL,
	CONSTRAINT purchase_pk PRIMARY KEY (id)
);