package nl.huisklassiek.activity;

import android.os.Bundle;
import android.widget.Button;

import com.appolica.interactiveinfowindow.fragment.MapInfoWindowFragment;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

import butterknife.BindView;
import butterknife.ButterKnife;
import nl.huisklassiek.R;
import nl.kozzion.common.ActivityBase;

public class ActivityMap extends ActivityBase implements OnMapReadyCallback {


    @BindView(R.id.map_button_host)
    Button mButtonHost;
    @BindView(R.id.map_button_book)
    Button mButtonBook;

    MapInfoWindowFragment mapsMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        ButterKnife.bind(this);

        // Obtain the MapInfoWindowFragment and get notified when the map is ready to be used.
        mapsMapFragment  =(MapInfoWindowFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment_map);
        mapsMapFragment.getMapAsync(this);

        mButtonHost.setOnClickListener(v -> executeHost());
        mButtonBook.setOnClickListener(v -> executeBook());
    }

    private void executeHost() {
        ActivityHost.start(this);
    }

    private void executeBook() {
    }

    public void onMapReady(GoogleMap googleMap) {

    }
}
