-- < UPDATE > - 테이블의 기존 데이터(행)를 변경하는 구문

SELECT * FROM EMPLOYEES e ;

UPDATE
	EMPLOYEES
SET
	LAST_NAME = '김',
	FIRST_NAME = '뭉봄'
WHERE
	EMPLOYEE_ID = 207;
	
-- Q1. 실습
--1. EMPLOYEES 테이블의 Donald 직원 데이터를 아래와 같이 변경하세요.
-- EMAIL : Donald
-- PHONE_NUMBER : 01044445555
-- COMMISSION_PCT : 1.5
SELECT * FROM EMPLOYEES e ;
UPDATE EMPLOYEES  SET EMAIL = 'Donald', PHONE_NUMBER = '01044445555', COMMISSION_PCT = 0.5
WHERE FIRST_NAME = 'Donald';

--2. EMPLOYEES 테이블에 590.423.4567 핸드폰을 가진 직원을 아래와 같이 변경하세요.
-- HIRE_DATE : 현재 날짜
-- SALARY : 15,000
SELECT * FROM EMPLOYEES e ;
UPDATE EMPLOYEES SET HIRE_DATE = SYSDATE, SALARY = 15000
WHERE PHONE_NUMBER = '590.423.4567';



