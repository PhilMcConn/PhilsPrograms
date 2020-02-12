import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


class CodingBat extends JFrame implements ActionListener
{
	public boolean cigarParty(int cigars, boolean isWeekend) {
	if(cigars>=40&&cigars<=60&&!isWeekend){
	return true;
	}
	if(cigars>=40&&isWeekend){
	return true;
	}

	return false;
	}
	
	public int[] plusTwo(int[] a, int[] b) {
    int[]sum={a[0],a[1],b[0],b[1]};
    return sum;
	}
	
	public String combos(String a, String b) {
	if(a.length()<b.length()){
	return a+b+a;
	}
	if(a.length()>b.length()){}
	return b+a+b;

	}

	
	JPanel party = new JPanel();
	JPanel plus2 = new JPanel();
	JPanel combos = new JPanel();

	
	JLabel pTitle = new JLabel("Cigar Party");
	JLabel pCigars = new JLabel("Number of Cigars");
	JLabel pWeekend = new JLabel("Party Like The Weekend?");
	JLabel twoTitle = new JLabel("Plus Two Arrays");
	JLabel twoA0L = new JLabel("A0");
	JLabel twoA1L = new JLabel("A1");
	JLabel twoB0L = new JLabel("B0");
	JLabel twoB1L = new JLabel("B1");
	JLabel twoSumL = new JLabel("New Array");
	JLabel combosTitle = new JLabel("comboString");
	JLabel combos1stL = new JLabel("First String");
	JLabel combos2ndL = new JLabel("Second String");
	JLabel combosSumL = new JLabel("Both Strings Together");
	Font customFont = new Font("Serif", Font.ITALIC, 12 );
	Color colorRed = new Color( 255, 0, 0 ) ;
	Color colorBlue = new Color(0,0,255);
	JTextField pCigarCount = new JTextField( 5 );
	JTextField pResults = new JTextField( 25 );
	JTextField twoA0 = new JTextField(5);
	JTextField twoA1 = new JTextField(5);
	JTextField twoB0 = new JTextField(5);
	JTextField twoB1 = new JTextField(5);
	JTextField twoC0 = new JTextField(5);
	JTextField twoC1 = new JTextField(5);
	JTextField twoC2 = new JTextField(5);
	JTextField twoC3 = new JTextField(5);
	JTextField combos1st = new JTextField(15);
	JTextField combos2nd = new JTextField(15);
	JTextField combosSum = new JTextField(15);
	
	
	JCheckBox pIsWeekend = new JCheckBox();
	
	JButton pGo = new JButton("GO!");
	JButton twoGo = new JButton("GO!");
	JButton twoNo = new JButton("NO!");
	JButton comboGo = new JButton("Copy the front to back");
	JMenuItem cb1, cb2, cb3;
	JMenu Skillz;
	JMenuBar CodingBAMenu;
	
	JPanel partyGrid = new JPanel(new GridLayout(2,2));
	JPanel plus2Grid = new JPanel(new GridLayout(2,2));
	JPanel plus2GridSouth = new JPanel(new GridLayout(1,4));
	JPanel combosGrid = new JPanel(new GridLayout(1,3));
	
	public CodingBat ()
	{
	super("CodingBat App");
	setSize( 350,225 );
	setDefaultCloseOperation( EXIT_ON_CLOSE );
	
	party.add("North",pTitle);
	//combosTitle.setFont( customFont ) ;

	CodingBAMenu = new JMenuBar();
	Skillz = new JMenu("Its Over All");
	cb1 = new JMenuItem("Smoking With squierls");
	cb2 = new JMenuItem("page 44");
	cb3 = new JMenuItem("Get to the Chopper");
	
	pGo.addActionListener(this);
	twoGo.addActionListener(this);
	comboGo.addActionListener(this);
	
	partyGrid.add("Center",pCigars);
	partyGrid.add("Center",pWeekend);
	partyGrid.add("Center",pCigarCount);
	partyGrid.add("Center",pIsWeekend);
	party.add(partyGrid);
	party.add("South",pGo);
	party.add(pResults);
	
	
	plus2.add("Center",twoTitle);
	plus2.add("West",twoA0L);
	plus2.add(twoA0);
	plus2.add("West",twoA1L);
	plus2.add(twoA1);
	plus2.add("East",twoB0L);
	plus2.add(twoB0);
	plus2.add("East",twoB1L);
	plus2.add(twoB1);
	plus2.add("South",twoSumL);
	plus2.add( twoC0);
	plus2.add( twoC1);
	plus2.add( twoC2);
	plus2.add( twoC3);
	//plus2.add("Center", plus2Grid);
	plus2.add("West",twoGo);
	//plus2.add("East",twoNo);
	
	
	
	
	//plus2.add("South",plus2GridSouth);
	
	combos.add(combosTitle);
	combos.add(combos1stL);
	combos.add(combos2ndL);
	combos.add(combosSumL);
	combosGrid.add(combos1st);
	combosGrid.add(combos2nd);
	combosGrid.add(combosSum);
	combos.add(comboGo);
	combos.add(combosGrid);
	
	
	cb1.addActionListener(this);
	cb2.addActionListener(this);
	cb3.addActionListener(this);
	
	Skillz.add(cb1);
	Skillz.add(cb2);
	Skillz.add(cb3);
	

	CodingBAMenu.add(Skillz);
	setJMenuBar(CodingBAMenu);
	setLayout(new BorderLayout());
	add("Center",party);
	setVisible(true);
	
	}
	public static void main (String [] args)
	{
		CodingBat gui = new CodingBat();
		
	}
	public void cigarAction()
	{
		int CountOfCigars = Integer.valueOf(pCigarCount.getText());
		boolean weekend = pIsWeekend.isSelected();
		pIsWeekend.isSelected();
		String output = "";
		if(cigarParty(CountOfCigars, weekend))
			output="party like its 1999";
		else
			output="this part is so 1999";
		
		pResults.setText(output);
		
	}	
		public void plus2Action(){
		
		int[] firstArray = new int[]{Integer.valueOf(twoA0.getText()),Integer.valueOf(twoA1.getText())};
		int[] nextArray = new int[]{Integer.valueOf(twoB0.getText()),Integer.valueOf(twoB1.getText())};
		
		int[] output =  plusTwo(firstArray, nextArray);
		
		twoC0.setText(String.valueOf(output[0]));
		twoC1.setText(String.valueOf(output[1]));
		twoC2.setText(String.valueOf(output[2]));
		twoC3.setText(String.valueOf(output[3]));
		}
		public void combosAction()
		{
			String firstString = combos1st.getText();
			String secondString = combos2nd.getText();
			String output = combos(firstString,secondString);
		
			combosSum.setText(output);
			combosSum.setFont( customFont ) ;
			
		
		}
			
	
		public void actionPerformed(ActionEvent event)
		{	if(event.getSource()== pGo)
			cigarAction();
			if(event.getSource()== twoGo)
			plus2Action();
			if(event.getSource()== comboGo)
			combosAction();
		
			if(event.getSource()== cb1)
			smokePressed();
			if(event.getSource()== cb2)
			plus2Pressed();
			if(event.getSource()== cb3)
			combosPressed();

				
		}
		public void smokePressed(){
		add("Center",party);
		party.setVisible(true);
		plus2.setVisible(false);
		combos.setVisible(false);
	}
	
		public void plus2Pressed(){
		add("Center",plus2);
		party.setVisible(false);
		plus2.setVisible(true);
		combos.setVisible(false);		
	}
	
		public void combosPressed(){
		add("Center",combos);
		party.setVisible(false);
		plus2.setVisible(false);
		combos.setVisible(true);
	}

		
			
	}




	