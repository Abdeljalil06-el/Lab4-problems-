package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){
        super();
    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        this.major=major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne,Major.computerScience);
    }

    // Getters
    public String getCne() { return cne; }

    public Major getMajor() { return major; }

    // Setters
    public void setCne(String cne) { this.cne = cne; }

    public void setMajor(Major major){
        if (this.major!=null){
            this.major.removeStudent(cne);
        }
        this.major=major;
        major.addStudent(this);
    }

    public String getFullNameFormatted(){
        return String.format("%s, %s",getLastName(),getFirstName());
    }

    @Override
    public String toString() {
    return "Student : id=" + id + ", cne=" + cne + ", name=" + getFullNameFormatted()
            + ", major=" + (major != null ? major.getName() : "none") + ".";
    }   
    

}
//