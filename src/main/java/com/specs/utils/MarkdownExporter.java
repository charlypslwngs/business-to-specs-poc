package com.specs.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MarkdownExporter {
    private StringBuilder markdownContent;

    public MarkdownExporter() {
        this.markdownContent = new StringBuilder();
    }

    public void addHeader(String header) {
        markdownContent.append("# ").append(header).append("\n\n");
    }

    public void addSection(String sectionTitle, String content) {
        markdownContent.append("## ").append(sectionTitle).append("\n");
        markdownContent.append(content).append("\n\n");
    }

    public void addList(String[] items) {
        for (String item : items) {
            markdownContent.append("- ").append(item).append("\n");
        }
        markdownContent.append("\n");
    }

    public void exportToFile(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(markdownContent.toString());
        }
    }
}
