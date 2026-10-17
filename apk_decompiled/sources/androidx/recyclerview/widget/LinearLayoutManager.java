package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ei0;
import defpackage.j50;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class LinearLayoutManager extends p01 {
    public final int g;
    public final p10 h;
    public final boolean i;
    public boolean j = false;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = 1;
        this.i = false;
        ei0 o = p01.o(context, attributeSet, i, i2);
        int i3 = o.a;
        if (i3 != 0 && i3 != 1) {
            o.m(j50.h(i3, "invalid orientation:"));
            throw null;
        }
        if (i3 != this.g || this.h == null) {
            this.h = p10.q(this, i3);
            this.g = i3;
        }
        boolean z = o.c;
        if (z != this.i) {
            this.i = z;
        }
        J(o.d);
    }

    public void J(boolean z) {
        if (this.j == z) {
            return;
        }
        this.j = z;
    }
}
