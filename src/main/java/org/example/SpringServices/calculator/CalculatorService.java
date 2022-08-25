package org.example.SpringServices.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{
    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        return x-y;
    }

    @Override
    public int multi(int x, int y) {
        return x*y;
    }


}