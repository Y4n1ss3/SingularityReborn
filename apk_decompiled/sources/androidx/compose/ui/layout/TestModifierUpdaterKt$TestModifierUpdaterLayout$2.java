package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ky $onAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(ky kyVar, int i) {
        super(2);
        this.$onAttached = kyVar;
        this.$$changed = i;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        TestModifierUpdaterKt.TestModifierUpdaterLayout(this.$onAttached, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
