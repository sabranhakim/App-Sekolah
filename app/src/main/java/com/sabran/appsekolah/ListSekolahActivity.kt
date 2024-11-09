package com.sabran.appsekolah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sabran.appsekolah.Adapter.AdapterSekolah
import com.sabran.appsekolah.Model.ModelSekolah

class ListSekolahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_sekolah)

        val listSekolah = listOf<ModelSekolah>(
            ModelSekolah(
                "SMA Negeri 1 Padang Panjang",
                "Padang Panjang",
                "08319823423",
                R.drawable.sman1padapa,
                "SMA Negeri (SMAN) 1 Padang Panjang, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Provinsi Sumatera Barat, Indonesia. Sama dengan SMA pada umumnya di Indonesia, masa pendidikan sekolah di SMAN 1 Padang Panjang ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII. Sekolah ini Awalnya dibangun sebagai Sekolah Guru atau Noormal School oleh Pemerintah Kolonial Hindia Belanda di tahun 1918.[1] Noormal School diperuntukkan untuk siswa tamatan kelas V dari sekolah rendah pribumi tingkat II seperti Vervolgschool atau Standaardschool selama kurun waktu 4 tahun pendidikan dengan bahasa daerah sebagai bahasa pengantar di kelas. Lulusan dari sekolah ini ditempatkan sebagai guru di Tweede Inlandse School atau TIS (sekolah rendah pribumi.)",
                -0.4633321,
                100.4040291
            ),
            ModelSekolah(
                "SMA Negeri 1 Sumatra Barat",
                "Padang Panjang",
                "08319825623",
                R.drawable.sman1sumbar,
                "Berdirinya SMA Negeri 1 Sumatera Barat pada awalnya merupakan ide dari Gubernur Sumatera Barat waktu itu, Gamawan Fauzi, yang pembangunannya mulai direalisasikan pada tahun 2008 dan selesai pada tahun 2011. Pada April 2011, PPDB pertama dilaksanakan, yang diikuti oleh 72 orang pendaftar, dan menerima 43 orang siswi dan 17 siswa sebagai angkatan pertama. Pada tahun 2020, untuk pertama kalinya PPDB SMAN 1 Sumatera Barat dilaksanakan secara daring (online) dikarenakan mewabahnya COVID-19 yang melanda seluruh dunia, sehingga tidak dapat melaksanakan tes akademik dan wawancara. Peserta PPDB sebanyak 395 orang dan yang diterima sebanyak 105 orang. SMA Negeri 1 Sumatera Barat adalah salah satu sekolah menengah atas (SMA) yang terletak di Kota Padang Panjang, Provinsi Sumatera Barat, Indonesia yang menggunakan sistem Kurikulum 2013 dan Kurikulum Merdeka.",
                -0.4620969,
                100.4086988
            ),
            ModelSekolah(
                "SMA Negeri 1 Padang",
                "Padang",
                "08459823423",
                R.drawable.sman1padang,
                "SMA Negeri 1 Padang adalah salah satu sekolah menengah atas (SMA) berstatus negeri yang terletak di Kelurahan Lolong Belanti, Kecamatan Padang Utara, Kota Padang, Sumatera Barat. Sekolah ini beralamat di Jalan Belanti Raya No. 11, beberapa puluh meter ke arah barat dari Jalan Khatib Sulaiman, Padang. Sebelumnya, sekolah ini beralamat di Jalan Sudirman No. 1, tetapi kemudian direlokasi ke lokasi sekarang karena bangunan sekolah yang lama rusak berat akibat gempa bumi pada tahun 2009. Gedung sekolah yang baru dibangun di atas lahan seluas 1,6 hektare pada 10 November 2009 dan selesai pada 7 Agustus 2010. ",
                -0.9196179,
                100.3511485
            ),
            ModelSekolah(
                "SMA Negeri 10 Padang",
                "Padang",
                "08345323423",
                R.drawable.sman10padan,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.9360543,
                100.3612719
            ),
            ModelSekolah(
                "SMA Negeri Agam Cendekia",
                "Agam",
                "08009823423",
                R.drawable.smanagamcendekia,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.2909671,
                100.1311273
            ),
            ModelSekolah(
                "SMA Negeri 1 Bukittinggi",
                "Bukittinggi",
                "08319820023",
                R.drawable.sman1bkt,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.3029732,
                100.371308
            ),
            ModelSekolah(
                "SMA Negeri 3 Batu Sangkar",
                "Batu Sangkar",
                "08319823498",
                R.drawable.sman3batusangkar,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.4846389,
                100.6124084
            ),
            ModelSekolah(
                "SMA Negeri 3 Batu Sangkar",
                "Batu Sangkar",
                "083198298923",
                R.drawable.sman3batusangkar,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.4846389,
                100.6124084
            ),
            ModelSekolah(
                "SMA Negeri 3 Painan",
                "Painan",
                "083112823423",
                R.drawable.sman3painan,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -1.3053232,
                100.5409185
            ),
            ModelSekolah(
                "SMA Negeri 2 Sumatra Barat",
                "Solok",
                "08376823423",
                R.drawable.sman2sumbar,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.936767,
                100.5930264
            ),
            ModelSekolah(
                "SMA Negeri 2 Padang",
                "Padang",
                "08319823454",
                R.drawable.sman2padang,
                "Mesjid Raya Sumbar tempat yang menyenangkan Wisata yang murah dan terjangkau Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau, Istano Pagaruyuang tempat yang menyenangkan Wisata yang murah dan terjangkau",
                -0.9299022,
                100.3511301
            )


        )
        // panggil adapter
        val adapterSekolah = AdapterSekolah(listSekolah)
        //recycler view
        val rvSekolah = findViewById<RecyclerView>(R.id.rv_sekolah)
        rvSekolah.adapter = adapterSekolah
        // set layout untuk recycler view
        rvSekolah.apply {
            layoutManager = LinearLayoutManager(this@ListSekolahActivity)
        }
        rvSekolah.setHasFixedSize(true)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}