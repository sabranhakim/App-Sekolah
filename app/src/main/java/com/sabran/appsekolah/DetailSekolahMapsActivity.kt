package com.sabran.appsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.sabran.appsekolah.databinding.ActivityDetailSekolahMapsBinding

class DetailSekolahMapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityDetailSekolahMapsBinding

    private lateinit var tvNamaLokasiSekolah : TextView
    private lateinit var imgSekolah : ImageView
    private lateinit var tvDeskripsi : TextView
    private lateinit var btnLokasi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailSekolahMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvNamaLokasiSekolah = findViewById(R.id.tvNamaLokasiSekolah)
        imgSekolah = findViewById(R.id.imgSekolah)
        tvDeskripsi = findViewById(R.id.tvDeskripsi)
        btnLokasi = findViewById(R.id.btnLokasi)


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        //mengambil data dari intent
        val namaLokasiSekolah = intent.getStringExtra("namaLokasiSekolah")
        val gambarSekolah = intent.getIntExtra("gambarSekolah", 0)
        val tlpSekolah = intent.getStringExtra("tlpSekolah")
        val deskripsiSekolah = intent.getStringExtra("deskripsiSekolah")
        val latSekolah = intent.getDoubleExtra("latSekolah", 0.0)
        val longSekolah = intent.getDoubleExtra("longSekolah", 0.0)

        tvNamaLokasiSekolah.text = namaLokasiSekolah
        imgSekolah.setImageResource(gambarSekolah)
        tvDeskripsi.text = deskripsiSekolah

        //event click button map wisata
        btnLokasi.setOnClickListener {
            val intentMapsSekolah = Intent(this, MapsSekolahActivity::class.java)
            //kirim lat dan long
            intentMapsSekolah.putExtra("latSekolah", latSekolah)
            intentMapsSekolah.putExtra("longSekolah", longSekolah)
            intentMapsSekolah.putExtra("namaLokasiSekolah", namaLokasiSekolah)
            startActivity(intentMapsSekolah)
        }

        // Add a marker in Sydney and move the camera
        val koordinatSekolah = LatLng(-latSekolah, longSekolah)
        mMap.addMarker(MarkerOptions().position(koordinatSekolah).title(namaLokasiSekolah))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(koordinatSekolah, 14f))

    }
}