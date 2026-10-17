package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1 extends f30 implements ky {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-size$0$inlined, reason: not valid java name */
    final /* synthetic */ float f41$$v$c$androidxcomposeuiunitDp$size$0$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(float f) {
        super(1);
        this.f41$$v$c$androidxcomposeuiunitDp$size$0$inlined = f;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("size");
        inspectorInfo.setValue(Dp.m7609boximpl(this.f41$$v$c$androidxcomposeuiunitDp$size$0$inlined));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
