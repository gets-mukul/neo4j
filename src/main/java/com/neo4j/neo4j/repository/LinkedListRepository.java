package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.LinkedList;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface LinkedListRepository extends Neo4jRepository<LinkedList, Long> {
    @Query("MATCH (n:LinkedList {title: {title}}) DELETE n")
    String deleteLLNode(String title);

    @Query("MATCH (n:LinkedList) RETURN n LIMIT {noOfNodes}")
    Collection<LinkedList> getAllLLNodes(Integer noOfNodes);

}
