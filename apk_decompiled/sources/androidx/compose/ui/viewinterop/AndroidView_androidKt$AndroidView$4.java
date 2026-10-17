package androidx.compose.ui.viewinterop;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$AndroidView$4 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ky $factory;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ky $onRelease;
    final /* synthetic */ ky $onReset;
    final /* synthetic */ ky $update;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$4(ky kyVar, Modifier modifier, ky kyVar2, ky kyVar3, ky kyVar4, int i, int i2) {
        super(2);
        this.$factory = kyVar;
        this.$modifier = modifier;
        this.$onReset = kyVar2;
        this.$onRelease = kyVar3;
        this.$update = kyVar4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(Composer composer, int i) {
        AndroidView_androidKt.AndroidView(this.$factory, this.$modifier, this.$onReset, this.$onRelease, this.$update, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
