package com.studentmanagement;

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
            }
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
        System.out.println("Vui long nhap so thu tu sinh vien");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap thong tin sinh vien moi");
        String newStudent = scanner.nextLine();
        studentList.modifyStudent(index, newStudent);
    }
    public static void removeItem(){
        System.out.println("Ban da chon xoa sinh vien");
        System.out.println("Vui long nhap so thu tu sinh vien can xoa");
        int index = scanner.nextInt();
        scanner.nextLine();
        studentList.removeStudent(index);
    }

    public static void findItem(){
        System.out.println("Ban da chon tim sinh vien");
        System.out.println("Vui long nhap ten sinh vien can tim");
        scanner.nextLine();
        String student = scanner.nextLine();
        String findStudent = studentList.findStudent(student);
        if(findStudent != null){
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
