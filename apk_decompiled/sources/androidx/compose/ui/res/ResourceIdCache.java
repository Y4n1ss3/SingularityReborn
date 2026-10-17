package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import defpackage.na0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;
    private final na0 resIdPathMap = new na0();

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.c();
        }
    }

    public final TypedValue resolveResourcePath(Resources resources, int i) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.resIdPathMap.b(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                na0 na0Var = this.resIdPathMap;
                int d = na0Var.d(i);
                Object[] objArr = na0Var.c;
                Object obj = objArr[d];
                na0Var.b[d] = i;
                objArr[d] = typedValue;
            }
        }
        return typedValue;
    }
}
