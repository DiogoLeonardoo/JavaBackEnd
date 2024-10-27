package com.eventostec.api.repositories;
import com.eventostec.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID>{


}
