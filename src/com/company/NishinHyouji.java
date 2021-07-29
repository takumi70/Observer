package com.company;

public class NishinHyouji implements Observer{
    public void update(Subject s){
        print(((Suuchi)s).getValue());
    }

    private void print(int n){
        System.out.println(n + "を2進数で表示します");
        //
        //2進数表示処理
        //

    }
}
