package br.com.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calculateXP() {
        return XP_PADRAO + 20d;
    }
}
