package com.izhou.redpacket;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

public class HelpActivity extends Activity{
	
	private String helpContent="";
	private TextView textView;
	//������
	// private GestureDetector gestureDetector; 	
   /* 
    public  GameSetUI gameSetUI;// ������    
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
		// �õ��Զ���Ի���
		//view = factory.inflate(R.layout.game_set, null);

		//View view=(View)findViewById(R.layout.game_set);
		
		setContentView(R.layout.help);
		init();
		
    }     
    private void init(){
    	helpContent="��л��λ���ѲμӼ��桤���ҵĻ���\n"
		+"��ҸϽ��������ٶ�ƴ�������ͼ����\n"
		+"Ȼ��ȥ����������һ����Ŷ��\n"
		+"лл������ף��������졣\n";
    	
    	textView=(TextView)HelpActivity.this.findViewById(R.help_id.helpTextView);
    	textView.setText(helpContent);
    	
    }
}
     