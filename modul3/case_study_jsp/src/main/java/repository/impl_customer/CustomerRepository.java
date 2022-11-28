package repository.impl_customer;

import model.Customer;
import model.CustomerType;
import repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String INSERT_USERS_SQL = "INSERT INTO customer (customer_type_id,`name`,date_of_birth,gender,id_card," +
            "phone_number,email,address) VALUES (?, ?, ? , ? ,? ,? , ? , ?);";
    private static final String SELECT_USER_BY_ID = "select * from customer where id =?";
    private static final String SELECT_ALL_USERS = "select * from customer";
    private static final String DELETE_USERS_SQL = "delete from customer where id = ?;";
    private static final String UPDATE_USERS_SQL = "update customer set customer_type_id = ?,`name`= ?, date_of_birth =?,gender =?," +
            "id_card=?,phone_number=?,email=?,address=?  where id = ?;";
    private static final String SEARCH_USERS_BY_ID = "select c.*, ct.name_type as customer_type_name from\n" +
            "customer c join customer_type ct on c.customer_type_id = ct.id where c.id like ? and c.`name` like ? and  c.address like ?;";
    private static final String SELECT_ALL_BY_TYPE="select c.*, ct.name_type as customer_type_name from\n" +
            "customer c join customer_type ct on c.customer_type_id = ct.id;";
    @Override
    public boolean deleteById(int id) {
        boolean rowDeleted = false;
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }


    @Override
    public boolean edit(Customer customer) {
        boolean rowUpdated = false;
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getDateOfBirth());
            preparedStatement.setBoolean(4, customer.isGender());
            preparedStatement.setString(5, customer.getIdCard());
            preparedStatement.setString(6, customer.getPhoneNumber());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setInt(9, customer.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;

    }

    @Override
    public boolean create(Customer customer) {
        boolean rowCreate = false;
        System.out.println(INSERT_USERS_SQL);
        Connection connection = BaseRepository.getConnectDB();
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getDateOfBirth());
            preparedStatement.setBoolean(4, customer.isGender());
            preparedStatement.setString(5, customer.getIdCard());
            preparedStatement.setString(6, customer.getPhoneNumber());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            System.out.println(preparedStatement);
            rowCreate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
           e.getMessage();
        }
        return rowCreate;
    }

    @Override
    public List<Customer> displayAll() {
        // Tạo list để hiển thị danh sách
        List<Customer> users = new ArrayList<>();
        // Step 1: Kết nối
        try (Connection connection = BaseRepository.getConnectDB();

             // Step 2: Tạo kết nối vs câu lệnh
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BY_TYPE)) {
            System.out.println(preparedStatement);

            // Step 3: hứng câu truy vấn
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: xử lý
            while (rs.next()) {
                int id = rs.getInt("id");
                int customerTypeId = rs.getInt("customer_type_id");
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("date_of_birth");
                boolean gender = rs.getBoolean("gender");
                String idCard = rs.getString("id_card");
                String phoneNumber = rs.getString("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String customerTypeName = rs.getString("customer_type_name");
                users.add(new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address, new CustomerType(customerTypeName)));
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return users;
    }

    @Override
    public List<Customer> search(int idSearch,String nameSearch,String addressSearch) {
        List<Customer> customer = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_USERS_BY_ID);
            preparedStatement.setInt(1,idSearch );
            preparedStatement.setString(2,"%" + nameSearch + "%");
            preparedStatement.setString(3,"%" + addressSearch + "%");
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String customerTypeName = resultSet.getString("customer_type_name");
                customer.add(new Customer(id,customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address,new CustomerType(customerTypeName)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return customer;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;

        try (Connection connection = BaseRepository.getConnectDB();
             // bước  2: tạo trạng thái kết nối vs DB
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // bước 3 3: hứng kết quả từ câu truy vấn select
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: xử ly result set.
            while (rs.next()) {
                int customerTypeId = rs.getInt("customer_type_id");
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("date_of_birth");
                boolean gender = rs.getBoolean("gender");
                String idCard = rs.getString("id_card");
                String phoneNumber = rs.getString("phone_number");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customer = new Customer(customerTypeId,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return customer;

    }
}
