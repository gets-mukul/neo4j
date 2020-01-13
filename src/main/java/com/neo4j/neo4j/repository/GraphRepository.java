package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Graph;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface GraphRepository extends Neo4jRepository<Graph, Long> {
}
