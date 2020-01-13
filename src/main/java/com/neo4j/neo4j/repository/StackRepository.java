package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Stack;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StackRepository extends Neo4jRepository<Stack, Long> {
}
