create table dept_tcl0
as select * from dept;

select * from dept_tcl1;

--40번 부서의 근무지를 JEJU로 변경
update  dept_tcl0 set loc='JEJU' where deptno =40;
--부서명이 'RESEARCH'인 부서 삭제

rollback;

