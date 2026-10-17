package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vs {
    public final boolean a;
    public final int b;
    public final int c;

    static {
        Math.round(5.1000000000000005d);
    }

    public vs(Context context) {
        int i;
        int i2;
        TypedValue typedValue = new TypedValue();
        typedValue = context.getTheme().resolveAttribute(R.attr.elevationOverlayEnabled, typedValue, true) ? typedValue : null;
        int i3 = 0;
        boolean z = (typedValue == null || typedValue.type != 18 || typedValue.data == 0) ? false : true;
        TypedValue typedValue2 = new TypedValue();
        typedValue2 = context.getTheme().resolveAttribute(R.attr.elevationOverlayColor, typedValue2, true) ? typedValue2 : null;
        if (typedValue2 != null) {
            int i4 = typedValue2.resourceId;
            i = i4 != 0 ? context.getColor(i4) : typedValue2.data;
        } else {
            i = 0;
        }
        TypedValue typedValue3 = new TypedValue();
        typedValue3 = context.getTheme().resolveAttribute(R.attr.elevationOverlayAccentColor, typedValue3, true) ? typedValue3 : null;
        if (typedValue3 != null && (i2 = typedValue3.resourceId) != 0) {
            context.getColor(i2);
        }
        TypedValue typedValue4 = new TypedValue();
        TypedValue typedValue5 = context.getTheme().resolveAttribute(R.attr.colorSurface, typedValue4, true) ? typedValue4 : null;
        if (typedValue5 != null) {
            int i5 = typedValue5.resourceId;
            i3 = i5 != 0 ? context.getColor(i5) : typedValue5.data;
        }
        float f = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = i;
        this.c = i3;
    }
}
