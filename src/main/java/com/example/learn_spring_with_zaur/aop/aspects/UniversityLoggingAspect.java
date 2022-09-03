package com.example.learn_spring_with_zaur.aop.aspects;

import com.example.learn_spring_with_zaur.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging getting "+
                "list of students before getStudents method");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        Student firstStudent = students.get(0);

        String fullName = firstStudent.getFullName();
        fullName = "Mr. " + fullName;
        firstStudent.setFullName(fullName);

        firstStudent.setGPA(4.0);



        System.out.println("afterReturningGetStudentsLoggingAdvice: logging getting "+
                "list of students after ending getStudents method");
    }

}
