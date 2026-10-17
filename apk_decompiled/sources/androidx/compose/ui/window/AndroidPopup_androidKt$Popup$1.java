package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import defpackage.f30;
import defpackage.iy;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$1 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ my $content;
    final /* synthetic */ long $offset;
    final /* synthetic */ iy $onDismissRequest;
    final /* synthetic */ PopupProperties $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(Alignment alignment, long j, iy iyVar, PopupProperties popupProperties, my myVar, int i, int i2) {
        super(2);
        this.$alignment = alignment;
        this.$offset = j;
        this.$onDismissRequest = iyVar;
        this.$properties = popupProperties;
        this.$content = myVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(Composer composer, int i) {
        AndroidPopup_androidKt.m7873PopupK5zGePQ(this.$alignment, this.$offset, this.$onDismissRequest, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
