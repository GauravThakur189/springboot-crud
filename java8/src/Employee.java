public class Employee {
    public int id;
    public String name;

    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
    public  String toString(){
        return "Employee { id: "+ this.id +", name: " + this.name + "}";
    }
}
