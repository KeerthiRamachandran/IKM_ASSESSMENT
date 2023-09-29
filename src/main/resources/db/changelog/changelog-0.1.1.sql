
CREATE TABLE IF NOT EXISTS public.citizen
(
    id SERIAL NOT NULL,
    address character varying(255) COLLATE pg_catalog."default",
    date_of_birth timestamp(6) without time zone,
    name character varying(255) COLLATE pg_catalog."default",
    phone character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT citizen_pkey PRIMARY KEY (id)
)