package com.example.pertemuan8.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pertemuan8.model.Mahasiswa
import com.example.pertemuan8.model.RencanaStudi

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    dataRencanaStudi: RencanaStudi,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    val listDataDetail = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("NIM", dataMhs.nim),
        Pair("Email", dataMhs.email),
        Pair("Mata Kuliah", dataRencanaStudi.mataKuliah),
        Pair("Kelas", dataRencanaStudi.kelas)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 30.dp)
    ) {
        listDataDetail.forEach { data ->
            DetailRow(judul = data.first, isi = data.second)
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            modifier = modifier
                .fillMaxWidth(),
            onClick = { onBackClick() },
        ) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun DetailRow(
    judul: String,
    isi: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = judul,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = ":",
            modifier = Modifier.weight(0.1f)
        )
        Text(
            text = isi,
            modifier = Modifier.weight(2f)
        )
    }
}
