package OOP;

public class DZ {

    public static void main(String[] args) {

        employee[] persArray = new employee[5];

        persArray[0] = new employee("Ivan",     "Engineer",      "Ivanov",      "anykey",    "ivivan@mailbox.com",   "892312312",     30000,     30);
        persArray[1] = new employee("Vladimir", "Vladimirovich", "Putin",       "president", "RF@yandex.ru",         "8 800 2000 600",35000000,  60);
        persArray[2] = new employee("Vladimir", "Volfovich",     "Zhirinovsky", "Liberal",   "LDPR@yandex.ru",       "8 800 2000 601",350000,    58);
        persArray[3] = new employee("Olga",     "Igorevna",      "Buzova",      "dom2",      "SuperPyper@yandex.ru", "8 800 2000 603",3500000,   31);
        persArray[4] = new employee("Michael",  "Sergeevich",    "Boyarsky",    "vocalist",  "VlcalRF@yandex.ru",    "8 800 2000 604",999999999, 71);

        for (employee person : persArray) {

            if (person.getAge() > 40) person.Info();

        }

    }
}
