package lethanh98.rest;

import lethanh98.rpc.CalculatorRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author lethanh9398 <p>
 * email lethanh9398@gmail.com <p>
 * create Date 12/12/2019 12:24 PM  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
@RestController
@RequestMapping("/controller-calculator/{a}/{b}")
public class CalculatorController {
    @Autowired
    CalculatorRpc calculatorRpc;

    @GetMapping("")
    public Integer getAll(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b) {
        return calculatorRpc.multiplier2(a,b);
    }
}
