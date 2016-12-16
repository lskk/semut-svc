package com.gigastic.semut;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ceefour on 16/12/2016.
 */
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    Page<Place> findAllByTypeId(List<Integer> typeIds, Pageable pageable);

}
