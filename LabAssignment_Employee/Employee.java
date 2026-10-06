public class Employee {
    private String emp_id;
    private String emp_name;
    private String emp_designation;



    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_designation(String emp_designation) {
        this.emp_designation = emp_designation;
    }

    public String getEmp_designation() {
        return emp_designation;
    }

    public void displayDesignation(){
        System.out.println("The employee designation is: " + emp_designation);
    }


}
