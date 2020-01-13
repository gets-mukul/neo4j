package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Tree;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TreeRepository extends Neo4jRepository<Tree, Long> {
}
