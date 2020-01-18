package com.neo4j.neo4j.service;

import com.neo4j.neo4j.entity.*;
import com.neo4j.neo4j.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GetServiceImpl implements GetService {

    private AnalysisOfAlgorithmRepository analysisOfAlgorithmRepository;
    private ArrayRepository arrayRepository;
    private DataStructureRepository dsRepository;
    private GraphRepository graphRepository;
    private LinkedListRepository linkedListRepository;
    private QueueRepository queueRepository;
    private StackRepository stackRepository;
    private TreeRepository treeRepository;

    @Autowired
    public GetServiceImpl(AnalysisOfAlgorithmRepository analysisOfAlgorithmRepository, ArrayRepository arrayRepository,
                          DataStructureRepository dataStructureRepository, GraphRepository graphRepository,
                          LinkedListRepository linkedListRepository, QueueRepository queueRepository,
                          StackRepository stackRepository, TreeRepository treeRepository) {

        this.analysisOfAlgorithmRepository = analysisOfAlgorithmRepository;
        this.arrayRepository = arrayRepository;
        this.dsRepository = dataStructureRepository;
        this.graphRepository = graphRepository;
        this.linkedListRepository = linkedListRepository;
        this.queueRepository = queueRepository;
        this.stackRepository = stackRepository;
        this.treeRepository = treeRepository;
    }

    @Override
    public Collection<AnalysisOfAlgorithm> getAllAoaNodes(Integer noOfNodes) {
        return analysisOfAlgorithmRepository.getAllAoaNodes(noOfNodes);
    }

    @Override
    public Collection<Array> getAllArrayNodes(Integer noOfNodes) {
        return arrayRepository.getAllArrayNodes(noOfNodes);
    }

    @Override
    public Collection<DataStructure> getAllDSNodes(Integer noOfNodes) {
        return dsRepository.getAllDsNodes(noOfNodes);
    }

    @Override
    public Collection<Graph> getAllGraphNodes(Integer noOfNodes) {
        return graphRepository.getAllGraphNodes(noOfNodes);
    }

    @Override
    public Collection<LinkedList> getAllLLNodes(Integer noOfNodes) {
        return linkedListRepository.getAllLLNodes(noOfNodes);
    }

    @Override
    public Collection<Queue> getAllQueueNodes(Integer noOfNodes) {
        return queueRepository.getAllQueueNodes(noOfNodes);
    }

    @Override
    public Collection<Stack> getAllStackNodes(Integer noOfNodes) {
        return stackRepository.getAllStackNodes(noOfNodes);
    }

    @Override
    public Collection<Tree> getAllTreeNodes(Integer noOfNodes) {
        return treeRepository.getAllTreeNodes(noOfNodes);
    }
}
