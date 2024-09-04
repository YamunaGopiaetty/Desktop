SELECT 
  * 
FROM 
  information_schema._pg_foreign_table_columns
ORDER BY
  _pg_foreign_table_columns.nspname ASC;


  CREATE TABLE covid_data (
    id INT PRIMARY KEY,
    country VARCHAR(255),
    active INT,
    death INT,
    recovered INT
);
