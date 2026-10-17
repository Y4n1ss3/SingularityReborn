package androidx.compose.ui.focus;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusOrderModifierKt$focusOrder$2 extends f30 implements ky {
    final /* synthetic */ FocusOrderToProperties $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOrderModifierKt$focusOrder$2(FocusOrderToProperties focusOrderToProperties) {
        super(1);
        this.$scope = focusOrderToProperties;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return w01.a;
    }

    public final void invoke(FocusProperties focusProperties) {
        this.$scope.apply(focusProperties);
    }
}
