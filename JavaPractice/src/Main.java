import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listI=new ArrayList<>();
        Set<Integer> setiI=new HashSet<>() ;
        Set<Integer> setI=new LinkedHashSet<>() ;
        Set<Integer> setII=new TreeSet<>() ;

        listI.add(5);
        listI.add(1);
        listI.add(6);
        listI.add(3);
        listI.add(4);
        listI.add(1);
        listI.add(2);
        System.out.println("args = " + listI);

        setiI.addAll(listI);
        setI.addAll(listI);
        setII.addAll(listI);
        System.out.println("hashset = " + setiI);
        System.out.println("linkedhashset = " + setI);
        System.out.println("TreeSet = " + setII);


        System.out.println("Hello world!");
        Map<Integer,Integer> map1=new HashMap();
        Map<Integer,Integer> map2=new TreeMap<>();
        Map<Integer,Integer> map3=new LinkedHashMap<>();

        map1.put(1,3);
        map1.put(3,4);
        map1.put(2,9);
        map1.put(5,1);
        map2.putAll(map1);

        map3.put(1,3);
        map3.put(3,4);
        map3.put(2,9);
        map3.put(5,1);
        System.out.println("HashMap = " + map1);
        System.out.println("TreeMap = " + map2);
        System.out.println("LinkedHAshMap = " + map3);

        LinkedHashMap<Integer,ArrayList<Integer>>lp=new LinkedHashMap<>();
        lp.put(1,listI);
        System.out.println("args = " + lp);


    }
}