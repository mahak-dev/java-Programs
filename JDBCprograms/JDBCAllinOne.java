import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JDBCAllinOne implements ActionListener {
	
	JLabel lblFname,lblLname,lblAddress,lblSalary,lblf,lbll,lbla,lbls;
	JLabel lblfVal,lbllVal,lblaVal,lblsVal;
	JTextField txtFname,txtLname,txtAddress,txtSalary;
	JButton btnInsert,btnUpdate,btnDelete,btnPrev,btnNext,btnClear;
	ResultSet rs ;
	public static void main(String[] args) {
		JDBCAllinOne obj = new JDBCAllinOne();
		obj.createUI();
	}
	private void createUI()
	{
		JFrame frame = new JFrame("JDBC All in One");
		
		//Layout of Main Window
		Container c = frame.getContentPane();
		c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
		
		lblFname = new JLabel("First Name :");
		lblLname = new JLabel("Last Name :");
		lblAddress = new JLabel("Address :");
		lblSalary = new JLabel("Salary :");
		
		txtFname = new JTextField("",15);//To adjust width
		txtLname = new JTextField();
		txtAddress = new JTextField();
		txtSalary = new JTextField();
		
		JPanel pnlInput = new JPanel(new GridLayout(4,2));
		
		pnlInput.add(lblFname);
		pnlInput.add(txtFname);
		
		pnlInput.add(lblLname);
		pnlInput.add(txtLname);
		
		pnlInput.add(lblAddress);
		pnlInput.add(txtAddress);
		
		pnlInput.add(lblSalary);
		pnlInput.add(txtSalary);
		
		btnInsert = new JButton("Insert");
		btnInsert.addActionListener(this);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(this);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(this);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		
		JPanel pnlButton = new JPanel(new GridLayout(1,4));
		
		pnlButton.add(btnInsert);
		pnlButton.add(btnUpdate);
		pnlButton.add(btnDelete);
		pnlButton.add(btnClear);
		
		JPanel pnlAns = new JPanel(new GridLayout(4,2));
		
		lblf = new JLabel("First Name :");
		lbll = new JLabel("Last Name :");
		lbla = new JLabel("Address :");
		lbls = new JLabel("Salary :");
		
		lblfVal = new JLabel("");
		lbllVal = new JLabel("");
		lblaVal = new JLabel("");
		lblsVal = new JLabel("");
		
		pnlAns.add(lblf);
		pnlAns.add(lblfVal);
		
		pnlAns.add(lbll);
		pnlAns.add(lbllVal);
		
		pnlAns.add(lbla);
		pnlAns.add(lblaVal);
		
		pnlAns.add(lbls);
		pnlAns.add(lblsVal);
		
		
		btnPrev = new JButton(" << ");
		btnPrev.setActionCommand("Prev");		
		btnPrev.addActionListener(this);
		
		
		btnNext = new JButton(" >> ");
		btnNext.setActionCommand("Next");
		btnNext.addActionListener(this);
		
		JPanel pnlNavigate = new JPanel(new GridLayout(1,2));
		
		pnlNavigate.add(btnPrev);
		pnlNavigate.add(btnNext);
		
		frame.add(pnlInput);
		frame.add(pnlButton);
		frame.add(pnlAns);
		frame.add(pnlNavigate);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt) {		
		String cmd = evt.getActionCommand();
		
		if(cmd.equals("Insert"))
		{
			insertData();
		}else if(cmd.equals("Update"))
		{
			updateData();
		}else if(cmd.equals("Delete"))
		{
			deleteData();
		}else if(cmd.equals("Prev"))
		{
			previous();
		}else if(cmd.equals("Next"))
		{
			next();
		}else if(cmd.equals("Clear"))
		{
			clearControls();	
		}
	}
	
	private void insertData()
	{
		Connection con;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
			String sql = "Insert Into Emp (FName,LName,Address,Salary) " +
					"Values ('"+txtFname.getText()+"','"+txtLname.getText()
					+"','"+txtAddress.getText()+"','"+txtSalary.getText()+"')";
			Statement statement = con.createStatement();
			statement.execute(sql);
			createMessageBox("Inserted Successfully");
			clearControls();
		}
		catch(Exception e)
		{
			createMessageBox(e.getMessage());
		}
	}
	private void updateData()
	{
		Connection con;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
			String sql = "Update Emp Set LName='"+txtLname.getText()+"'," +
					"Address='"+txtAddress.getText()+"',Salary='"+
					txtSalary.getText()+"' Where FName='"+txtFname.getText()+"'";
			Statement statement = con.createStatement();
			statement.execute(sql);
			createMessageBox("Updated Successfully");
			clearControls();
		}
		catch(Exception e)
		{
			createMessageBox(e.getMessage());
		}
	}
	private void deleteData()
	{
		Connection con;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
			String sql = "delete from Emp where FName = '"+txtFname.getText()+"'";
			Statement statement = con.createStatement();
			statement.execute(sql);
			createMessageBox("Record of "+txtFname.getText()+" Deleted Successfully");
			clearControls();
		}
		catch(Exception e)
		{
			createMessageBox(e.getMessage());
		}
	}
	private void previous()
	{
		try
		{
			if(rs == null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
				String sql = "Select FName,LName,Address,Salary from Emp";
				Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				rs = statement.executeQuery(sql);
			}
			if(rs.previous())
			{
				populateControls();				
				
			}
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private void next()
	{
		try
		{
			if(rs == null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahak","root","Mahak@123");
				String sql = "Select FName,LName,Address,Salary from Emp";
				Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				rs = statement.executeQuery(sql);				
			}

			if(rs.next() && !rs.isAfterLast())//After Last was giving invalid cursor state error
			{
				populateControls();
			}
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private void createMessageBox(String msg)
	{
		JFrame frame = new JFrame("Result");
		JLabel lbl = new JLabel(msg);
		frame.add(lbl);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	private void clearControls()
	{
		String empty = "";
		
		txtFname.setText(empty);
		txtLname.setText(empty);
		txtAddress.setText(empty);
		txtSalary.setText(empty);
		
		lblfVal.setText(empty);
		lbllVal.setText(empty);
		lblaVal.setText(empty);
		lblsVal.setText(empty);
	}
	private void populateControls()
	{
		try{
			lblfVal.setText(rs.getString("fName"));
			lbllVal.setText(rs.getString("lName"));
			lblaVal.setText(rs.getString("Address"));
			lblsVal.setText(rs.getString("Salary"));
		
			txtFname.setText(lblfVal.getText());
			txtLname.setText(lbllVal.getText());
			txtAddress.setText(lblaVal.getText());
			txtSalary.setText(lblsVal.getText());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}