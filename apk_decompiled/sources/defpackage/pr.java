package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pr {
    public final DisplayCutout a;

    public pr(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final v00 a() {
        return Build.VERSION.SDK_INT >= 30 ? v00.c(v0.c(this.a)) : v00.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pr.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((pr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
