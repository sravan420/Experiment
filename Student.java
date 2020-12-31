import java.util.List;

public   class Student {
    private String name;
    private int rollno;
    private List<String> Phonenumbers;

    public Student(String name, int rollno, List<String> phonenumbers) {
        this.name = name;
        this.rollno = rollno;
        Phonenumbers = phonenumbers;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public List<String> getPhonenumbers() {
        return Phonenumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setPhonenumbers(List<String> phonenumbers) {
        Phonenumbers = phonenumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                ", Phonenumbers=" + Phonenumbers +
                '}';
    }


}