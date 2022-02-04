SELECT * FROM USER_INDEXES;

SELECT * FROM USER_IND_COLUMNS;

SELECT * FROM emp where empno = 7788;
SELECT * FROM emp where ename ='SCOTT';


create index ind_emp_sal0
on emp(sal);

select *from emp where sal =3000;

drop INDEX  ind_emp_sal0; 

create table dept_seq_test1
as select *from dept where 1=0;

select* from dept_seq_test1;

create sequence seq_deptno1
increment by 10
start with 10
maxvalue 90
minvalue 0
nocycle
cache 2;

select* from user_sequences;

insert into dept_seq_test1
values(seq_deptno.nextval, 'DATVASE', 'SEOUL');

select * from dept_seq_test1;

select seq_deptno.currval from dual;

alter sequence seq_deptno
increment by 3
maxvalue 99
cycle;

drop sequence seq_deptno;






