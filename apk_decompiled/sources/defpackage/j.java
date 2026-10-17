package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((AbstractComposeView) obj).attachedToWindow();
                return;
            case 1:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0((AndroidComposeViewAccessibilityDelegateCompat) obj);
                return;
            case 2:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) obj);
                return;
            case 3:
                ck ckVar = (ck) obj;
                Runnable runnable = ckVar.e;
                if (runnable != null) {
                    runnable.run();
                    ckVar.e = null;
                    return;
                }
                return;
            case 4:
                fk.b((fk) obj);
                return;
            case 5:
                tx txVar = (tx) obj;
                synchronized (txVar.f) {
                    try {
                        if (txVar.j == null) {
                            return;
                        }
                        try {
                            fy c = txVar.c();
                            int i2 = c.e;
                            if (i2 == 2) {
                                synchronized (txVar.f) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Typeface a = q01.a(txVar.d, new fy[]{c}, 0);
                                MappedByteBuffer x = q10.x(txVar.d, c.a);
                                if (x == null || a == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    f90 f90Var = new f90(a, p01.y(x));
                                    Trace.endSection();
                                    synchronized (txVar.f) {
                                        try {
                                            p10 p10Var = txVar.j;
                                            if (p10Var != null) {
                                                p10Var.A(f90Var);
                                            }
                                        } finally {
                                        }
                                    }
                                    txVar.b();
                                    return;
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (txVar.f) {
                                try {
                                    p10 p10Var2 = txVar.j;
                                    if (p10Var2 != null) {
                                        p10Var2.z(th2);
                                    }
                                    txVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 6:
                dg0 dg0Var = (dg0) obj;
                a50 a50Var = dg0Var.i;
                if (dg0Var.e == 0) {
                    dg0Var.f = true;
                    a50Var.e(q40.ON_PAUSE);
                }
                if (dg0Var.d == 0 && dg0Var.f) {
                    a50Var.e(q40.ON_STOP);
                    dg0Var.g = true;
                    return;
                }
                return;
            case 7:
                kh0 kh0Var = (kh0) obj;
                Intent registerReceiver = kh0Var.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z = ((registerReceiver != null ? registerReceiver.getIntExtra("plugged", 0) : 0) & 12) != 0;
                if (z && !kh0Var.e) {
                    kh0Var.e = true;
                    of ofVar = kh0Var.f;
                    if (ofVar != null) {
                        ofVar.m("am broadcast -a com.oculus.vrpowermanager.automation_disable");
                        return;
                    }
                    return;
                }
                if (z || !kh0Var.e) {
                    return;
                }
                kh0Var.e = false;
                of ofVar2 = kh0Var.f;
                if (ofVar2 != null) {
                    ofVar2.m("am broadcast -a com.oculus.vrpowermanager.prox_close");
                    return;
                }
                return;
            case 8:
                RippleHostView.setRippleState$lambda$1((RippleHostView) obj);
                return;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((p7) obj).d;
                int i3 = sideSheetBehavior.o;
                if (i3 != 2 || i3 == 0) {
                    return;
                }
                sideSheetBehavior.o = 0;
                return;
            case 10:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                TextInputServiceAndroid.sendInputCommand$lambda$0((TextInputServiceAndroid) obj);
                return;
        }
    }
}
