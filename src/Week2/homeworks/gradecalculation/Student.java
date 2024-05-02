package Week2.homeworks.gradecalculation;

import Week2.homeworks.gradecalculation.Course;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;




    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void addBulkPerformanceNote(int grade1, int grade2, int grade3) {

        if (grade1 >= 0 && grade1 <= 100) {
            this.mat.performanceGrade = grade1;
        }

        if (grade2 >= 0 && grade2 <= 100) {
            this.fizik.performanceGrade = grade2;
        }

        if (grade3 >= 0 && grade3 <= 100) {
            this.kimya.performanceGrade = grade3;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.02f\n" , this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public double calcAverage() {
        //call for calculation with performance grades.
        mat.finalGrade =(mat.performanceGrade* this.mat.percentage)+ (this.mat.note*(1- this.mat.percentage));
        fizik.finalGrade =(mat.performanceGrade* this.fizik.percentage)+ (this.fizik.note*(1- this.fizik.percentage));
        kimya.finalGrade =(mat.performanceGrade* this.kimya.percentage)+ (this.kimya.note*(1- this.kimya.percentage));

        //Average of final grades
        this.average = (fizik.finalGrade + kimya.finalGrade + mat.finalGrade) / 3;
        return this.average;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}



