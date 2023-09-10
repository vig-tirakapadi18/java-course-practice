interface JavaTech {
    void javaFeature();
}

interface PythonTech {
    void pythonFeature();
}

interface SQLTech {
    void sqlFeature();
}

class Developer implements JavaTech, PythonTech, SQLTech {
    public void javaFeature() {
        System.out.println("Java Feature!");
    }

    public void pythonFeature() {
        System.out.println("Python Feature!");
    }

    public void sqlFeature() {
        System.out.println("SQL Feature!");
    }
}

class Interface1 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.javaFeature();
        dev.pythonFeature();
        dev.sqlFeature();
    }
}