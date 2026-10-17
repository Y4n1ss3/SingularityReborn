package com.lumi.singularity.ui.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.c3;
import defpackage.d3;
import defpackage.ds0;
import defpackage.ek;
import defpackage.p01;
import defpackage.q10;
import defpackage.rh;
import defpackage.vu0;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AdbRootActivity extends vu0 implements c3 {
    public static final /* synthetic */ int v = 0;

    public final File h() {
        File file = new File(getApplicationInfo().nativeLibraryDir, "libadb.so");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // defpackage.vu0, defpackage.dk, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("is_fugu_setup", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("use_port_5555", false);
        String stringExtra = getIntent().getStringExtra("binary_name");
        if (stringExtra == null) {
            stringExtra = "FUGU";
        }
        String str2 = stringExtra;
        try {
            Process exec = Runtime.getRuntime().exec("getprop ro.boot.verifiedbootstate");
            InputStream inputStream = exec.getInputStream();
            inputStream.getClass();
            str = ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192))).toString();
            exec.waitFor();
        } catch (Exception e) {
            Log.e("AdbRootActivity", "Failed to read ro.boot.verifiedbootstate", e);
            str = "";
        }
        boolean b = q10.b(str, "orange");
        if (!booleanExtra && !b) {
            Log.w("AdbRootActivity", "Magisk/patch flow opened on locked bootloader (verifiedbootstate='" + str + "') — patch button will be locked");
        }
        boolean z = booleanExtra || !b;
        boolean booleanExtra3 = getIntent().getBooleanExtra("is_adb_rootable", false);
        SharedPreferences sharedPreferences = getSharedPreferences("singularity_prefs", 0);
        if (sharedPreferences.getBoolean("is_unlocked_bootloader", false) != b) {
            sharedPreferences.edit().putBoolean("is_unlocked_bootloader", b).apply();
        }
        ek.a(this, ComposableLambdaKt.composableLambdaInstance(1705630074, true, new d3(sharedPreferences, z, str2, booleanExtra2, b, booleanExtra3, this, 0)));
    }
}
