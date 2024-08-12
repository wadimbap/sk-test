DROP TABLE IF EXISTS sk_example_table;

CREATE TABLE sk_example_table (
                                  id SERIAL PRIMARY KEY,
                                  obj JSONB NOT NULL
);

INSERT INTO sk_example_table (obj) VALUES ('{"current": 0}');
