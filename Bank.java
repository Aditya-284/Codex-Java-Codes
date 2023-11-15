class Bank {
    String name;
    int accno;
    double p;

    Bank(String name, int accno, double p) {
        this.name = name;
        this.accno = accno;
        this.p = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Principal Amount: $" + p);
    }
}

class Account extends Bank {
    double amt;

    Account(String name, int accno, double p, double amt) {
        super(name, accno, p);
        this.amt = amt;
    }

    void deposit(double amount) {
        p = p + amount;
    }

    void withdraw(double amount) {
        if (amount > p) {
            System.out.println("INSUFFICIENT BALANCE");
        } else {
            p = p - amount;
            if (p < 500) {
                double penalty = (500 - p) / 10;
                p = p - penalty;
            }
        }
    }

    @Override
    void display() {
        super.display();
        System.out.println("Transaction Amount: $" + amt);
    }
}
