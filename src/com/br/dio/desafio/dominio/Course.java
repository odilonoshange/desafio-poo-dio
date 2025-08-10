package com.br.dio.desafio.dominio;

public class Course extends Content {

    private byte hourlyLoad;

    public byte getHourlyLoad() {
        return hourlyLoad;
    }

    public void setHourlyLoad(byte hourlyLoad) {
        this.hourlyLoad = hourlyLoad;
    }

    @Override
    public double generateXP() {
        return getDefaultXp() * hourlyLoad;
    }

    @Override
    public String toString() {
        return "\nCourse's name: " + getTitle() + "\nCourse's hourly load: " + getHourlyLoad() + "\nDescription: "+ getDescription() + ".";
    }
   
}
