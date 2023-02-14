public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 33232);
        employees[1] = new Employee("Петров Сергей Васильевич", 2, 40000);
        employees[2] = new Employee("Сидоров Вектор Павлович", 3, 27000);
        employees[3] = new Employee("Бирюков Виктор Александрович", 4, 39000);
        employees[4] = new Employee("Захаров Гордей Юрьевич", 5, 53323);
        employees[5] = new Employee("Агафонов Максимилиан Валерьевич", 1, 33023);
        employees[6] = new Employee("Игнатов Юлий Егорович", 2, 45000);
        employees[7] = new Employee("Карпов Вилен Лаврентьевич", 3, 35329);
        employees[8] = new Employee("Виноградов Мирослав Николаевич", 4, 29658);
        employees[9] = new Employee("Артемьев Наум Евсееви", 5, 38565);

        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println(sumSalary(employees));
        System.out.println(sumSalary(employees)/ employees.length);
        System.out.println(minSalary(employees));
        System.out.println(maxSalary(employees));
        printFio(employees);

    }
    public static int sumSalary(Employee[]employees){
        int sum=0;
        for (Employee person : employees) {
            sum += person.getSalary();
        }
        return sum;
    }
    public static int minSalary(Employee[] employees){
        Employee result= employees[0];
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getSalary()<result.getSalary()){
                result = employees[i];
            }
        }
        return result.getSalary();
    }
    public static float maxSalary(Employee[] employees){
        Employee result = employees[0];
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i].getSalary()>result.getSalary()){
                result=employees[i];
            }
        }
        return result.getSalary();
    }
    public static void printFio(Employee[]employees){
        for (int i = 0; i < employees.length ; i++) {
            System.out.println(employees[i].getFio());

        }
    }

    }
