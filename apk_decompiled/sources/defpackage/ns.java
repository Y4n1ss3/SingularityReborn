package defpackage;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import androidx.compose.ui.graphics.Matrix;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ns {
    public static final int[] a = {R.attr.state_checked};
    public static final int[] b = new int[0];

    static {
        new Rect();
    }

    public static PorterDuff.Mode a(int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case Matrix.TranslateZ /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return null;
        }
    }
}
