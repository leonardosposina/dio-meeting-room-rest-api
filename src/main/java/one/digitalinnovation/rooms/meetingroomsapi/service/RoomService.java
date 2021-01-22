package one.digitalinnovation.rooms.meetingroomsapi.service;

import one.digitalinnovation.rooms.meetingroomsapi.exception.RoomNotFoundException;
import one.digitalinnovation.rooms.meetingroomsapi.model.Room;
import one.digitalinnovation.rooms.meetingroomsapi.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

  @Autowired
  private RoomRepository roomRepository;

  public Room createRoom(Room room) {
    return roomRepository.save(room);
  }

  public List<Room> listAll() {
    return roomRepository.findAll();
  }

  public Room findById(Long id) throws RoomNotFoundException {
    return verifyIfExists(id);
  }

  public Room updateById(Long id, Room room) throws RoomNotFoundException {
    verifyIfExists(id);
    return roomRepository.save(room);
  }

  public void deleteById(Long id) throws RoomNotFoundException {
    verifyIfExists(id);
    roomRepository
      .deleteById(id);
  }

  private Room verifyIfExists(Long id) throws RoomNotFoundException {
    return roomRepository
      .findById(id)
      .orElseThrow(() -> new RoomNotFoundException(id));
  }
}
