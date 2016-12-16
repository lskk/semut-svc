package com.gigastic.semut;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.IdentifiableResourceAssemblerSupport;
import org.springframework.stereotype.Component;

/**
 * Created by ceefour on 16/12/2016.
 */
@Component
public class PlaceResourceAssembler extends IdentifiableResourceAssemblerSupport<Place, Resource<Place>> {
    public PlaceResourceAssembler() {
        super(PlaceServiceController.class, (Class) Resource.class);
    }

    @Override
    public Resource<Place> toResource(Place entity) {
        return new Resource<>(entity);
    }
}
