package ru.mishaev.max;

/*
Логгер типа SimpleLogger при вызове метода log должен выводить на экран текст вида:

[2022-12-17T19:04:28.907390] <сообщение>,

где в квадратных скобках указаны точная дата и время вызова метода.
Его можно получить с помощью LocalDateTime.now().
Возвращённый этой командой объект можно напрямую склеивать с текстом через +.
 */

import java.time.LocalDateTime;

public class SimpleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] <" + message + ">");
    }

}
