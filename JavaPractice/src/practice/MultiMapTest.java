package practice;

import java.util.HashMap;
import java.util.Map;

public class MultiMapTest {

    public static void main(String args[])
    {
        Department dep=new Department(1,"IT");
        Department dep2=new Department(2,"Finance");

        Employee emp=new Employee(101,"Alice");
        Employee emp2= new Employee(102,"Rose");
        Map<Department,Employee>mp=new HashMap<>();
        mp.put(dep,emp);
        mp.put(dep2,emp2);

        Map<Integer,Map<Department,Employee>> empDepMap=new HashMap<>();

        empDepMap.put(11,mp);
        System.out.println("empDepMap ="+ mp.get(1));










    }
}
