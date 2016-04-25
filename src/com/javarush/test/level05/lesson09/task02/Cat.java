package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name = null;
        private String adress = null;
        private int weight = 5;
        private int age = 2;
        public Cat (String name)
        {
            this.name = name;
        }
        public Cat (int age, int weight, String name)
        {
            this.name = age + weight + name;
        }
        public Cat (String name, int age)
        {
            this.name = name + age + weight;
        }
        public Cat (int weight, String color)
        {
            this.name = color + weight + name + adress + age;
        }
        public Cat (int weight, String color, String adress)
        {
            this.name = weight + color + adress;
        }

}
