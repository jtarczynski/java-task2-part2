package org.example;

import org.example.datainitializer.DataInitializer;
import org.example.models.City;
import org.example.models.Shop;
import org.example.models.Worker;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<City> cities = DataInitializer.initializeCityData();
        List<Shop> shops = DataInitializer.initializeShopData();
        List<Worker> workers = DataInitializer.initializeWorkerData();

        System.out.println("Filter example: ");
        cities.stream()
                .filter(city -> city.getCityName().equals("Warsaw"))
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();

        System.out.println("Map example: ");
        shops.stream()
                .map(Shop::getCity)
                .forEach(city -> System.out.println(city.getCityName()));
        System.out.println();

        System.out.println("MIN/MAX example");
        workers.stream()
                .max(Comparator.comparing(worker -> worker.getShop().getSquareSurface()))
                .ifPresent(System.out::println);
        System.out.println();

        /*
        NOTE > I don't know if it is what we was expected to do, because I turned it into a map. It seemed to make more
                sense than performing normal foreach and calculating average without any output.

        Question > Should it be separated into two operations? (I mean returning one set and then operating on it,
                   because I feel it is too much for one operation)
         */
        System.out.println("GroupingBy example: ");
        shops.stream()
                .collect(Collectors.groupingBy(
                        Shop::getShopName))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        set -> set
                                .getValue()
                                .stream()
                                .mapToInt(Shop::getSquareSurface)
                                .average()
                                .orElseThrow(IllegalArgumentException::new)))
                .entrySet()
                .forEach(System.out::println);
    }
}
