package lethanh98.service.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import lethanh98.service.CalculatorService;
import org.springframework.stereotype.Service;

/**
 * author lethanh9398 <p>
 * email lethanh9398@gmail.com <p>
 * create Date 12/12/2019 11:36 AM  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
@Service
@AutoJsonRpcServiceImpl
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int multiplier(int a, int b) {
        System.out.println(Thread.currentThread().getName());
        return a * b;
    }

    @Override
    public int multiplier2(int a, int b) {
        System.out.println(Thread.currentThread().getName());
        return a + b;
    }

    @Override
    public void multiplier3(int a, int b) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(a + b);
    }
}
