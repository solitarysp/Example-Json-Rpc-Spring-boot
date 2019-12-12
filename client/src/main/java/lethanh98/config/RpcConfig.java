package lethanh98.config;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;
import lethanh98.rpc.CalculatorRpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/**
 * author lethanh9398 <p>
 * email lethanh9398@gmail.com <p>
 * create Date 12/12/2019 1:49 PM  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
@Configuration
public class RpcConfig {
    @Bean
    public CalculatorRpc exampleClientAPI() throws MalformedURLException {
        String endpoint = "http://localhost:8080/calculator";
        return ProxyUtil.createClientProxy(getClass().getClassLoader(), CalculatorRpc.class, new JsonRpcHttpClient(new URL(endpoint), new HashMap<>()));
    }
}
