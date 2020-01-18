package com.neo4j.neo4j.service;

import org.springframework.stereotype.Service;

@Service
public interface CreateService {
    String createNewAoaNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String createNewArrayNode(String title, Integer daysToComplete, Boolean isQuestBoolean);

    String createNewDSNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String createNewGraphNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String createNewLLNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String createNewQueueNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String createNewStackNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String createNewTreeNode(String title, Integer daysToComplete, Boolean isQuestionNode);
}
