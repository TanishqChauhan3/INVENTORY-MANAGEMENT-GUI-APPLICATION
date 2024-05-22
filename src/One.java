import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class One extends Frame implements ActionListener
{
	Panel p1,p2,p3,p4,p5,p6,p7,p8;
	Button b1,b2,b3,b4,b5,b6,b7,b8, b9,b10,b11,b12,b13;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25;
	Choice c1,c2;
	Checkbox cb1, cb2,cb3,cb4,cb5,cb6,cb7,cb8;
	JTable tbl1,tbl2,tbl3,tbl4;
	JScrollPane jsp1,jsp2,jsp3,jsp4;
	DefaultTableModel dtm1,dtm2,dtm3,dtm4;
	int count=0,i=0,j=0,k=0,l=0,m=0,n=0;
	String pn,bno="",bdate="",name="",pname="";
	Double rt1=0d,q=0d,bal=0d,total,qnt,rt=0d,tlt,gst,amt,amt1,sum=0d,sum1=0d,sum2=0d,sum3=0d,dis=0d,dis1=0d,amtpd,amtpd1,gst1=0d,gst2=0d,comp=0d,comp1=0d,g=0d,g1=0d;
	String ar[][]=new String[100][6];
	String ar1[][]=new String[100][6];
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
		p3.setBackground(new Color(220, 220, 220));
	    p4=new Panel(null);
		p4.setBounds(250,160,800,520);
		p4.setBackground(new Color(220, 220, 220));
		p4.setVisible(false);
		p5=new Panel(null);
		p5.setBounds(250,160,800,520);
		p5.setBackground(new Color(220, 220, 220));
		p5.setVisible(false);
		/*p6=new Panel(null);
		p6.setBounds(250,160,800,520);
		p6.setBackground(new Color(153,255,204));
		p6.setVisible(false);*/
		p7=new Panel(null);
		p7.setBounds(250,160,800,720);
		p7.setBackground(new Color(220, 220, 220));
		p7.setVisible(false);
		p8=new Panel(null);
		p8.setBounds(250,160,800,520);
		p8.setBackground(new Color(220, 220, 220));
		p8.setVisible(false);
		
		l1=new Label("SynTech");
		l1.setFont(new Font("Arial",Font.BOLD,50));
		l1.setBounds(220,30,250,50);
		l1.setForeground(new Color(220, 220, 220));
		l2=new Label("ORDER MENU");
		l2.setFont(new Font("Boulder",Font.BOLD,40));
		l2.setBounds(255,90,500,40);
	
		l3=new Label("Item Form");
		l3.setFont(new Font("Arial",Font.BOLD,30));
		l3.setBounds(300,20,300,40);
		l4=new Label("Product Code");
		l4.setFont(new Font("Arial",Font.BOLD,30));
		l4.setBounds(20,80,200,30);
		l5=new Label("Product Name");
		l5.setFont(new Font("Arial",Font.BOLD,30));
		l5.setBounds(20,140,210,30);
		l6=new Label("Product Category");
		l6.setFont(new Font("Arial",Font.BOLD,30));
		l6.setBounds(20,200,300,30);
		
		l8=new Label("TAX SLAB");
		l8.setFont(new Font("Arial",Font.BOLD,30));
		l8.setBounds(20,320,200,30);
		l21=new Label("Price");
		l21.setFont(new Font("Arial",Font.BOLD,30));
		l21.setBounds(20,370,200,30);
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
			
		b1=new Button("Add Items");
		b1.setFont(new Font("Arial",Font.PLAIN,30));
		b1.setBounds(20,30,150,100);
		b1.addActionListener(this);
		
		b2=new Button("Stock Summary");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBounds(20,190,150,100);
		b2.addActionListener(this);
		
		b3=new Button("Purchase/Return");
		b3.setFont(new Font("Arial",Font.BOLD,18));
		b3.setBounds(20,340,150,100);
		b3.addActionListener(this);
		
		b5=new Button("Reports");
		b5.setFont(new Font("Arial",Font.PLAIN,30));
		b5.setBounds(20,470,150,100);
		b5.addActionListener(this);
		b6=new Button("ADD");
		b6.setFont(new Font("Arial",Font.BOLD,30));
		b6.setBounds(70,450,100,40);
		b6.addActionListener(this);
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
		b10=new Button("Search");
		/*b10.setFont(new Font("Arial",Font.PLAIN,20));
		b10.setBounds(170,110,70,20);
		b10.addActionListener(this);*/
		b11=new Button("Generate Invoice");
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
		c1.setFont(new Font("Arial",Font.PLAIN,20));
		c1.setBounds(330,200,150,30);
		c1.add("Electronics");
		c1.add("Generals");
		c1.add("Food");
		c1.add("Books");
		c1.add("woods");
		
		c2=new Choice();
		c2.setFont(new Font("Arial",Font.PLAIN,20));
		c2.setBounds(230,320,100,20);
		c2.add("0");
		c2.add("5");
		c2.add("12");
		c2.add("18");
		c2.add("28");
		
		tf1=new TextField();
		tf1.setBounds(240,80,300,30);
		tf2=new TextField();
		tf2.setBounds(240,140,300,30);
		
		tf16=new TextField();
		tf16.setBounds(230,370,200,30);
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
		cb2=new Checkbox("Purchased Return",false,cb);
		cb2.setBounds(280,30,200,40);
		cb2.setFont(new Font("Boulder",Font.BOLD,20));
		cb3=new Checkbox("Sales",false,cb);
		cb3.setBounds(490,30,100,40);
		cb3.setFont(new Font("Boulder",Font.BOLD,20));
		cb4=new Checkbox("Sales Return",false,cb);
		cb4.setBounds(600,30,200,40);
		cb4.setFont(new Font("Boulder",Font.BOLD,20));
		cb5=new Checkbox("Purchased",false,cb);
		cb5.setBounds(30,30,150,20);
		cb5.setFont(new Font("Boulder",Font.PLAIN,20));
		cb6=new Checkbox("Purchased Return",false,cb);
		cb6.setBounds(190,30,200,20);
		cb6.setFont(new Font("Boulder",Font.PLAIN,20));
		cb7=new Checkbox("Sales",false,cb);
		cb7.setBounds(410,30,100,20);
		cb7.setFont(new Font("Boulder",Font.PLAIN,20));
		cb8=new Checkbox("Sales Return",false,cb);
		cb8.setBounds(550,30,200,20);
		cb8.setFont(new Font("Boulder",Font.PLAIN,20));
		
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
		
		tbl4 = new JTable() {
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
		
		 add(p1);
		 p1.add(b1);
		 p1.add(b2);
		 p1.add(b3);
		 p1.add(b5);
		 add(p2);
		 add(l1);
		 add(p3);
		 p3.add(l2);
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
		setLayout(null);
        setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			p4.setVisible(true);
			p5.setVisible(false);
			//p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(false);		
		}
		if(ae.getSource()==b2)
		{
			p4.setVisible(false);		
			p5.setVisible(false);
			//p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(true);
		}
		
		if(ae.getSource()==b3)
		{
			p4.setVisible(false);
			p5.setVisible(true);
			//p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(false);
		}
		
		if(ae.getSource()==b5)
		{
			//p6.setVisible(false);
			p4.setVisible(false);
			p5.setVisible(false);
			p7.setVisible(true);
			p8.setVisible(false);
		}
	}
		
	public static void main(String[] args)
	{
		new One();
	}
}
