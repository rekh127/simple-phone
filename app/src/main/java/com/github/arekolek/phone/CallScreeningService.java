package com.github.arekolek.phone;

import android.telecom.Call;

import androidx.annotation.NonNull;

public class CallScreeningService extends android.telecom.CallScreeningService {
    @Override
    public void onScreenCall(@NonNull Call.Details callDetails) {
        CallScreeningService.CallResponse.Builder builder = new CallResponse.Builder();
        if (callDetails.getHandle().getEncodedSchemeSpecificPart().equals("4259987609")) {
            builder.setDisallowCall(true).setSkipNotification(true).setSilenceCall(true).setSkipCallLog(true);
        }
        respondToCall(callDetails, builder.build());
    }
}
