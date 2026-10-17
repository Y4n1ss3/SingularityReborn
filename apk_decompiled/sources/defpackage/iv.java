package defpackage;

import android.util.Log;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.ui.autofill.AutofillUtils_androidKt;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class iv {
    public static final List a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static volatile List f;
    public static volatile List g;
    public static final ob0 h;

    static {
        Integer valueOf = Integer.valueOf(AutofillUtils_androidKt.MAX_AUTOFILL_TEXT_LENGTH);
        a = y80.E(1000, 2000, 3000, 4000, valueOf, Integer.valueOf(ProgressIndicatorKt.CircularAnimationProgressDuration), 7000);
        b = y80.E(1600, 1800, 2000, 2200, 2400, 2600);
        c = y80.E(3700, 4500, valueOf, 5500);
        d = y80.E(3000, 4000, valueOf, 6500, 7500);
        e = y80.E(120, 255);
        h = new ob0();
    }

    public static boolean a() {
        return hr.c();
    }

    public static int b() {
        Integer num = (Integer) yi.y0(c());
        if (num != null) {
            return num.intValue();
        }
        return 1000;
    }

    public static List c() {
        int ordinal = hr.b().ordinal();
        if (ordinal == 0) {
            return e;
        }
        if (ordinal == 1) {
            return a;
        }
        if (ordinal == 2) {
            return b;
        }
        if (ordinal != 3) {
            if (ordinal == 4) {
                return d;
            }
            if (ordinal != 5) {
                o.n();
                return null;
            }
        }
        return c;
    }

    public static void d(String str, boolean z) {
        try {
            uv.M(new File(str), z ? "1" : "0");
        } catch (Exception e2) {
            Log.e("FanUtils", "Failed to write fan sleep-mode flag file", e2);
        }
    }

    public static void e(int i, String str) {
        int b2 = b();
        Integer num = (Integer) yi.x0(c());
        try {
            uv.M(new File(str), String.valueOf(y80.h(i, b2, num != null ? num.intValue() : 8500)));
        } catch (Exception e2) {
            Log.e("FanUtils", "Failed to write fan target rpm file", e2);
        }
    }
}
