package ru.Albiz19.java2020.pr13.ex13_1;

class StudentTest {
    Student []students = {
            new Student("Петров",19,35621),
            new Student("Иванов",20, 20653),
            new Student("Сидоров",21,12903),
            new Student("Иванова",20,63213),
            new Student("Полякова",19,53421)
    };
    public void sort(){
        int min;
        Student temp;
        for (int index = 0; index < students.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < students.length; scan++)
                if (!students[scan].compareTo(students[min]))
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
class Student {
    private String name;
    private int age;
    private int iDNumber;

    public Student(String name, int age, int iDNumber) {
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + iDNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
    public boolean compareTo(Student student){
        if (student.getiDNumber() < iDNumber) return true;
        else return false;
    }

}
