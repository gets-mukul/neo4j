package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.AnalysisOfAlgorithm;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisOfAlgorithmRepository extends Neo4jRepository<AnalysisOfAlgorithm, Long> {

    @Query("MATCH (n:AnalysisOfAlgorithm {title: {title}}) DELETE n")
    String deleteAoaNode(String title);
}
