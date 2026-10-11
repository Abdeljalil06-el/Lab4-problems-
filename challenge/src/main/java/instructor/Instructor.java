package instructor;
import student.Person;

public class Instructor extends Person{
    private String employeeNumber;

    public Instructor(){
        super();
        this.employeeNumber="";
    }

    public Instructor(String lastName, String firstName, String phone, String email, String employeeNumber) {
        super(firstName, lastName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public String cleanEmployeeNumber(){
        if (employeeNumber==null){
            return "";
        }
        return employeeNumber.trim().replace(" ", "");
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",cleanEmployeeNumber(),getLastName(),getFirstName());
    }

    public String toCard(){
        StringBuilder sb=new StringBuilder();
        sb.append("Instructor").append("\n").append("----------")
        .append("\n").append("Employee #: ").append(cleanEmployeeNumber())
        .append("\n").append("Name : ").append(getLastName()).append(", ").append(getFirstName())
        .append("\n").append("Email : ").append(getEmail())
        .append("\n").append("Phone : ").append(getPhone());

        return sb.toString();
    }

    public String displayName(){
        StringBuilder sb=new StringBuilder();
        String lastName=getLastName();
        String firstName=getFirstName();

        if (lastName!=null && !lastName.isEmpty()){
            sb.append(lastName);
        }
        if (firstName!=null && !firstName.isEmpty()){
            if (sb.length()>0){
                sb.append(" ");
            }
            sb.append(firstName);
        }
        
        return sb.toString();
    }
}
