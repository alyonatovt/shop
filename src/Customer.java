public class Customer {
 private String name;
 private int age;
 private double budget;

    public Customer(String name, int age, double budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public double getBudget(){
        return budget;
    }
    public void setBudget(){
        this.budget = budget;
    }
}
