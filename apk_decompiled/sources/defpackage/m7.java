package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class m7 {
    public final l7 a;
    public final o7 b;
    public int c = -1;
    public tv0 d;
    public tv0 e;
    public tv0 f;

    public m7(l7 l7Var) {
        o7 o7Var;
        this.a = l7Var;
        PorterDuff.Mode mode = o7.b;
        synchronized (o7.class) {
            try {
                if (o7.c == null) {
                    o7.b();
                }
                o7Var = o7.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = o7Var;
    }

    public final void a() {
        l7 l7Var = this.a;
        Drawable background = l7Var.getBackground();
        if (background != null) {
            if (this.d != null) {
                tv0 tv0Var = this.f;
                if (tv0Var == null) {
                    tv0Var = new tv0();
                    this.f = tv0Var;
                }
                tv0Var.a = null;
                tv0Var.d = false;
                tv0Var.b = null;
                tv0Var.c = false;
                int i = u11.a;
                ColorStateList b = p11.b(l7Var);
                if (b != null) {
                    tv0Var.d = true;
                    tv0Var.a = b;
                }
                PorterDuff.Mode c = p11.c(l7Var);
                if (c != null) {
                    tv0Var.c = true;
                    tv0Var.b = c;
                }
                if (tv0Var.d || tv0Var.c) {
                    int[] drawableState = l7Var.getDrawableState();
                    PorterDuff.Mode mode = o7.b;
                    aj0.i(background, tv0Var, drawableState);
                    return;
                }
            }
            tv0 tv0Var2 = this.e;
            if (tv0Var2 != null) {
                int[] drawableState2 = l7Var.getDrawableState();
                PorterDuff.Mode mode2 = o7.b;
                aj0.i(background, tv0Var2, drawableState2);
            } else {
                tv0 tv0Var3 = this.d;
                if (tv0Var3 != null) {
                    int[] drawableState3 = l7Var.getDrawableState();
                    PorterDuff.Mode mode3 = o7.b;
                    aj0.i(background, tv0Var3, drawableState3);
                }
            }
        }
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            tv0 tv0Var = this.d;
            if (tv0Var == null) {
                tv0Var = new tv0();
                this.d = tv0Var;
            }
            tv0Var.a = colorStateList;
            tv0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }
}
