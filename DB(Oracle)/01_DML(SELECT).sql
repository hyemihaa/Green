-- SELECT: 조회 (*  모든 테이블 가져오기)
SELECT
	*
FROM
	DEPARTMENTS d ;
-- 부분적으로 가져오고 싶을때는 아래처럼 작성하면 되는데 ,로 구분
SELECT
	DEPARTMENT_NAME,
	MANAGER_ID
FROM
	DEPARTMENTS d ;
--EMPLOYEES 테이블의 EMPLOYEE_ID, LAST_NAME, EMAIL 컬럼 조회
SELECT
	EMPLOYEE_ID ,
	LAST_NAME ,
	EMAIL
FROM
	EMPLOYEES e ;
--EMPLOYEES 테이블의 JOB_ID 컬럼 조회
SELECT
	JOB_ID
FROM
	EMPLOYEES e ;
--JOBS 테이블의 JOB-TITLE, MIN_SALASRY, MAX_SALARY 컬럼 조회
SELECT
	JOB_TITLE ,
	MIN_SALARY ,
	MAX_SALARY
FROM
	JOBS j ;
--DEPARTMENTS 테이블의 모든 컬럼 조회
SELECT
	*
FROM
	DEPARTMENTS d ;

SELECT
	EMPLOYEE_ID,
	SALARY,
	SALARY * 12 AS annual_salary
FROM
	EMPLOYEES e ;
--직원 사번, 월급 조회, 연봉계산(일시적으로 보여주는 컬럼) AS(생략가능):별칭 설정

SELECT
	DISTINCT MANAGER_ID
FROM
	EMPLOYEES e ;

-- DISTINCT : 중복제거
--EMPLOYEES 테이블에서 부서(DEPARTMENTS) 아이디 조회
-- 중복을 제거하여 조회하세요.
SELECT
	DISTINCT DEPARTMENT_ID
FROM
	EMPLOYEES e ;

--EMPLOYEES 테이블에서 월급(SALARY), 연봉, 연봉(보너스 포함) 조회
-- 산술 연산자를 사용하세요. 보너스 컬럼은 COMMISION_PCT 입니다.
-- 연봉과 연봉(보너스포함)은 컬럼명에 별칭을 주세요.
-- (월급 + 보너스 * 월급) *12 = 보너스 포함되어있는 연봉
SELECT
	SALARY,
	SALARY * 12 AS "연봉",
	(SALARY + COMMISSION_PCT * SALARY) * 12 AS "연봉(보너스포함)"
FROM
	EMPLOYEES e ;

-- <where조건문>
-- 코드가 길어질 경우 줄바꿈해서 구분해준다.
SELECT
	EMPLOYEE_ID,
	FIRST_NAME,
	SALARY
FROM
	EMPLOYEES e
WHERE
	SALARY >= 10000;

SELECT
	EMPLOYEE_ID,
	FIRST_NAME,
	LAST_NAME
FROM
	EMPLOYEES e
WHERE
	EMPLOYEE_ID < 150;

SELECT
	FIRST_NAME,
	LAST_NAME
FROM
	EMPLOYEES e
WHERE
	FIRST_NAME = 'Peter';
-- = :같다, (같지 않다 : !=, ^=, <>)

SELECT
	*
FROM
	EMPLOYEES e
WHERE
	HIRE_DATE > '2006-01-01';

-- 입사일이 2006년1월1일 이후인 직원들 데이터 
-- < 실습 >
-- 코드 정렬 ctrl + shift + F
-- 1. 직원 테이블에서 부서 번호가 90번인 직원들을 조회
--  부서번호 컬럼명 : DEPARTMENT_ID
--  조회할 컬럼 : FIRST_NAME, LAST_NAME, EMAIL
SELECT
	FIRST_NAME,
	LAST_NAME ,
	EMAIL
FROM
	EMPLOYEES e
WHERE
	DEPARTMENT_ID = 90;

-- 2. 월급이 10,000 달러 이상인 직원들을 조회
--  조회할 컬럼 : JOB_ID, MANAGER_ID, DEPARTMENT_ID
SELECT
	JOB_ID,
	MANAGER_ID,
	DEPARTMENT_ID
FROM
	EMPLOYEES e
WHERE
	SALARY >= 10000;

--3. 보너스를 포함한 연봉이 20,000 달러 이상인 직원들 조회
-- 조회할 컬럼 : EMPLOYEE_ID, FIRST_NAME, 연봉, HIRE_DATE
SELECT
	EMPLOYEE_ID ,
	FIRST_NAME ,
	(SALARY + COMMISSION_PCT * SALARY )* 12 ,
	HIRE_DATE
FROM
	EMPLOYEES e
WHERE
	(SALARY + COMMISSION_PCT * SALARY )* 12 >= 20000 ;

-- AND연산(그리고)
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	MANAGER_ID = 100
	AND DEPARTMENT_ID = 80
	AND SALARY >= 12000;

-- OR연산(또는)
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	SALARY >= 10000
	OR DEPARTMENT_ID = 100;


--BETWEEN : 범위를 지정하여 값을 가져오고 싶을 때 사용
--NOT BETWEEN : 지정한 범위 빼고 추출
-- 월금이 5000이상, 10000 이하인 직원 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	SALARY BETWEEN 5000 AND 10000;

-- 입사일이 2005년 ~ 2006년 사이인 직원 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	HIRE_DATE BETWEEN '2005-01-01' AND '2006-01-01';


-- LIKE : 특정 패턴에 만족하는지 확인해주는 구문
-- % : 0글자 이상
-- FIRST_NAME이 N으로 시작하는 데이터조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	FIRST_NAME LIKE 'N%';

-- FIRST_NAME이 en으로 끝나는 데이터 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	FIRST_NAME LIKE '%en';

-- FIRST_NAME의 중간에 ar이 해당하는 데이터 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	FIRST_NAME LIKE '%ar%'

-- _ : 1글자
-- FIRST_NAME 컬럼에서 "i" 앞에 한글자가 존재하는 데이터 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	FIRST_NAME LIKE '_i';

-- FIRST_NAME 컬럼에서 “P“로 시작하고 뒤에 2글자가 존재하는 데이터 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	FIRST_NAME LIKE 'P__';

-- COMMISSION_PCT 컬럼의 값이 NULL인 데이터 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	COMMISSION_PCT IS NULL ;

-- COMMISSION_PCT 컬럼의 값이 NULL이 아닌 데이터 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	COMMISSION_PCT IS NOT NULL;

-- IN : 여러 개의 값을 제시하고 해당하는 값에 일치하는 데이터가 있는지 조회
-- Department_id가 80또는 100인 데이터 조회
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	DEPARTMENT_ID IN('80', '100');

-- ||(연결연산자) : 여러 개의 컬럼 값을 하나의 컬럼처럼 연결 시켜줄 수 있는 연산자 
SELECT
	first_name || ' ' || last_name AS "이름"
	-- 연결할 데이터 중간에 ' ' 공백을 넣어서 구분
FROM
	EMPLOYEES e;
