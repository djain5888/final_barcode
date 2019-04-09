package com.example.deepakjain.final_barcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Toast;

import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import java.util.List;

import info.androidhive.barcode.BarcodeReader;

public class Main3Activity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener{
    BarcodeReader barcodeReader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        barcodeReader = (BarcodeReader) getSupportFragmentManager().findFragmentById(R.id.barcode_scanner);
    }

    @Override
    public void onScanned(Barcode barcode) {
        barcodeReader.playBeep();

        String s=barcode.displayValue;
        //   Toast.makeText(this, "value is"+s, Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("info",barcode.displayValue);
        startActivity(intent);




    }

    @Override
    public void onScannedMultiple(List<Barcode> barcodes) {

    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {

    }

    @Override
    public void onScanError(String errorMessage) {

    }

    @Override
    public void onCameraPermissionDenied() {

    }

}
