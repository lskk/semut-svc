package com.gigastic.semut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ceefour on 16/12/2016.
 */
@RestController
@RequestMapping("api/placeService")
public class PlaceServiceController {

    @Autowired
    private PlaceRepository placeRepo;
    @Autowired
    private PlaceResourceAssembler placeResourceAssembler;

    @GetMapping("places")
    public PagedResources<Place> searchPlaces(@RequestParam("category") List<String> categories,
                                              @PageableDefault Pageable pageable,
                                              PagedResourcesAssembler pagedAssembler) {
        final List<Integer> typeIds = categories.stream().map(it -> PlaceType.OSM_MAPPING.inverse().get(it)).collect(Collectors.toList());
        final Page<Place> page = placeRepo.findAllByTypeId(typeIds, pageable);
        return pagedAssembler.toResource(page, placeResourceAssembler);
    }


}
