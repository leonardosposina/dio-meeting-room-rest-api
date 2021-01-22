package one.digitalinnovation.rooms.meetingroomsapi.repository;

import one.digitalinnovation.rooms.meetingroomsapi.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
