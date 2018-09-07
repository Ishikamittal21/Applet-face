import java.applet.Applet;
import java.awt.*;
/* <applet code="ThirdApplet.class" width="500" height="500">
	</applet>*/
	public class ThirdApplet extends Applet implements Runnable{
		Thread t;
		Color c1;
		int f=0;
		int x=150;
		int y=220;
		int h=30;
		int b=170;
		int c=250;
		int a=210;
	public void init(){
		t=new Thread(this);
		t.start();
		c1=Color.RED;
		}
	public void run(){
	while(true){
			if(f==0){
				x=150;
				y=220;
				h=30;
				a=220;
				b=170;
				c=250;
c1=Color.RED;
f=1;
}
else if(f==1){
c1=Color.GREEN;
f=0;
x=155;
y=225;
h=0;
a=218;
b=168;
c=248;
}

			try{
				Thread.sleep(2000);
				
			}
			catch(Exception e){}
					repaint();
		}

	}
public void paint(Graphics g){
	g.drawLine(210,40,a,100);
		g.drawLine(170,40,b,100);
		g.drawLine(250,40,c,100);	
g.drawOval(50,90,325,325);
g.setColor(Color.ORANGE);
g.fillOval(51,92,322,322);
Color white=new Color(155,155,155);
g.setColor(white);
g.fillOval(100,140,100,100);
g.setColor(Color.BLACK);
g.drawOval(100,140,100,100);
g.setColor(white);
g.fillOval(190,140,100,100);
g.setColor(Color.BLACK);
g.drawOval(190,140,100,100);
Color blue=new Color(0,60,98);
g.setColor(blue);
g.fillOval(125,160,51,51);
g.setColor(Color.BLACK);
g.drawOval(125,160,51,51);
g.setColor(blue);
g.fillOval(205,160,51,51);
g.setColor(Color.BLACK);
g.drawOval(205,160,50,50);
g.setColor(Color.BLACK);
g.fillOval(x,185,15,15);
g.setColor(Color.BLACK);
g.fillOval(y,185,15,15);
g.setColor(Color.RED);
g.fillOval(170,240,47,47);
g.setColor(Color.BLACK);
g.drawLine(120,300,295,300);
	g.drawArc(120,210,174,176,179,182);
	g.setColor(Color.YELLOW);
	g.fillArc(120,208,172,174,179,182);
g.setColor(c1);
g.fillRect(190,370,20,h);
}
}