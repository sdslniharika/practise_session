package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MultiList<T>{

    private List<List<T>> listList;

    MultiList()
    {
        listList=new LinkedList<>();
    }

    void add(int index ,T value)
    {
        if(!listList.isEmpty() && listList.size()>index)
        {
            List<T> sublist=listList.get(index);
            sublist.add(value);
            return;
        }
        List<T> newList=new ArrayList<>();
        newList.add(value);
        listList.add(newList);
    }

    void removeByIndex(int index)
    {
        listList.remove(index);
    }
    void removeByValue(T value)
    {
        for (List<T> val:listList) {
            if (val.contains(value)) {
                val.remove(value);
            }
            if(val.isEmpty())
            {
                int index=listList.indexOf(val);
                listList.remove(index);
            }
        }

    }

    public List getAll()
    {
        return listList;
    }
    public List getByIndex(int index) {
        if (index < listList.size()) {
            return listList.get(index);
        }
        return new ArrayList<>();
    }
}
