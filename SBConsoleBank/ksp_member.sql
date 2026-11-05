CREATE TABLE bank_member (
    id       VARCHAR2(20) PRIMARY KEY,
    password VARCHAR2(20) NOT NULL,
    name     VARCHAR2(30) NOT NULL,
    email    VARCHAR2(50),
    mobile   VARCHAR2(20),
    type     CHAR(1) DEFAULT 'U' NOT NULL
);
INSERT INTO bank_member (id, password, name, type) VALUES ('admin', '1234', 'admin', 'A');
COMMIT;