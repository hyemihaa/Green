-- < 서브쿼리 : SQL 쿼리 안에 포함된 또 다른 쿼리 >

-- 단일행 서브쿼리 - 결과값의 데이터(행)가 1개인 서브쿼리
-- * 단일행 비교 연산자 : =, <, <=, >=, >, !=

-- Donald가 속한 부서의 ID를 찾음
SELECT DEPARTMENT_ID FROM EMPLOYEES e 
WHERE FIRST_NAME = 'Donald'; -- 50 출력

-- Donald랑 같은 부서에 속한 직원들의 이름조회
SELECT FIRST_NAME FROM EMPLOYEES e
WHERE DEPARTMENT_ID  = 50 ;

-- 위 쿼리문 -> 단일행 서브쿼리문으로 작성
SELECT FIRST_NAME FROM EMPLOYEES e 
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM EMPLOYEES e2 WHERE FIRST_NAME = 'Donald'); 
					  -- 서브쿼리 : Donald가 속한 부서의 ID = 50 


-- 부서 ID = 30인 직원들의 평균 급여보다 높은 직원들의 이름 조회
SELECT FIRST_NAME FROM EMPLOYEES e 
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES e2 WHERE DEPARTMENT_ID = 30);
 				-- 서브쿼리 : 부서 id가 30인 직원들의 평균급여 (-> 4150)


-- 가장 높은 월급을 받는 직원의 이름 조회
SELECT FIRST_NAME, MAX(SALARY) FROM EMPLOYEES e 
GROUP BY FIRST_NAME 
ORDER BY MAX(SALARY) DESC 
FETCH FIRST 1 ROW ONLY;

-- 가장 높은 월급을 받는 직원의 이름 조회(서브쿼리)
SELECT FIRST_NAME FROM EMPLOYEES e 
WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEES e2);
				-- 서브쿼리 : employees 에서 가장 높은 월급 (-> 24000)


-- 입사일이 가장 빠른 직원의 이름
SELECT FIRST_NAME FROM EMPLOYEES e 
WHERE e.HIRE_DATE = (SELECT MIN(HIRE_DATE) FROM EMPLOYEES e2)
					-- 입사일이 가장 빠른 직원 (입사일이 가장 낮은 == 입사일이 빠른)


-- 가장 낮은 location_id를 가진 도시 조회(locations)
SELECT CITY FROM LOCATIONS l 
WHERE LOCATION_ID = (SELECT MIN(LOCATION_ID) FROM LOCATIONS l2);

-- 가장 높은 보너스를 받는 직원의 이름 조회(employees)
SELECT FIRST_NAME FROM EMPLOYEES e 
WHERE COMMISSION_PCT = (SELECT max(COMMISSION_PCT) FROM EMPLOYEES e2)


-- Q1. 실습
--1. 사수 번호(MANAGER_ID)가 가장 낮은 직원의 이름과 핸드폰 번호를 출력하세요.
SELECT FIRST_NAME, PHONE_NUMBER FROM EMPLOYEES e 
WHERE MANAGER_ID = (SELECT MIN(MANAGER_ID) FROM EMPLOYEES e2);

--2. 사번(EMPLOYEE_ID)가 가장 높은 직원의 이름과 사번을 출력하세요.
SELECT FIRST_NAME, EMPLOYEE_ID FROM EMPLOYEES e 
WHERE EMPLOYEE_ID = (SELECT MAX(EMPLOYEE_ID) FROM EMPLOYEES e2)

--3. LOCATIONS 테이블에서 COUNTRY_ID가 가장 많은 도시(CITY)의 이름을 출력하세요.
SELECT
	CITY
FROM
	LOCATIONS l
WHERE
	COUNTRY_ID = (
	SELECT
		COUNTRY_ID
	FROM
		LOCATIONS l2
	GROUP BY
		COUNTRY_ID
	ORDER BY
		COUNT(COUNTRY_ID) DESC FETCH FIRST 1 ROW ONLY)
						


-- 다중행 서브쿼리 - 결과값의 데이터(행)가 여러 개인 서브 쿼리
-- * 다중행 비교 연산자 : IN, ALL, ANY, …

-- 부서별 가장 급여가 낮은 직원들의 정보 조회
SELECT * FROM EMPLOYEES e
WHERE SALARY IN (SELECT MIN(SALARY) 
				 FROM EMPLOYEES e 
				 GROUP BY DEPARTMENT_ID);

-- 부서별 가장 낮은 급여
SELECT
	MIN(SALARY)
FROM
	EMPLOYEES e
GROUP BY
	DEPARTMENT_ID;


-- ALL 연산자는 앞에 비교 연산자(>, <, >=, <=)가 붙으며 모두 일치해야 TRUE가 됨 (즉, 모든 값을 대입했을 때 모두 true일 때 반환)
SELECT * FROM EMPLOYEES e 
WHERE SALARY >= ALL (SELECT MIN(SALARY) 
					FROM EMPLOYEES e2 
					GROUP BY DEPARTMENT_ID);


-- ANY 연산자는 해당하는 값 중 하나라도 일치하면 TRUE를 반환함(즉, 모든 값을 대입했을 때 하나라도 true이면 반환)
SELECT * FROM EMPLOYEES e 
WHERE SALARY > ANY (SELECT MIN(SALARY) 
					FROM EMPLOYEES e2 
					GROUP BY DEPARTMENT_ID);


-- Q2 . 실습
--1. 직원이 가장 많은 부서의 부서명과 인원수를 조회하세요.
SELECT
	d.DEPARTMENT_NAME,
	count(*)
FROM
	EMPLOYEES e
JOIN DEPARTMENTS d ON
	e.DEPARTMENT_ID = d.DEPARTMENT_ID
GROUP BY
	DEPARTMENT_NAME
	-- 부서별로 인원수 조회
HAVING
	COUNT(*) = (
	SELECT
		MAX(COUNT(*))
	FROM
		EMPLOYEES e2
	GROUP BY
		DEPARTMENT_ID); 

--2. Luis 또는 Pat과 같은 부서인 직원들을 조회하세요.
-- 사번(EMPLOYE_ID), 이름(FIRST_NAME), 부서번호(DEPARTMENT_ID)를 조회하세요.
SELECT
	EMPLOYEE_ID,
	FIRST_NAME,
	DEPARTMENT_ID
FROM
	EMPLOYEES e2
WHERE
	DEPARTMENT_ID IN (
	SELECT
		DEPARTMENT_ID
	FROM
		EMPLOYEES e
	WHERE
		FIRST_NAME IN('Luis', 'Pat'));

--3. 직무명 FI_ACCOUNT의 평균 월급보다 많이 받는 직원들의 이름과 월급을 조회하세요.
SELECT
	FIRST_NAME,
	SALARY
FROM
	EMPLOYEES e
WHERE
	SALARY > (
	SELECT
		AVG(SALARY)
	FROM
		EMPLOYEES e2
	WHERE
		JOB_ID = 'FI_ACCOUNT');

--4. 보너스를 받는 직원들의 평균 월급보다 더 높은 월급을 가진 직원들의 이름과 월급을 조회하세요.
SELECT
	FIRST_NAME,
	SALARY
FROM
	EMPLOYEES e
WHERE
	SALARY > (
	SELECT
		AVG(SALARY)
	FROM
		EMPLOYEES e2
	WHERE
		COMMISSION_PCT IS NOT NULL);

SELECT * FROM EMPLOYEES e ;


-- < 다중열 (단일행) 서브쿼리 > - 결과값의 컬럼이 여러 개인 서브 쿼리.
-- 단, 데이터(행)은 반드시 하나여야 하며 단일행 비교 연산자와 사용할 수 있음

SELECT DEPARTMENT_ID FROM EMPLOYEES e  
WHERE FIRST_NAME = 'Bruce';

-- 직무, 부서, 급여
SELECT
	JOB_ID,
	DEPARTMENT_ID,
	SALARY
FROM
	EMPLOYEES e
WHERE
	(DEPARTMENT_ID, SALARY) = (
	SELECT
		DEPARTMENT_ID, SALARY
	FROM
		EMPLOYEES e
	WHERE
		FIRST_NAME = 'Bruce');

-- 이메일이 SBELL인 직원과 사수번호(MANAGER_ID), 부서번호(DEPARTMENT_ID)가 같은
-- 직원들의 이름(FIRST_NAME) 조회

SELECT
	FIRST_NAME
FROM
	EMPLOYEES e
WHERE
	(MANAGER_ID,
	DEPARTMENT_ID) =(
	SELECT
		MANAGER_ID,
		DEPARTMENT_ID
	FROM
		EMPLOYEES e2
	WHERE
		EMAIL = 'SBELL');

	
-- < 다중열 다중행 서브쿼리 > - 결과값의 컬럼과 데이터(행)가 여러 개인 서브 쿼리. 
-- 다중행 비교 연산자와 사용할 수 있음 * 다중행 비교 연산자 : IN, ALL, ANY, …
	
	
-- 월급이 5000 이상인 직원들의 이름, 부서 조회
SELECT
	FIRST_NAME,
	DEPARTMENT_ID
FROM
	EMPLOYEES e
WHERE
	(FIRST_NAME,
	DEPARTMENT_ID) IN (
	SELECT
		FIRST_NAME,
		DEPARTMENT_ID
	FROM
		EMPLOYEES e2
	WHERE
		e.SALARY >= 5000);


-- 부서 번호가 50번이면서 이름이 S로 시작하는 직원들의 이름과 연봉 조회
-- 서브쿼리 조회 컬럼 : DEPARTMENT_ID, FIRST_NAME
SELECT
	FIRST_NAME,
	SALARY*12
FROM
	EMPLOYEES e
WHERE
	(DEPARTMENT_ID,
	FIRST_NAME) IN (
	SELECT
		DEPARTMENT_ID,
		FIRST_NAME
	FROM
		EMPLOYEES e2
	WHERE
		DEPARTMENT_ID = 50
		AND FIRST_NAME LIKE 'S%');
	
-- 부서별 가장 많은 월급을 받는 직원들의 이름, 부서번호, 월급 조회
-- 서브쿼리 조회 컬럼 : DEPARTMENT_ID, MAX(SALARY)
SELECT
	FIRST_NAME,
	DEPARTMENT_ID,
	SALARY
FROM
	EMPLOYEES e
WHERE
	(DEPARTMENT_ID,
	SALARY) IN (
	SELECT
		DEPARTMENT_ID,
		MAX(SALARY)
	FROM
		EMPLOYEES e
	GROUP BY DEPARTMENT_ID);


-- < 인라인뷰 > - 메인쿼리의 FROM에 서브 쿼리를 사용하며, 수행한 결과가 테이블 대신 사용됨
-- 단, 서브쿼리에서 조회한 컬럼들을 기준으로만 메인 쿼리에서 조회할 수 있음
-- 되도록 조건식을 메인쿼리에 두는 것이 좋다.( 전체 데이터에서 하나씩 비교해가며 조건식을 보는것보다 빠름 )

-- 월급이 10000이상인 직원의 이름 조회
SELECT
	*
FROM
	(SELECT
		FIRST_NAME
	FROM
		EMPLOYEES e
	WHERE
		salary >= 10000);
	
	
-- 부서별 가장 많은 월급을 받는 직원 조회하기
SELECT
	*
FROM
	(
	SELECT
		DEPARTMENT_ID,
		MAX(SALARY)
	FROM
		EMPLOYEES e
	GROUP BY
		DEPARTMENT_ID);


-- 이름이 K로 시작, 월급이 5000 이상
SELECT
	*
FROM
	(SELECT
		FIRST_NAME,
		SALARY
	FROM
		EMPLOYEES e
	WHERE
		FIRST_NAME LIKE 'K%'
		AND SALARY >= 5000);


-- 이름이 K로 시작, 월급이 5000 이상
-- 되도록 조건식을 메인쿼리에 두는 것이 좋다.( 전체 데이터에서 하나씩 비교해가며 조건식을 보는것보다 빠름 )
-- 조건식을 메인쿼리에 둘때, 서브쿼리안에서 AS(별칭)를 주게 되면 메인에서도 같은 별칭으로 조건을 줘야 한다.
SELECT
	*
FROM
	(SELECT
		FIRST_NAME,
		SALARY
	FROM
		EMPLOYEES e)
WHERE
	FIRST_NAME LIKE 'K%'
	AND SALARY >= 5000;
	

-- 부서별 월급 합계, 평균, 인원수 조회
SELECT
	*
FROM
	(SELECT
		DEPARTMENT_ID,
		SUM(SALARY) AS 합계,
		AVG(SALARY) AS 평균,
		COUNT(*) AS 인원수
	FROM
		EMPLOYEES e
	GROUP BY
		DEPARTMENT_ID)
WHERE 
	합계 >= 50000; -- 여기서 그룹합수 합계를 다시 불러온다면 다시 그룹를 해줘야 한다 -> 서브쿼리 안에서 별칭을 줘서 사용

	
-- Q3. 실습(인라인뷰)
--1. 가장 월급이 높은 직원의 이름과 월급을 조회하세요
SELECT
	*
FROM
	(SELECT
		FIRST_NAME,
		SALARY 
	FROM
		EMPLOYEES 
	ORDER BY SALARY DESC 
	)
FETCH FIRST 1 ROW ONLY;

--2. JOBS 테이블에서 JOB_TITLE별로 MAX_SALARY를 확인하고, 가장 MAX_SALARY가 높은 JOB_TITLE를 조회하세요.
SELECT
	*
FROM
	(SELECT
		JOB_TITLE,
		MAX_SALARY AS 상위월급
	FROM
		JOBS j)
ORDER BY
	상위월급 DESC FETCH FIRST 1 ROW ONLY;

--3. 부서별로 평균 연봉을 계산하고, 평균 연봉이 가장 높은 부서의 이름과 평균 연봉을 조회하세요.
SELECT
	*
FROM
	(SELECT
		d.DEPARTMENT_NAME,
		AVG(SALARY * 12) AS 평균연봉
	FROM
		EMPLOYEES e
	JOIN DEPARTMENTS d ON
		e.DEPARTMENT_ID = d.DEPARTMENT_ID
	GROUP BY
		d.DEPARTMENT_NAME
	ORDER BY
		평균연봉 DESC FETCH FIRST 1 ROW ONLY);

-- Q4. 실습
--1. 월급이 6000 이상인 직원 중에서 상위 5명의 직원 이름과 연봉을 조회하세요.
SELECT
	*
FROM
	(SELECT
		FIRST_NAME,
		SALARY * 12 AS 연봉
	FROM
		EMPLOYEES e
	WHERE
		SALARY >= 6000
	ORDER BY
		연봉 DESC )
WHERE
	ROWNUM <= 5; 

-- fetch first 1 row only 사용
SELECT
	FIRST_NAME,
	SALARY * 12
FROM
	EMPLOYEES e
WHERE
	SALARY >= 6000
ORDER BY
	SALARY DESC FETCH FIRST 5 ROW ONLY;

--2. JOBS 테이블에서 JOB_TITLE을 ABC순으로 정렬하고 상위 10개의 JOB_TITLE을 조회하세요.
SELECT
	*
FROM
	(SELECT
		JOB_TITLE
	FROM
		JOBS j
	ORDER BY
		JOB_TITLE ASC)
WHERE
	ROWNUM <= 10;

--3. DEPARTMENT 테이블에서 DEPARTMENT_ID를 기준으로 내림차순 정렬하여
--상위 15개의 ID, NAME, LOCATION_ID를 조회하세요.
SELECT
	*
FROM
	(SELECT
		DEPARTMENT_ID,
		DEPARTMENT_NAME,
		LOCATION_ID
	FROM
		DEPARTMENTS d
	ORDER BY
		DEPARTMENT_ID DESC)
WHERE
	ROWNUM <= 15;


--4. 이름이 e로 끝나는 직원 중 입사일이 오래된 상위 3명의 직원 이름과 연봉, 입사일을 조회하세요.
SELECT
	*
FROM
	(SELECT
		FIRST_NAME,
		SALARY * 12,
		HIRE_DATE
	FROM
		EMPLOYEES e
	WHERE 
		FIRST_NAME LIKE '%e'
	ORDER BY
		HIRE_DATE ASC)
WHERE ROWNUM <= 3 ;

--5. 전화번호가 4로 끝나는 직원 중 이메일을 ABC순으로 정렬하고 상위 3명의 직원 이름과 이메일을 조회하세요.
SELECT
	*
FROM
	(SELECT
		FIRST_NAME,
		EMAIL
	FROM
		EMPLOYEES e
	WHERE
		PHONE_NUMBER LIKE '%4'
	ORDER BY
		EMAIL ASC)
WHERE ROWNUM <= 3;
 
--6. 보너스를 가진 직원들의 보너스를 포함한 연봉(*12)을 계산하고 가장 많은 연봉을 받는
--상위 5명의 직원 이름과 보너스를 포함한 연봉을 조회하세요.
-- 단, 첫번째 컬럼의 별칭을 “순위”로 만들고 조회합니다.
-- 직원 이름의 별칭을 “이름”으로 만들고 조회합니다.
-- 보너스를 포함한 연봉의 별칭을 “보너스 연봉”으로 만들고 조회합니다

SELECT
	ROWNUM AS "순위",
	"이름",
	"보너스 연봉"
FROM
	(SELECT
		FIRST_NAME ||' '|| LAST_NAME AS "이름",
		(SALARY + COMMISSION_PCT * SALARY)* 12 AS "보너스 연봉"
	FROM
		EMPLOYEES e
	ORDER BY "보너스 연봉" DESC NULLS LAST)
WHERE
	ROWNUM <= 5;


