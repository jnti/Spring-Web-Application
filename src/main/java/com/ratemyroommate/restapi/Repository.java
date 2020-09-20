package com.ratemyroommate.restapi;

import org.springframework.data.repository.CrudRepository;
import com.ratemyroommate.restapi.Roommate;

public interface Repository extends CrudRepository<Roommate, Integer>{

}
