package pro.sky.skyprospring;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(int n1, int n2) {
        int result = n1 + n2;
        return n1 + " + " + n2 + " = " + result;
    }

    public String subtraction(int n1, int n2) {
        int result = n1 - n2;
        return n1 + " - " + n2 + " = " + result;
    }

    public String multiplication(int n1, int n2) {
        int result = n1 * n2;
        return n1 + " x " + n2 + " = " + result;
    }

    public String division(int n1, int n2) {
        double result = (double) n1 / n2;
        if (n2 == 0) {
            return "На ноль не делят";
        }
        return n1 + " / " + n2 + " = " + result;
    }
}
