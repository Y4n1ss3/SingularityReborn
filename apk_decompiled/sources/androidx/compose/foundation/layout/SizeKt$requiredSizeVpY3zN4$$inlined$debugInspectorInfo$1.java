package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.f30;
import defpackage.j50;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1 extends f30 implements ky {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-height$0$inlined, reason: not valid java name */
    final /* synthetic */ float f32$$v$c$androidxcomposeuiunitDp$height$0$inlined;

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-width$0$inlined, reason: not valid java name */
    final /* synthetic */ float f33$$v$c$androidxcomposeuiunitDp$width$0$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f2) {
        super(1);
        this.f33$$v$c$androidxcomposeuiunitDp$width$0$inlined = f;
        this.f32$$v$c$androidxcomposeuiunitDp$height$0$inlined = f2;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requiredSize");
        j50.g(this.f33$$v$c$androidxcomposeuiunitDp$width$0$inlined, inspectorInfo.getProperties(), "width", inspectorInfo).set("height", Dp.m7609boximpl(this.f32$$v$c$androidxcomposeuiunitDp$height$0$inlined));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
