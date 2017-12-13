package nl.huisklassiek.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import nl.huisklassiek.R;
import nl.kozzion.common.ActivityBase;

/**
 * Created by jaapo on 13-12-2017.
 */

public class ActivityHost extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        ButterKnife.bind(this);

    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, ActivityHost.class));
    }
}
