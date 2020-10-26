package ru.Albiz19.java2020.pr32;

public final class Address {
        private String cityName;
        private int zipCode;
        private  String streetName;
        private int buildingNumber;
        private char buidingLetter;
        private int apartmentNumber;
        public Address EMPTY_ADRESS;

        public String getCityName() {
            return cityName;
        }

        public int getZipCode() {
            return zipCode;
        }

        public String getStreetName() {
            return streetName;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }

        public char getBuidingLetter() {
            return buidingLetter;
        }

        public int getApartmentNumber() {
            return apartmentNumber;
        }
    }
