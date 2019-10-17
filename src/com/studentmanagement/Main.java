package com.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static StudentList studentList = new StudentList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Chuong trinh quan ly sinh vien");
        printInstructions();
        boolean flag = true;
        while (flag){
            System.out.println("Nhap vao lua chon cua ban: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    studentList.displayStudentList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    flag = false;
                    break;
                case 7:
                    covertArrayListToArray();
            }
        }
        System.out.println("Chuong trinh ket thuc");

    }
    public static void covertArrayListToArray(){
        ArrayList<String> studentArrayList = studentList.getStudentList();
        String [] studentArray = new String[studentArrayList.size()];
        studentArray = studentArrayList.toArray(studentArray);
        for(int i= 0; i< studentArray.length ; i++ ){
            System.out.println(studentArray[i]);
        }
    }

    public static void addItem(){
        System.out.println("Ban da chon them sinh vien");
        System.out.println("Vui long nhap ten sinh vien");
        scanner.nextLine();
        String student = scanner.nextLine();
        studentList.addStudent(student);
    }

    public static void modifyItem(){
        System.out.println("Ban da chon sua sinh vien");
        System.out.println("Nhap ten sinh vien can sua thong tin: ");
        scanner.nextLine();
        String oldStudent = scanner.nextLine();
        System.out.println("Nhap thong tin sinh vien moi: ");
        String newStudent = scanner.nextLine();
        studentList.modifyStudent(oldStudent, newStudent);
    }
    public static void removeItem(){
        System.out.println("Ban da chon xoa sinh vien");
        System.out.println("Nhap ten sinh vien can xoa: ");
        scanner.nextLine();
        String student = scanner.nextLine();
        studentList.removeStudent(student);
    }

    public static void findItem(){
        System.out.println("Ban da chon tim sinh vien");
        System.out.println("Vui long nhap ten sinh vien can tim");
        scanner.nextLine();
        String student = scanner.nextLine();
        if(studentList.onFind(student)){
            System.out.println("Tim thay sinh vien " + student);
        } else {
            System.out.println("Khong tim thay sinh vien " + student);
        }
    }


    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list student items");
        System.out.println("\t 2 - To add an item in the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item in the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");

    }
}
