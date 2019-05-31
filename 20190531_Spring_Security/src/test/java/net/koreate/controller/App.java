package net.koreate.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
public class App {
	
	@Inject
	private PasswordEncoder encoder;
	
	@Inject
	private DataSource ds;
	
	public void testInsertMember() {
		String sql = "INSERT INTO tbl_member(userid, userpw, username) VALUES(?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for (int i = 0; i <= 100; i++) {
				pstmt.setString(2, encoder.encode("pw" + i));
				
				if (i < 80) {
					pstmt.setString(1, "user" + i);
					pstmt.setString(3, "일반사용자" + i);
				} else if (i < 90) {
					pstmt.setString(1, "manager" + i);
					pstmt.setString(3, "운영자" + i);
				} else {
					pstmt.setString(1, "admin" + i);
					pstmt.setString(3, "관리자" + i);
				}
				pstmt.executeUpdate();
			}
		} catch (SQLException e) { e.printStackTrace(); }
		finally {
			if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if (conn != null) { try { conn.close(); } catch (SQLException e) {} }
		}
	}
	
	@Test
	public void testInsertAuth() {
		String sql = "INSERT INTO tbl_member_auth(userid, auth) VALUES(?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for (int i = 0; i <= 100; i++) {
				
				if (i < 80) {
					pstmt.setString(1, "user" + i);
					pstmt.setString(2, "ROLE_USER");
				} else if (i < 90) {
					pstmt.setString(1, "manager" + i);
					pstmt.setString(2, "ROLE_MANAGER");
				} else {
					pstmt.setString(1, "admin" + i);
					pstmt.setString(2, "ROLE_ADMIN");
				}
				pstmt.executeUpdate();
			}
		} catch (SQLException e) { e.printStackTrace(); }
		finally {
			if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if (conn != null) { try { conn.close(); } catch (SQLException e) {} }
		}
	}
}
