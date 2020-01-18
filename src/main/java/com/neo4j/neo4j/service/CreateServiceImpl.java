package com.neo4j.neo4j.service;

import com.neo4j.neo4j.entity.*;
import com.neo4j.neo4j.repository.*;
import org.springframework.stereotype.Service;

@Service
public class CreateServiceImpl implements CreateService {

    private AnalysisOfAlgorithmRepository analysisOfAlgorithmRepository;
    private ArrayRepository arrayRepository;
    private DataStructureRepository dsRepository;
    private GraphRepository graphRepository;
    private LinkedListRepository linkedListRepository;
    private QueueRepository queueRepository;
    private StackRepository stackRepository;
    private TreeRepository treeRepository;

    public CreateServiceImpl(AnalysisOfAlgorithmRepository analysisOfAlgorithmRepository, ArrayRepository arrayRepository,
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
    public String createNewAoaNode(String title, Integer daysToComplete, Boolean isQuestionNode) {

        AnalysisOfAlgorithm aoa = new AnalysisOfAlgorithm();
        aoa.setTitle(title);
        aoa.setDaysToComplete(daysToComplete);
        aoa.setIsQuestionNode(isQuestionNode);
        analysisOfAlgorithmRepository.save(aoa);
        return aoa.toString();
    }

    @Override
    public String createNewArrayNode(String title, Integer daysToInteger, Boolean isQuestBoolean) {

        Array arrayNode = new Array();
        arrayNode.setTitle(title);
        arrayNode.setDaysToComplete(daysToInteger);
        arrayNode.setIsQuestionNode(isQuestBoolean);
        arrayRepository.save(arrayNode);
        return arrayNode.toString();
    }

    public String createNewDSNode(String title, Integer daysToComplete, Boolean isQuestionNode) {

        DataStructure dsNode = new DataStructure();
        dsNode.setTitle(title);
        dsNode.setIsQuestionNode(isQuestionNode);
        dsNode.setDaysToComplete(daysToComplete);
        dsRepository.save(dsNode);
        return dsNode.toString();
    }


    @Override
    public String createNewGraphNode(String title, Integer daysToComplete, Boolean isQuestionNode) {

        Graph graph = new Graph();
        graph.setTitle(title);
        graph.setDaysToComplete(daysToComplete);
        graph.setIsQuestionNode(isQuestionNode);
        graphRepository.save(graph);
        return graph.toString();
    }

    @Override
    public String createNewLLNode(String title, Integer daysToComplete, Boolean isQuestionNode) {

        LinkedList ll = new LinkedList();
        ll.setTitle(title);
        ll.setDaysToComplete(daysToComplete);
        ll.setIsQuestionNode(isQuestionNode);
        linkedListRepository.save(ll);
        return ll.toString();
    }

    @Override
    public String createNewQueueNode(String title, Integer daysToComplete, Boolean isQuestionNode) {

        Queue queue = new Queue();
        queue.setTitle(title);
        queue.setDaysToComplete(daysToComplete);
        queue.setIsQuestionNode(isQuestionNode);
        queueRepository.save(queue);
        return queue.toString();
    }

    @Override
    public String createNewStackNode(String title, Integer daysToComplete, Boolean isQuestionNode) {

        Stack stack = new Stack();
        stack.setTitle(title);
        stack.setDaysToComplete(daysToComplete);
        stack.setIsQuestionNode(isQuestionNode);
        stackRepository.save(stack);
        return stack.toString();
    }

    @Override
    public String createNewTreeNode(String title, Integer daysToComplete, Boolean isQuestionNode) {

        Tree tree = new Tree();
        tree.setTitle(title);
        tree.setDaysToComplete(daysToComplete);
        tree.setIsQuestionNode(isQuestionNode);
        treeRepository.save(tree);
        return tree.toString();
    }
}
