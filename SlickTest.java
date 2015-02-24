import org.newdawn.slick.*;

public class SlickTest extends org.newdawn.slick.BasicGame
{
	int t=100;

	public SlickTest(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException 
	{
		if (t%10==2)
			g.setColor(Color.red);
		else
			g.setColor(Color.blue);
		g.drawString("Hello World",t,t);
		t++;
		arg0.setTargetFrameRate(120);
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[] args)
	{
		SlickTest game=new SlickTest("Slick Test");
		try {
			AppGameContainer container = new AppGameContainer(game);
			container.setDisplayMode(800, 800, false);
			container.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
