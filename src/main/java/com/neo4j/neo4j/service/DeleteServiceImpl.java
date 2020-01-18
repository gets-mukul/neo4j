package com.neo4j.neo4j.service;

import com.neo4j.neo4j.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteServiceImpl implements DeleteService {

    private AnalysisOfAlgorithmRepository analysisOfAlgorithmRepository;
    private ArrayRepository arrayRepository;
    private DataStructureRepository dsRepository;
    private GraphRepository graphRepository;
    private LinkedListRepository linkedListRepository;
    private QueueRepository queueRepository;
    private StackRepository stackRepository;
    private TreeRepository treeRepository;

    @Autowired
    public DeleteServiceImpl(AnalysisOfAlgorithmRepository analysisOfAlgorithmRepository, ArrayRepository arrayRepository,
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
    public String deleteAoaNode(String title) {
        try {
            analysisOfAlgorithmRepository.deleteAoaNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "AnalysisOfAlgorithm node with title: " + title + " deleted successfully";
        return msg;
    }

    @Override
    public String deleteArrayNode(String title) {
        try {
            arrayRepository.deleteArrayNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "Array node with title: " + title + " deleted successfully";
        return msg;
    }

    @Override
    public String deleteDSNode(String title) {
        try {
            dsRepository.deleteDsNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "DataStructure node with title: " + title + " deleted successfully";
        return msg;
    }

    @Override
    public String deleteGraphNode(String title) {
        try {
            graphRepository.deleteGraphNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "Graph node with title: " + title + " deleted successfully";
        return msg;
    }

    @Override
    public String deleteLLNode(String title) {
        try {
            linkedListRepository.deleteLLNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "LinkedList node with title: " + title + " deleted successfully";
        return msg;
    }

    @Override
    public String deleteQueueNode(String title) {
        try {
            queueRepository.deleteQueueNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "Queue node with title: " + title + " deleted successfully";
        return msg;
    }

    @Override
    public String deleteStackNode(String title) {
        try {
            stackRepository.deleteStackNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "Stack node with title: " + title + " deleted successfully";
        return msg;
    }

    @Override
    public String deleteTreeNode(String title) {
        try {
            treeRepository.deleteTreeNode(title);
        } catch (Exception e) {
            return e.getMessage();
        }
        String msg = "Tree node with title: " + title + " deleted successfully";
        return msg;
    }

}

