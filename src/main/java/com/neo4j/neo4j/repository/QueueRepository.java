package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Queue;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface QueueRepository extends Neo4jRepository<Queue, Long> {
}
