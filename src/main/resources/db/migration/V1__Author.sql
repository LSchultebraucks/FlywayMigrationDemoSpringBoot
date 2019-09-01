CREATE TABLE public.author(
    id BIGINT NOT NULL,
    author_name CHARACTER varying(255),
    CONSTRAINT author_pkey PRIMARY KEY (id)
);
ALTER TABLE public.author
    OWNER TO admin;

ALTER TABLE public.book
    ADD author_id bigint,
    ADD CONSTRAINT author_id FOREIGN KEY (author_id)
        REFERENCES public.author (id) MATCH SIMPLE;

CREATE SEQUENCE public.hibernate_sequence
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;
ALTER TABLE public.hibernate_sequence
    OWNER TO admin;