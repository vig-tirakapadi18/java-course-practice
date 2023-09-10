class Emp {
    void work() {
        System.out.println("Working!");
    }

    void project() {
        System.out.println("Doing Project!");
    }
}

class Dev extends Emp {
    void work() {
        System.out.println("Developer is Working!");
    }

    void project() {
        System.out.println("Developer doing Project!");
    }
}

class Tester extends Emp {
    void work() {
        System.out.println("Testing Work!");
    }
 
    void project() {
        System.out.println("Testing Project!");
    }
}

class Job {
    void activity(Emp ref) {
        ref.work();
        ref.project();
    }
}

class WithoutAbstraction {
    public static void main(String[] args) {
        Dev dev = new Dev();
        Tester test = new Tester();

        Job job = new Job();
        job.activity(dev);
        job.activity(test);
    }
}
