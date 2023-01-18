import java.util.Arrays;

public class Main {
       static int sumSalary = 0;
    static int averageSalary;

    public static void printNameSurname (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудников: " + employees[i].getId() + " " + employees[i].getEmployeeName() + " " + employees[i].getEmployeePatronymic()+ " " + employees[i].getEmployeeSurname());
        }
    }
    public static void calculateSumSalary (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            sumSalary += employees[i].getSalary();
        }
        averageSalary = sumSalary/(employees.length+1);
        System.out.println("Все расходы на  зарплату: " + sumSalary);
        System.out.println("Средняя зарплата в компании: "+ averageSalary);
    }

    public static void minSalary (Employee[] employees) {
        int minSalary1 = employees[0].getSalary();
          for (int i = 0; i < employees.length; i++) {
            if (minSalary1 > employees[i].getSalary()) {
                minSalary1 = employees[i].getSalary();
            }
        }
            System.out.println("Минимальная зарплата в компании:" + minSalary1);
        }

        public static void maxSalary (Employee[] employees) {
            int maxSalary1 = -1;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSalary() > maxSalary1) {
                    maxSalary1 = employees[i].getSalary();
                }
                }
            System.out.println("Максимальная зарплата в компании:" + maxSalary1);
    }


    public static void main(String[] args) {
        Employee employees[] = new Employee[10];
        employees[0] = new Employee("Сергей", "Иванович", "Сидоров", 10500, 2, Employee.counter);
        employees[1] = new Employee("Иван", "Ильич", "Петров", 17500, 1, Employee.counter);
        employees[2] = new Employee("Илья", "Ильич", "Петров", 23500, 3, Employee.counter);
        employees[3] = new Employee("Тамара", "Ивановна", "Петрова", 86410, 4, Employee.counter);
        employees[4] = new Employee("Лариса", "Александровна", "Петрова", 17500, 1, Employee.counter);
        employees[5] = new Employee("Лика", "Савельевна", "Изотова", 56300, 5, Employee.counter);
        employees[6] = new Employee("Лидия", "Николаевна", "Иванова", 98700, 5, Employee.counter);
        employees[7] = new Employee("Ксения", "Сергеевна", "Климова", 12300, 1, Employee.counter);
        employees[8] = new Employee("Иван", "Николаевич", "Троекуров", 45200, 2, Employee.counter);
        employees[9] = new Employee("Михаил", "Ильич", "Савин", 63100, 3, Employee.counter);


        calculateSumSalary(employees);
        System.out.println(Arrays.toString(employees));
        minSalary(employees);
        maxSalary(employees);
        printNameSurname(employees);


      }
    }
