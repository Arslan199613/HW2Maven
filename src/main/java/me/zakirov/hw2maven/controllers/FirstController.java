package me.zakirov.hw2maven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FirstController {
    @GetMapping
    public String aplicationIsRunning() {
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String info() {
        return "Имя ученика: Иван" +
                " .Название вашего проекта: HW2Maven " +
                " .Дата создания проекта: " + " " + LocalDate.of(2022,12,29)+
                " .Описание проекта в свободной форме: 1.запуск приложения,2. Обработка запросов с конкретным URL-адресом";
    }
}

