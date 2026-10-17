package androidx.compose.foundation;

import defpackage.ky;
import defpackage.w01;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends xy implements ky {
    public AbstractClickableNode$focusableNode$1(Object obj) {
        super(1, obj, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return w01.a;
    }

    public final void invoke(boolean z) {
        ((AbstractClickableNode) this.receiver).onFocusChange(z);
    }
}
