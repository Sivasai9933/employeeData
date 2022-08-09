package employeeData;

public class Main {

    public static void main(String[] args) {
        Developer obj = new Developer(21, "siva", "Dev", "IT", 201211, "2122", new String[]{"java","pyton"});
        obj.display();
        //obj.update_skills("java", "python");
        System.out.println(obj);
    }
}
