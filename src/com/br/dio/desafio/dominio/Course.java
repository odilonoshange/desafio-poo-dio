package com.br.dio.desafio.dominio;

public class Course {

    private String title;
    private String description;
    private byte hourlyLoad;

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

    public byte getHourlyLoad() {
        return hourlyLoad;
    }

    public void setHourlyLoad(byte hourlyLoad) {
        this.hourlyLoad = hourlyLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hourlyLoad='" + hourlyLoad + '\'' +
                '}';
    }
}
