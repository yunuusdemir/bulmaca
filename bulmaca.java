package bul;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;



public class bulmaca extends Frame {
	
	JLabel kontrolEt;
	JButton kontrolButon;
	JLabel l1,l2,l3,l4,l5,l6,dialogLabel,notLabel;
	private static JDialog d;
	
	public static String metin="";
	public static int randomSayi;
	public static int k,n;
	public static String[] cevaplar= {"SELAM�Y�EM�ZAMAE",
			"YUNUSANAEZ�MIRKA",
			"RECEP�MAEC�NAZAA",
			"MOT�FELA�AT�LAZL",
			"MAKETAT�AKAZ�ZAI",
			"KAT�POBAAYERULAA",
			"PRENSALT��EKAB�E",
			"BUG�N�K�ANENAD�E",
			"FAT�HUD�AA�LRETI",
			"KADINOLEECAYARI�", };

			public static String[] sorular= {"1)Merhaba'n�n E� anlaml�s� nedir?(1-5)","2)K�t�'n�n z�t anlam� nedir?(6-8)",
		    		"3)Y�z-�ehre-Surat e� anlaml�s� ?(1-13)","4)Farsca�da tat, �e�ni, tad�lacak �ey?(5-16)",
		    		"5)yerde b�rak�lan belirti ?(11-12)","6)lakin-fakat e� anlaml�s� ?(13-15)",
		    		"1)Memeli Balina (..... Bal���)?(1-5)","2)�ocu�u olan kad�n,anne?(6-8)",
		    		"3)yazma i�i?(1-13)","4)g�ky�z� e� anlaml�s� ?(5-16)",
		    		"5)i�aret- e� anlaml�s� ?(11-12)","6)soy-e� anlaml�s� ?(13-15)",
		    		"1)T.C Cumhurba�kan�'n�n ad� nedir?(1-5)","2)�st� kapal� bir bi�imde belirtme ?(6-8)",
		    		"3)te�ekk�r'�n kar��l���?(1-13)","4)Telli �alg�lar� �almaya yarayan �alg� arac�?(5-16)",
		    		"5)Eski Dilde ma�ara?(11-12)","6)eski dilde �ye ?(13-15)",
		    		"1)bir yap�tta s�k s�k yinelenen s�sleyici ��e?(1-5)","2)Bir G�z Rengi?(6-8)",
		    		"3)anlam, kavram e� anlaml�s� ?(1-13)","4)i�, eylem e� anlaml�s�?(5-16)",
		    		"5)Boru Sesi?(11-12)","6) Karadeniz halk�'n�n soyu ?(13-15)",
		    		"1)nesnenin taslak olarak yap�lm�� k���k �rne�i?(1-5)","2)Eski dilde gelecek?(6-8)",
		    		"3)Akdeniz B�lgesinin �klimi ?(1-13)","4)�ok h�zl� ko�an k�pek t�r�?(5-16)",
		    		"5)Yetersiz olan ?(11-12)","6)Eski dilde �ye ?(13-15)",
		    		"1)�cret kar��l���nda mektup,dilek�e yazan ki�i?(1-5)","2)b�y�k ve uzun, b�lmeli g��ebe �ad�r�?(6-8)",
		    		"3)A��k-sulu z�t anlaml�s� ?(1-13)","4)�lke i�inde �deme olarak kullan�lan ka��t?(5-16)",
		    		"5)erkek  ?(11-12)","6)Mu�la'n�n bir il�esi ?(13-15)",
		    		"1)Kral'�n O�lu?(1-5)","2)�st'�n z�t anlaml�s�?(6-8)",
		    		"3)general r�tbesindekilere halk�n verdi�i �an ?(1-13)","4)Ayd�n'�n bir il�esi?(5-16)",
		    		"5)�lave nin e� anlaml�s� ?(11-12)","6)B�y�k Karde�?(13-15)",
		    		"1)i�inde bulundu�umuz g�n?(1-5)","2)birden sonra gelen say�n�n ad�?(6-8)",
		    		"3)B�y�k katl� yap� ?(1-13)","4)esans� ��kar�lan, �t�rl�, k���k, otsu bir bitki?(5-16)",
		    		"5)geni� e� anlaml�s� ?(11-12)","6)baya��, a�a��l�k, de�ersiz, niteliksiz, k�t� ?(13-15)",
		    		"1)yengi kazanan, yenen (kimse)?(1-5)","2)UT �alan kimse?(6-8)",
		    		"3)�r�n tan�tmak amac�yla a��lan b�y�k pazar ?(1-13)","4)Yere Serilen nak��l� kal�n e�ya?(5-16)",
		    		"5)�ehir-vilayet e� anlaml�s� ?(11-12)","6)bir �eyi geri �evirme, kabul etmeme ?(13-15)",
		    		"1)eri�kin di�i insan?(1-5)","2)�spanyolcada ya�a! anlam�nda y�reklendirme s�z�?(6-8)",
		    		"3)bir kad�n�n evli bulundu�u erkek, e� ?(1-13)","4)hangisi, hangisini ?(5-16)",
		    		"5)D�nya'n�n uydusu?(11-12)","6)kirli olmayan, temiz.saf'�n e� anlaml�s� ?(13-15)"};


	public bulmaca() {
		
		Random r=new Random();
		 randomSayi=1+r.nextInt(10);
		 JFrame ekran= new JFrame();
		    JPanel panel=new JPanel();
		    
		    
		    JButton b1;
		    JButton bdegistir;
		    Image icon = Toolkit.getDefaultToolkit().getImage("indir.jpg");    
		    
		   ekran.setIconImage(icon);    
		   ekran.setLayout(null);     
		   ekran.setSize(400,400);     
		    ekran.setVisible(true); 
		    
		   
		    
		   
		
		    
		    
		    switch(randomSayi)
    		{
    		case 1:
    			
    			l1 = new  JLabel ( sorular[0] );
    			l1.setBounds ( 70 , 190 ,  350 , 30 );
    			l2 = new  JLabel ( sorular[1] );  
    		    l2.setBounds ( 70 , 210,  350 , 30 );  
    		    l3 = new  JLabel ( sorular[2] );  
    		    l3.setBounds ( 70 , 230 ,  350 , 30 );  
    		    l4 = new  JLabel ( sorular[3] );  
    		    l4.setBounds ( 70 , 250 ,  350 , 30 ); 
    		    l5 = new  JLabel ( sorular[4]);  
    		    l5.setBounds ( 70 , 270 ,  350 , 30 ); 
    		    l6 = new  JLabel ( sorular[5] );  
    		    l6.setBounds ( 70 , 290 ,  350 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			
    			break;
    		
    		case 2:
    			l1 = new  JLabel ( sorular[6] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[7] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[8] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[9] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[10]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[11] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    			
    		case 3: 
    			l1 = new  JLabel ( sorular[12] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[13] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[14] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[15] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[16]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[17] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    		
    		case 4:
    			l1 = new  JLabel ( sorular[18] );
    			l1.setBounds ( 70 , 190 ,  400 , 30 );
    			l2 = new  JLabel ( sorular[19] );  
    		    l2.setBounds ( 70 , 210,  400 , 30 );  
    		    l3 = new  JLabel ( sorular[20] );  
    		    l3.setBounds ( 70 , 230 ,  400 , 30 );  
    		    l4 = new  JLabel ( sorular[21] );  
    		    l4.setBounds ( 70 , 250 ,  400 , 30 ); 
    		    l5 = new  JLabel ( sorular[22]);  
    		    l5.setBounds ( 70 , 270 ,  400 , 30 ); 
    		    l6 = new  JLabel ( sorular[23] );  
    		    l6.setBounds ( 70 , 290 ,  400 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    			
    		case 5:
    			l1 = new  JLabel ( sorular[24] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[25] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[26] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[27] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[28]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[29] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    		
    		case 6:
    			l1 = new  JLabel ( sorular[30] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[31] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[32] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[33] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[34]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[35] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    			
    		case 7: 
    			l1 = new  JLabel ( sorular[36] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[37] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[38] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[39] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[40]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[41] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    		
    		case 8:
    			l1 = new  JLabel ( sorular[42] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[43] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[44] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[45] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[46]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[47] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    		
    		case 9:
    			l1 = new  JLabel ( sorular[48] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[49] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[50] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[51] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[52]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[53] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    		
    		case 10:
    			l1 = new  JLabel ( sorular[54] );
    			l1.setBounds ( 70 , 190 ,  300 , 30 );
    			l2 = new  JLabel ( sorular[55] );  
    		    l2.setBounds ( 70 , 210,  300 , 30 );  
    		    l3 = new  JLabel ( sorular[56] );  
    		    l3.setBounds ( 70 , 230 ,  300 , 30 );  
    		    l4 = new  JLabel ( sorular[57] );  
    		    l4.setBounds ( 70 , 250 ,  300 , 30 ); 
    		    l5 = new  JLabel ( sorular[58]);  
    		    l5.setBounds ( 70 , 270 ,  300 , 30 ); 
    		    l6 = new  JLabel ( sorular[59] );  
    		    l6.setBounds ( 70 , 290 ,  300 , 30 );
				ekran.getContentPane().add(l1);   ekran.getContentPane().add(l2);
				ekran.getContentPane().add(l3);    ekran.getContentPane().add(l4);
				ekran.getContentPane().add(l5);    ekran.getContentPane().add(l6);
    			break;
    		
    			default:
    				
    			
    		}
		    notLabel=new JLabel("NOT: B�Y�K HARF KULLANIN.");
		    notLabel.setBounds(70, 310, 300, 30);
		    ekran.getContentPane().add(notLabel);
		    notLabel.setForeground(Color.RED);
		    Font font = new Font("Courier", Font.BOLD,12);
		    notLabel.setFont(font);
		    
		    d = new JDialog(ekran , "Kontrol Ekran�", true);
		    d.setLayout(null);
		    d.setSize(400,300);
		    d.setVisible(false);
		    
		    JTextField ax,bx,cx,dx;
		    ax=new JTextField("X");
		    ax.setBounds(210,60, 40,40);
		    bx=new JTextField("X");  
		    bx.setBounds(130,100, 40,40);
		    cx=new JTextField("X");  
		    cx.setBounds(170,100, 40,40); 
		    dx=new JTextField("X");  
		    dx.setBounds(210,140, 40,40); 
		    JTextField t[] = new JTextField[]
		    	    {
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	new JTextField(),
		    	    	
		    	    };
		    
		    
		    
		    t[1]=new JTextField("1");  
		    t[1].setBounds(90,20, 40,40);  
		    
		    
		    t[1].setToolTipText("as");
		    
		    
		    t[2]=new JTextField("2");  
		    t[2].setBounds(130,20, 40,40);
		    t[3]=new JTextField("3");  
		    t[3].setBounds(170,20, 40,40);  
		    t[4]=new JTextField("4");  
		    t[4].setBounds(210,20, 40,40);  
		    t[5]=new JTextField("5");  
		    t[5].setBounds(250,20, 40,40);  
		    t[6]=new JTextField("6");  
		    t[6].setBounds(90,60, 40,40);  
		    t[7]=new JTextField("7");  
		    t[7].setBounds(130,60, 40,40);  
		    t[8]=new JTextField("8");  
		    t[8].setBounds(170,60, 40,40);  	 
		    t[9]=new JTextField("9");  
		    t[9].setBounds(250,60, 40,40);  
		    t[10]=new JTextField("10");  
		    t[10].setBounds(90,100, 40,40);   
		    t[11]=new JTextField("11");  
		    t[11].setBounds(210,100, 40,40);  
		    t[12]=new JTextField("12");  
		    t[12].setBounds(250,100, 40,40);  
		    t[13]=new JTextField("13");  
		    t[13].setBounds(90,140, 40,40);  
		    t[14]=new JTextField("14");  
		    t[14].setBounds(130,140, 40,40);  
		    t[15]=new JTextField("15");  
		    t[15].setBounds(170,140, 40,40);  
		    t[16]=new JTextField("16");  
		    t[16].setBounds(250,140, 40,40);
		    
		    ax.setEnabled(false);
		    bx.setEnabled(false);
		    cx.setEnabled(false);
		    dx.setEnabled(false);
		    
		    
		    b1= new JButton("Cevaplar� G�ster");
		    b1.setBounds(5,350, 150,30);
		    kontrolButon= new JButton("Kontrol Et");
		    kontrolButon.setBounds(160,350,150,30);
		    
		    dialogLabel= new JLabel(" ");
		    dialogLabel.setBounds(50, 50, 300, 30);
		    
		    bdegistir= new JButton("Degistir");
		    bdegistir.setBounds(315,350, 150,30);
		    	ekran.getContentPane().add(bdegistir);
		    
		    kontrolEt = new  JLabel ("");
			kontrolEt.setBounds ( 100 , 400 ,  300 , 30 );
		    kontrolEt.setVisible(true);
		    
		    
		    
		    ekran.getContentPane().add(t[1]); ekran.getContentPane().add(t[2]);  
		    ekran.getContentPane().add(t[3]); ekran.getContentPane().add(t[4]); 
		    ekran.getContentPane().add(t[5]); ekran.getContentPane().add(t[6]); 
		    ekran.getContentPane().add(t[7]); ekran.getContentPane().add(t[8]); 
		    ekran.getContentPane().add(ax); ekran.getContentPane().add(t[9]); 
		    ekran.getContentPane().add(t[10]); ekran.getContentPane().add(bx); 
		    ekran.getContentPane().add(cx); ekran.getContentPane().add(t[11]); 
		    ekran.getContentPane().add(t[12]); ekran.getContentPane().add(t[13]); 
		    ekran.getContentPane().add(t[14]); ekran.getContentPane().add(t[15]); 
		    ekran.getContentPane().add(dx); ekran.getContentPane().add(t[16]);
		    ekran.getContentPane().add(b1);    ekran.getContentPane().add(kontrolEt);
		   ekran.getContentPane().add(kontrolButon);
		    d.getContentPane().add(dialogLabel);
		    
		    
		    panel.setBackground(Color.WHITE);
		    ekran.getContentPane().add(panel);
		    
		    
		    b1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    	    
		    		switch(randomSayi)
		    		{
		    		case 1:
		    			kontrolEt.setText(cevaplar[0]);
		    			break;
		    		
		    		case 2:
		    			kontrolEt.setText(cevaplar[1]);
		    			break;
		    			
		    		case 3: 
		    			kontrolEt.setText(cevaplar[2]);
		    			break;
		    		
		    		case 4:
		    			kontrolEt.setText(cevaplar[3]);
		    			break;
		    			
		    		case 5:
		    			kontrolEt.setText(cevaplar[4]);
		    			break;
		    		
		    		case 6:
		    			kontrolEt.setText(cevaplar[5]);
		    			break;
		    			
		    		case 7: 
		    			kontrolEt.setText(cevaplar[6]);
		    			break;
		    		
		    		case 8:
		    			kontrolEt.setText(cevaplar[7]);
		    			break;
		    		
		    		case 9:
		    			kontrolEt.setText(cevaplar[8]);
		    			break;
		    		
		    		case 10:
		    			kontrolEt.setText(cevaplar[9]);
		    			break;
		    		
		    			default:
		    				
		    			
		    		}
		    		
		    		
		    		
		    			
		    	}
		    	    });  
		    
		    bdegistir.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		
		    		ekran.dispose();
		    		new bulmaca();
		    	}
		    	
		    });
		    
		    kontrolButon.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){
		    		for(int deger=1;deger<=16;deger++)
				    {
				    	metin=metin+t[deger].getText();
				    }
		    		switch(randomSayi)
		    		{
		    		case 1:
		    			if(metin.equals(cevaplar[0]))
		    			{
		    			kontrolEt.setText("Kazand�n�z... !!!");
		    			
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 2:
		    			if(metin.equals(cevaplar[1]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    			
		    		case 3: 
		    			if(metin.equals(cevaplar[2]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 4:
		    			if(metin.equals(cevaplar[3]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    			
		    		case 5:
		    			if(metin.equals(cevaplar[4]))
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 6:
		    			if(metin.equals(cevaplar[5]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    			
		    		case 7: 
		    			if(metin.equals(cevaplar[6]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    		case 8:
		    			if(metin.equals(cevaplar[7]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 9:
		    			if(metin.equals(cevaplar[8]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			
		    			break;
		    		
		    		case 10:
		    			if(metin.equals(cevaplar[9]))
		    			{
		    				kontrolEt.setText("Kazand�n�z... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bak�n�z..B�Y�K HARF'E D�KKAT ET");
		    				
		    			}
		    			break;
		    		
		    			default:
		    				
		    				
		    		}
		    		
		    	}
    	    });
		    
		    
		    	
		    
		    
		    
		    ekran.setTitle("Bulmaca ��z");
		    ekran.setSize(new Dimension(500,480));
		    ekran.setLocationRelativeTo(null);
		    ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    ekran.setResizable(false);
		    ekran.setVisible(true);
	    
		
		  
	  
	
	}
		
	



	public static void main(String[] args) {
		
		   new bulmaca();
		    
		    
		}

}
































