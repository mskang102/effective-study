package com.level1;

public class item01 {
    String studentId;
    String grade;
    String studentName;
    String age;

    private item01(String studentId) {
        this.studentId = studentId;
    }

    public static item01 autoCreateId(String studentId){
        return new item01(studentId);
    }

    public static void main(String[] args) {
        item01 item01 = autoCreateId("1");
    }
}
