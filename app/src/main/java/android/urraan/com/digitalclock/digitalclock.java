package android.urraan.com.digitalclock;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.TextClock;

/**
 * Implementation of App Widget functionality.
 */
public class digitalclock extends AppWidgetProvider {
    Button btn;
    Digital digital;

    public void onReceive(Context context, Intent intent) {
        digital=new Digital();
       digital.ChangeColor();
        String act = intent.getAction();
        if (AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(act)) {
            RemoteViews myView = new RemoteViews(context.getPackageName(), R.layout.widget);
         //   myView.setTextColor(R.id.textClock,Color.BLUE);
         //   myView.setCharSequence(R.id.textClock,"ChangeColor", (CharSequence) context);
            AppWidgetManager.getInstance(context).updateAppWidget(intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS), myView);
        }
    }

}