package one.digitalinnovation.rooms.meetingroomsapi.controller;

import one.digitalinnovation.rooms.meetingroomsapi.exception.RoomNotFoundException;
import one.digitalinnovation.rooms.meetingroomsapi.model.Room;
import one.digitalinnovation.rooms.meetingroomsapi.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

  @Autowired
  private RoomService roomService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Room createRoom(@RequestBody Room room) {
    return roomService.createRoom(room);
  }

  @GetMapping
  public List<Room> getAll() {
    return roomService.listAll();
  }

  @GetMapping("/{id}")
  public Room findById(@PathVariable Long id) throws RoomNotFoundException {
    return roomService.findById(id);
  }

  @PutMapping("/{id}")
  public Room updateById(@PathVariable Long id, @RequestBody Room room) throws RoomNotFoundException {
    return roomService.updateById(id, room);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteById(@PathVariable Long id) throws RoomNotFoundException {
    roomService.deleteById(id);
  }

}
