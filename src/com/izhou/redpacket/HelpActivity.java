package com.izhou.redpacket;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

public class HelpActivity extends Activity{
	
	private String helpContent="";
	private TextView textView;
	//监听器
	// private GestureDetector gestureDetector; 	
   /* 
    public  GameSetUI gameSetUI;// 操作类    
    public WaitCanvasUI waitCanvasUI;
    
    public AddUserNameUI addUserNameUI;   
    public ShowPeopleInfoListUI showPeopleInfoListUI;
    public ClassSetPhoto classSetPhoto;
*/    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("MainActivity===>>onCreate");   
		
		//LayoutInflater factory = LayoutInflater.from(HelpActivity.this);
		// 得到自定义对话框
		//view = factory.inflate(R.layout.game_set, null);

		//View view=(View)findViewById(R.layout.game_set);
		
		setContentView(R.layout.help);
		init();
		
    }     
    private void init(){
    	helpContent="感谢各位亲友参加技锋·春桃的婚礼。\n"
		+"大家赶紧以最快的速度拼出红包的图案，\n"
		+"然后去找新郎新娘兑换红包哦。\n"
		+"谢谢捧场，祝大家玩得愉快。\n";
    	
    	textView=(TextView)HelpActivity.this.findViewById(R.help_id.helpTextView);
    	textView.setText(helpContent);
    	
    }
}
     