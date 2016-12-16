package com.gigastic.semut;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import org.springframework.validation.support.BindingAwareModelMap;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by ceefour on 16/12/2016.
 */
@Entity @Table(name = "tb_place_type")
public class PlaceType {

    public static final ImmutableBiMap<Integer, String> OSM_MAPPING;

    static {
        OSM_MAPPING = ImmutableBiMap.<Integer, String>builder()
                .put(1, "amenity_restaurant")
                .put(2, "tourism_hotel")
                .put(3, "shop_fashion")
                .put(4, "amenity_fuel")
                .put(5, "amenity_school")
                .put(6, "amenity_university")
                .put(7, "amenity_hospital")
                .put(8, "amenity_bank")
                .put(9, "railway_station")
                .put(10, "shop_mall")
                .put(11, "amenity_parking")
                .build();
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
