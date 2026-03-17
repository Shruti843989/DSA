class Number {
    private double value;
    public Number(double value) {
        this.value = value;
    }
    public boolean isZero() {
        return value == 0;
    }
    public boolean isPositive() {
        return value > 0;
    }
    public boolean isNegative() {
        return value < 0;
    }
    public boolean isOdd() {
        if (value % 2 != 0) return true;
        return false;
    }
    public boolean isEven() {
        if (value % 2 == 0) return true;
        return false;
    }
    public boolean isPrime() {
        if (value <= 1 || value != (int) value) return false;
        int n = (int) value;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        if (value != (int) value) return false;
        int num = (int) value;
        int sum = 0, temp = num;
        int digits = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }
}
    public class number{

    public static void main(String[] args) {
        Number n1 = new Number(153);
        System.out.println("Zero = " + n1.isZero());
        System.out.println("Positive = " + n1.isPositive());
        System.out.println("Negative = " + n1.isNegative());
        System.out.println("Odd = " + n1.isOdd());
        System.out.println("Even = " + n1.isEven());
        System.out.println("Prime = " + n1.isPrime());
        System.out.println("Armstrong = " + n1.isArmstrong());
    }
}


