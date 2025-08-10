package com.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> registeredContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void signUpInBootcamp(Bootcamp bootcamp) {
        this.registeredContent.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void grow() {
        var content = this.registeredContent.stream().findFirst();
        if (content.isPresent()) {
            this.completedContent.add(content.get());
            this.registeredContent.remove(content.get());
        } else {
            System.err.println("\033[1;3;31mThe user is not signed at any content.\033[0m");
        }
    }

    public double calculateTotalXP() {
        return this.completedContent
        .stream()
        .mapToDouble(content -> content.generateXP())
        .sum();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Content> getRegisteredContent() {
        return registeredContent;
    }
    public void setRegisteredContent(Set<Content> registeredContent) {
        this.registeredContent = registeredContent;
    }
    public Set<Content> getCompletedContent() {
        return completedContent;
    }
    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((registeredContent == null) ? 0 : registeredContent.hashCode());
        result = prime * result + ((completedContent == null) ? 0 : completedContent.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (registeredContent == null) {
            if (other.registeredContent != null)
                return false;
        } else if (!registeredContent.equals(other.registeredContent))
            return false;
        if (completedContent == null) {
            if (other.completedContent != null)
                return false;
        } else if (!completedContent.equals(other.completedContent))
            return false;
        return true;
    }

}
