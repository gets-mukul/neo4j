package com.neo4j.neo4j.service;

import org.springframework.stereotype.Service;

@Service
public interface DeleteService {

    String deleteAoaNode(String title);

    String deleteArrayNode(String title);

    String deleteDSNode(String title);

    String deleteGraphNode(String title);

    String deleteLLNode(String title);

    String deleteQueueNode(String title);

    String deleteStackNode(String title);

    String deleteTreeNode(String title);
}
