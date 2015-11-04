package com.example.wuziqi;

import java.util.ArrayList;
import java.util.List;



import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Chessboard extends View{
	
	private final Paint paint = new Paint();
	private final List<Line> lines = new ArrayList<Line>();
	public int xStart;
	public int yStart;
	
	private class Line{
		public Line(int xStart, int yStart, int xStop, int yStop) {
			super();
			this.xStart = xStart;
			this.yStart = yStart;
			this.xStop = xStop;
			this.yStop = yStop;
		}
		private int xStart;
		private int yStart;
		private int xStop;
		private int yStop;
	}
	
	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO Auto-generated method stub
		super.onSizeChanged(w, h, oldw, oldh);
		
		 xStart=(w-45*14)/2;
		 yStart=(h-45*14)-20;
		for(int i=0;i<15;i++){
			lines.add(new Line(xStart+i*45, yStart, xStart+i*45, yStart+14*45));
			lines.add(new Line(xStart, yStart+i*45, xStart+14*45, yStart+i*45));
			}
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		drawAllLines(canvas);
		}

		
		

	private void drawAllLines(Canvas canvas) {
		// TODO Auto-generated method stub
		for (Line line : lines) {
			canvas.drawLine(line.xStart, line.yStart, line.xStop, line.yStop, paint);
		}
	}

	public Chessboard(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

}
