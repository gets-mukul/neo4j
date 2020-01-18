package com.neo4j.neo4j.rest;

import com.neo4j.neo4j.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/delete")
public class DeleteApi {

    private final DeleteService deleteService;

    @Autowired
    public DeleteApi(DeleteService deleteService) {
        this.deleteService = deleteService;
    }

    @DeleteMapping("/node/aoa")
    public String deleteAoaNode(@RequestParam String title) {
        return deleteService.deleteAoaNode(title);
    }

    @DeleteMapping("/node/array")
    public String deleteArrayNode(@RequestParam String title) {
        return deleteService.deleteArrayNode(title);
    }

    @DeleteMapping("/node/ds")
    public String deleteDsNode(@RequestParam String title) {
        return deleteService.deleteDSNode(title);
    }

    @DeleteMapping("/node/graph")
    public String deleteGraphNode(@RequestParam String title) {
        return deleteService.deleteGraphNode(title);
    }

    @DeleteMapping("/node/ll")
    public String deleteLLNode(@RequestParam String title) {
        return deleteService.deleteLLNode(title);
    }

    @DeleteMapping("/node/queue")
    public String deleteQueueNode(@RequestParam String title) {
        return deleteService.deleteQueueNode(title);
    }

    @DeleteMapping("/node/stack")
    public String deleteStackNode(@RequestParam String title) {
        return deleteService.deleteStackNode(title);
    }

    @DeleteMapping("/node/tree")
    public String deleteTreeNode(@RequestParam String title) {
        return deleteService.deleteTreeNode(title);
    }
}
