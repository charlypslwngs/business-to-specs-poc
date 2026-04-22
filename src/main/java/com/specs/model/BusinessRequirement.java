package com.specs.model;

public class BusinessRequirement {
    private String title;
    private String description;
    private String context;
    private String constraints;

    public BusinessRequirement(String title, String description, String context, String constraints) {
        this.title = title;
        this.description = description;
        this.context = context;
        this.constraints = constraints;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getConstraints() {
        return constraints;
    }

    public void setConstraints(String constraints) {
        this.constraints = constraints;
    }
}