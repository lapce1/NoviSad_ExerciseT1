import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 20:52
// Student ID: IT26-2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		this.frames.add(frame);
	}
	
	public int getFrameNumber(){
		return this.frames.size();
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		Frame frejm = new Frame(firstThrow,secondThrow);
		if(frames.size()==10&&(frejm.isSpare()||frejm.isStrike())){
			this.frames.add(bonus);
		}
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return 0;
	}
}
