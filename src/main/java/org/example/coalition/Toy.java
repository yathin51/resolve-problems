package org.example.coalition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;

public class Toy {
    static long doublyValue;

    private static Logger log = LoggerFactory.getLogger("Toy.class");

    public void play() {
        log.info("play-");
    }

    public static void main(String[] args) {
        Toy car = new Toy();
        car.play();
        Toy doll = new Toy();
        doll.play();

        log.info("{}",doublyValue);



        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =1; i<10;++i){
            arrayList.add(i);
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            log.info("iterator value = {}",iterator.next());
            log.info(" Size : "+arrayList.size());
            iterator.remove();
            log.info(" Size : "+arrayList.size());
        }
        String chair = "123", table = "metal";
        chair = chair + table;
        log.info("{}",chair);

    }
}

class A{
    private void add(int a, int b){

    }
}

class B extends  A{
//    lowering the visibility causes compilation errors;
    protected void add(int a, int b){

    }

}