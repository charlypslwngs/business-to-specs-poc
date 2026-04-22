package com.specs.model;

import java.util.List;

public class TechnicalSpec {

    private List<String> functionalRequirements;
    private List<String> nonFunctionalRequirements;
    private String architecture;
    private List<String> techStack;
    private List<String> userStories;

    public TechnicalSpec(List<String> functionalRequirements, List<String> nonFunctionalRequirements, String architecture, List<String> techStack, List<String> userStories) {
        this.functionalRequirements = functionalRequirements;
        this.nonFunctionalRequirements = nonFunctionalRequirements;
        this.architecture = architecture;
        this.techStack = techStack;
        this.userStories = userStories;
    }

    // Getters and Setters
    public List<String> getFunctionalRequirements() {
        return functionalRequirements;
    }

    public void setFunctionalRequirements(List<String> functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public List<String> getNonFunctionalRequirements() {
        return nonFunctionalRequirements;
    }

    public void setNonFunctionalRequirements(List<String> nonFunctionalRequirements) {
        this.nonFunctionalRequirements = nonFunctionalRequirements;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    public List<String> getUserStories() {
        return userStories;
    }

    public void setUserStories(List<String> userStories) {
        this.userStories = userStories;
    }
}
