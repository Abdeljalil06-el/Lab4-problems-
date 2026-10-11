package student;

public class Major {
    private static int nextId = 1;
    private static int MAX_STUDENTS = 50;
    public static Major computerScience=new Major("23", "Compter Science");
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    
    public Major(){
        this("","");
    }

    public Major(String code, String name) {
        this.id=nextId++;
        this.code=code;
        this.name=name;
        this.students=new Student[MAX_STUDENTS];
        this.studentCount=0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount>=MAX_STUDENTS){
            System.out.println(name + "id full");
            return;
        }
        students[studentCount]=s;
        studentCount++;
    }

    // Getters
    public int getId(){return this.id;}

    public String getCode(){return this.code;}
    public String getName(){return this.name;}

    public void setCode(String code){this.code=code;}
    public void setName(String name) { this.name = name; }



    public Student findStudentByCNE(String cne){
        for (int i=0;i<studentCount;i++){
            if (students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }

    public int getStudentCount(){
        return studentCount;
    }

    public boolean removeStudent(String cne){
        Student student=findStudentByCNE(cne);
        if (student==null){
            return false;
        }

        int index=0;
        while (students[index]!=student){
            index++;
        }

        for (int i=index;i<studentCount-1;i++){
            students[i]=students[i+1];
        }
        students[studentCount-1]=null;
        studentCount--;
        return true;
    } 

    public void getOccupancyRate(){
        double rate=(double) studentCount/MAX_STUDENTS *100;
        System.out.println(name + " capacity: " + MAX_STUDENTS + " students");
        System.out.println("Current enrollment: " + studentCount + " students");
        System.out.println("Occupancy rate = " + rate + "%");
    }

    public String getStudentListAsString(){
        StringBuilder str=new StringBuilder();
        for (int i=0;i<studentCount;i++){
            str.append(" ").append(i+1).append(". ").append(students[i].getCne()).append(" ").append(students[i].getLastName().toUpperCase()).append(" ").append(students[i].getFirstName()).append("\n");
        }
        return str.toString();
    }


    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the " + name.toLowerCase() + " major is:");
        System.out.print(getStudentListAsString());
    }

    public String toString() {
    return "Major : id=" + id + ", code=" + code + ", name=" + name
            + ", students=" + studentCount + "/" + MAX_STUDENTS + ".";
    }


}
