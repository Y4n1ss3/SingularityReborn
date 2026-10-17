package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.ei0;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.zk0;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends p01 {
    public final int g;
    public final zk0[] h;
    public final p10 i;
    public final p10 j;
    public final int k;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = -1;
        new Rect();
        ei0 o = p01.o(context, attributeSet, i, i2);
        int i3 = o.a;
        if (i3 != 0 && i3 != 1) {
            o.m("invalid orientation.");
            throw null;
        }
        if (i3 != this.k) {
            this.k = i3;
            p10 p10Var = this.i;
            this.i = this.j;
            this.j = p10Var;
        }
        int i4 = o.b;
        if (i4 != this.g) {
            this.g = i4;
            new BitSet(this.g);
            this.h = new zk0[this.g];
            for (int i5 = 0; i5 < this.g; i5++) {
                zk0[] zk0VarArr = this.h;
                zk0 zk0Var = new zk0(3);
                new ArrayList();
                zk0VarArr[i5] = zk0Var;
            }
        }
        this.i = p10.q(this, this.k);
        this.j = p10.q(this, 1 - this.k);
    }
}
