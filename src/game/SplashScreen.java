package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import controller.Mode;
import controller.PaintManager;

import util.Pixmap;
import util.Text;
import view.Canvas;

public class SplashScreen implements Mode {
	private static final Pixmap SPLASH_IMAGE = new Pixmap("MarioBackground.jpeg");
	// This is the Text the Splash Screen will display
    private Text SplashScreenText;
	private String myNextMode;
	private Canvas myCanvas;
	private boolean myStartGame;

	public SplashScreen(Canvas canvas, String NextMode) {
		myCanvas = canvas;
		myNextMode = "MarioTime";
		myStartGame = false;
		myNextMode = NextMode;
		SplashScreenText = new Text("Welcome to Mario! Press 1 to Start!");
	}

	@Override
	public void update(double steptime) {
		if(myCanvas.getLastKeyPressed()!= -1){
			myStartGame = true;
		}
	}

	@Override
	public String getNextModeName() {
		return myNextMode;
	}

	@Override
	public String getModeName() {
		// TODO Auto-generated method stub
		return "SplashScreen";
	}

	@Override
	public boolean needNextMode() {
		// TODO Auto-generated method stub
		return myStartGame;
	}

	@Override
	public void reset() {
		
	}
	
	public void paint(Graphics2D pen){
        SPLASH_IMAGE.paint((Graphics2D) pen, new Point(myCanvas.getSize().width/2,
        		myCanvas.getSize().height/2), myCanvas.getSize(), 0);
        SplashScreenText.paint((Graphics2D) pen, new Point(myCanvas.getSize().width/2,
        		myCanvas.getSize().height/2), Color.RED);
	}

	@Override
	public void setupPainting(PaintManager paintmanager) {
		//Already done!
	}

	@Override
	public Integer getStatus() {
		return 0;
	}

}
