import java.util.*;
import java.util.Scanner;

public class homework220926_2 {
    public static void main(String[] args){
        var monthList=new HashMap<>();
        monthList.put(1,"January");
        monthList.put(2,"February");
        monthList.put(3,"March");
        monthList.put(4,"April");
        monthList.put(5,"May");
        monthList.put(6,"June");
        monthList.put(7,"July");
        monthList.put(8,"August");
        monthList.put(9,"September");
        monthList.put(10,"October");
        monthList.put(11,"November");
        monthList.put(12,"December");
        System.out.println(monthList);
        int month=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.printf("請輸入1~12? ");
            month = input.nextInt();
            if(month<1 || month>12){
                System.out.printf("範圍錯誤!\n");
            }
        }while(month<1 || month>12);
        System.out.printf("第%d月的英文單字為%s\n",month,monthList.get(month));14
    }
}