package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Stack;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StackRepository extends Neo4jRepository<Stack, Long> {

    @Query("MATCH (n:Stack {title: {title}}) DELETE n")
    String deleteStackNode(String title);

    @Query("MATCH (n:Stack) RETURN n LIMIT {noOfNodes}")
    Collection<Stack> getAllStackNodes(Integer noOfNodes);
}
