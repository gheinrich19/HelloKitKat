package com.example.yams.hellokitkat;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
/**
 * Created by yams on 9/12/2015.
 */
public class mainActivity extends Activity {

    Button FirstKitKatButton = null;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity_layout);
        FirstKitKatButton = (Button) this.findViewById(R.id.btnKitKat);
        FirstKitKatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast
                        .makeText(getApplicationContext(), R.string.toastmsg, Toast.LENGTH_LONG).show();

            }
        });
    }

}
