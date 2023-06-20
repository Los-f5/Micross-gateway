CREATE TABLE PRODUCTO(
    ID_PRODUCTO NUMERIC(6,0) NOT NULL PRIMARY KEY,
    NOMBRE VARCHAR2(120) NOT NULL UNIQUE,
    DESCRIPCION VARCHAR2(2000) NULL,
    PRECIO NUMERIC(6,2) NOT NULL,
    STOCK NUMERIC(4,0) NOT NULL,
    ESTADO CHAR(1) DEFAULT '1' NOT NULL 
);

CREATE SEQUENCE SEQ_PRODUCTO;

INSERT INTO PRODUCTO(ID_PRODUCTO,NOMBRE,DESCRIPCION,PRECIO,STOCK)
VALUES(SEQ_PRODUCTO.NEXTVAL,'Mouse Cybertel','Mouse inálambrico',30.00,1);

INSERT INTO PRODUCTO(ID_PRODUCTO,NOMBRE,DESCRIPCION,PRECIO,STOCK)
VALUES(SEQ_PRODUCTO.NEXTVAL,'Galaxy S9','Galaxy S9 Edge',3000.00,1);

COMMIT;

SELECT ID_PRODUCTO,NOMBRE,DESCRIPCION,PRECIO,STOCK, ESTADO FROM PRODUCTO;