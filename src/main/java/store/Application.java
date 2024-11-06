package store;

import store.controller.ConvenienceController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        ConvenienceController convenienceController = new ConvenienceController();
        convenienceController.start();

    }
}
