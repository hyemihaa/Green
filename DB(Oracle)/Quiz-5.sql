-- Q0 .실습준비
--1. shopping_admin 계정을 생성하세요.
 
CREATE USER shopping_admin IDENTIFIED BY qwer1234;
--2. shopping_admin 계정은 아래에 대한 권한을 추가 하세요.
-- connect, resource, dba
GRANT CONNECT,RESOURCE, DBA TO shopping_admin;
--3. 해당 계정으로 DBeaver에서 로그인을 하고 새로운 SQL 편집기를 활용하세요.

-- Q1-1.
--1. customers 테이블 생성
-- customer_no 컬럼은 NUMBER, 기본키를 가집니다
-- customer_name 컬럼은 이름을 작성하며 빈값이 올 수 없습니다.
--또한 적절한 데이터 타입을 설정하세요.
-- customer_gender 컬럼을 성별을 가지며 W(여자) 또는 M(남자)만을 가집니다.
--또한 적절한 데이터 타입을 설정하고, NULL을 가질 수 없습니다
-- customer_email 컬럼은 이메일을 작성하며 유일한 값을 가지며 빈값이 올 수 없습니다.
--또한 적절한 데이터 타입을 설정하세요.
-- customer_phone 컬럼은 핸드폰 번호를 작성하며 빈값이 올 수 없습니다.
--또한 적절한 데이터 타입을 설정하세요.

CREATE TABLE CUSTOMERS (
	CUSTOMER_NO NUMBER PRIMARY KEY,
	CUSTOMER_NAME varchar2(50) NOT NULL,
	CUSTOMER_GENDER varchar2(2) CHECK (CUSTOMER_GENDER IN('W', 'M')) NOT NULL,
	CUSTOMER_EMAIL varchar2(50) UNIQUE NOT NULL,
	CUSTOMER_PHONE varchar2(50) NOT NULL
);

--2. 각각의 컬럼에 대한 코멘트를 적용하세요.
COMMENT ON COLUMN CUSTOMERS.CUSTOMER_NO IS '고객 번호'; 
COMMENT ON COLUMN CUSTOMERS.CUSTOMER_NAME IS '고객 이름'; 
COMMENT ON COLUMN CUSTOMERS.CUSTOMER_GENDER IS '고객 성별'; 
COMMENT ON COLUMN CUSTOMERS.CUSTOMER_EMAIL IS '고객 이메일'; 
COMMENT ON COLUMN CUSTOMERS.CUSTOMER_PHONE IS '고객 휴대전화 번호'; 

COMMIT;

SELECT * FROM CUSTOMERS ;

-- Q1-2.
--1. orders 테이블 생성
-- order_no 컬럼은 NUMBER, 기본키를 가집니다.
-- order_date 컬럼은 주문 날짜를 작성하며 기본값으로 SYSDATE를 갖습니다.
--또한 빈값을 가질 수 없으며 적절한 데이터 타입을 설정하세요.
-- order_name 컬럼은 주문 상품을 작성하며 빈값을 가질 수 없습니다.
--또한 적절한 데이터 타입을 설정하세요.
-- order_amount 컬럼은 주문 금액을 작성하며 빈값을 가질 수 없습니다.
--또한 적절한 데이터 타입을 설정하세요.
-- customer_no 컬럼은 customers 테이블의 customer_no 컬럼을 참조합니다.

CREATE TABLE ORDERS (
	ORDER_NO NUMBER PRIMARY KEY,
	ORDER_DATE DATE DEFAULT sysdate NOT NULL,
	ORDER_NAME varchar2(100) NOT NULL,
	ORDER_AMOUNT NUMBER NOT NULL,
	CUSTOMER_NO NUMBER REFERENCES CUSTOMERS(CUSTOMER_NO)
);

--2. 각각의 컬럼에 대한 코멘트를 적용하세요.
COMMENT ON COLUMN ORDERS.ORDER_NO IS '주문 번호';
COMMENT ON COLUMN ORDERS.ORDER_DATE IS '주문 날짜';
COMMENT ON COLUMN ORDERS.ORDER_NAME IS '주문 상품';
COMMENT ON COLUMN ORDERS.ORDER_AMOUNT IS '주문 가격';
COMMENT ON COLUMN ORDERS.customer_no IS 'customers 테이블의 customer_no(고객번호) 컬럼을 참조합니다';

--Q2 시퀀스 생성
--1. customers 시퀀스 생성
-- 해당 시퀀스는 customer_seq 이름을 가지며 1로 시작하여 1씩 증가합니다.
CREATE SEQUENCE CUSTOMER_SEQ 
INCREMENT BY 1
START WITH 1;

--2. orders 시퀀스 생성
-- 해당 시퀀스는 order_seq 이름을 가지며 1로 시작하여 1씩 증가합니다.
CREATE SEQUENCE ORDER_SEQ 
START WITH 1
INCREMENT BY 1;

--Q3-1. CUSTOMERS 테이블 데이터 삽입
--customer_no는 시퀀스를 활용해야 합니다.
--'John Doe', 'M', 'john.doe@example.com', '123-456-7890'
--'Jane Smith', 'W', 'jane.smith@example.com', '987-654-3210'
--'Bob Johnson', 'M', 'bob.johnson@example.com', '555-555-5555'
--'Alice White', 'W', 'alice.white@example.com', '777-777-7777'
--'Charlie Brown', 'M', 'charlie.brown@example.com', '999-999-9999'
--'Eva Davis', 'W', 'eva.davis@example.com', '111-111-1111'
--'Frank Lee', 'M', 'frank.lee@example.com', '222-222-2222'
--'Grace Taylor', 'W', 'grace.taylor@example.com', '333-333-3333'
--'David Clark', 'M', 'david.clark@example.com', '444-444-4444'
--'Helen Wilson', 'W', 'helen.wilson@example.com', '666-666-6666'
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'John Doe', 'M', 'john.doe@example.com', '123-456-7890');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Jane Smith', 'W', 'jane.smith@example.com', '987-654-3210');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Bob Johnson', 'M', 'bob.johnson@example.com', '555-555-5555');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Alice White', 'W', 'alice.white@example.com', '777-777-7777');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Charlie Brown', 'M', 'charlie.brown@example.com', '999-999-9999');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Eva Davis', 'W', 'eva.davis@example.com', '111-111-1111');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Frank Lee', 'M', 'frank.lee@example.com', '222-222-2222');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Grace Taylor', 'W', 'grace.taylor@example.com', '333-333-3333');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'David Clark', 'M', 'david.clark@example.com', '444-444-4444');
INSERT INTO CUSTOMERS c VALUES (CUSTOMER_SEQ.nextval, 'Helen Wilson', 'W', 'helen.wilson@example.com', '666-666-6666');

SELECT * FROM CUSTOMERS c ;

--Q3-2. ORDERS 테이블 데이터 삽입
--order_no는 시퀀스를 활용해야 합니다.
--'마우스',10000, 1
--'데스크탑',15000, 2
--'스캐너',20000, 3
--'마우스패드',7500, 4
--'조이스틱',30000, 5
--'모니터',12500, 6
--'마우스패드',18000, 7
--'허브',9000, 8
--'데스크탑',22000, 9
--'데스크탑',17500, 10

INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '마우스', 10000, 1);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '데스크탑', 15000, 2);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '스캐너', 20000, 3);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '마우스패드', 7500, 4);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '조이스틱', 30000, 5);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '모니터', 12500, 6);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '마우스패드', 18000, 7);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '허브', 9000, 8);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '데스크탑', 22000, 9);
INSERT INTO ORDERS VALUES (ORDER_SEQ.nextval, DEFAULT, '데스크탑', 17500, 10);

SELECT * FROM ORDERS;

COMMIT;

-- Q4. 실습
--1. 데스크탑을 구입한 고객이 몇 명인지 조회하세요.
SELECT count(*) FROM ORDERS o WHERE order_name = '데스크탑';
--2. 마우스패드를 구입한 고객의 이름을 조회하세요.
SELECT c.CUSTOMER_NAME FROM CUSTOMERS c JOIN ORDERS o ON c.CUSTOMER_NO = o.CUSTOMER_NO WHERE o.ORDER_NAME = '마우스패드';
--3. 주문 금액이 20000원 이상인 고객들의 이메일과 핸드폰 번호를 조회하세요.
SELECT c.CUSTOMER_EMAIL, c.CUSTOMER_PHONE FROM CUSTOMERS c JOIN ORDERS o ON c.CUSTOMER_NO = o.CUSTOMER_NO  WHERE o.ORDER_AMOUNT >= 20000;
--4. 가장 큰 금액의 물품을 구입한 고객의 이름과 주문 상품을 조회하세요.
SELECT
	c.CUSTOMER_NAME,
	o.ORDER_NAME
FROM
	CUSTOMERS c
JOIN ORDERS o ON
	c.CUSTOMER_NO = o.CUSTOMER_NO 
ORDER BY o.ORDER_AMOUNT DESC 
FETCH FIRST 1 ROW ONLY;
--5. 모든 주문의 합계 금액을 조회하세요.
SELECT
	SUM(o.ORDER_AMOUNT)
FROM
	ORDERS o ;
--6. 전체 주문에 대한 평균 금액을 구하세요.
SELECT
	AVG(o.ORDER_AMOUNT)
FROM
	ORDERS o ;
--7. 핸드폰 번호가 0으로 끝나는 고객의 이름을 조회하세요.
SELECT
	c.CUSTOMER_NAME
FROM
	CUSTOMERS c
WHERE
	c.CUSTOMER_PHONE LIKE '%0';
--8. 이름에 i가 들어가는 모든 고객의 번호와 이름을 조회하고 내림차순으로 정렬하세요.
SELECT
	CUSTOMER_NAME,
	CUSTOMER_PHONE
FROM
	CUSTOMERS c
WHERE
	CUSTOMER_NAME LIKE '%i%'
ORDER BY
	CUSTOMER_NAME DESC;

COMMIT;
















