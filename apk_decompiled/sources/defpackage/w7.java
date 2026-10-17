package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class w7 {
    public final l7 a;
    public tv0 b;
    public tv0 c;
    public tv0 d;
    public tv0 e;
    public tv0 f;
    public tv0 g;
    public tv0 h;
    public final a8 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public w7(l7 l7Var) {
        this.a = l7Var;
        this.i = new a8(l7Var);
    }

    public static tv0 c(Context context, o7 o7Var, int i) {
        ColorStateList g;
        synchronized (o7Var) {
            g = o7Var.a.g(context, i);
        }
        if (g == null) {
            return null;
        }
        tv0 tv0Var = new tv0();
        tv0Var.d = true;
        tv0Var.a = g;
        return tv0Var;
    }

    public final void a(Drawable drawable, tv0 tv0Var) {
        if (drawable == null || tv0Var == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = o7.b;
        aj0.i(drawable, tv0Var, drawableState);
    }

    public final void b() {
        tv0 tv0Var = this.b;
        l7 l7Var = this.a;
        if (tv0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = l7Var.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a = s7.a(l7Var);
        a(a[0], this.f);
        a(a[2], this.g);
    }

    public final void d(Context context, c8 c8Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) c8Var.a;
        this.j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.k = i2;
        if (i2 != -1) {
            this.j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface e = c8Var.e(i4, this.j, new q7(this, i5, i6, new WeakReference(this.a)));
                if (e != null) {
                    if (this.k != -1) {
                        this.l = v7.a(Typeface.create(e, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = e;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = v7.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(string, this.j);
        }
    }
}
