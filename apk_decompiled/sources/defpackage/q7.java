package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class q7 extends ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ w7 d;

    public q7(w7 w7Var, int i, int i2, WeakReference weakReference) {
        this.d = w7Var;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.ej0
    public final void onFontRetrieved(Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = v7.a(typeface, i, (this.b & 2) != 0);
        }
        w7 w7Var = this.d;
        if (w7Var.m) {
            w7Var.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                int i2 = u11.a;
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i3 = w7Var.j;
                if (isAttachedToWindow) {
                    textView.post(new r7(textView, typeface, i3));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }

    @Override // defpackage.ej0
    public final void onFontRetrievalFailed(int i) {
    }
}
