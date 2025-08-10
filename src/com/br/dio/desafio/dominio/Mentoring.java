package com.br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate startsDate;
    private LocalDate endsDate;

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
    public double generateXP() {
        return getDefaultXp() + 20;
    }
}
