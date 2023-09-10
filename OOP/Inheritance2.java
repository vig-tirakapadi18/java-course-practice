class Developer {
    String name;
    String team;
}

class FrontendDev extends Developer {
    String webTechName;

    void work() {
        System.out.println("FrontendDev is working!");
    }
}

class BackendDev extends Developer {
    String progLangName;

    void attendMeeting() {
        System.out.println("BackendDev is working!");
    }
}

class JavaDev extends BackendDev {
    void javaProj() {
        System.out.println("JavaDev is working!");
    }
}

class PythonDev extends BackendDev {
    void pythonProj() {
        System.out.println("PythonDev is working!");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        FrontendDev fd = new FrontendDev();
        BackendDev bd = new BackendDev();
        JavaDev jd = new JavaDev();
        PythonDev pd = new PythonDev(); 

        fd.name = "ABC";
        fd.team = "Alpha";
        fd.webTechName = "ReactJs";
        fd.work();

        bd.name = "DEF";
        bd.team = "Beta";
        bd.progLangName = "Python";
        bd.attendMeeting();

        jd.name = "LMN";
        jd.team = "Gamma";
        jd.javaProj();

        pd.name = "XYZ";
        pd.team = "Delta";
        pd.pythonProj();
    }
}
