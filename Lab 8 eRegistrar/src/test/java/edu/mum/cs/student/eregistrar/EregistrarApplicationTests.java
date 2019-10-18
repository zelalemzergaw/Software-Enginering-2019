package edu.mum.cs.student.eregistrar;

import edu.mum.cs.student.eregistrar.model.Student;
import edu.mum.cs.student.eregistrar.service.StudentServiceImp;
import org.hibernate.query.criteria.internal.expression.SimpleCaseExpression;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EregistrarApplicationTests {
    @Mock
    Student student;
    @Mock
    StudentServiceImp studentServiceImp;
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Test
    public void testSaveStudent() {
        Student s= new Student();
        s.setStudentId(1L);
        when(studentServiceImp.saveStudent(student)).thenReturn(s);
        long expected=studentServiceImp.saveStudent(student).getStudentId();

        Assert.assertEquals(1,expected);

            }

}
