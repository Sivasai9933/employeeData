package employeeData;

public class Developer extends Employee {

    private String developer_id;
    private String[] pr_language = new String[2];



    public Developer(int em_age, String em_name, String em_designation, String em_department, double em_salary,String developer_id, String[] pr_language) {
        super(em_age, em_name, em_designation, em_department, em_salary);
        this.developer_id = developer_id;
        this.pr_language = pr_language;
    }
   
    
    
    
    
    





    @Override
    void display() {
        setEm_salary(getEm_salary()+24789.12);
        System.out.println(getEm_salary());
        
    }
    

    
    


}
