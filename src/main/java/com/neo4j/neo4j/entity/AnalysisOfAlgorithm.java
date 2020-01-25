package com.neo4j.neo4j.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Getter
@Setter
@ToString
public class AnalysisOfAlgorithm {

    private Long id;
    private String title;
    private Integer daysToComplete;
    private Boolean isQuestionNode;

    @Relationship(type = "LEVEL_1")
    private List<Array> array;
}