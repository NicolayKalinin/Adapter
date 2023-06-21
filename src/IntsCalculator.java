public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        return arg0;
    }

    @Override
    public int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
}
