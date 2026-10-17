package defpackage;

import android.os.Build;
import androidx.compose.ui.graphics.Fields;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x31 implements w31 {
    public final cr b;

    public x31() {
        this.b = Build.VERSION.SDK_INT >= 34 ? dr.d : ts.j;
        y80.a(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(Fields.SpotShadowColor));
    }
}
