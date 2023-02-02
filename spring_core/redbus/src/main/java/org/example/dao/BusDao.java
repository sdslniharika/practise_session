package org.example.dao;

import org.example.entity.BusDetails;


import java.util.Optional;

public interface BusDao {
    public void addBus(BusDetails busDetails);

    public Optional<BusDetails> getBusDetails(int busId);
}
