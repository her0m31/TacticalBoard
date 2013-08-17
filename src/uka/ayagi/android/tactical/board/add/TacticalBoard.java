package uka.ayagi.android.tactical.board.add;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;

public class TacticalBoard extends Activity {
	Bundle sIS;

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		sIS = savedInstanceState;

		final OnTouchListener moving = new OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
            	final ViewGroup.MarginLayoutParams param = (ViewGroup.MarginLayoutParams)v.getLayoutParams();

            	if( event.getAction() == MotionEvent.ACTION_MOVE){
                   param.leftMargin = (int)(event.getRawX() ) -30;
                   param.topMargin = (int)(event.getRawY() ) -40;
                   v.layout( param.leftMargin, param.topMargin, param.leftMargin + v.getWidth(), param.topMargin + v.getHeight());

                    return true;
                }
                return false;
            }
        };

        findViewById(R.id.imgBut1).setOnTouchListener(moving);
        findViewById(R.id.imgBut2).setOnTouchListener(moving);
        findViewById(R.id.imgBut3).setOnTouchListener(moving);
        findViewById(R.id.imgBut4).setOnTouchListener(moving);
        findViewById(R.id.imgBut5).setOnTouchListener(moving);
        findViewById(R.id.imgBut6).setOnTouchListener(moving);
        findViewById(R.id.imgBut7).setOnTouchListener(moving);
        findViewById(R.id.imgBut8).setOnTouchListener(moving);
        findViewById(R.id.imgBut9).setOnTouchListener(moving);
        findViewById(R.id.imgBut10).setOnTouchListener(moving);
        findViewById(R.id.imgBut11).setOnTouchListener(moving);
        findViewById(R.id.imgBut12).setOnTouchListener(moving);
        findViewById(R.id.imgBut13).setOnTouchListener(moving);
        findViewById(R.id.imgBut14).setOnTouchListener(moving);
        findViewById(R.id.imgBut15).setOnTouchListener(moving);
        findViewById(R.id.imgBut16).setOnTouchListener(moving);
        findViewById(R.id.imgBut17).setOnTouchListener(moving);
        findViewById(R.id.imgBut18).setOnTouchListener(moving);
        findViewById(R.id.imgBut19).setOnTouchListener(moving);
        findViewById(R.id.imgBut20).setOnTouchListener(moving);
        findViewById(R.id.imgBut21).setOnTouchListener(moving);
        findViewById(R.id.imgBut22).setOnTouchListener(moving);
        findViewById(R.id.imgButball).setOnTouchListener(moving);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate( R.menu.mainmenu, menu );
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.clear: {
				onCreate(sIS);
			}
		}
		return super.onOptionsItemSelected(item);
	}
}
