package com.neo4j.neo4j.service;

import org.springframework.stereotype.Service;

@Service
public interface CreateService {
    String creteNewAoaNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String createNewArrayNode(String title, Integer daysInteger, Boolean isQuestBoolean);

    String creteNewDSNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String creteNewGraphNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String creteNewLLNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String creteNewQueueNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String creteNewStackNode(String title, Integer daysToComplete, Boolean isQuestionNode);

    String creteNewTreeNode(String title, Integer daysToComplete, Boolean isQuestionNode);
}
