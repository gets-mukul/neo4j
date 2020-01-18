package com.neo4j.neo4j.service;

import com.neo4j.neo4j.entity.*;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface GetService {

    Collection<AnalysisOfAlgorithm> getAllAoaNodes(Integer noOfNodes);

    Collection<Array> getAllArrayNodes(Integer noOfNodes);

    Collection<DataStructure> getAllDSNodes(Integer noOfNodes);

    Collection<Graph> getAllGraphNodes(Integer noOfNodes);

    Collection<LinkedList> getAllLLNodes(Integer noOfNodes);

    Collection<Queue> getAllQueueNodes(Integer noOfNodes);

    Collection<Stack> getAllStackNodes(Integer noOfNodes);

    Collection<Tree> getAllTreeNodes(Integer noOfNodes);
}
