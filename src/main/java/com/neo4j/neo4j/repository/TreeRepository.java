package com.neo4j.neo4j.repository;

import com.neo4j.neo4j.entity.Tree;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TreeRepository extends Neo4jRepository<Tree, Long> {

    @Query("MATCH (n:Tree {title: {title}}) DELETE n")
    String deleteTreeNode(String title);

    @Query("MATCH (n:Tree) RETURN n LIMIT {noOfNodes}")
    Collection<Tree> getAllTreeNodes(Integer noOfNodes);
}
