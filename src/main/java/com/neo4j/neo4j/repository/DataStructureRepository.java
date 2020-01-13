package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.DataStructure;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DataStructureRepository  extends Neo4jRepository<DataStructure, Long> {

}
