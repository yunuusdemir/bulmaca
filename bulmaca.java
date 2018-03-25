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
	public static String[] cevaplar= {"SELAMÝYÝEMÝZAMAE",
			"YUNUSANAEZÝMIRKA",
			"RECEPÝMAECÝNAZAA",
			"MOTÝFELAÝATÝLAZL",
			"MAKETATÝAKAZÝZAI",
			"KATÝPOBAAYERULAA",
			"PRENSALTÖÞEKABÝE",
			"BUGÜNÝKÝANENADÝE",
			"FATÝHUDÝAAÝLRETI",
			"KADINOLEECAYARIÝ", };

			public static String[] sorular= {"1)Merhaba'nýn Eþ anlamlýsý nedir?(1-5)","2)Kötü'nün zýt anlamý nedir?(6-8)",
		    		"3)Yüz-Çehre-Surat eþ anlamlýsý ?(1-13)","4)Farsca’da tat, çeþni, tadýlacak þey?(5-16)",
		    		"5)yerde býrakýlan belirti ?(11-12)","6)lakin-fakat eþ anlamlýsý ?(13-15)",
		    		"1)Memeli Balina (..... Balýðý)?(1-5)","2)Çocuðu olan kadýn,anne?(6-8)",
		    		"3)yazma iþi?(1-13)","4)gökyüzü eþ anlamlýsý ?(5-16)",
		    		"5)iþaret- eþ anlamlýsý ?(11-12)","6)soy-eþ anlamlýsý ?(13-15)",
		    		"1)T.C Cumhurbaþkaný'nýn adý nedir?(1-5)","2)üstü kapalý bir biçimde belirtme ?(6-8)",
		    		"3)teþekkür'ün karþýlýðý?(1-13)","4)Telli çalgýlarý çalmaya yarayan çalgý aracý?(5-16)",
		    		"5)Eski Dilde maðara?(11-12)","6)eski dilde üye ?(13-15)",
		    		"1)bir yapýtta sýk sýk yinelenen süsleyici öðe?(1-5)","2)Bir Göz Rengi?(6-8)",
		    		"3)anlam, kavram eþ anlamlýsý ?(1-13)","4)iþ, eylem eþ anlamlýsý?(5-16)",
		    		"5)Boru Sesi?(11-12)","6) Karadeniz halký'nýn soyu ?(13-15)",
		    		"1)nesnenin taslak olarak yapýlmýþ küçük örneði?(1-5)","2)Eski dilde gelecek?(6-8)",
		    		"3)Akdeniz Bölgesinin Ýklimi ?(1-13)","4)çok hýzlý koþan köpek türü?(5-16)",
		    		"5)Yetersiz olan ?(11-12)","6)Eski dilde üye ?(13-15)",
		    		"1)ücret karþýlýðýnda mektup,dilekçe yazan kiþi?(1-5)","2)büyük ve uzun, bölmeli göçebe çadýrý?(6-8)",
		    		"3)Açýk-sulu zýt anlamlýsý ?(1-13)","4)ülke içinde ödeme olarak kullanýlan kaðýt?(5-16)",
		    		"5)erkek  ?(11-12)","6)Muðla'nýn bir ilçesi ?(13-15)",
		    		"1)Kral'ýn Oðlu?(1-5)","2)Üst'ün zýt anlamlýsý?(6-8)",
		    		"3)general rütbesindekilere halkýn verdiði þan ?(1-13)","4)Aydýn'ýn bir ilçesi?(5-16)",
		    		"5)Ýlave nin eþ anlamlýsý ?(11-12)","6)Büyük Kardeþ?(13-15)",
		    		"1)içinde bulunduðumuz gün?(1-5)","2)birden sonra gelen sayýnýn adý?(6-8)",
		    		"3)Büyük katlý yapý ?(1-13)","4)esansý çýkarýlan, ýtýrlý, küçük, otsu bir bitki?(5-16)",
		    		"5)geniþ eþ anlamlýsý ?(11-12)","6)bayaðý, aþaðýlýk, deðersiz, niteliksiz, kötü ?(13-15)",
		    		"1)yengi kazanan, yenen (kimse)?(1-5)","2)UT çalan kimse?(6-8)",
		    		"3)ürün tanýtmak amacýyla açýlan büyük pazar ?(1-13)","4)Yere Serilen nakýþlý kalýn eþya?(5-16)",
		    		"5)Þehir-vilayet eþ anlamlýsý ?(11-12)","6)bir þeyi geri çevirme, kabul etmeme ?(13-15)",
		    		"1)eriþkin diþi insan?(1-5)","2)Ýspanyolcada yaþa! anlamýnda yüreklendirme sözü?(6-8)",
		    		"3)bir kadýnýn evli bulunduðu erkek, eþ ?(1-13)","4)hangisi, hangisini ?(5-16)",
		    		"5)Dünya'nýn uydusu?(11-12)","6)kirli olmayan, temiz.saf'ýn eþ anlamlýsý ?(13-15)"};


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
		    notLabel=new JLabel("NOT: BÜYÜK HARF KULLANIN.");
		    notLabel.setBounds(70, 310, 300, 30);
		    ekran.getContentPane().add(notLabel);
		    notLabel.setForeground(Color.RED);
		    Font font = new Font("Courier", Font.BOLD,12);
		    notLabel.setFont(font);
		    
		    d = new JDialog(ekran , "Kontrol Ekraný", true);
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
		    
		    
		    b1= new JButton("Cevaplarý Göster");
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
		    			kontrolEt.setText("Kazandýnýz... !!!");
		    			
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 2:
		    			if(metin.equals(cevaplar[1]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    			
		    		case 3: 
		    			if(metin.equals(cevaplar[2]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 4:
		    			if(metin.equals(cevaplar[3]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    			
		    		case 5:
		    			if(metin.equals(cevaplar[4]))
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 6:
		    			if(metin.equals(cevaplar[5]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    			
		    		case 7: 
		    			if(metin.equals(cevaplar[6]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    		case 8:
		    			if(metin.equals(cevaplar[7]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    		
		    		case 9:
		    			if(metin.equals(cevaplar[8]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			
		    			break;
		    		
		    		case 10:
		    			if(metin.equals(cevaplar[9]))
		    			{
		    				kontrolEt.setText("Kazandýnýz... !!!");
		    				
		    			}
		    			else
		    			{
		    				kontrolEt.setText("Hata Var Tekrar Bakýnýz..BÜYÜK HARF'E DÝKKAT ET");
		    				
		    			}
		    			break;
		    		
		    			default:
		    				
		    				
		    		}
		    		
		    	}
    	    });
		    
		    
		    	
		    
		    
		    
		    ekran.setTitle("Bulmaca Çöz");
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
































