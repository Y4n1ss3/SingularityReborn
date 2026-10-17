package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cj0 {
    public final Resources a;
    public final Resources.Theme b;

    public cj0(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cj0.class == obj.getClass()) {
            cj0 cj0Var = (cj0) obj;
            if (this.a.equals(cj0Var.a) && Objects.equals(this.b, cj0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
