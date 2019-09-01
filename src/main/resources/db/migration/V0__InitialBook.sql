CREATE TABLE public.book
(
    id   BIGINT NOT NULL,
    name CHARACTER varying(255),
    CONSTRAINT book_pkey PRIMARY KEY (id)
);
ALTER TABLE public.book
    OWNER TO admin;