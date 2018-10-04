package com.springcore;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Boolean saveEmployee(final Employee e)
	{
		String query = "insert into employee values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException
			{
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setFloat(3, e.getSalary());
				return ps.execute();
			}
		});
	}
	
	public List<Employee> getAllEmployee()
	{
		return jdbcTemplate.query("Select * from employee",new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException
			{
				List<Employee> list = new ArrayList<Employee>();
				while(rs.next())
				{
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getFloat(3));
					list.add(e);
				}
				return list;
			}
		});
	}
	
	public int updateEmployee(Employee e)
	{
		String query = "update employee set name='"+e.getName()+"', salary="+e.getSalary()+" where id="+e.getId();
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee e)
	{
		String query = "delete from employee where id="+e.getId();
		return jdbcTemplate.update(query);
	}
	
}
