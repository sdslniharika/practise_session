package org.example.service;

import org.example.dao.BusDao;
import org.example.entity.BusDetails;
import org.example.exception.BusNotFoundExcpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
@Service
public class BusServiceImp implements BusService{

    BusDao busDao;
    @Autowired
    public BusServiceImp(BusDao busDao) {
        this.busDao = busDao;
    }

    public void addBusDetails(int busId, LocalDate dateOfArrival, LocalTime arrivalTime, LocalTime departureTime, String from,
                              String to, double ticketCost) {
        BusDetails busDetails = new BusDetails(busId, dateOfArrival, arrivalTime, departureTime, from, to, ticketCost);
        busDao.addBus(busDetails);
    }
    public BusDetails printBusDetails(int busId)
    {
      Optional<BusDetails> optionalBusDetails = busDao.getBusDetails(busId);
      if(optionalBusDetails.isEmpty())
      {
          throw  new BusNotFoundExcpetion("Bus Not Found");
      }
      return  optionalBusDetails.get();
    }


}
