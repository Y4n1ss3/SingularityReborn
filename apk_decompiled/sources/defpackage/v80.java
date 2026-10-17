package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class v80 extends Drawable.ConstantState {
    public po0 a;
    public vs b;
    public ColorStateList c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public Rect f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public Paint.Style l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        w80 w80Var = new w80(this);
        w80Var.e = true;
        return w80Var;
    }
}
