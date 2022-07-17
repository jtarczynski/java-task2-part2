package org.example.datainitializer;

import org.example.models.City;
import org.example.models.Shop;
import org.example.models.Worker;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {

    private static List<City> cities;

    private static List<Shop> shops;

    public static List<City> initializeCityData() {
        cities = new ArrayList<>();

        cities.add(City.builder()
                .cityName("Wroclaw")
                .country("Poland")
                .populationNumber(600000)
                .build());

        cities.add(City.builder()
                .cityName("Warsaw")
                .country("Poland")
                .populationNumber(1700000)
                .build());

        cities.add(City.builder()
                .cityName("Paris")
                .country("France")
                .populationNumber(2100000)
                .build());

        cities.add(City.builder()
                .cityName("Hamburg")
                .country("Germany")
                .populationNumber(1800000)
                .build());

        cities.add(City.builder()
                .cityName("Monachium")
                .country("Germany")
                .populationNumber(1400000)
                .build());

        cities.add(City.builder()
                .cityName("Berlin")
                .country("Germany")
                .populationNumber(3600000)
                .build());

        return cities;
    }

    public static List<Shop> initializeShopData() {
        shops = new ArrayList<>();

        shops.add(Shop.builder()
                .city(cities.get(0))
                .shopName("Falafel")
                .squareSurface(30)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(0))
                .shopName("McDonalds")
                .squareSurface(60)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(0))
                .shopName("Empik")
                .squareSurface(60)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(1))
                .shopName("Burger King")
                .squareSurface(50)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(1))
                .shopName("Pasibus")
                .squareSurface(63)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(2))
                .shopName("Zara")
                .squareSurface(65)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(2))
                .shopName("Burger King")
                .squareSurface(45)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(2))
                .shopName("Lidl")
                .squareSurface(49)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(3))
                .shopName("KFC")
                .squareSurface(90)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(4))
                .shopName("McDonalds")
                .squareSurface(55)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(4))
                .shopName("Leroy Merlin")
                .squareSurface(65)
                .build());

        shops.add(Shop.builder()
                .city(cities.get(5))
                .shopName("McDonalds")
                .squareSurface(90)
                .build());

        return shops;
    }

    public static List<Worker> initializeWorkerData() {
        List<Worker> workers = new ArrayList<>();

        workers.add(Worker.builder()
                .name("Piotr")
                .age(34)
                .secondName("Michał")
                .shop(shops.get(0))
                .build());

        workers.add(Worker.builder()
                .name("Agnieszka")
                .age(23)
                .secondName("Marcelina")
                .shop(shops.get(1))
                .build());

        workers.add(Worker.builder()
                .name("Konrad")
                .age(22)
                .secondName("Julian")
                .shop(shops.get(1))
                .build());

        workers.add(Worker.builder()
                .name("Ola")
                .age(30)
                .secondName("Ula")
                .shop(shops.get(1))
                .build());

        workers.add(Worker.builder()
                .name("Natalia")
                .age(55)
                .secondName("Patrycja")
                .shop(shops.get(2))
                .build());

        workers.add(Worker.builder()
                .name("Hubert")
                .age(61)
                .secondName("Kamil")
                .shop(shops.get(2))
                .build());

        workers.add(Worker.builder()
                .name("Piotr")
                .age(22)
                .secondName("Bartek")
                .shop(shops.get(3))
                .build());

        workers.add(Worker.builder()
                .name("Patrycja")
                .age(34)
                .secondName("Alicja")
                .shop(shops.get(4))
                .build());

        workers.add(Worker.builder()
                .name("Maciej")
                .age(47)
                .secondName("Michał")
                .shop(shops.get(4))
                .build());

        workers.add(Worker.builder()
                .name("Julian")
                .age(25)
                .secondName("Mikołaj")
                .shop(shops.get(5))
                .build());

        workers.add(Worker.builder()
                .name("Dominik")
                .age(25)
                .secondName("Maciej")
                .shop(shops.get(5))
                .build());

        workers.add(Worker.builder()
                .name("Dawid")
                .age(25)
                .secondName("Kuba")
                .shop(shops.get(6))
                .build());

        workers.add(Worker.builder()
                .name("Kuba")
                .age(25)
                .secondName("Daniel")
                .shop(shops.get(7))
                .build());

        workers.add(Worker.builder()
                .name("Martyna")
                .age(28)
                .secondName("Ula")
                .shop(shops.get(8))
                .build());

        workers.add(Worker.builder()
                .name("Wiktoria")
                .age(25)
                .secondName("Karolina")
                .shop(shops.get(8))
                .build());

        workers.add(Worker.builder()
                .name("Róża")
                .age(29)
                .secondName("Alicja")
                .shop(shops.get(9))
                .build());

        workers.add(Worker.builder()
                .name("Anastazja")
                .age(35)
                .secondName("Felicja")
                .shop(shops.get(10))
                .build());

        workers.add(Worker.builder()
                .name("Paulina")
                .age(38)
                .secondName("Alicja")
                .shop(shops.get(11))
                .build());

        return workers;
    }
}
