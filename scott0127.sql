select *from emp, dept order by empno;--크로스 조인.

--Equi join : 컬럼의 값이 같은 경우 조인한다.
select emp.deptno,ename,dname from emp, dept where emp.deptno =dept.deptno;

select * from emp e, dept d where e.deptno =d.deptno;

--non Equi join
select * from salgrade;
select * from emp;

select e.empno, e.ename, s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal and e.deptno=10;





--20번 부서 사원의 사번, 이름, 부서명을 출력하세요
SELECT e.empno, e.ename, d.dname, d.deptno
from emp e, dept d
where e.deptno=d.deptno and e.deptno =20;


select *
from emp e inner join dept d
on e.deptno= d.deptno;


select *
from emp e inner join dept d
using (deptno);


select *
from emp e NATURAL join dept d where ename like '%S%';  --위 3가지다 where절을 붙일수 있다.










