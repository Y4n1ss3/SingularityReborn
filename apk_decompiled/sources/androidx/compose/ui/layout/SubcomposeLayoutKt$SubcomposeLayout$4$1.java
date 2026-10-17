package androidx.compose.ui.layout;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$4$1 extends f30 implements iy {
    final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$4$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(0);
        this.$state = subcomposeLayoutState;
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6370invoke();
        return w01.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6370invoke() {
        this.$state.forceRecomposeChildren$ui();
    }
}
