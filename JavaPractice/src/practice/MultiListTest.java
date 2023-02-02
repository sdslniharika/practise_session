package practice;

public class MultiListTest {

    public static void main(String args[])
    {
        MultiList<String> multiList=new MultiList<>();

        multiList.add(0,"It");
        multiList.add(0,"Finance");
        multiList.add(1,"Alice");
        multiList.add(5,"Rose");
        multiList.add(1,"Adam");

        System.out.println("All Elements before removing= " + multiList.getAll());
        multiList.removeByValue("Rose");
        multiList.removeByIndex(1);


        System.out.println("All Elements = " + multiList.getByIndex(9));
        System.out.println("All Elements = " + multiList.getAll());
    }
}

