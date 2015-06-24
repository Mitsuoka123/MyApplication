package hr.visimedia.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;


public class BicycleTrail2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle_trail2);
    }


    File kmlKorculaRasohatica = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "download" + File.separator + "korcula-rasohatica.kml");

    public void dwnldKmlKorculaRasohatica(View v)
    {
        Intent dwnldKmlKorculaRasohatica = new Intent();
        dwnldKmlKorculaRasohatica.setAction(Intent.ACTION_VIEW);
        dwnldKmlKorculaRasohatica.setData(Uri.parse("http://www.visitkorcula.eu/downloads/bike-trails/korcula-rasohatica.kml"));
        if(kmlKorculaRasohatica.exists())
        {
            Toast alreadydownloaded = Toast.makeText(getApplicationContext(), "*.KML file already downloaded, Open *.KML file", Toast.LENGTH_LONG);
            LinearLayout toastLayout = (LinearLayout) alreadydownloaded.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toastTV.setTextSize(25);
            alreadydownloaded.show();
        }
        else
        {
            startActivity(dwnldKmlKorculaRasohatica);
        }
    }

    public void openKmlKorculaRasohatica(View v)
    {
        Intent openKmlKorculaRasohatica = new Intent();
        openKmlKorculaRasohatica.setAction(Intent.ACTION_VIEW);
        openKmlKorculaRasohatica.setDataAndType(Uri.fromFile(kmlKorculaRasohatica), "application/vnd.google-earth.kml+xml");
        if(kmlKorculaRasohatica.exists())
        { startActivity(openKmlKorculaRasohatica);}
        else
        {
            Toast notdownloaded = Toast.makeText(getApplicationContext(), "*.KML file is not downloaded, download *.KML file", Toast.LENGTH_LONG);
            LinearLayout toastLayout = (LinearLayout) notdownloaded.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toastTV.setTextSize(25);
            notdownloaded.show();
        }
    }

    public void playStoreOrux(View v)
    {
        Intent playStoreOrux = new Intent(Intent.ACTION_VIEW);
        playStoreOrux.setData(Uri.parse("market://details?id=com.orux.oruxmaps"));
        startActivity(playStoreOrux);
    }
}
