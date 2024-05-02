package Week2.homeworks.gradecalculation;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double percentage=1;
    //Declared as constants, for further use cases values can be changed easily.
    static final double MATH_PERCENTAGE=0.20;
    static final double PHYSIC_PERCENTAGE=0.40;
    static final double CHEMISTRY_PERCENTAGE=0.30;

    double performanceGrade;
    double finalGrade;


    //New parameter performance grade is added to the constructor.
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        //It will set the percentages to the course according to the prefixes.
        this.percentage=setPercentage();
        //It calls the setPercentage for clarifying percentage per class
    }

    //According to prefix, percentage will be assinged while object creation
    public double setPercentage() {
        switch(this.prefix){
            case "MAT":
                this.percentage=MATH_PERCENTAGE;
                break;
            case "FZK":
                this.percentage=PHYSIC_PERCENTAGE;
                break;
            case "KMY":
                this.percentage=CHEMISTRY_PERCENTAGE;
                break;
        }
        return this.percentage;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }


    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }


}
