package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.spatial.RectListKt;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class u11 {
    public static final /* synthetic */ int a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, int i) {
        int i2;
        if (i == -1) {
            i2 = -1;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            i2 = 6;
            if (i3 < 34) {
                switch (i) {
                    case 21:
                    case 23:
                    case 26:
                        i = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i = 4;
                        break;
                    case RectListKt.BitOffsetForParentId /* 25 */:
                        i = 0;
                        break;
                }
            }
            if (i3 < 30) {
                if (i != 12) {
                    if (i != 13) {
                        if (i != 16) {
                            if (i == 17) {
                                i2 = 0;
                            }
                        }
                    }
                }
                i2 = 1;
            }
            i2 = i;
        }
        if (i2 == -1) {
            return;
        }
        view.performHapticFeedback(i2);
    }

    public static void b(ViewGroup viewGroup, p0 p0Var) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(p0Var.getBridge());
    }
}
