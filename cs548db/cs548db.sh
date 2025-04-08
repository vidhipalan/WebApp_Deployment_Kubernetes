#!/bin/bash
set -e
psql -v ON_ERROR_STOP=1 -v password="$DATABASE_PASSWORD" --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
 CREATE USER cs548user PASSWORD :'password';
 CREATE DATABASE cs548 WITH OWNER cs548user;
 GRANT ALL PRIVILEGES ON DATABASE cs548 TO cs548user;
 \c cs548 postgres
 GRANT ALL ON SCHEMA public TO cs548user;
EOSQL
