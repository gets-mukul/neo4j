package com.neo4j.neo4j.rest;

import com.neo4j.neo4j.entity.*;
import com.neo4j.neo4j.service.GetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "api/v1/get")
public class ReadApi {

    private GetService getService;

    public ReadApi(GetService getService) {
        this.getService = getService;

    }

    @GetMapping("/node/aoa")
    public Collection<AnalysisOfAlgorithm> getAoaNode(@RequestParam Integer noOfNodes) {
        return getService.getAllAoaNodes(noOfNodes);
    }

    @GetMapping("/node/array")
    public Collection<Array> getArrayNode(@RequestParam Integer noOfNodes) {
        return getService.getAllArrayNodes(noOfNodes);
    }

    @GetMapping("/node/ds")
    public Collection<DataStructure> getDsNode(@RequestParam Integer noOfNodes) {
        return getService.getAllDSNodes(noOfNodes);
    }

    @GetMapping("/node/graph")
    public Collection<Graph> getGraphNode(@RequestParam Integer noOfNodes) {
        return getService.getAllGraphNodes(noOfNodes);
    }

    @GetMapping("/node/ll")
    public Collection<LinkedList> getLLNode(@RequestParam Integer noOfNodes) {
        return getService.getAllLLNodes(noOfNodes);
    }

    @GetMapping("/node/queue")
    public Collection<Queue> getQueueNode(@RequestParam Integer noOfNodes) {
        return getService.getAllQueueNodes(noOfNodes);
    }

    @GetMapping("/node/stack")
    public Collection<Stack> getStackNode(@RequestParam Integer noOfNodes) {
        return getService.getAllStackNodes(noOfNodes);
    }

    @GetMapping("/node/tree")
    public Collection<Tree> getTreeNode(@RequestParam Integer noOfNodes) {
        return getService.getAllTreeNodes(noOfNodes);
    }
}