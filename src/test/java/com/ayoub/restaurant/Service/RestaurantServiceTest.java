package com.ayoub.restaurant.Service;

import com.ayoub.restaurant.Repository.RestaurantRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class RestaurantServiceTest {


    @Mock private RestaurantRepository restaurantRepository;
    private RestaurantService underTest;

    @BeforeEach
    void setUp() {
        underTest = new RestaurantService(restaurantRepository);
    }


    @Test
    @Disabled
    void canGetAllRestaurant() {

        //when
        underTest.GetAllRestaurant();
        //then
        verify(restaurantRepository).findAll();

    }
    @Test
    void addNewRestaurant() {
    }

    @Test
    @Disabled
    void getRestaurantById() {
    }

    @Test
    @Disabled
    void deletRestaurantById() {
    }

    @Test
    @Disabled
    void getAllRestaurantProximity() {
    }

}