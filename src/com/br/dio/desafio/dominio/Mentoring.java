package com.br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring {

    private String title;
    private String description;
    private LocalDate startsDate;
    private LocalDate endsDate;

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

    public LocalDate getStartsDate() {
        return startsDate;
    }

    public void setStartsDate(LocalDate startsDate) {
        this.startsDate = startsDate;
    }

    public LocalDate getEndsDate() {
        return endsDate;
    }

    public void setEndsDate(LocalDate endsDate) {
        this.endsDate = endsDate;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startsDate=" + startsDate +
                ", endsDate=" + endsDate +
                '}';
    }
}
