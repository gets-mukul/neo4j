package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.AnalysisOfAlgorithm;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AnalysisOfAlgorithmRepository extends Neo4jRepository<AnalysisOfAlgorithm, Long> {

    @Query("MATCH (n:AnalysisOfAlgorithm {title: {title}}) DELETE n")
    String deleteAoaNode(String title);

    @Query("MATCH (n:AnalysisOfAlgorithm ) RETURN n LIMIT {noOfNodes}")
    Collection<AnalysisOfAlgorithm> getAllAoaNodes(Integer noOfNodes);
}
