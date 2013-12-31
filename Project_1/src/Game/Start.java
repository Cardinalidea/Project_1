package Game;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;

public class Start extends Applet implements Runnable
{
	
	@Override
	public void init()
	{
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true);
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
	
}
