package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given

        //Africa
        Country egypt = new Country(new BigDecimal("99413317"));
        Country morocco = new Country(new BigDecimal("34314130"));
        Country kenya = new Country(new BigDecimal("48397527"));
        List<Country> africanCountries = new ArrayList<>();
        africanCountries.add(egypt);
        africanCountries.add(morocco);
        africanCountries.add(kenya);
        Continent africa = new Continent(africanCountries);
        //Asia
        Country china = new Country(new BigDecimal("1384688986"));
        Country japan = new Country(new BigDecimal("126168156"));
        Country thailand = new Country(new BigDecimal("68615858"));
        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(china);
        asianCountries.add(japan);
        asianCountries.add(thailand);
        Continent asia = new Continent(asianCountries);
        //Europe
        Country spain = new Country(new BigDecimal("49331076"));
        Country france = new Country(new BigDecimal("67364357"));
        Country germany = new Country(new BigDecimal("80457737"));
        List<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(spain);
        europeanCountries.add(france);
        europeanCountries.add(germany);
        Continent europe = new Continent(europeanCountries);
        //World
        List<Continent> continentsList = new ArrayList<>();
        continentsList.add(africa);
        continentsList.add(asia);
        continentsList.add(europe);

        //When
        World world = new World(continentsList);
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("1958751144");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
