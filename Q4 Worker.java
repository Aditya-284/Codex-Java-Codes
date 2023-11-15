class Worker {
    String name;
    double basic;

    Worker(String name, double basic) {
        this.name = name;
        this.basic = basic;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Pay: $" + basic);
    }
}

class Wages extends Worker {
    double hrs;
    double rate;
    double wage;

    Wages(String name, double basic, double hrs, double rate) {
        super(name, basic);
        this.hrs = hrs;
        this.rate = rate;
        calculateWage();
    }

    double overtime() {
        return (hrs > 40) ? (hrs - 40) * rate * 1.5 : 0;
    }

    void calculateWage() {
        wage = basic + overtime();
    }

    @Override
    void display() {
        super.display();
        System.out.println("Hours Worked: " + hrs);
        System.out.println("Hourly Rate: $" + rate);
        System.out.println("Wage: $" + wage);
    }
}
