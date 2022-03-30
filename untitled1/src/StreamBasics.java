
import java.util.*;
import java.util.stream.Collectors;

public class StreamBasics {
    private void findLargeTradeUsingStreams(List<Trade> trades){
        List<Trade> largeTrades=trades.stream().filter(trade-> trade.getQuantity()>10000)
                .collect(Collectors.toList());

        System.out.println("Large trades: "+largeTrades);
    }

    private List<Trade> findLargeTradeUsingPreJava8(List<Trade> trades){
        public static void main(String[] args){
            StreamBasics basics=new StreamBasics();
            List<Trade> trades=TradeUtil.createTrades();
            basics.findLargeTradeUsingPreJava8(trades);
            basics.findLargeTradeUsingStreams(trades);
        }
    }
}
