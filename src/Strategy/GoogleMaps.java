package Strategy;

public class GoogleMaps {
    void findPath(String from, String to, String mode){
//        if(mode == ...){
//
//        }else if(mode == ...){
//
//        } --> violates SRP, OCP

        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorByMode(mode);
        pathCalculatorStrategy.findPath(from,to);
    }
}
