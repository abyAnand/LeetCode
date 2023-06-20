package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class CarCollection {

    public static void main(String[] args) {

        ArrayList<Car> carCollection = new ArrayList<>();

        Car supra = new Car("Supra","Toyota");
        Car gtr = new Car("Skyline GTR","Nissan");

        carCollection.add(supra);
        carCollection.add(gtr);

//         carCollection
//                .stream()
//                .filter(car -> car.getName().startsWith("Su"))
//                 .forEach(System.out::println);
//
//
//
//    }

        Predicate<Integer> greaterThan = number -> (number> 10);

        System.out.println(greaterThan.test(12));
    }


}
