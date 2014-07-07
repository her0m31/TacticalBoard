package uka.ayagi.android.tactical.board.add;

import java.util.ArrayList;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
//test
public class Draw extends View implements OnTouchListener {
	private Paint paint;
	private ArrayList<Path> pathList = new ArrayList<Path>();
	private Path path;

	public Draw(Context context, AttributeSet attrs) {
		super(context, attrs);
		setOnTouchListener(this);

		paint = new Paint();
		paint.setARGB(255, 255, 255, 102);
		paint.setStyle(Paint.Style.STROKE);
		paint.setAntiAlias(true);
		paint.setStrokeWidth(5);
	}

	public void reset(){
		pathList = new ArrayList<Path>();
		invalidate();
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		for(Path path : pathList) {
			canvas.drawPath(path, paint);
		}
	}

	public boolean onTouch(View v, MotionEvent event) {
		switch(event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			path = new Path();
			path.moveTo(event.getX(), event.getY());
			pathList.add(path);
			break;
		case MotionEvent.ACTION_MOVE:
			path.lineTo(event.getX(), event.getY());
			break;
		case MotionEvent.ACTION_UP:
			path.lineTo(event.getX(), event.getY());
			break;
		default:
		}
		invalidate();
		return true;
	}

}
