package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.iy;
import defpackage.ji0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 extends f30 implements iy {
    final /* synthetic */ ji0 $disposer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(ji0 ji0Var) {
        super(0);
        this.$disposer = ji0Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6805invoke() {
        ((iy) this.$disposer.d).invoke();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6805invoke();
        return w01.a;
    }
}
