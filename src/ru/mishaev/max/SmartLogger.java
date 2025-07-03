package ru.mishaev.max;

/*
Логгер типа SmartLogger должен иметь текст вида

 INFO#13 [2022-12-17T19:04:28.907390] <сообщение>

 Вместо 13 следует указать порядковый номер вызова метода log у этого логгера
 (нумеровать с 1).
 В случае, если в сообщении есть слово error (всё равно в каком регистре),
 то INFO следует заменить на ERROR.

 boolean contains(CharSequence s)
 Возвращает true, если строка содержит указанную последовательность символов.
 */

import java.time.LocalDateTime;

public class SmartLogger implements Logger{
    private int info = 0;

    @Override
    public void log(String message) {
        info++;
        String infoPrefix = "INFO#";
        if (message.toLowerCase().contains("error")) {
            infoPrefix = "ERROR#";
        }
        System.out.println(infoPrefix + info + " [" + LocalDateTime.now() + "] <" + message + ">");
    }
}
