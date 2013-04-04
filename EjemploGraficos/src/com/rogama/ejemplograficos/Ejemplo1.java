package com.rogama.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.view.View;

public class Ejemplo1 extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new EjemploView(this));
	}

	public class EjemploView extends View {
		public EjemploView(Context context) {
			super(context);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			Paint pincel = new Paint();
			pincel.setColor(Color.BLUE);
			pincel.setStrokeWidth(8);
			pincel.setStyle(Style.STROKE);
			canvas.drawCircle(150, 150, 100, pincel);
			pincel.setColor(getResources().getColor(R.color.color_circulo));
			canvas.drawCircle(150, 250, 100, pincel);
		}
		
	}
}
