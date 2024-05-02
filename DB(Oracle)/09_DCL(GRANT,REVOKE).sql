-- DCL : 계정에겐 권한을 부여하거나 회수하는 역할을 가진 언어

-- < GRANT > - 계정에게 권한을 부여하며 시스템 권한과 접근 권한으로 나뉘어 짐

ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

CREATE USER grantuser IDENTIFIED BY qwer1234;

-- CREATE SESSION : 계정 접속 권한
GRANT CREATE SESSION TO grantuser;

-- CREATE TABLE : 테이블 생성 권한
GRANT CREATE TABLE TO grantuser;

CREATE TABLE grant_test (
	test_id varchar2(50) PRIMARY KEY,
	test_name varchar2(50)
);

SELECT * FROM hr.EMPLOYEES e;

-- 조회권한 부여
GRANT SELECT ON hr.EMPLOYEES TO grantuser;
-- grant select, insert, delete, update on 모든 권한 부여

-- Q1. 실습 
--1. web_back 계정을 생성한 후 아래의 시나리오에 맞춰 권한을 부여하세요.
-- HR 개발팀의 백엔드 직원들만 사용하는 계정입니다.
-- 오라클에 접속할 수 있어야 하며 테이블을 생성할 수 있는 권한을 가집니다.
-- HR 스키마의 EMPLOYEES 테이블을 조작(DML)할 수 있는 모든 권한을 가집니다.

ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

CREATE USER web_back IDENTIFIED BY qwer1234; -- web_back 계정생성

GRANT CREATE SESSION TO web_back; -- 계정 접속 권한 부여
GRANT CREATE TABLE TO web_back; -- 테이블 생성 권한 부여

GRANT SELECT, INSERT, DELETE, UPDATE ON hr.EMPLOYEES TO web_back; -- DML 모든 권한

REVOKE SELECT, INSERT, DELETE, UPDATE ON hr.EMPLOYEES FROM WEB_BACK;
--2. web_front 계정을 생성한 후 아래의 시나리오에 맞춰 권한을 부여하세요.
-- HR 개발팀의 프론트 직원들만 사용하는 계정입니다.
-- 오라클에 접속할 수 있어야 하며 테이블을 생성할 수 없습니다.
-- HR 스키마의 EMPLOYEES 테이블을 조회할 수 있는 권한만을 가지며, 그 외
--데이터의 추가/수정/삭제에 대한 권한은 가질 수 없습니다.
ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

CREATE USER web_front IDENTIFIED BY qwer1234; -- web_front 계정 생성

GRANT CREATE SESSION TO web_front; -- 계정 접속 권한 부여

GRANT SELECT ON hr.EMPLOYEES TO web_front; -- select(조회) 권한만 부여
REVOKE SELECT ON hr.EMPLOYEES FROM web_front;
-- < REVOKE > - 계정의 권한 제거
-- 표현법 : REVOKE 권한 ON 테이블명 FROM 계정명

REVOKE SELECT ON hr.EMPLOYEES FROM GRANTUSER; -- 조회 권한 회수


-- < ROLE > - 필요한 권한들을 하나의 그룹으로 묶어놓고 효율적으로 권한을 관리하기 위한 집합

CREATE ROLE back_dev; -- back_dev 롤 생성
GRANT SELECT, INSERT, UPDATE, DELETE ON hr.EMPLOYEES TO back_dev; -- back_dev(롤) 권한 부여
GRANT back_dev TO web_back; -- web_back유저에게 back_dev(롤)가 가지고 있는 롤 권한 부여

CREATE ROLE front_dev; -- front_dev 롤 생성
GRANT SELECT ON hr.EMPLOYEES TO front_dev; -- 롤 권한 부여
GRANT front_dev TO web_front; -- 사용자에게 롤 권한 부여

REVOKE front_dev FROM WEB_FRONT; -- 사용자(web_front)에게 롤 권한 회수

-- dba_role_privs : 계정에 어떠한 ROLE이 부여되었는지 확인하는 방법
SELECT * FROM dba_tab_privs WHERE table_name='EMPLOYEES'; -- dba (데이터베이스관리자(dbadmin) 테이블의 권한
SELECT * FROM dba_role_privs WHERE grantee='WEB_BACK'; -- 롤 적용 확인
SELECT * FROM dba_role_privs WHERE grantee='WEB_FRONT'; -- 롤 적용 확인
SELECT * FROM role_sys_privs; -- 시스템 권한 확인
SELECT * FROM all_tab_privs; -- all 모든 테이블의 권한

REVOKE DELETE ON hr.EMPLOYEES FROM back_dev; -- back_dve(롤)의 DELETE 권한 회수

DROP ROLE front_dev; -- front_dev(롤) 자체를 삭제



