class Teacher {
    void teach() {
        System.out.println("Teaching!");
    }

    void assignment() {
        System.out.println("Teacher is giving Assignment!");
    }
}

class JavaTeacher extends Teacher {
    void assignment() {
        System.out.println("Java Assignment!");
    }

    void javaProject() {
        System.out.println("Java Project is being Done!");
    }
}

class PythonTeacher extends Teacher {
    void assignment() {
        System.out.println("Python Assignment!");
    }

    void pythonProject() {
        System.out.println("Python project is being Done!");
    }
}

public class TypesOfMethods {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();

        jt.teach();
        jt.assignment();
        jt.javaProject();

        pt.teach();
        pt.assignment();
        pt.pythonProject();
    }
}
