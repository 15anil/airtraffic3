package com.example.airtraffic.repository;




import com.example.airtraffic.model.Flights;
import com.example.airtraffic.model.Runway;
import com.example.airtraffic.model.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepo extends JpaRepository<Flights,Integer> {
    List<Flights> findByRunway(Runway runway);
    List<Flights> findByTerminal(Terminal terminal);
}
