package javacources.api.repositories;

import javacources.entitiy.Booking;
import javacources.entitiy.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Long>{
List<Booking> findAll();
}
