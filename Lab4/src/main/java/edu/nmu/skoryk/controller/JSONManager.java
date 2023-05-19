package edu.nmu.skoryk.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class JSONManager<T> {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void writeToFile(T structure, String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(this.toString(structure));
        fileWriter.close();
    }

    public T readFromFile(String filePath, Class<T> type) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);
        return this.gson.fromJson(fileReader, type);
    }

    public String toString(T structure) {
        return gson.toJson(structure);
    }
}
