package com.springbootapp1.conferencedemo.repositories;

import com.springbootapp1.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
