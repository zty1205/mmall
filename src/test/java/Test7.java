import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by CJ on 2017/12/14.
 */
public class Test7 {
    public static void main(String[] args) {
        JsonParser j = new JsonParser();
        JsonElement je = j.parse("{\"data\":[{\"building\":\"1\",\"cashPledge\":300,\"level\":1,\"lockId\":\"5\",\"lockKey\":\"8106\",\"lockno\":0,\"maxNumber\":\"3\",\"roomMoney\":394,\"roomNumber\":\"8106\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"1\",\"cashPledge\":300,\"level\":1,\"lockId\":\"4\",\"lockKey\":\"8109\",\"lockno\":0,\"maxNumber\":\"3\",\"roomMoney\":394,\"roomNumber\":\"8109\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"2\",\"cashPledge\":300,\"level\":2,\"lockId\":\"7\",\"lockKey\":\"8217\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8217\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"2\",\"cashPledge\":300,\"level\":2,\"lockId\":\"7\",\"lockKey\":\"8220\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8220\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"2\",\"cashPledge\":300,\"level\":2,\"lockId\":\"6\",\"lockKey\":\"8223\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8223\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"2\",\"cashPledge\":300,\"level\":2,\"lockId\":\"5\",\"lockKey\":\"8225\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8225\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"8\",\"lockKey\":\"8306\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8306\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"9\",\"lockKey\":\"8307\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8307\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"8\",\"lockKey\":\"8308\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8308\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"7\",\"lockKey\":\"8309\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8309\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"5\",\"lockKey\":\"8310\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8310\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"7\",\"lockKey\":\"8311\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8311\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"10\",\"lockKey\":\"8312\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8312\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"1\",\"lockKey\":\"8317\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8317\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"7\",\"lockKey\":\"8319\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8319\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"5\",\"lockKey\":\"8320\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8320\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"6\",\"lockKey\":\"8323\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8323\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"},{\"building\":\"3\",\"cashPledge\":300,\"level\":3,\"lockId\":\"6\",\"lockKey\":\"8325\",\"lockno\":0,\"maxNumber\":\"4\",\"roomMoney\":394,\"roomNumber\":\"8325\",\"roomType\":1,\"typeName\":\"睿沃雅致大床\"}],\"message\":\"查询成功\",\"result\":1}");
        JsonObject jsonObject = je.getAsJsonObject();
        System.out.println(jsonObject.get("data"));
    }
}
