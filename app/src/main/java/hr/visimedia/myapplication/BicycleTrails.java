package hr.visimedia.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class BicycleTrails extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle_trails);
    }


    public void bicButton1 (View view)
    {
        Intent btrail1 = new Intent(BicycleTrails.this, BicycleTrail1.class);
        startActivity(btrail1);
    }
    public void bicButton2 (View view)
    {
        Intent btrail2 = new Intent(BicycleTrails.this, BicycleTrail2.class);
        startActivity(btrail2);
    }
    public void bicButton3 (View view)
    {
        Intent btrail3 = new Intent(BicycleTrails.this, BicycleTrail3.class);
        startActivity(btrail3);
    }
    public void bicButton4 (View view)
    {
        Intent btrail4 = new Intent(BicycleTrails.this, BicycleTrail4.class);
        startActivity(btrail4);
    }
    public void bicButton5 (View view)
    {
        Intent btrail5 = new Intent(BicycleTrails.this, BicycleTrail5.class);
        startActivity(btrail5);
    }
    public void bicButton6 (View view)
    {
        Intent btrail6 = new Intent(BicycleTrails.this, BicycleTrail6.class);
        startActivity(btrail6);
    }
}
