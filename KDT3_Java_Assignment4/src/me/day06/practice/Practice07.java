package me.day06.practice;

import java.util.Arrays;

public class Practice07 {
    public static void main(String[] args) {

        final String jsonString = "{\n" +
                "\t\"name\": \"Molecule Man\",\n" +
                "\t\"age\": 29,\n" +
                "\t\"secretIdentity\": \"Dan Jukes\",\n" +
                "\t\"powers\": \"Radiation resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Madame Uppercut\",\n" +
                "\t\"age\": 39,\n" +
                "\t\"secretIdentity\": \"Jane Wilson\",\n" +
                "\t\"powers\": \"Damage resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Eternal Flame\",\n" +
                "\t\"age\": 1000000,\n" +
                "\t\"secretIdentity\": \"Unknown\",\n" +
                "\t\"powers\": \"Heat Immunity\"\n" +
                "}";
        String[] jsonArray = jsonString.split("},");
        String[][] jsonTable = new String[3][4];
        String[] jsonColumn = new String[4];

        for (int i = 0; i < jsonArray.length; i++) {
            jsonArray[i] = (jsonArray[i].replaceAll("[\"}\",\"{\"]", "")).trim();
            String[] jsonArray2 = jsonArray[i].split("\n+\t");
            for (int j = 0; j < jsonArray2.length; j++) {
                String[] jsonArray3 = jsonArray2[j].split(":");
                jsonTable[i][j] = jsonArray3[1].trim();
                jsonColumn[j] = jsonArray3[0].trim();
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jsonColumn.length; i++) {
            System.out.printf("%20s\t", jsonColumn[i]);
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jsonTable.length; i++) {
            for (int j = 0; j < jsonTable[i].length; j++) {
                System.out.printf("%20s\t", jsonTable[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");


    }
}





