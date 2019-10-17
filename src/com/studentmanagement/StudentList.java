package com.studentmanagement;


import java.util.ArrayList;

public class StudentList {
    private ArrayList<String> studentList = new ArrayList<String>();

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(String student){
        studentList.add(student);
    }

    public void displayStudentList(){
        System.out.println("In ra danh sach cac sinh vien: ");
        for(int i=0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }

    public void removeStudent(String student){
        int index = studentList.indexOf(student);
        if (index >= 0){
            studentList.remove(index);
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Khong tim thay sinh vien");
        }

    }

    public void modifyStudent(String oldStudent, String newStudent){
        int index = studentList.indexOf(oldStudent);
        studentList.add(index, newStudent);
    }

    public String findStudent(String student){
        if(studentList.indexOf(student) >= 0){
            int index = studentList.indexOf(student);
            return studentList.get(index);
        } else {
            return null;
        }
    }
    public boolean onFind(String student){
        if(studentList.indexOf(student) >= 0){
            return true;
        } else {
            return false;
        }
    }

}
