package androidx.compose.foundation;

import defpackage.iy;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class FocusableNode$applySemantics$1 extends xy implements iy {
    public FocusableNode$applySemantics$1(Object obj) {
        super(0, obj, FocusableNode.class, "requestFocus", "requestFocus()Z", 0);
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        return Boolean.valueOf(((FocusableNode) this.receiver).requestFocus());
    }
}
