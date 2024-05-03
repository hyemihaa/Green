SELECT * FROM ACCOUNTS a ;
DELETE FROM ACCOUNTS a ;	
COMMIT;

-- < SEQUENCE > - 번호를 자동으로 증가시켜주는 역할을 수행하는 객체
-- * 일반적으로 회원 번호, 게시글 번호 등 식별자 역할을 하는 PRIMARY KEY에 자주 사용됨

-- * 표현법
--CREATE SEQUENCE 시퀀스이름
--START WITH 시작값
--INCREMENT BY 증가값
--MAXVALUE 최대값
--MINVALUE 최소값
--CYCLE(반복)/NOCYCLE
--CACHE 바이트크기/NOCACHE


CREATE SEQUENCE accounts_seq
INCREMENT BY 1 -- 1씩 증가
START WITH 1 -- 1부터 시작
MINVALUE 1 -- 최소값 1
MAXVALUE 5 -- 최대값 5
nocycle;

INSERT INTO ACCOUNTS a VALUES(accounts_seq.nextval, '이름', 10000);

SELECT * FROM ACCOUNTS a ;

-- 시퀀스 변경 (객체이기 때문에 DDL문으로 변경)
ALTER SEQUENCE accounts_seq MAXVALUE 100;


-- < INDEX > - 데이터가 많은 테이블에서 특정 컬럼에 대한 정렬 및 검색 성능을 향상시키기 위해 사용됨
DELETE FROM ACCOUNTS a ;

-- 인덱스 생성
-- * CREATE INDEX 인덱스명 ON 테이블명(컬럼명)
CREATE INDEX IDX_NAME ON ACCOUNTS(ACCOUNT_NAME);

-- 데이터 삽입
INSERT INTO ACCOUNTS(ACCOUNT_ID, ACCOUNT_NAME, BALANCE)
SELECT ACCOUNTS_SEQ.nextval, '이름' || LEVEL, 10000
FROM dual 
CONNECT BY LEVEL <= 1000000;

-- 시퀀스 변경
ALTER SEQUENCE accounts_seq MAXVALUE 99999999;

-- 조회
SELECT count(*) FROM ACCOUNTS a2 ;
SELECT * FROM ACCOUNTS a WHERE ACCOUNT_NAME = '이름123';
DELETE FROM ACCOUNTS a ;
-- 인덱스 삭제
DROP INDEX idx_name;












