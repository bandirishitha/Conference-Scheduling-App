package com.springbootapp1.conferencedemo.repositories;

import com.springbootapp1.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
