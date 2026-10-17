package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class n0 extends ClickableSpan {
    public final int d;
    public final z0 e;
    public final int f;

    public n0(int i, z0 z0Var, int i2) {
        this.d = i;
        this.e = z0Var;
        this.f = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.e.a.performAction(this.f, bundle);
    }
}
