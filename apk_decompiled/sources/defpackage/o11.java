package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class o11 implements View.OnApplyWindowInsetsListener {
    public p31 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ fd0 c;

    public o11(View view, fd0 fd0Var) {
        this.b = view;
        this.c = fd0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        p31 c = p31.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        fd0 fd0Var = this.c;
        if (i < 30) {
            p11.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return fd0Var.onApplyWindowInsets(view, c).b();
            }
        }
        this.a = c;
        p31 onApplyWindowInsets = fd0Var.onApplyWindowInsets(view, c);
        if (i >= 30) {
            return onApplyWindowInsets.b();
        }
        int i2 = u11.a;
        n11.a(view);
        return onApplyWindowInsets.b();
    }
}
