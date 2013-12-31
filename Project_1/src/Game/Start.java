package Game;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Start extends Applet implements Runnable, KeyListener
{
	
	@Override
	public void init()
	{
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(this);
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("DERPDERP");
	}
	
	@Override
	public void start()
	{
		//creating a new thread
		Thread thread = new Thread();
		thread.start();
	}
	
	@Override
	public void stop()
	{
		
	}
	
	@Override
	public void destroy()
	{
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			
			repaint();
			
			try
			{
				Thread.sleep(17);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	    // TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		   case KeyEvent.VK_UP:
			   System.out.println("Messed Up");
		   break;

		   case KeyEvent.VK_DOWN:
			   System.out.println("Get Down");
		   break;

		   case KeyEvent.VK_LEFT:
			   System.out.println("Left Out");
		   break;

		   case KeyEvent.VK_RIGHT:
			   System.out.println("Righteous Power");
		   break;

		   case KeyEvent.VK_SPACE:
			   System.out.println("Hey lady. Lady. Space. Gotta go to space.");
		   break;
		   }
	}

	@Override
	public void keyReleased(KeyEvent e) {
	    // TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		   case KeyEvent.VK_UP:
			   System.out.println("Up and above");
		   break;

		   case KeyEvent.VK_DOWN:
			   System.out.println("Down the rabbit's hole");
		   break;

		   case KeyEvent.VK_LEFT:
			   System.out.println("Left for dead too");
		   break;

		   case KeyEvent.VK_RIGHT:
			   System.out.println("Right angles");
		   break;

		   case KeyEvent.VK_SPACE:
			   System.out.println("WEMADEITWEMADEITWEMADEIT SPACE! Earth. Wanna go to earth.");
		   break;
		   }
	}

	@Override
	public void keyTyped(KeyEvent e) {
	    // TODO Auto-generated method stub
	    
	}
	
}
