package com.example.ticket;

public interface QRCodeFoundListener {
 void onQRCodeFound(String qrCode);
 void qrCodeNotFound();
}