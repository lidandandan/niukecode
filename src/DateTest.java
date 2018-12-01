import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by yixinf-q on 2018/9/12.
 */
public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String postfix = sdf.format(new Date());
        System.out.println(postfix);


        HashMap<String,String> map1=new HashMap<>();
        map1.put("1","A");

        HashMap<String,String> map2=new HashMap<>();
        map2.put("2","B");
        map2.put("3","c");
        map1.putAll(map2);
        System.out.println(map1);
    }
}
