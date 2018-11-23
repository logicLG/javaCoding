package test;

import com.google.protobuf.InvalidProtocolBufferException;
import test.StudentOuterClass;
public class Student2 {
    public static void main(String[] args) {
        StudentOuterClass.Student.Builder buidler = StudentOuterClass.Student.newBuilder();
        buidler.setName("Frank");
        buidler.setNumber(123456);
        buidler.setHobby("music");
        StudentOuterClass.Student student = buidler.build();
        System.out.println(student.toString());
        byte[] array = student.toByteArray();

        try {
            StudentOuterClass.Student student1 = StudentOuterClass.Student.parseFrom(array);
            System.out.println(student1.toString());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }


    }
}
