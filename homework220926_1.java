import java.security.SecureRandom;
import java.util.*;

public class homework220926_1 {
    public static void main(String[] args){
        SecureRandom random=new SecureRandom();
        ArrayList<Integer> number=new ArrayList<>();
        TreeSet<Integer> numberTreeSet=new TreeSet<>();
        while(number.size()<10){
            int numA=1+random.nextInt(99);
            if(number.contains(numA)==false){
                number.add(numA);
            }
        }
        System.out.println("電腦從1~100的整數中，亂數取出10個不同的號碼....");
        for(int n=0;n<number.size();n++){
            System.out.printf("第%d個號碼:%d\n",n+1,number.get(n));
        }
        System.out.printf("物件內元素個數為:%d\n",number.size());
        for(int n=0;n<number.size();n++){
            numberTreeSet.add(number.get(n));
        }
        System.out.println(numberTreeSet);
        System.out.printf("第一個元素內容為:%d\n",numberTreeSet.first());
        System.out.printf("最後一個元素內容為:%d\n",numberTreeSet.last());
        System.out.println("內容介於30~70者:"+numberTreeSet.subSet(30, 70));
        
    }
    
}
