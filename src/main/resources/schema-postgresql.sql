DROP TABLE IF EXISTS "role", "user", "rolemap";

CREATE TABLE "role"
(
  id        BIGSERIAL PRIMARY KEY NOT NULL,
  role_name VARCHAR(100)          NOT NULL
);

CREATE TABLE "user"
(
  id       BIGSERIAL PRIMARY KEY NOT NULL,
  username VARCHAR(100)          NOT NULL,
  password VARCHAR(100)          NOT NULL,
  role_id  BIGSERIAL REFERENCES "role" (id)
);

CREATE TABLE "rolemap"
(
  id        BIGSERIAL PRIMARY KEY NOT NULL,
  user_id   BIGSERIAL REFERENCES "user" (id),
  role_id   BIGSERIAL REFERENCES "role" (id)
);

