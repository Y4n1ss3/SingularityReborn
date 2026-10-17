package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.lumi.singularity.R;
import defpackage.cq;
import defpackage.p10;
import defpackage.p7;
import defpackage.po0;
import defpackage.ts;
import defpackage.uh0;
import defpackage.v80;
import defpackage.w80;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends p10 {
    public final ts k;
    public final w80 l;
    public final ColorStateList m;
    public final po0 n;
    public int o;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        int resourceId;
        ColorStateList q;
        new p7((SideSheetBehavior) this);
        this.o = 5;
        new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh0.g);
        if (obtainStyledAttributes.hasValue(3)) {
            this.m = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (q = cq.q(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : q;
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.n = po0.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            obtainStyledAttributes.getResourceId(5, -1);
        }
        po0 po0Var = this.n;
        if (po0Var != null) {
            w80 w80Var = new w80(po0Var);
            this.l = w80Var;
            w80Var.e(context);
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                w80 w80Var2 = this.l;
                v80 v80Var = w80Var2.a;
                if (v80Var.c != colorStateList) {
                    v80Var.c = colorStateList;
                    w80Var2.onStateChange(w80Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.l.setTint(typedValue.data);
            }
        }
        obtainStyledAttributes.getDimension(2, -1.0f);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.k == null) {
            this.k = new ts(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new p7((SideSheetBehavior) this);
        this.o = 5;
        new LinkedHashSet();
    }
}
