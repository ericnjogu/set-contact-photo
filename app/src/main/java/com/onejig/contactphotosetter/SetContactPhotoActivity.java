package com.onejig.contactphotosetter;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SetContactPhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_contact_photo);
        Intent intent = getIntent();
        Parcelable parcelableExtra = intent.getParcelableExtra(Intent.EXTRA_STREAM);
        // https://developer.android.com/training/sharing/receive#java
        if (Intent.ACTION_SEND.equals(intent.getAction()) &&
                parcelableExtra != null) {
            Log.d("SetContactPhotoActivity", parcelableExtra.toString());
            Toast toast = Toast.makeText(this, "Selected " + parcelableExtra.toString(), Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
