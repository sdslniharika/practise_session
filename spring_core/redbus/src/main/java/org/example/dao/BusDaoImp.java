package org.example.dao;

import org.example.datastore.BusDetailStorage;
import org.example.entity.BusDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class BusDaoImp implements  BusDao{

    public void addBus(BusDetails busDetails)
    {
        BusDetailStorage.busMap.put(busDetails.getBusId(),busDetails);
    }

    public Optional<BusDetails> getBusDetails(int busId)
    {
        BusDetails busDetails =BusDetailStorage.busMap.get(busId);
        if(busDetails==null)
        {
           return Optional.empty();
        }
        return  Optional.of(busDetails);
    }
}
