package plans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import product.ProductVO;

public class PlanDao {
	private JdbcTemplate jdbcTemplate;

	public PlanDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}	

    // 메소드: 선택한 값들을 데이터베이스에 저장하는 기능
    public void saveSelectedValues(PlanVO vo) {
		System.out.printf("[WorkDao] saveSelectedValues: color(%s), size(%s), len(%s), num(%s)\n", vo.getColor(), vo.getSize(), vo.getLen(), vo.getNum());
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement("INSERT INTO  plan (color, psize, len, num) VALUES (?, ?, ?, ?)");

	            pstmt.setString(1, vo.getColor());
	            pstmt.setString(2, vo.getSize());
	            pstmt.setString(3, vo.getLen());
	            pstmt.setString(4, vo.getNum());
				return pstmt;
			}
		});
	}    
}
