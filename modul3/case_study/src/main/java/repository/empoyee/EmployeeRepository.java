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
            "join user on user.usename = employee.username ;";
    private static final String INSERT_USERS_SQL2 = "INSERT INTO employee(name,date_of_birth,id_card,salary,phone_number,email,address,position_id,education_degeee_id,division_id,username)  VALUES (?, ?, ? , ? ,? ,? , ? , ? , ?, ?, ?)";
    private static final String DELETE_USERS_SQL = "delete from employee where id = ?;";
    private static final String SEARCH_USERS_BY_ID ="select employee.*, `position`.name as chuc_vu , division.name as bo_phan , education_degree.name as trinh_do from employee join `position` on `position`.id = employee.position_id join division on" +
            " division.id = employee.division_id " +
            "join education_degree on education_degree.id = employee.education_degeee_id " +
            "join user on user.usename = employee.username where employee.id like ? and employee.`name` like ? and  employee.address like ?;";
    private static final String UPDATE_USERS_SQL = "update employee set `name`= ?, date_of_birth =?, id_card=? ,salary = ? ,phone_number=? ,email=?, address=? , position_id =? ,education_degeee_id =? ,division_id =? ,username=? where id = ?;";
    private static final String SELECT_USER_BY_ID = "select * from employee where id =?";

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
        System.out.println(INSERT_USERS_SQL2);
        Connection connection = BaseRepository.getConnectDB();
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL2)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getDateOfBirth());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setString(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhoneNumber());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setString(8, employee.getPosition());
            preparedStatement.setString(9, employee.getEducationDegreeId());
            preparedStatement.setString(10, employee.getDivision());
            preparedStatement.setString(11, employee.getUsername());
            System.out.println(preparedStatement);
            return  preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return false;
    }

    @Override
    public Employee editById(int id) {
        Employee employee = null;
        try (Connection connection = BaseRepository.getConnectDB();
             // bước  2: tạo trạng thái kết nối vs DB
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // bước 3 3: hứng kết quả từ câu truy vấn select
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: xử ly result set.
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("date_of_birth");
                String idCard = rs.getString("id_card");
                String salary = rs.getString("salary");
                String phoneNumber = rs.getString("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String position = rs.getString("position_id");
                String educationDegeeeId = rs.getString("education_degeee_id");
                String divisionId = rs.getString("division_id");
                String username = rs.getString("username");
                employee = new Employee(id1,name,dateOfBirth,idCard,salary,phoneNumber,email,address,position,educationDegeeeId,divisionId,username);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;

    }

    @Override
    public void deleteById(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean edit(Employee employee) {
        boolean rowUpdated = false;
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getDateOfBirth());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setString(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhoneNumber());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setString(8, employee.getPosition());
            preparedStatement.setString(9, employee.getEducationDegreeId());
            preparedStatement.setString(10, employee.getDivision());
            preparedStatement.setString(11, employee.getUsername());
            preparedStatement.setInt(12, employee.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public List<Employee> search(int idSearch, String nameSearch, String addressSearch) {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_USERS_BY_ID);
            preparedStatement.setInt(1,idSearch);
            preparedStatement.setString(2,"%" + nameSearch + "%");
            preparedStatement.setString(3,"%" + addressSearch + "%");
            System.out.println(preparedStatement);
            ResultSet rs =preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("date_of_birth");
                String idCard = rs.getString("id_card");
                String salary = rs.getString("salary");
                String phoneNumber = rs.getString("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String position = rs.getString("position_id");
                String educationDegeeeId = rs.getString("education_degeee_id");
                String divisionId = rs.getString("division_id");
                String username = rs.getString("username");
                employeeList.add(new Employee(id,name,dateOfBirth,idCard,salary,phoneNumber,email,address,position,educationDegeeeId,divisionId,username));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }
}
