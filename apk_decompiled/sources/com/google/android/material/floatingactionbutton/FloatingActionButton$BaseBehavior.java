package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.p10;
import defpackage.uh0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior<T> extends p10 {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh0.c);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
