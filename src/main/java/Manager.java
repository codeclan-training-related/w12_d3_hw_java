public class Manager extends Employee {
    private String deptName;

    public Manager(String name,int NINumber, Double salary, String deptName){
        super(name,NINumber,salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }






}
