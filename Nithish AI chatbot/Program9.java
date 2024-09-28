class Program9 {
    double real;
    double imaginary;

    public Program9(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Program9 subtract(Program9 other) {
        return new Program9(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Program9 add(Program9 other) {
        return new Program9(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Program9 multiply(Program9 other) {
        return new Program9(this.real * other.real, this.imaginary * other.imaginary);
    }

    public Program9 conjugate() {
        return new Program9(this.real, -this.imaginary);
    }

    public void display() {
        System.out.println(this.real + "+" + this.imaginary + "i");
    }

    public static void main(String args[]) {
        Program9 c1 = new Program9(4, 5);
        Program9 c2 = new Program9(2, 3);
        Program9 sum = c1.add(c2);
        Program9 difference = c1.subtract(c2);
        Program9 product = c1.multiply(c2);
        Program9 conjugate = c1.conjugate();
        System.out.println("sum:");
        sum.display();
        System.out.println("Difference:");
        difference.display();
        System.out.println("Product:");
        product.display();
        System.out.println("Conjugate:");
        conjugate.display();
    }
}