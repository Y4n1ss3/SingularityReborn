package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.lumi.singularity.R;
import defpackage.cq;
import defpackage.o;
import defpackage.p10;
import defpackage.p7;
import defpackage.po0;
import defpackage.uh0;
import defpackage.v80;
import defpackage.w80;
import defpackage.we;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends p10 {
    public final boolean k;
    public int l;
    public boolean m;
    public final w80 n;
    public final ColorStateList o;
    public final boolean p;
    public final po0 q;
    public boolean r;
    public final ValueAnimator s;
    public final int t;
    public final boolean u;
    public int v;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int resourceId;
        ColorStateList q;
        this.k = true;
        new p7((BottomSheetBehavior) this);
        this.v = 4;
        new ArrayList();
        new SparseIntArray();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh0.a);
        int i3 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.o = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (q = cq.q(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : q;
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.q = po0.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        po0 po0Var = this.q;
        if (po0Var != null) {
            w80 w80Var = new w80(po0Var);
            this.n = w80Var;
            w80Var.e(context);
            ColorStateList colorStateList = this.o;
            if (colorStateList != null) {
                w80 w80Var2 = this.n;
                v80 v80Var = w80Var2.a;
                if (v80Var.c != colorStateList) {
                    v80Var.c = colorStateList;
                    w80Var2.onStateChange(w80Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.n.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.setDuration(500L);
        this.s.addUpdateListener(new we(this));
        obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            W(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            W(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.u != z) {
            this.u = z;
            if (!z && this.v == 5 && this.v != 4) {
                this.v = 4;
            }
        }
        obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.k != z2) {
            this.k = z2;
            if (!z2 || (i = this.v) != 6) {
                i3 = this.v;
                i = i3;
            }
            if (i == i3) {
                i3 = i;
            } else {
                this.v = i3;
            }
            X(i3);
        }
        obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            o.m("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                o.m("offset must be greater than or equal to 0");
                throw null;
            }
            this.t = dimensionPixelOffset;
            X(this.v);
        } else {
            int i4 = peekValue2.data;
            if (i4 < 0) {
                o.m("offset must be greater than or equal to 0");
                throw null;
            }
            this.t = i4;
            X(this.v);
        }
        obtainStyledAttributes.getInt(11, 500);
        obtainStyledAttributes.getBoolean(17, false);
        obtainStyledAttributes.getBoolean(18, false);
        obtainStyledAttributes.getBoolean(19, false);
        obtainStyledAttributes.getBoolean(20, true);
        obtainStyledAttributes.getBoolean(14, false);
        obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.getBoolean(16, false);
        this.p = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void W(int i) {
        boolean z = this.m;
        if (i == -1) {
            if (z) {
                return;
            }
            this.m = true;
        } else if (z || this.l != i) {
            this.m = false;
            this.l = Math.max(0, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r7.k ? 0 : java.lang.Math.max(r7.t, 0)) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i) {
        boolean z;
        w80 w80Var;
        float f;
        if (i == 2) {
            return;
        }
        if (this.v == 3) {
            if (!this.p) {
            }
            z = true;
            if (this.r != z || (w80Var = this.n) == null) {
            }
            this.r = z;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                    return;
                }
                f = z ? 0.0f : 1.0f;
                valueAnimator.setFloatValues(1.0f - f, f);
                valueAnimator.start();
                return;
            }
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            f = this.r ? 0.0f : 1.0f;
            v80 v80Var = w80Var.a;
            if (v80Var.h != f) {
                v80Var.h = f;
                w80Var.e = true;
                w80Var.invalidateSelf();
                return;
            }
            return;
        }
        z = false;
        if (this.r != z) {
        }
    }

    public BottomSheetBehavior() {
        this.k = true;
        new p7((BottomSheetBehavior) this);
        this.v = 4;
        new ArrayList();
        new SparseIntArray();
    }
}
