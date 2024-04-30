-- ORDER BY : SELECT에 의해서 조회된 데이터를 정렬해주는 구문
-- DESC : 내림차순 , ASC(기본값) :오름차순

-- 실행순서 : from -> where -> select -> order by(출력할 데이터를 정렬함으로 제일 마지막에 실행) 
SELECT
	*
FROM
	EMPLOYEES e
WHERE
	SALARY >= 10000
ORDER BY
	DEPARTMENT_ID ASC ; 


-- 그룹함수 : 여러 개의 행을 묶어 연산하여 결과를 반환하며 자주 쓰이는 그룹 함수
SELECT MAX(SALARY) FROM EMPLOYEES e ; -- 최대값

SELECT MIN(SALARY) FROM EMPLOYEES e ; -- 최소값 

SELECT round(AVG(SALARY))  FROM EMPLOYEES e ; -- 평균 , round: 소수점 버리기

SELECT SUM(SALARY) FROM EMPLOYEES e ; -- 합계

SELECT COUNT(*) FROM EMPLOYEES e ; -- 조회한 데이터의 행의 개수 


-- 매니저 아이디가 149이면서 월급이 8000 이상인 직원의 수
SELECT
	COUNT(*)
FROM
	EMPLOYEES e
WHERE
	MANAGER_ID = 149
	AND SALARY >= 8000;


--1. DEPARTMENT_ID가 80인 직원들의 월급 합계를 구하세요.
SELECT
	sum(SALARY)
FROM
	EMPLOYEES e
WHERE
	DEPARTMENT_ID = 80;

--2. JOB_ID가 IT_PROG인 직원들의 수를 구하세요.
SELECT
	count(*)
FROM
	EMPLOYEES e
WHERE
	JOB_ID = 'IT_PROG';

--3. HIRE_DATE가 2006년 이후인 직원들의 평균 월급을 구하세요.
SELECT
	round(AVG(SALARY))
FROM
	EMPLOYEES e
WHERE
	HIRE_DATE >= '2006-01-01';

--4. 직원들 중 가장 월급이 낮은 값과 가장 월급이 큰 값을 구하세요.
SELECT
	MIN(SALARY),
	MAX(SALARY)
FROM
	EMPLOYEES e;


-- GROUP BY : 조회된 데이터의 여러 개 행을 특정 컬럼을 기준으로 묶어 그룹화 시키며 일반적으로 그룹 함수와 함께 사용됨
-- HAVING : GROUP BY에서 조건을 제시할 때 사용

--EMPLOYEES 테이블에서 DEPARTMENT_ID를 기준으로 그룹화 한 뒤 각 부서별 평균 월급을 조회
SELECT
	DEPARTMENT_ID,
	avg(SALARY)
FROM
	EMPLOYEES e
GROUP BY
	DEPARTMENT_ID; -- DEPARTMENT_ID가 같은 데이터 그룹화

--EMPLOYEES 테이블에서 DEPARTMENT_ID를 기준으로 그룹화 한 뒤 각 부서별 존재하는 데이터의 행의 개수를 조회
-- (즉, 부서별 직원 수 조회)
SELECT
	DEPARTMENT_ID,
	count(*)
FROM
	EMPLOYEES e
GROUP BY
	DEPARTMENT_ID;

-- JOB_ID별로 직원들의 평균 월급 조회
-- 평균 월급이 15000이상
SELECT
	JOB_ID,
	avg(SALARY)
FROM
	EMPLOYEES e
GROUP BY
	JOB_ID
HAVING 
	AVG(SALARY) >= 15000;

-- JOB_ID 기준으로 MAX SALARY가 13000이상
SELECT
	JOB_ID,
	MAX(SALARY)
FROM
	EMPLOYEES e
GROUP BY
	JOB_ID
HAVING
	MAX(SALARY) >= 13000; 
	
-- 보너스를 받지 않는 JOB_ID 조회
SELECT JOB_ID, COUNT(COMMISSION_PCT) FROM EMPLOYEES e 
GROUP BY JOB_ID 
HAVING count(COMMISSION_PCT) = '0';

-- JOB_ID를 기준으로 가장 낮은 월급이 5000이상
-- 가장 높은 월금이 10000 이하인 JOB_ID 조회
-- 실행순서 : from -> where -> group by -> having -> select -> order by(출력할 데이터를 정렬함으로 제일 마지막에 실행) 
SELECT
	JOB_ID
FROM
	EMPLOYEES e
GROUP BY
	JOB_ID
HAVING
	MIN(SALARY) >= 5000
	AND MAX(SALARY) <= 10000
ORDER BY JOB_ID; -- ASC(오름차순)는 생략 가능


-- <실습문제>
--1. 직원들 중 DEPARTMENT_ID를 기준으로 아래의 요구사항에 맞게 데이터를 조회하세요.
-- 총 급여의 합
-- 사원 수
-- 보너스를 받는 사원 수
-- 최소 월급
-- 평균 월급
-- 최대 월급
-- 내림차순을 이용하여 데이터 출력
-- 각각의 값들을 모두 조회하고, 별칭을 사용하세요.
--2. 위의 데이터에서 최소 월급이 1000 이고 최대 월급이 5000 이하인 직원을 조회하세요.

SELECT
	DEPARTMENT_ID,
	SUM(SALARY) AS "총급여의 합",
	COUNT(*) AS "사원수",
	count(COMMISSION_PCT) AS "보너스를 받는 사원 수",
	MIN(SALARY) AS "최소 월급",
	round(AVG(SALARY)) AS "평균 월급",
	MAX(SALARY) AS "최대 월급"
FROM
	EMPLOYEES e
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID DESC; 









