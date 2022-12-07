package repository.empoyee;

import model.Customer;
import model.Employee;
import repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String SELECT_ALL_BY_TYPE="select employee.*, `position`.name as chuc_vu , division.name as bo_phan , education_degree.name as trinh_do from employee \n" +
            "join `position` on `position`.id = employee.position_id\n" +
            "join division on division.id = employee.division_id\n" +
            "join education_degree on education_degree.id = employee.education_degeee_id\n" +
            "join user on user.usename = employee.username;";

    @Override
    public List<Employee> list() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BY_TYPE);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("date_of_birth");
                String idCard = rs.getString("id_card");
                String salary = rs.getString("salary");
                String phoneNumber = rs.getString("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String position = rs.getString("chuc_vu");
                String educationDegreeId = rs.getString("trinh_do");
                String division = rs.getString("bo_phan");
                String username = rs.getString("username");
                employeeList.add(new Employee(id,name,dateOfBirth,idCard,salary,phoneNumber,email,address,position,educationDegreeId,division,username));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public boolean create(Employee employee) {
        return false;
    }
}
