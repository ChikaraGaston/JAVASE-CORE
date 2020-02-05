package day2.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day2.Person;
import day2.Student;

public class Test {


    public static void main(String[] args) {
        Person p=new Person();
        Student s=new Student();
        Person p1=new Student();
        System.out.println(p instanceof Person);
        System.out.println(p1 instanceof Student);
        System.out.println(p1 instanceof Person);
    }
}
