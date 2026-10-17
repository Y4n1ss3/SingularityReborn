package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.f30;
import defpackage.j50;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1 extends f30 implements ky {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-max$0$inlined, reason: not valid java name */
    final /* synthetic */ float f49$$v$c$androidxcomposeuiunitDp$max$0$inlined;

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-min$0$inlined, reason: not valid java name */
    final /* synthetic */ float f50$$v$c$androidxcomposeuiunitDp$min$0$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f2) {
        super(1);
        this.f50$$v$c$androidxcomposeuiunitDp$min$0$inlined = f;
        this.f49$$v$c$androidxcomposeuiunitDp$max$0$inlined = f2;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("widthIn");
        j50.g(this.f50$$v$c$androidxcomposeuiunitDp$min$0$inlined, inspectorInfo.getProperties(), "min", inspectorInfo).set("max", Dp.m7609boximpl(this.f49$$v$c$androidxcomposeuiunitDp$max$0$inlined));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
