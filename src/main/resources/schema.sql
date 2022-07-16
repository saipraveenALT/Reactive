CREATE TABLE IF NOT EXISTS employee (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    email text,
    phno int
);

CREATE TABLE IF NOT EXISTS project (
    project_id SERIAL,
    project_name text
--    projects_id int,
--    CONSTRAINT fk_employee
--      FOREIGN KEY (projects_id)
--	  REFERENCES employee(id)
--	  ON UPDATE NO ACTION
--      ON DELETE NO ACTION
);