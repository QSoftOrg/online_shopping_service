--liquibase formatted sql

--changeset id:1 author:misirghi
--comment: Creating database schema

CREATE SCHEMA IF NOT EXISTS ONLINESHOP AUTHORIZATION postgres;
--CREATE USER IF NOT EXISTS app PASSWORD 'app';

--changeset id:2 author:misirghi splitStatements:false
--comment: Adding an app user to the schema
DO
$do$
Declare
    userName varchar := 'app';
BEGIN
   IF EXISTS (
      SELECT FROM pg_catalog.pg_roles
      WHERE  rolname = userName) THEN

      RAISE NOTICE 'Role app already exists. Skipping.';
   ELSE
      BEGIN   -- nested block
         CREATE ROLE app LOGIN PASSWORD 'app';
      EXCEPTION
         WHEN duplicate_object THEN
            RAISE NOTICE 'Role app was just created by a concurrent transaction. Skipping.';
      END;
   END IF;
END
$do$;

--changeset id:3 author:misirghi
--comment: Grant roles on schema to app user
GRANT ALL ON SCHEMA ONLINESHOP TO app;
--GRANT ALL ON SCHEMA FE2BEFFILTERING TO sa;
