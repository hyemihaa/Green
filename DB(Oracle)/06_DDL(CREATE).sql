-- DDL - 데이터베이스의 객체(스키마오브젝트)를 생성, 수정, 삭제 하는 등의 작업이 가능한 언어
-- < CREATE > - 객체 생성

-- * NOT NULL : 해당 컬럼에 빈 값(NULL)이 들어올 수 없음을 뜻함. 반드시 있어야 하는 값
-- * UNIQUE : 해당 컬럼에 들어있는 값에서 반드시 유일(절대 중복되지 않는)해야 하는 값
-- * CHECK : 해당 컬럼에 들어와야 할 값들을 미리 정함. 정해진 값 외에는 입력할 수 없음
-- ***PRIMARY KEY(PK) : 테이블에서 튜플들의 데이터를 유일하게 식별, 해당 값은 반드시 유일(UNIQUE)해야하고 NULL이 들어올 수 없음
CREATE TABLE ddl_member (
	member_no NUMBER PRIMARY KEY,
	member_id varchar2(30) UNIQUE NOT NULL, 
	member_pwd varchar2(255) NOT NULL, 
	member_name varchar2(30) NOT NULL, 
	member_gender varchar2(5) CHECK(member_gender IN('W', 'M')) NOT NULL,
	member_point NUMBER DEFAULT 0,
	member_indate DATE DEFAULT sysdate
);

INSERT
	INTO
	DDL_MEMBER dm2
VALUES (
	1,
	'아이디1',
	'qwer1234!',
	'홍길동',
	'M', 
	 DEFAULT, 
	 DEFAULT);
INSERT
	INTO
	DDL_MEMBER dm2
VALUES (
	2,
	'아이디2',
	'qwer1234!',
	'김뭉구',
	'M', 
	 DEFAULT, 
	 DEFAULT);
INSERT
	INTO
	DDL_MEMBER dm2
VALUES (
	3,
	'아이디3',
	'qwer1234!',
	'하봄이',
	'W', 
	 DEFAULT, 
	 DEFAULT);


DROP TABLE DDL_MEMBER ;
DROP TABLE DDL_JOB  ;
SELECT * FROM DDL_MEMBER dm ;
SELECT * FROM ddl_job;

CREATE TABLE ddl_job ( 
	job_code NUMBER PRIMARY KEY,
	job_name varchar2(100),
	member_no NUMBER REFERENCES ddl_member(member_no) ON DELETE CASCADE  
); 
-- member_no 컬럼을 생성하면서 ddl_member 테이블의 member_no 컬럼을 참조하겠다는 의미
-- ON DELETE CASECADE : 참조하는 부모 테이블의 값(PK or UNIQUE)이 삭제 된다면 자식 테이블의 값 또한 같이 삭제

INSERT INTO DDL_JOB dj VALUES(1,'개발자',3);

DELETE FROM DDL_MEMBER dm WHERE member_no =3;


-- COMMENT : 해당 컬럼이 어떠한 역할을 정의하는 컬럼인지 주석을 남길 수 있음 습관화 해야한다!!!
-- COMMENT ON COLUMN 테이블명.컬럼명 IS ‘내용’
-- COMMENT ON COLUMN ddl_member.MEMBER_ID IS '아이디 컬럼';

-- Q1. 실습
--1. 테이블 명 : FREE_BOARD
--2. 컬럼은 아래와 같습니다.
-- BOARD_NO NUMBER
-- BOARD_TITLE VARCHAR2(100)
-- BOARD_CONTENT CLOB
-- BOARD_DATE DATE
-- BOARD_VIEWS NUMBER

-- 테이블 생성
CREATE TABLE ddl_free_board (
	BOARD_NO NUMBER NOT NULL UNIQUE,
	BOARD_TITLE VARCHAR2(100) NOT NULL,
	BOARD_CONTENT CLOB NOT NULL,
	BOARD_DATE DATE,
	BOARD_VIEWS NUMBER
	);

--3. 각각의 컬럼에 코멘트를 추가합니다.
-- BOARD_NO : 게시판 번호
-- BOARD_TITLE : 게시판 제목
-- BOARD_CONTENT : 게시판 내용
-- BOARD_DATE : 게시판 작성일
-- BOARD_VIEWS : 게시판 조회수
COMMENT ON COLUMN ddl_free_board.BOARD_NO IS '게시판 번호';
COMMENT ON COLUMN ddl_free_board.BOARD_TITLE IS '게시판 제목';
COMMENT ON COLUMN ddl_free_board.BOARD_CONTENT IS '게시판 내용';
COMMENT ON COLUMN ddl_free_board.BOARD_DATE IS '게시판 작성일';
COMMENT ON COLUMN ddl_free_board.BOARD_VIEWS IS '게시판 조회수';

--4. 임의의 데이터를 3개 이상 추가하세요.
INSERT INTO DDL_FREE_BOARD dfb VALUES (1, 'DML', 'SELECT', SYSDATE, 0);
INSERT INTO DDL_FREE_BOARD dfb VALUES (1, 'DDL', 'CREATE', SYSDATE, 0); 
INSERT INTO DDL_FREE_BOARD dfb VALUES (3, 'DCL', 'GRANT', SYSDATE, 0);

SELECT * FROM DDL_FREE_BOARD dfb;

DROP TABLE DDL_FREE_BOARD ; -- 테이블 내용 삭제









