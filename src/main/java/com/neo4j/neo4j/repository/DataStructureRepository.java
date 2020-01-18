package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.DataStructure;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataStructureRepository extends Neo4jRepository<DataStructure, Long> {

    @Query("MATCH (n:DataStructure {title: {title}}) DELETE n")
    String deleteDsNode(String title);
}
