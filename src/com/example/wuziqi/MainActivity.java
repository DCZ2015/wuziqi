package com.example.wuziqi;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button buttonb;
    Button buttonw;
    ChessBoard chessboard;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonb = (Button) findViewById(R.id.buttonb);
		buttonw = (Button) findViewById(R.id.buttonw);
		ClickButton clickbutton=new ClickButton();
		buttonb.setOnClickListener(clickbutton);
		buttonw.setOnClickListener(clickbutton);
  		chessboard = new ChessBoard(this);
        chessboard.setBackgroundResource(R.drawable.wood_background);
	}
	
	class ClickButton implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 switch (v.getId()) {  
		            case R.id.buttonb:{  
		            	chessboard.playerStatus=0;
		            	setContentView(chessboard);
		            }break;  
		            case R.id.buttonw:{  
		            	chessboard.playerStatus=1;  
		            	setContentView(chessboard);
		            }  break;    
		            default:  
		                break;  
		        }  
		}

     }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
