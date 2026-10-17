package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ci0 implements dl0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public ci0(el0 el0Var) {
        el0Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.dl0
    public final Bundle a() {
        Bundle g = p10.g((xe0[]) Arrays.copyOf(new xe0[0], 0));
        g.putStringArrayList("classes_to_restore", p01.E(yi.I0(this.a)));
        return g;
    }
}
