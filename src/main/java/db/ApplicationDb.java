package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationDb extends DbWorker {
    public void AssessmentSchool (){
        String SQL = "Select grade from journal 1 where pupil_id = (?)";

        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)){
           // preparedStatement.setInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
