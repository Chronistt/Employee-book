public class Employee {

    private final String employeeName;
    private final String employeeSurname;
    private final String employeePatronymic;
    private Integer salary;
    private Integer department;
    private Integer id;
    public static Integer counter = 1;

    public Employee (String employeeName,  String employeePatronymic, String employeeSurname, Integer salary, Integer department, Integer id) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeePatronymic = employeePatronymic;
        this.salary = salary;
        this.department = department;
        this.id = counter++;

         }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
                return employeeSurname;
    }

    public String getEmployeePatronymic() {
        return employeePatronymic;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartment() {
        return department;
    }
    public Integer getId() { return id;}

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "\nФИО сотрудника: " + getEmployeeSurname() +" "+ getEmployeeName()+" "+ getEmployeePatronymic()+", зарплата: " + getSalary()+", Отдел " + getDepartment()+", id: " + getId() ;
    }

    }

