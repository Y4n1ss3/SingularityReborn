package androidx.compose.material3;

import android.content.Context;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    /* renamed from: getColor-WaAFU9c, reason: not valid java name */
    public final long m1740getColorWaAFU9c(Context context, int i) {
        return ColorKt.Color(context.getResources().getColor(i, context.getTheme()));
    }
}
