package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.iy;
import defpackage.s40;
import defpackage.w01;
import defpackage.w40;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends f30 implements iy {
    final /* synthetic */ s40 $lifecycle;
    final /* synthetic */ w40 $observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(s40 s40Var, w40 w40Var) {
        super(0);
        this.$lifecycle = s40Var;
        this.$observer = w40Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6806invoke() {
        this.$lifecycle.b(this.$observer);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6806invoke();
        return w01.a;
    }
}
