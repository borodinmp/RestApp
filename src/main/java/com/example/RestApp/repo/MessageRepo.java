package com.example.RestApp.repo;

import com.example.RestApp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository <Message, Long> {
}
