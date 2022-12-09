package repository.facility;

import model.Facility;
import repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    private static final String SELECT_USER_BY_ID = "select facility.* , rent_type.name as thoi_han , facility_type.name as loai_thue from facility \n" +
            "join facility_type on facility_type.id = facility.facility_type_id\n" +
            "join rent_type on rent_type.id = facility.rent_type_id";
    @Override
    public List<Facility> list() {
        List<Facility> facilityList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("max_people");
                String standardRoom = resultSet.getString("standard_room");
                String descriptionOther = resultSet.getString("description_other_covenience");
                Double poolArea = resultSet.getDouble("poll_area");
                Integer numberOfFloors = resultSet.getInt("number_of_floors");
                String facilityFree = resultSet.getString("facility_free");
                String rentType = resultSet.getString("thoi_han");
                String facilityType = resultSet.getString("loai_thue");
                facilityList.add(new Facility(id,name,area,cost,maxPeople,standardRoom,descriptionOther,poolArea,numberOfFloors,facilityFree,rentType,facilityType));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return facilityList;
    }
}
