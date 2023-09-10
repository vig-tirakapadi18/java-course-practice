class Teacher {
    void teach() {
        System.out.println("Teaching!");
    }

    void assignment() {
        System.out.println("Teacher Assignment!");
    }
} 

class JavaTeacher extends Teacher {
    void assignment() {
        System.out.println("Java Assignment!");
    }

    void javaWorker() {
        System.out.println("Java Work!");
    }
}

class PythonTeacher extends Teacher {
    void assignment() {
        System.out.println("Python Assignment!");
    }

    void pythonWork() {
        System.out.println("Python Work!");
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {
        Teacher ref;
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();

        ref = jt;
        ref.teach();
        ref.assignment();
        // ref.javaWorker(); //Can't access Specialized Methods
        ((JavaTeacher)(ref)).javaWorker();

        ref = pt;
        ref.teach();
        ref.assignment();
        // ref.pythonWork();   //Can't access Specialized Methods
        ((PythonTeacher)(ref)).pythonWork();
    }
}
