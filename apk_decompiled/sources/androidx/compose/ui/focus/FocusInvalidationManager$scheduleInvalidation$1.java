package androidx.compose.ui.focus;

import defpackage.iy;
import defpackage.w01;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class FocusInvalidationManager$scheduleInvalidation$1 extends xy implements iy {
    public FocusInvalidationManager$scheduleInvalidation$1(Object obj) {
        super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4402invoke() {
        ((FocusInvalidationManager) this.receiver).invalidateNodes();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m4402invoke();
        return w01.a;
    }
}
