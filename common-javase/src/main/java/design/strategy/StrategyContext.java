package design.strategy;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/2/26 9:14
 */
public class StrategyContext {


private     Strategy  strategy;
public   StrategyContext(Strategy strategy){
    this.strategy=strategy;
}



    /*
    策略方法
     */
    public  void  doStrategry(String msg){

        strategy.strategyInterface(msg);
    }

}
