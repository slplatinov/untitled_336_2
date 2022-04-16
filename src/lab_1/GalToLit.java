package lab_1;

class GalToLit {
    public static void main(String[] args) {
        double gallons;//в этой переменной хранится значение,
                        //выражающее объем жидкости в галлонах
        double liters;  // в этой переменной хранится значение,
        gallons=10;     // начальное значение соответствует 10 галлонам
        liters=gallons*3.7854;//перевести в литры
        System.out.println(gallons + " галлонам соответствует " +
                liters + " литров");
    }
}
