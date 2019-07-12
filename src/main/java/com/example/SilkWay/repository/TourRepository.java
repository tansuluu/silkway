package com.example.SilkWay.repository;

import com.example.SilkWay.model.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("tourRepository")
public interface TourRepository extends JpaRepository<Tour, Long> {
    List<Tour> getAllByTitle(String title);
    Tour findByTitle(String title);
    Tour findAllByCountry(String country);
    Tour findById(long id);

    @Override
    Page<Tour> findAll(Pageable pageable);

    List<Tour> getAllByCountry(String country);


//    List<Tour> filterTour(Tour tour);
}
