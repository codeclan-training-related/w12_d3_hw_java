public abstract class Employee {
    private String name;
    private int NINumber;

    private Double salary;

    public Employee( String name, int NINumber, Double salary){
        this.name=name;
        this.NINumber=NINumber;
        this.salary=salary;
    }

    public Double raiseSalary(Double raiseAmount){
        return salary+=raiseAmount;
    }

    public Double payBonus(){
        return this.salary*0.01;
    }

}
