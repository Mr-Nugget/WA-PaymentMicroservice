CREATE TABLE public.payment
(
    payment_id bigint NOT NULL,
    authorized boolean,
    booking_id bigint,
    create_date timestamp without time zone,
    currency character varying(255) COLLATE pg_catalog."default",
    price real,
    CONSTRAINT payment_pkey PRIMARY KEY (payment_id)
)

TABLESPACE pg_default;

ALTER TABLE public.payment
    OWNER to wildadventure;
    
    
CREATE TABLE public.transaction
(
    transaction_id bigint NOT NULL,
    funding_source character varying(255) COLLATE pg_catalog."default",
    message character varying(255) COLLATE pg_catalog."default",
    payer_country_code character varying(255) COLLATE pg_catalog."default",
    payer_firstname character varying(255) COLLATE pg_catalog."default",
    payer_mail character varying(255) COLLATE pg_catalog."default",
    payer_name character varying(255) COLLATE pg_catalog."default",
    status character varying(255) COLLATE pg_catalog."default",
    transaction_number character varying(255) COLLATE pg_catalog."default",
    update_date timestamp without time zone,
    payment_id bigint,
    CONSTRAINT transaction_pkey PRIMARY KEY (transaction_id),
    CONSTRAINT fkq9m7rb5uydysanp8smxcovxlh FOREIGN KEY (payment_id)
        REFERENCES public.payment (payment_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.transaction
    OWNER to wildadventure;