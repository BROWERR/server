package com.server.server.repository;

import com.server.server.models.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PlayerRepository extends CrudRepository<Player,Long> {

}
