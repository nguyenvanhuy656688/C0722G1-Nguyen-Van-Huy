package case_study_furama.view;

import case_study_furama.controller.FuramaController;
import case_study_furama.ultis.FacilityException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FacilityException, IOException {
        FuramaController.displayMainMenu();
    }
}
