import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;

class One extends Frame implements ActionListener,ItemListener
{
	Panel p1,p2,p3,p4,p5,p6,p7,p8;
	JLabel lb1,lb2,lb3;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25;
	Choice c1,c2;
	Checkbox cb1, cb2,cb3,cb4,cb5,cb6,cb7,cb8;
	JTable tbl1,tbl2,tbl3,tbl4,tbl5;
	JScrollPane jsp1,jsp2,jsp3,jsp4,jsp5;
	DefaultTableModel dtm1,dtm2,dtm3,dtm4,dtm5;
	int count=0,i=1,j=0,k=0,l=0,m=0,n=0;
	String pn,bno="",bdate="",name="",pname="";
	Double rt1=0d,q=0d,bal=0d,total=0d,gst=0d,amount=0d,qnt,rt=0d,tlt,amt,amt1,sum=0d,sum1=0d,sum2=0d,sum3=0d,dis=0d,dis1=0d,amtpd,amtpd1,gst1=0d,gst2=0d,comp=0d,comp1=0d,g=0d,g1=0d;
	int id=0;
		
	
	One()	
	{
	
		addWindowListener(new WindowAdapter() {  //addapter class for windowListener
			
            public void windowClosing (WindowEvent e) 
			{    
                dispose();    
            }			
        });
		p1=new Panel(null);
		p1.setBounds(10,20,200,800);
		p1.setBackground(new Color(35, 43, 196));
		p2=new Panel();
		p2.setBounds(510,20,890,50);
		p2.setBackground(new Color(35, 43, 196));
		p3=new Panel();
		p3.setBounds(250,90,1100,50);
	    p4=new Panel(null);
		p4.setBounds(250,160,950,400);
		p4.setBackground(new Color(220, 220, 220));
		p4.setVisible(false);
		p5=new Panel(null);
		p5.setBounds(250,160,800,520);
		p5.setBackground(new Color(220, 220, 220));
		p5.setVisible(false);
		
		p7=new Panel(null);
		p7.setBounds(250,160,800,720);
		p7.setBackground(new Color(220, 220, 220));
		p7.setVisible(false);
		p8=new Panel(null);
		p8.setBounds(250,160,800,520);
		p8.setBackground(new Color(220, 220, 220));
		p8.setVisible(false);
		ImageIcon it=new ImageIcon("C:\\Users\\91954\\Downloads\\Gemini_Generated_Image_1uj4oj1uj4oj1uj4.jpg");
		lb1=new JLabel(it);
		lb1.setBounds(510,20,890,50);
		
		ImageIcon i=new ImageIcon("C:\\Users\\91954\\Downloads\\Gemini_Generated_Image_eevytyeevytyeevy.jpg");
		lb2=new JLabel(i);
		lb2.setBounds(0,0,200,800);
		
		ImageIcon ik=new ImageIcon("C:\\Users\\91954\\Downloads\\Gemini_Generated_Image_eevytyeevytyeevy.jpg");
		lb3=new JLabel(ik);
		lb3.setBounds(255,65,500,100);
		
		l1=new Label("SynTech");
		l1.setFont(new Font("Arial",Font.BOLD,50));
		l1.setBounds(220,30,250,62);
		l1.setForeground(new Color(220, 220, 220));
		
		l3=new Label("Item Form");
		l3.setFont(new Font("Arial",Font.PLAIN,30));
		l3.setBounds(120,20,140,40);
		l4=new Label("Product Code");
		l4.setFont(new Font("Arial",Font.BOLD,15));
		l4.setBounds(20,80,110,30);
		l5=new Label("Product Name");
		l5.setFont(new Font("Arial",Font.BOLD,15));
		l5.setBounds(20,120,110,30);
		l6=new Label("Product Category");
		l6.setFont(new Font("Arial",Font.BOLD,15));
		l6.setBounds(20,160,140,30);
		l8=new Label("Tax Slab");
		l8.setFont(new Font("Arial",Font.BOLD,15));
		l8.setBounds(20,200,140,30);
		l21=new Label("Price");
		l21.setFont(new Font("Arial",Font.BOLD,15));
		l21.setBounds(20,240,140,30);
		l9=new Label("Invoice No");
		l9.setFont(new Font("Boulder",Font.PLAIN,20));
		l9.setBounds(20,80,100,20);
		l10=new Label("Invoice Date");
		l10.setFont(new Font("Boulder",Font.PLAIN,20));
		l10.setBounds(250,80,120,20);
		l11=new Label("Seller");
		l11.setFont(new Font("Boulder",Font.PLAIN,20));
		l11.setBounds(500,80,70,20);
		l12=new Label("Product Id");
		l12.setFont(new Font("Boulder",Font.PLAIN,20));
		l12.setBounds(20,110,100,20);
		l13=new Label("Product Name");
		l13.setFont(new Font("Boulder",Font.PLAIN,18));
		l13.setBounds(250,110,120,20);
		l14=new Label("Quantity");
		l14.setFont(new Font("Boulder",Font.PLAIN,20));
		l14.setBounds(500,110,100,20);
		l22=new Label("Total");
		l22.setFont(new Font("Boulder",Font.PLAIN,20));
		l22.setBounds(500,300,100,20);
		l23=new Label("Discount");
		l23.setFont(new Font("Boulder",Font.PLAIN,20));
		l23.setBounds(500,340,100,20);
		l29=new Label("GST");
		l29.setFont(new Font("Boulder",Font.PLAIN,20));
		l29.setBounds(500,380,100,20);
		l24=new Label("Amount");
		l24.setFont(new Font("Boulder",Font.PLAIN,20));
		l24.setBounds(500,420,100,20);
		l15=new Label("Product Name");
		l15.setFont(new Font("Boulder",Font.PLAIN,20));
		l15.setBounds(20,40,200,20);
		
		l28=new Label("Total");
		l28.setFont(new Font("Boulder",Font.PLAIN,20));
		l28.setBounds(530,350,80,20);
		b14=new Button("Search");
		b14.setFont(new Font("Arial",Font.PLAIN,15));
		b14.setBounds(257,81,73,30);
		b14.addActionListener(this);
		
		b1=new Button("Add Items");
		b1.setFont(new Font("Arial",Font.PLAIN,20));
		b1.setBounds(0,140,200,50);
		b1.addActionListener(this);
		
		b2=new Button("Stock Summary");
		b2.setFont(new Font("Arial",Font.PLAIN,20));
		b2.setBounds(0,195,200,50);
		b2.addActionListener(this);
		
		b3=new Button("Purchase/Return");
		b3.setFont(new Font("Arial",Font.PLAIN,20));
		b3.setBounds(0,250,200,50);
		b3.addActionListener(this);
		
		b5=new Button("Reports");
		b5.setFont(new Font("Arial",Font.PLAIN,20));
		b5.setBounds(0,305,200,50);
		b5.addActionListener(this);
		b6=new Button("Insert");
		b6.setFont(new Font("Arial",Font.BOLD,15));
		b6.setBounds(20,300,310,30);
		b6.addActionListener(this);
		b15=new Button("Delete");
		b15.setFont(new Font("Arial",Font.BOLD,15));
		b15.setBounds(20,331,164,30);
		b15.addActionListener(this);
		b15.setEnabled(false);
		b16=new Button("Update");
		b16.setFont(new Font("Arial",Font.BOLD,15));
		b16.setBounds(184,331,146,30);
		b16.addActionListener(this);
		b16.setEnabled(false);
		b7=new Button("ADD");
		b7.setFont(new Font("Arial",Font.PLAIN,20));
		b7.setBounds(710,100,80,30);
		b7.addActionListener(this);
		/*b8=new Button("ADD");
		b8.setFont(new Font("Arial",Font.PLAIN,20));
		b8.setBounds(710,100,80,30);
		b8.addActionListener(this);*/
		b9=new Button("Search");
		b9.setFont(new Font("Arial",Font.PLAIN,20));
		b9.setBounds(170,110,70,20);
		b9.addActionListener(this);
		/*b10.setFont(new Font("Arial",Font.PLAIN,20));
		b10.setBounds(170,110,70,20);
		b10.addActionListener(this);*/
		b11=new Button("Save");
		b11.setFont(new Font("Arial",Font.PLAIN,20));
		b11.setBounds(40,300,180,30);
		b11.addActionListener(this);
		/*b12=new Button("Generate Invoice");
		b12.setFont(new Font("Arial",Font.PLAIN,20));
		b12.setBounds(40,300,180,30);
		b12.addActionListener(this);*/
		b13=new Button("Summary");
		b13.setFont(new Font("Arial",Font.PLAIN,20));
		b13.setBounds(40,350,180,30);
		b13.addActionListener(this);
		
		c1=new Choice();
		c1.setFont(new Font("Arial",Font.PLAIN,15));
		c1.setBounds(180,160,150,30);
		c1.add("------ Choose ------");
		c1.add("Electronics");
		c1.add("Generals");
		c1.add("Food");
		c1.add("Books");
		c1.add("woods");
		
		c2=new Choice();
		c2.setFont(new Font("Arial",Font.PLAIN,15));
		c2.setBounds(180,200,150,30);
		c2.add("------ Choose ------");
		c2.add("0");
		c2.add("5");
		c2.add("12");
		c2.add("18");
		c2.add("28");
		
		tf1=new TextField();
		tf1.setBounds(180,80,75,30);
		tf2=new TextField();
		tf2.setBounds(180,120,150,30);
		
		tf16=new TextField();
		tf16.setBounds(180,240,150,30);
		tf4=new TextField();
		tf4.setBounds(130,80,100,20);
		tf5=new TextField();
		tf5.setBounds(380,80,100,20);
		tf6=new TextField();
		tf6.setBounds(600,80,100,20);
		tf7=new TextField();
		tf7.setBounds(130,110,30,20);
		tf8=new TextField();
		tf8.setBounds(380,110,100,20);
		tf9=new TextField();
		tf9.setBounds(600,110,100,20);
		tf10=new TextField();
		tf10.setBounds(240,40,100,20);
		/*tf11=new TextField();
		tf11.setBounds(380,80,100,20);
		tf12=new TextField();
		tf12.setBounds(600,80,100,20);
		tf13=new TextField();
		tf13.setBounds(130,110,30,20);
		tf14=new TextField();
		tf14.setBounds(380,110,100,20);
		tf15=new TextField();
		tf15.setBounds(600,110,100,20);*/
		tf17=new TextField();
		tf17.setBounds(620,300,100,20);
		tf18=new TextField();
		tf18.setBounds(620,340,100,20);
		tf19=new TextField();
		tf19.setBounds(620,420,100,20);
		/*tf20=new TextField();
		tf20.setBounds(620,300,100,20);
		tf21=new TextField();
		tf21.setBounds(620,340,100,20);
		tf22=new TextField();
		tf22.setBounds(620,420,100,20);*/
		tf23=new TextField();
		tf23.setBounds(630,350,100,20);
		tf24=new TextField();
		tf24.setBounds(620,380,100,20);
		//tf25=new TextField();
		//tf25.setBounds(620,380,100,20);
		
		CheckboxGroup cb=new CheckboxGroup();
		cb1=new Checkbox("Purchased",false,cb);
		cb1.setBounds(70,30,200,40);
		cb1.setFont(new Font("Boulder",Font.BOLD,20));
		cb1.addItemListener((ItemListener)this);
		cb2=new Checkbox("Purchased Return",false,cb);
		cb2.setBounds(280,30,200,40);
		cb2.setFont(new Font("Boulder",Font.BOLD,20));
		cb2.addItemListener((ItemListener)this);
		cb3=new Checkbox("Sales",false,cb);
		cb3.setBounds(490,30,100,40);
		cb3.setFont(new Font("Boulder",Font.BOLD,20));
		cb3.addItemListener((ItemListener)this);
		cb4=new Checkbox("Sales Return",false,cb);
		cb4.setBounds(600,30,200,40);
		cb4.setFont(new Font("Boulder",Font.BOLD,20));
		cb4.addItemListener((ItemListener)this);
		cb5=new Checkbox("Purchased",false,cb);
		cb5.setBounds(30,30,150,20);
		cb5.setFont(new Font("Boulder",Font.PLAIN,20));
		cb5.addItemListener((ItemListener)this);
		cb6=new Checkbox("Purchased Return",false,cb);
		cb6.setBounds(190,30,200,20);
		cb6.setFont(new Font("Boulder",Font.PLAIN,20));
		cb6.addItemListener((ItemListener)this);
		cb7=new Checkbox("Sales",false,cb);
		cb7.setBounds(410,30,100,20);
		cb7.setFont(new Font("Boulder",Font.PLAIN,20));
		cb7.addItemListener((ItemListener)this);
		cb8=new Checkbox("Sales Return",false,cb);
		cb8.setBounds(550,30,200,20);
		cb8.setFont(new Font("Boulder",Font.PLAIN,20));
		cb8.addItemListener((ItemListener) this);
		tbl1 = new JTable() {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
        return false;
			}
		};
		
		jsp1 = new JScrollPane(tbl1);
		jsp1.setBounds(10,140,780,150);
		dtm1 = new DefaultTableModel(0, 0);
		String header[] = {"SR No.", "Product", "Quantity", "Rate", "Total", "GST","Amount"};
		dtm1.setColumnIdentifiers(header);
		tbl1.setModel(dtm1);
		
		 
		tbl3 = new JTable() {
				public boolean editCellAt(int row, int column, java.util.EventObject e) {
            return false;
				}
		};
		jsp3 = new JScrollPane(tbl3);
		jsp3.setBounds(10,140,780,150);
		dtm3 = new DefaultTableModel(0, 0);
		String header2[] = {"Bill no.", "Bill Date", "Buyer/Seller", "Total"};
        dtm3.setColumnIdentifiers(header2);
		tbl3.setModel(dtm3);
		int t=0;
		Connection con = null;
		Statement st = null;
		dtm3.setNumRows(0);
		String query="Select invoice_no,date,seller,total from invoice";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			st = con.createStatement();
			st = con.createStatement();
			ResultSet rt=st.executeQuery(query);
			while(rt.next()) 
			{
				String ar[]=new String[4];
				ar[0]=rt.getString("invoice_no");
				ar[1]=rt.getString("date");
				ar[2]=rt.getString("seller");
				ar[3]=rt.getString("total");
				t+=Integer.parseInt(ar[3]);
				dtm3.addRow(ar);
			}
			tf23.setText(String.valueOf(t));
		}catch(Exception e){System.out.println(e);}
		tbl4 = new JTable() {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
			return false;
			}
		};
		
		
		tbl5 = new JTable() {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
			return false;
			}
		};
		jsp4 = new JScrollPane(tbl4);
		jsp4.setBounds(10,140,780,150);
		dtm4 = new DefaultTableModel(0, 0);
		String header3[] = { "Product Name","Total purchased", "Total sales", "Balance"};
		dtm4.setColumnIdentifiers(header3);
		tbl4.setModel(dtm4);
		
		jsp5 = new JScrollPane(tbl5);
		jsp5.setBounds(400,10,500,380);
		dtm5= new DefaultTableModel(0, 0);
		String header4[] = { "Product Code","Product Name", "Product Category", "Tax Slab","Price"};
		dtm5.setColumnIdentifiers(header4);
		tbl5.setModel(dtm5);
		
		 
		 add(p1);
		 p1.add(lb2);
		 lb2.add(b1);
		 lb2.add(b2);
		 lb2.add(b3);
		 lb2.add(b5);
		 add(p2);
		 p2.add(lb1);
		 add(l1);
		 add(p3);
		 p3.add(lb3);
		 add(p4);
		 p4.add(l3);
		 p4.add(l4);
		 p4.add(l5);
		 p4.add(l6);
		 p4.add(l8);
		 p4.add(l21);
		 p4.add(c1);
		 p4.add(c2);
		 p4.add(tf1);
		 p4.add(tf2);
		 p4.add(tf16);
		 p4.add(b6);
		 p4.add(b14);
		 p4.add(b15);
		 p4.add(b16);
		 p4.add(jsp5);
		 add(p5);
		 p5.add(cb1);
		 p5.add(cb2);
		 p5.add(cb3);
		 p5.add(cb4);
		 p5.add(l9);
		 p5.add(l10);
		 p5.add(l11);
		 p5.add(l12);
		 p5.add(l13);
		 p5.add(l14);
		 p5.add(tf4);
		 p5.add(tf5);
		 p5.add(tf6);
		 p5.add(tf7);
		 p5.add(tf8);
		 p5.add(tf9);
		 p5.add(b7);
		 p5.add(jsp1);
		 p5.add(l22);
		 p5.add(l23);
		 p5.add(l24);
		 p5.add(l29);
		 p5.add(tf17);
		 p5.add(tf18);
		 p5.add(tf19);
		 p5.add(tf24);
		 p5.add(b9);
		 p5.add(b11);
		 
		 
		 add(p7);
		 p7.add(cb5);
		 p7.add(cb6);
		 p7.add(cb7);
		 p7.add(cb8);
		 p7.add(jsp3);
		 p7.add(l28);
		 p7.add(tf23);
		 
		 add(p8);
		 p8.add(jsp4);
		 p8.add(b13);
		 p8.add(l15);
		 p8.add(tf10);
		 
		setSize(1400,800);
		setBackground(new Color(205, 187, 160));
		setLayout(null);
        setVisible(true);	
		p4.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			b1.setBackground(new Color(205, 187, 160));
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b5.setBackground(Color.WHITE);
			p4.setVisible(true);
			p5.setVisible(false);
			//p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(false);		
		}
		if(ae.getSource()==b2)
		{
			b2.setBackground(new Color(205, 187, 160));
			b1.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b5.setBackground(Color.WHITE);
			p4.setVisible(false);		
			p5.setVisible(false);
			//p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(true);
		}
		
		if(ae.getSource()==b3)
		{
			b3.setBackground(new Color(205, 187, 160));
			b2.setBackground(Color.WHITE);
			b1.setBackground(Color.WHITE);
			b5.setBackground(Color.WHITE);
			p4.setVisible(false);
			p5.setVisible(true);
			//p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(false);
		}
		
		if(ae.getSource()==b5)
		{
			b5.setBackground(new Color(205, 187, 160));
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b1.setBackground(Color.WHITE);
			//p6.setVisible(false);
			p4.setVisible(false);
			p5.setVisible(false);
			p7.setVisible(true);
			p8.setVisible(false);
		}
		
		if(ae.getSource()==b14)
		{
		
			System.out.println("Value Searched");
			String a=tf1.getText();
			Connection con = null;
			Statement st = null;
			try{
			String name="",category="",tax="",price="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			st = con.createStatement();
			String query = "SELECT Product_Name, Product_Category, Tax_Slab, Price FROM items WHERE Product_Code=" + a;
		    ResultSet rs = st.executeQuery(query);

		    if (rs.next()) {
		    	name = rs.getString("Product_Name");
		        category = rs.getString("Product_Category");
		        tax = rs.getString("Tax_Slab");
		        price=rs.getString("Price");
		    }
		    
			tf2.setText(name);
			c1.select(category);
			c2.select(tax);
			tf16.setText(price);
			b16.setEnabled(true);
			b15.setEnabled(true);
			b6.setEnabled(false);
			}catch(Exception e){System.out.println(e);}
			
		}
		
		
		
		if(ae.getSource()==b16)
		{
			int a=Integer.parseInt(tf1.getText());
			String name=tf2.getText();
			String category=c1.getSelectedItem();
			int tax=Integer.parseInt(c2.getSelectedItem());
			int price=Integer.parseInt(tf16.getText());
			
			
			Connection con = null;
			Statement st = null;
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			st = con.createStatement();
			String query="Update items set Product_Name='"+name+"',Product_Category='"+category+"',Tax_Slab="+tax+",Price="+price+" where Product_Code="+a+"";
			st.execute(query);
			System.out.println("Values Updated");	
			display();
			tf1.setText("");
			tf2.setText("");
			c1.select("------ Choose ------");
			c2.select("------ Choose ------");
			tf16.setText("");
			b16.setEnabled(false);
			b15.setEnabled(false);
			b6.setEnabled(true);
			}
			catch(Exception e){System.out.println(e);}
		}
		
		if(ae.getSource()==b15)
		{
			int a=Integer.parseInt(tf1.getText());
			
			
			Connection con = null;
			Statement st = null;
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			 st = con.createStatement();
			String query="delete from items where Product_Code="+a+"";
			st.executeUpdate(query);
			System.out.println("Values deleted");		
			display();
			tf1.setText("");
			tf2.setText("");
			c1.select("------ Choose ------");
			c2.select("------ Choose ------");
			tf16.setText("");
			b16.setEnabled(false);
			b15.setEnabled(false);
			b6.setEnabled(true);
			}
			catch(Exception e){System.out.println(e);}
			
		}
		
		if(ae.getSource()==b6) 
		{
			int a=Integer.parseInt(tf1.getText());
			String name=tf2.getText();
			String category=c1.getSelectedItem();
			int tax=Integer.parseInt(c2.getSelectedItem());
			int price=Integer.parseInt(tf16.getText());
			
			
			Connection con = null;
			Statement st = null;
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			 st = con.createStatement();
			String query="Insert into items(Product_Code,Product_Name,Product_Category,Tax_Slab,Price)values("+a+",'"+name+"','"+category+"',"+tax+","+price+")";
			st.executeUpdate(query);
			System.out.println("Values Inserted");
			display();
			}
			catch(Exception e){System.out.println(e);}
			
		}
		
		if(ae.getSource()==b9)
		{
			int a=Integer.parseInt(tf7.getText());
			Connection con = null;
			Statement st = null;
			ResultSet rs=null;
			
			try
			{
			String name="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			st = con.createStatement();
			String query = "SELECT Product_Name FROM items WHERE Product_Code=" + a;
		    rs=st.executeQuery(query);
		    
		    if (rs.next())
		    name = rs.getString("Product_Name");
		    
			tf8.setText(name);
			System.out.println("Values Inserted");
			}
			catch(Exception e){System.out.println(e);}
			
		}
		if(ae.getSource()==b7)
		{
			display2(tf9.getText(),tf7.getText());			
		}
		
		
		if (ae.getSource() == b13) {
			display3();
		}
		
		if(ae.getSource()==b11)
		{	
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			Statement st = con.createStatement();
			String invno=tf4.getText();
	        if(cb1.getState()) 
	        	invno="p"+invno;
	        
	        else if(cb2.getState())
	        	invno="pr"+invno;
	        	
	        else if(cb3.getState()) 
	        	invno="s"+invno;
	        	
	        else if(cb4.getState()) 
	        	invno="sr"+invno;
	        
	        st = con.createStatement();
	        String query1 = "insert into invoice(invoice_no,date,seller,total,discount,GST,amount) values('"+invno+"','"+ tf5.getText() +"', '"+ tf6.getText() +"', "+ tf17.getText() +", "+ tf18.getText() +", "+ tf19.getText() +", "+ tf24.getText() +")";
	        st.executeUpdate(query1);
	        
	        for(int i=0;i<dtm1.getRowCount();i++)
	        {
	        	ArrayList<Double>l=new ArrayList<>();
	        	String s=dtm1.getValueAt(i,1).toString();
	        	int k=s.indexOf("-");
	        	String str=s.substring(k+1,s.length());
	        	System.out.println(str);
	        	for(int j=2;j<dtm1.getColumnCount();j++)
	        	{
	        		Double a=Double.parseDouble(dtm1.getValueAt(i, j).toString());	
	        		l.add(a);
	        	}
	        	
	        	String query2="insert into invoice1(invoice_no,pid,quantity,rate,total,GST,Amount) values('"+invno+"',"+str+","+l.get(0)+","+l.get(1)+","+l.get(2)+","+l.get(3)+","+l.get(4)+")";
		        st.executeUpdate(query2);
	        }
	        dtm1.setNumRows(0);
			}catch(Exception e){System.out.println(e);}
		}
		
	}
	
	void display3()
	{
		Connection con = null;
		Statement st = null;
	    String productName = tf10.getText();
	    ArrayList<String>check=new ArrayList<>();
	    String query="Select Product_Name from items";
	    String purchasedQuery = "SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+productName+"') AND invoice_no LIKE 'p%' and invoice_no NOT LIKE 'pr%'";
	    String soldQuery = "SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+productName+"') AND invoice_no LIKE 's%' and invoice_no NOT LIKE 'sr%'";
	    String purchasereturn="SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+productName+"') AND invoice_no LIKE 'pr%'";
	    String soldreturn="SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+productName+"') AND invoice_no LIKE 'sr%'";
	    String ar[]=new String[4];
	  
	    dtm4.setNumRows(0);
	    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			st=con.createStatement();
			ResultSet sl=st.executeQuery(query);
			while(sl.next())
			{
				check.add(sl.getString(1));
			}
			
			if(tf10.getText().isEmpty())
			{
				for(int i=0;i<check.size();i++)
				{
					 purchasedQuery = "SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+check.get(i)+"') AND invoice_no LIKE 'p%' and invoice_no NOT LIKE 'pr%'";
				     soldQuery = "SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+check.get(i)+"') AND invoice_no LIKE 's%' and invoice_no NOT LIKE 'sr%'";
				     purchasereturn="SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+check.get(i)+"') AND invoice_no LIKE 'pr%'";
				     soldreturn="SELECT SUM(quantity) FROM invoice1 WHERE pid = (SELECT Product_Code FROM items WHERE Product_Name = '"+check.get(i)+"') AND invoice_no LIKE 'sr%'";
				     	st = con.createStatement();
						ResultSet rs=st.executeQuery(purchasedQuery);
						st = con.createStatement();
						ResultSet rt=st.executeQuery(soldQuery);
						st = con.createStatement();
						ResultSet sr=st.executeQuery(soldreturn);
						st = con.createStatement();
						ResultSet pr=st.executeQuery(purchasereturn);
						ar[0] = check.get(i);
				        if (rs.next()) 
				            ar[1] = String.valueOf(rs.getInt(1)); 
				        else 
				            ar[1] = "0";
				        
			
				        if (rt.next()) 
				            ar[2] = String.valueOf(rt.getInt(1)); 
				        else 
				            ar[2] = "0"; 
				        
				        if(pr.next())
				        	ar[1]=String.valueOf(Integer.valueOf(ar[1])-pr.getInt(1));
				        
				        if(sr.next())
				        	ar[2]=String.valueOf(Integer.valueOf(ar[2])-sr.getInt(1));
				        
				        ar[3]=String.valueOf(Integer.parseInt(ar[1])-Integer.parseInt(ar[2]));
				        
				        dtm4.addRow(ar);
					}	   
			}
			
			if(check.contains(productName)) 
			{
				st = con.createStatement();
				ResultSet rs=st.executeQuery(purchasedQuery);
				st = con.createStatement();
				ResultSet rt=st.executeQuery(soldQuery);
				st = con.createStatement();
				ResultSet sr=st.executeQuery(soldreturn);
				st = con.createStatement();
				ResultSet pr=st.executeQuery(purchasereturn);
				ar[0] = productName; 
		        if (rs.next()) 
		            ar[1] = String.valueOf(rs.getInt(1)); 
		        else 
		            ar[1] = "0";
		        
	
		        if (rt.next()) 
		            ar[2] = String.valueOf(rt.getInt(1)); 
		        else 
		            ar[2] = "0"; 
		        
		        if(pr.next())
		        	ar[1]=String.valueOf(Integer.valueOf(ar[1])-pr.getInt(1));
		        
		        if(sr.next())
		        	ar[2]=String.valueOf(Integer.valueOf(ar[2])-sr.getInt(1));
		        
		        ar[3]=String.valueOf(Integer.parseInt(ar[1])-Integer.parseInt(ar[2]));
		        
		        dtm4.addRow(ar);
			}	
	        
	    }catch(Exception e){System.out.println(e);}	   
	}
	
	void display()
	{
		Connection con = null;
		Statement st = null;
		String ar[]=new String[5];
	
		dtm5.setNumRows(0);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			st = con.createStatement();
			String query="Select * from items";
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				ar[0]=rs.getString("Product_Code");
				ar[1]=rs.getString("Product_Name");
				ar[2]=rs.getString("Product_Category");
				ar[3]=rs.getString("Tax_Slab");
				ar[4]=rs.getString("Price");
				
				dtm5.addRow(ar);
			}
		}catch(Exception e){System.out.println(e);}
	}
	
	void display2(String b,String a)
	{
		Connection con = null;
		Statement st = null;
		String ar[]=new String[7];
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","8888");
			st = con.createStatement();
			String query="Select Product_Name,Tax_Slab,Price from items where Product_Code="+a+"";
			ResultSet rs=st.executeQuery(query);
			while (rs.next()){
	            ar[0] = String.valueOf(i);
	            ar[1] = rs.getString("Product_Name");
	            ar[1]+="-"+String.valueOf(a);
	            ar[2] = b;

	            int price = Integer.parseInt(rs.getString("Price"));
	            int qty = Integer.parseInt(b);

	            ar[3] = String.valueOf(price);	
	            ar[4] = String.valueOf(price * qty); 
	            int taxSlab = Integer.parseInt(rs.getString("Tax_Slab"));
	            ar[5] = String.valueOf(taxSlab * (price * qty) / 100.0); 
	            ar[6] = String.valueOf(Double.parseDouble(ar[5]) + Double.parseDouble(ar[4])); 
	            dtm1.addRow(ar);
	            i++;
	            total+=Double.parseDouble(ar[4]);
	            tf17.setText(String.valueOf(total));
	            Double Discout=((10.0/100.0)*(total));
	            tf18.setText(String.valueOf(Discout));
	            gst+=Double.parseDouble(ar[6]);
	            tf19.setText(String.valueOf(gst));
	            amount+=Double.parseDouble(ar[5]);
	            tf24.setText(String.valueOf(amount));
	            String invno=tf4.getText();
	        }
		}catch(Exception e){System.out.println(e);}
	
	}
	
	
	public void itemStateChanged(ItemEvent ae) {
	    String query = "";
	   
	    if (cb5.getState()) {
	        query = "SELECT invoice_no, date, seller, total FROM invoice WHERE invoice_no LIKE 'p%' and invoice_no NOT LIKE 'pr%'";
	        System.out.println("Query set for cb1: " + query);
	    } else if (cb6.getState()) {
	        query = "SELECT invoice_no, date, seller, total FROM invoice WHERE invoice_no LIKE 'pr%'";
	        System.out.println("Query set for cb2: " + query);
	    } else if (cb7.getState()) {
	        query = "SELECT invoice_no, date, seller, total FROM invoice WHERE invoice_no LIKE 's%' and invoice_no NOT LIKE 'sr%'";
	        System.out.println("Query set for cb3: " + query);
	    } else if (cb8.getState()) {
	        query = "SELECT invoice_no, date, seller, total FROM invoice WHERE invoice_no LIKE 'sr%'";
	        System.out.println("Query set for cb4: " + query);
	    }

	   
	    if (query.isEmpty()) {
	        System.out.println("No checkbox is selected or no query is set.");
	        return;
	    }

	    
	    int total = 0;
	    Connection con = null;
	    Statement st = null;
	    dtm3.setNumRows(0);

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "8888");
	        st = con.createStatement();

	        ResultSet rt = st.executeQuery(query);
	        while (rt.next()) {
	            String[] row = new String[4];
	            row[0] = rt.getString("invoice_no");
	            row[1] = rt.getString("date");
	            row[2] = rt.getString("seller");
	            row[3] = rt.getString("total");
	            total += Integer.parseInt(row[3]);
	            dtm3.addRow(row);
	        }
	        tf23.setText(String.valueOf(total));
	    } catch (Exception e) {
	        System.out.println("Error: " + e);
	    } finally {
	        try {
	            if (st != null) st.close();
	            if (con != null) con.close();
	        } catch (Exception e) {
	            System.out.println("Error closing resources: " + e);
	        }
	    }
	}

	
	public static void main(String[] args)
	{
		new One();
	}
}
