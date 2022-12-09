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
}
