package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutKt$MultiMeasureLayout$2 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ my $content;
    final /* synthetic */ MeasurePolicy $measurePolicy;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$MultiMeasureLayout$2(Modifier modifier, my myVar, MeasurePolicy measurePolicy, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$content = myVar;
        this.$measurePolicy = measurePolicy;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(Composer composer, int i) {
        LayoutKt.MultiMeasureLayout(this.$modifier, this.$content, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
