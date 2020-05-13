package services;

import org.springframework.stereotype.Service;

@Service
public class ConvertImp implements Convert {
    @Override
    public double usdToVnd(double rate, double usd) {
        return rate * usd;
    }
}
