package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Graph;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface GraphRepository extends Neo4jRepository<Graph, Long> {

    @Query("MATCH (n:Graph {title: {title}}) DELETE n")
    String deleteGraphNode(String title);

    @Query("MATCH (n:Graph) RETURN n LIMIT {noOfNodes}")
    Collection<Graph> getAllGraphNodes(Integer noOfNodes);
}

