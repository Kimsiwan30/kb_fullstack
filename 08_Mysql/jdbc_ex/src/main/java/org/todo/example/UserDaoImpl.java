package org.todo.example;

import org.scoula.common.JDBCUtil;
import org.scoula.user2.UserVO;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    private final Connection conn;

    public UserDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public UserVo loginUser(String userId, String password) {
        String sql = "select * from todo_user where user_id=? AND password=?";
        UserVo loginUser = null;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userId);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String logimUserId = rs.getString("userId");
                    String logimName = rs.getString("name");
                    String loginPassword = rs.getString("password");
                    Timestamp loginCreatedAt = rs.getTimestamp("created_at");

                    loginUser = new UserVo(logimUserId, logimName, loginPassword, loginCreatedAt);

                }

            }


        } catch (SQLException e) {
            e.printStackTrace();


        }

        return loginUser;
    }
}

