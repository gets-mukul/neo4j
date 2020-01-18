package com.neo4j.neo4j.rest;


import com.neo4j.neo4j.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/create")
public class CreateApi {

    private final CreateService createService;

    @Autowired
    public CreateApi(CreateService createService) {
        this.createService = createService;
    }

    ;

    @PostMapping("/node/aoa")
    public String createNewAoaNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                   @RequestParam Boolean isQuestionNode) {
        return createService.createNewAoaNode(title, daysToComplete, isQuestionNode);
    }

    @PostMapping("/node/array")
    public String createNewArrayNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                     @RequestParam Boolean isQuestionNode) {
        return createService.createNewArrayNode(title, daysToComplete, isQuestionNode);
    }

    @PostMapping("/node/ds")
    public String createNewDsNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                  @RequestParam Boolean isQuestionNode) {
        return createService.createNewDSNode(title, daysToComplete, isQuestionNode);
    }

    @PostMapping("/node/graph")
    public String createNewGraphNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                     @RequestParam Boolean isQuestionNode) {
        return createService.createNewGraphNode(title, daysToComplete, isQuestionNode);
    }

    @PostMapping("/node/ll")
    public String createNewLLNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                  @RequestParam Boolean isQuestionNode) {
        return createService.createNewLLNode(title, daysToComplete, isQuestionNode);
    }


    @PostMapping("/node/queue")
    public String createNewQueueNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                     @RequestParam Boolean isQuestionNode) {
        return createService.createNewQueueNode(title, daysToComplete, isQuestionNode);
    }

    @PostMapping("/node/stack")
    public String createNewStackNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                     @RequestParam Boolean isQuestionNode) {
        return createService.createNewStackNode(title, daysToComplete, isQuestionNode);
    }

    @PostMapping("/node/tree")
    public String createNewTreeNode(@RequestParam String title, @RequestParam Integer daysToComplete,
                                    @RequestParam Boolean isQuestionNode) {
        return createService.createNewTreeNode(title, daysToComplete, isQuestionNode);
    }

}
