package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class hr0 {
    public final p7 a;

    public hr0(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.a = new p7(view);
            return;
        }
        gr0 gr0Var = new gr0(view);
        gr0Var.e = view;
        this.a = gr0Var;
    }
}
