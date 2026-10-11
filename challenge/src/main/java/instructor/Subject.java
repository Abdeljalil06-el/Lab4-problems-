package instructor;

public class Subject {
    private static int nextId = 1;
    private int id;
    private String code;
    private String title;

    public Subject() {
        this(0,"", "");
    }

    // Initialization constructor
    public Subject(int id,String code, String title) {
        this.id = nextId;
        this.code = code;
        this.title = title;
        nextId++;
    }

    public String normalizedCode(){
        if (code==null){
            return "";
        }
        return code.trim().toUpperCase();
    }

    public String properTitle(){
        if (title==null || title.trim().isEmpty()){
            return "";
        }
        String[] words=title.trim().split("\\s+");

        StringBuilder sb=new StringBuilder();
        for (String word:words){
            if (sb.length()>0){
                sb.append(" ");
            }
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
        }
        return sb.toString();
    }

    public boolean isIntroCourse(){
        return title.toLowerCase().contains("intro") || normalizedCode().startsWith("INTRO-");
    }

    public String syllabusLine(Instructor instructor) {
    StringBuilder sb = new StringBuilder();
    sb.append(normalizedCode()).append(" - ").append(properTitle());
    sb.append(" (Instructor: ");
    sb.append(instructor.displayName());
    sb.append(")");
    return sb.toString();
}
}
