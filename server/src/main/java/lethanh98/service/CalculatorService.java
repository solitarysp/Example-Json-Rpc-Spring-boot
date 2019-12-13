package lethanh98.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

/**
 * author lethanh9398 <p>
 * email lethanh9398@gmail.com <p>
 * create Date 12/12/2019 11:35 AM  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
@JsonRpcService("/calculator")
public interface CalculatorService {
    int multiplier(@JsonRpcParam(value = "a") int a, @JsonRpcParam(value = "b") int b);
    int multiplier2(@JsonRpcParam(value = "a") int a, @JsonRpcParam(value = "b") int b);
    void multiplier3(@JsonRpcParam(value = "a") int a, @JsonRpcParam(value = "b") int b);
}
