package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import defpackage.j50;
import defpackage.lu0;
import defpackage.o;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final int k;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = -1;
        new SparseIntArray();
        new SparseIntArray();
        SparseIntArray sparseIntArray = new SparseIntArray();
        new SparseIntArray();
        new Rect();
        int i3 = p01.o(context, attributeSet, i, i2).b;
        if (i3 == this.k) {
            return;
        }
        if (i3 < 1) {
            o.m(j50.h(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.k = i3;
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J(boolean z) {
        if (z) {
            lu0.a("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.J(false);
        }
    }
}
