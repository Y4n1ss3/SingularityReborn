package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class po0 {
    public q10 a = new ak0();
    public q10 b = new ak0();
    public q10 c = new ak0();
    public q10 d = new ak0();
    public hn e = new e(0.0f);
    public hn f = new e(0.0f);
    public hn g = new e(0.0f);
    public hn h = new e(0.0f);
    public ts i;
    public ts j;
    public ts k;
    public ts l;

    public po0() {
        int i = 0;
        this.i = new ts(i);
        this.j = new ts(i);
        this.k = new ts(i);
        this.l = new ts(i);
    }

    public static po0 b(Context context, AttributeSet attributeSet, int i, int i2) {
        e eVar = new e(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh0.d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(uh0.f);
        try {
            int i3 = obtainStyledAttributes2.getInt(0, 0);
            int i4 = obtainStyledAttributes2.getInt(3, i3);
            int i5 = obtainStyledAttributes2.getInt(4, i3);
            int i6 = obtainStyledAttributes2.getInt(2, i3);
            int i7 = obtainStyledAttributes2.getInt(1, i3);
            hn c = c(obtainStyledAttributes2, 5, eVar);
            hn c2 = c(obtainStyledAttributes2, 8, c);
            hn c3 = c(obtainStyledAttributes2, 9, c);
            hn c4 = c(obtainStyledAttributes2, 7, c);
            hn c5 = c(obtainStyledAttributes2, 6, c);
            po0 po0Var = new po0();
            po0Var.a = y80.m(i4);
            po0Var.e = c2;
            po0Var.b = y80.m(i5);
            po0Var.f = c3;
            po0Var.c = y80.m(i6);
            po0Var.g = c4;
            po0Var.d = y80.m(i7);
            po0Var.h = c5;
            return po0Var;
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    public static hn c(TypedArray typedArray, int i, hn hnVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new e(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new oi0(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return hnVar;
    }

    public po0 a() {
        po0 po0Var = new po0();
        po0Var.a = this.a;
        po0Var.b = this.b;
        po0Var.c = this.c;
        po0Var.d = this.d;
        po0Var.e = this.e;
        po0Var.f = this.f;
        po0Var.g = this.g;
        po0Var.h = this.h;
        po0Var.i = this.i;
        po0Var.j = this.j;
        po0Var.k = this.k;
        po0Var.l = this.l;
        return po0Var;
    }

    public boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(ts.class) && this.j.getClass().equals(ts.class) && this.i.getClass().equals(ts.class) && this.k.getClass().equals(ts.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && ((this.b instanceof ak0) && (this.a instanceof ak0) && (this.c instanceof ak0) && (this.d instanceof ak0));
    }
}
