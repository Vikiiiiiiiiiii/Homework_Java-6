/* 1. Подумать над структурой класса Ноутбук для магазина техники - выделить 
поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации 
и выведет ноутбуки, отвечающие фильтру.

NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить 
параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по 
условиям.

Класс сделать в отдельном файле

Приветствие
Выбор параметра
Выбор конкретнее
Вывод подходящих */

import java.util.HashSet;
import java.util.Set;

public class decision_1{
    public static void main(String[] args) {
    
        Set<NBook> set = new HashSet<>();
        //set.add(new NBook("Notebook 5", 8, "MacOS", 142000, "MacBook"));
        set.add(new NBook("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new NBook("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new NBook("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new NBook("Notebook 4", 64, "MacOS", 90000, "MacBook"));
        
        operation operat = new operation(set);
        operat.start();
    
    }
}
