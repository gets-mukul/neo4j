package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Queue;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface QueueRepository extends Neo4jRepository<Queue, Long> {

    @Query("MATCH (n:Queue {title: {title}}) DELETE n")
    String deleteQueueNode(String title);

    @Query("MATCH (n:Queue) RETURN n LIMIT {noOfNodes}")
    Collection<Queue> getAllQueueNodes(Integer noOfNodes);
}
