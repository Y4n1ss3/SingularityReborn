package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class q21 {
    public final v00 a;
    public final v00 b;

    public q21(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        lowerBound = bounds.getLowerBound();
        this.a = v00.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.b = v00.c(upperBound);
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public q21(v00 v00Var, v00 v00Var2) {
        this.a = v00Var;
        this.b = v00Var2;
    }
}
