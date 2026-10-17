package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class l4 implements hn {
    public final hn a;
    public final float b;

    public l4(float f, hn hnVar) {
        while (hnVar instanceof l4) {
            hnVar = ((l4) hnVar).a;
            f += ((l4) hnVar).b;
        }
        this.a = hnVar;
        this.b = f;
    }

    @Override // defpackage.hn
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.a.equals(l4Var.a) && this.b == l4Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
