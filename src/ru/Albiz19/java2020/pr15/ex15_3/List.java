package ru.Albiz19.java2020.pr15.ex15_3;

public class List {
    private Student[] students = {};
    public List(Student[] students) {
        this.students = students;
    }
    public void sort(Student[] students){
        int min;
        Student temp;
        for (int index = 0; index < students.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < students.length; scan++)
                if (!students[scan].compareto(students[min]))
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
    public int binarySearch(Student[] students, Student student) {
        int firstIndex = 0;
        int lastIndex = students.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (students[middleIndex] == student) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (students[middleIndex].getiDNumber() < student.getiDNumber())
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (students[middleIndex].getiDNumber() > student.getiDNumber())
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
    public int recursiveBinarySearch(Student[] students, int firstElement, int lastElement, Student student) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (students[mid] == student)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (students[mid].getiDNumber() > student.getiDNumber())
                return recursiveBinarySearch(students, firstElement, mid - 1, student);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(students, mid + 1, lastElement, student);
        }

        return -1;
    }
}
