import java.util.Scanner;

class Complex {

    int real;
    int imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary numbers respectively: ");
        real = sc.nextInt();
        imag = sc.nextInt();
    }

    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

class ComplexDemo{
    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.read();
        c2.read();

        Complex sum = c1.add(c2);

        System.out.print("Sum = ");
        sum.display();
    }
}
