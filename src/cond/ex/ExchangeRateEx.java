package cond.ex;

import java.sql.SQLOutput;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar;
        dollar = 0;
        if (dollar<0) {
            System.out.println("잘못된 금액입니다");
        } else if (dollar==0) {
            System.out.println("환전 할 금액이 없습니다");
        }else {
            int won = dollar * 1300;
            System.out.println("환전할 금액은" + won + "입니다");
        }

    }
}
