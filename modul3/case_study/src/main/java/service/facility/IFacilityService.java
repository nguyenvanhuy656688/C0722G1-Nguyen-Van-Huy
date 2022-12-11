package service.facility;

import model.Facility;

import java.util.List;

public interface IFacilityService  {
    List<Facility> list();

    void add(Facility facility);

    void edit(Facility facility);

    Facility showFormEdit(int id);

    void deleteById(int id);

    List<Facility> search(String name, String descriptionOther);
}
