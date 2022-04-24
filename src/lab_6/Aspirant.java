package lab_6;
//Задача:
//1.Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//  аспирант отличается от студента наличием некой научной работы.
//2.Класс Student содержит переменные: String firstName, lastName, group.
//  А также, double averageMark, содержащую среднюю оценку.
//3.Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//4.Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//  Если средняя оценка студента равна 5, то сумма 100 р, иначе 80. Переопределить этот метод в классе Aspirant.
//  Если средняя оценка аспиранта равна 5, то сумма 200 р, иначе 180.
//5.Создать массив типа Student, содержащий объекты класса Student и Aspirant.
// Вызвать метод getScholarship() для каждого элемента массива.


public class Aspirant extends Student {
            String work;

            public Aspirant(String firstName, String lastName, String group,
                            double avgMark, String work) {

                super(firstName, lastName, group, avgMark);
                this.work = work;
            }
        void print(){
            System.out.println(firstName);
        }

        @Override
        public double getScholarship() {
            return avgMark == 5 ? 200 : 180;
        }

        public static void main(String[] args) {
            Student student = new Student("Ivan","Bolshoi",
                    "Group1",4);
            Aspirant aspirant1 = new Aspirant("Den", "Korban",
                    "Group2",5,"Work1");
            Student aspirant2 = new Aspirant("Jully", "Kirbi",
                    "Group3",4,"Work2");
            Student[] students={student,aspirant1,aspirant2};
            for (Student s:students){
                System.out.println(s.firstName +" " + s.lastName + " = " + s.getScholarship());
            }
        }
    }








