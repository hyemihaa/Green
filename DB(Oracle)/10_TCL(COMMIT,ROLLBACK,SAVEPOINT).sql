-- TCL : 트랜잭션을 제어하는 언어
-- 트랜잭션 : 데이터베이스에서 실행되는 논리적 작업 단위

-- < COMMIT > - 모든 작업을 성공적으로 완료하여 변경된 내용을 데이터베이스에 반영하는 작업
-- < ROLLBACK > - 작업 진행 도중 에러 또는 문제가 발생하여 현재 작업 내용을 데이터베이스에 반영하지 않고, 마지막 COMMIT 시점으로 되돌림

INSERT INTO DDL_JOB dj VALUES(1, '이름1', 1);
INSERT INTO DDL_JOB dj VALUES(2, '이름1', 1);
INSERT INTO DDL_JOB dj VALUES(3, '이름1', 1);

SELECT * FROM DDL_JOB dj ;

COMMIT;

DELETE FROM DDL_JOB dj;

UPDATE
	DDL_JOB
SET
	JOB_NAME = '롤백 테스트'
WHERE
	JOB_CODE = 3;

COMMIT;

ROLLBACK; -- 마지막 COMMIT 시점으로 복구 시켜줌

-- < SAVEPOINT > -세이브 포인트를 만들어 롤백 시 지정한 세이브 포인트로 트랜잭션을 롤백
--		표현법 저장 시 : SAVEPOINT 포인트명;
--  		   사용 시 : ROLLBACK TO 포인트명;

-- 직무 추가
INSERT INTO DDL_JOB dj values(4, '직무 추가3', 2);
INSERT INTO DDL_JOB dj values(5, '직무 추가4', 2);

UPDATE DDL_JOB SET JOB_NAME = '직무 변경' WHERE JOB_CODE = 3;
UPDATE DDL_JOB SET JOB_NAME = '직무 변경2' WHERE JOB_CODE = 4;
SAVEPOINT sp2;

-- 직무 전체 삭제
DELETE FROM DDL_JOB dj ;
SAVEPOINT sp3;

SELECT * FROM DDL_JOB dj ;
ROLLBACK TO sp2;
SELECT * FROM DDL_JOB dj ;


-- Q1. 실습
-- account 테이블 생성
CREATE TABLE accounts ( 
	account_id NUMBER PRIMARY KEY,
	account_name varchar2(255),
	balance NUMBER 
);
 
SELECT * FROM accounts;

-- 데이터 삽입
INSERT INTO ACCOUNTS VALUES (1, 'Alice' , 10000);
INSERT INTO ACCOUNTS VALUES (2, 'Bob' , 15000);
INSERT INTO ACCOUNTS VALUES (3, 'charlie' , 20000);

--1. Alice의 계좌에서 Bob이 계좌로 5000원을 이체합니다.
-- UPDATE문을 이용하여 Alice의 blance 컬럼의 값을 5000 뺍니다.
-- ex) SET balance = balance-5000
-- UPDATE문을 이용하여 Bob의 balance 컬럼의 값을 5000 더합니다.
UPDATE
	ACCOUNTS
SET
	balance = balance - 5000
WHERE
	account_name = 'Alice';

UPDATE
	ACCOUNTS
SET
	balance = balance + 5000
WHERE
	account_name = 'Bob';

--2. SAVEPOINT를 작성하세요.
SAVEPOINT sp1;

--3. Charlie의 계좌에서 10000원을 출금하고, 그 후 ROLLBACK을 사용하여 해당 출금을
--취소합니다.
-- 세이브 포인트로 롤백하세요.
UPDATE
	ACCOUNTS
SET
	balance = balance - 10000
WHERE
	account_name = 'charlie';

SELECT * FROM ACCOUNTS ;

ROLLBACK TO sp1;

--4. 이후 COMMIT을 사용하여 데이터베이스에 반영하세요.
COMMIT;


















