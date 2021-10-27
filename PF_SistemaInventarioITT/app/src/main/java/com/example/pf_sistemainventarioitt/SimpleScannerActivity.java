package com.example.pf_sistemainventarioitt;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;

    public class SimpleScannerActivity extends AppCompatActivity implements ZBarScannerView.ResultHandler {
        private final static  String TAG="ScannerLog";
        private ZBarScannerView mScannerView;

        @Override
        public void onCreate(Bundle state) {
            super.onCreate(state);
            mScannerView = new ZBarScannerView(this);    // Programmatically initialize the scanner view
            setContentView(mScannerView);                // Set the scanner view as the content view
        }

        @Override
        public void onResume() {
            super.onResume();
            mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
            mScannerView.startCamera();          // Start camera on resume
        }

        @Override
        public void onPause() {
            super.onPause();
            mScannerView.stopCamera();           // Stop camera on pause
        }

        @Override
        public void handleResult(Result rawResult) {
            // Do something with the result here
            Log.v(TAG, rawResult.getContents()); // Prints scan results
            Log.v(TAG, rawResult.getBarcodeFormat().getName()); // Prints the scan format (qrcode, pdf417 etc.)

            // If you would like to resume scanning, call this method below:
            mScannerView.resumeCameraPreview(this);
        }
    }

