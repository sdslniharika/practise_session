package practice;

import java.util.HashMap;
import java.util.Map;

public class MultiMap <K, V>{

    private Map<K,Map<V,V>> mapMap;

    public MultiMap()
    {
        mapMap=new HashMap<>();
    }

    void add(K key,V value)
    {
        boolean val=mapMap.containsKey(key);
        if(val)
        {
            Map<V,V> map2=mapMap.get(key);



        }
    }


}
