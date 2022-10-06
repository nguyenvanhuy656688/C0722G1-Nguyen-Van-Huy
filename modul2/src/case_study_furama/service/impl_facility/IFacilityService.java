package case_study_furama.service.impl_facility;

import case_study_furama.ultis.FacilityException;

import java.io.IOException;

public interface IFacilityService {
    void displayListMaintenance();

    void addVilla() throws FacilityException, IOException;

    void displayList();

    void addHouse() throws IOException;

    void addRoom() throws IOException;
}
