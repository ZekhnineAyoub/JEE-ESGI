package com.ayoub.restaurant.Repository;

import com.ayoub.restaurant.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    @Query(value = "SELECT id FROM Restaurant WHERE location =?1",nativeQuery = true)
    List<Long> GetRestaurantByCIty(String city);
    @Query("" +
            "SELECT CASE WHEN COUNT(r) > 0 THEN " +
            "TRUE ELSE FALSE END " +
            "FROM Restaurant r " +
            "WHERE r.name = ?1"
    )
    Boolean SelectExistsName(String name);

}
