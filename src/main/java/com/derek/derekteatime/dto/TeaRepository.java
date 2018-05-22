package com.derek.derekteatime.dto;

import com.derek.derekteatime.data.Tea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by nelsoder on 5/12/2018.
 */
@Repository
public interface TeaRepository extends CrudRepository<Tea, UUID> {

    Tea findByResourceId(UUID resourceId);

}
