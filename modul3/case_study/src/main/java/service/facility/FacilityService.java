package service.facility;

import model.Facility;
import repository.facility.FacilityRepository;
import repository.facility.IFacilityRepository;

import java.util.List;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository = new FacilityRepository();
    @Override
    public List<Facility> list() {
        return iFacilityRepository.list();
    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public void edit(Facility facility) {

    }

    @Override
    public Facility showFormEdit(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Facility> search(String name, String descriptionOther) {
        return null;
    }
}
