package main.repository;

import main.entity.Hotel;
import main.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

//        @Query("SELECT r from hotel h join room r on r.hotel_id=h.id")
//        List<Room> getRoomList(@Param("id")Integer id);

    @Query("SELECT r from Hotel h join h.roomList r")
    List<Room> getRoomList(@Param("Hotel") Hotel hotel);

////    @Query(
////            value="Select h FROM hotel INNER JOIN room ON hotel.id=room.hotel_id",nativeQuery = true)


}
