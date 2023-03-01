public class Main {

    public static void main(String[] args) {

        if (possibility()) { // если имеется возможность купить одежду
            System.out.println("Имеется достаточно средств для покупки одежды");
            System.out.println("Остаток от покупки " + balance() + " рублей " );
        } else { // иначе
            System.out.println("Недостаточно средств для покупки одежды");
            System.out.println(" - ");
        }
    }

    // Названия переменных и их цены
    static float coat = 70; // Пальто
     static byte DiscountOnCoats= 77; // скидка (На пальто)
    static float suit = 53; // костюм
    static byte DiscountOnSuit = 44; // скидка на костюм
    static float shirt = 19; // рубашка
    static byte hat = 25; // шляпа
    static byte DiscountOnHat = 37;// скидка на шляпу
    static float shoes = 41; // туфли
    static byte DiscountOnShoes = 32; // скидка на туфли
    static float account = 312; // счёт пользователя

    // метод подсчёта стоимости одежды
    private static float calculation() {
        // создание и инициализация переменной подсчёта стоимости
        float count = (coat * (100 - DiscountOnCoats) + suit * (100 - DiscountOnSuit)
                +hat * (100 - DiscountOnHat)+shoes * (100 - DiscountOnShoes))/100 + shirt;
        return count; // возврат подсчитанного значения
    }

    // метод определения возможностей бюджета покупки одежды
    private static boolean possibility() {
        if (calculation() <= account) { // если стоимость одежды меньше имеющихся средств
            return true; // то возврат истинного значения
        } else { // иначе
            return false; // возврат ложного значения
        }
    }

    // метод определения возможной сдачи
    private static float balance() {
        if(possibility()) { // если имеется возможность купить одежду
            return account - calculation(); // то возвращается остаток от покупки
        } else { // иначе
            return -1; // возвращается маркер недостатка денежных средств
        }
    }


}