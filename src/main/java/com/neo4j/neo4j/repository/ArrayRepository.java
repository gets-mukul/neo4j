package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Array;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ArrayRepository extends Neo4jRepository<Array, Long> {

    @Query("MATCH (n:Array {title: {title}}) DELETE n")
    String deleteArrayNode(String title);

    @Query("MATCH (n:Array) RETURN n LIMIT {noOfNodes}")
    Collection<Array> getAllArrayNodes(Integer noOfNodes);
}
