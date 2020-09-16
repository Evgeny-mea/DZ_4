package ru.gb.catch_the_drop;

public class Main<persArray> {

    public static void main(String[] args) {

        Work a = new Work("Иванов А.В.", 54000, 31);
        Work b = new Work("Петров П.С.", 64000, 46);
        Work c = new Work("Артемов Ф.Г.", 87000, 64);
        Work d = new Work("Владимиров А.Б.", 56000, 21);
        Work f = new Work("Поликовский О.Я.", 516000, 61);


        Work[] sotrud = new Work [5];
        sotrud[0] = a;
        sotrud[1] = b;
        sotrud[2] = c;
        sotrud[3] = d;
        sotrud[4] = f;

        System.out.printf("ФИО: %s,Зарплата: %s, Возраст: %d\n",
                a.getName(), a.getZp(), a.getAge());
        System.out.printf("ФИО: %s,Зарплата: %s, Возраст: %d\n",
                b.getName(), b.getZp(), b.getAge());
        System.out.printf("ФИО: %s,Зарплата: %s, Возраст: %d\n",
                c.getName(), c.getZp(), c.getAge());
        System.out.printf("ФИО: %s,Зарплата: %s, Возраст: %d\n",
                d.getName(), d.getZp(), d.getAge());
        System.out.println("  ");

System.out.println("Вывод сотрудников старше 40 \n");

        for (int i=0; i<sotrud.length; i++){
            if (sotrud[i].getAge() >= 40)
                System.out.printf ("ФИО: %s,Зарплата: %s, Возраст: %d\n",
                        sotrud[i].getName(), sotrud[i].getZp(), sotrud[i].getAge());
        }


//        for (int i=0; i< sotrud.length; i++){
//            if (sotrud[i].getAge() >= 45)
//
//               // // sotrud[i].getZp() + 5000;
//
//            System.out.println(sotrud[i].getZp()+5000);
//            }
        }

    }

