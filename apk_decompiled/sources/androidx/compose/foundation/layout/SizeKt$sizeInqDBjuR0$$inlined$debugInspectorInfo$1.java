package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.f30;
import defpackage.j50;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends f30 implements ky {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-maxHeight$0$inlined, reason: not valid java name */
    final /* synthetic */ float f44$$v$c$androidxcomposeuiunitDp$maxHeight$0$inlined;

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-maxWidth$0$inlined, reason: not valid java name */
    final /* synthetic */ float f45$$v$c$androidxcomposeuiunitDp$maxWidth$0$inlined;

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-minHeight$0$inlined, reason: not valid java name */
    final /* synthetic */ float f46$$v$c$androidxcomposeuiunitDp$minHeight$0$inlined;

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-minWidth$0$inlined, reason: not valid java name */
    final /* synthetic */ float f47$$v$c$androidxcomposeuiunitDp$minWidth$0$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f, float f2, float f3, float f4) {
        super(1);
        this.f47$$v$c$androidxcomposeuiunitDp$minWidth$0$inlined = f;
        this.f46$$v$c$androidxcomposeuiunitDp$minHeight$0$inlined = f2;
        this.f45$$v$c$androidxcomposeuiunitDp$maxWidth$0$inlined = f3;
        this.f44$$v$c$androidxcomposeuiunitDp$maxHeight$0$inlined = f4;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sizeIn");
        j50.g(this.f45$$v$c$androidxcomposeuiunitDp$maxWidth$0$inlined, j50.g(this.f46$$v$c$androidxcomposeuiunitDp$minHeight$0$inlined, j50.g(this.f47$$v$c$androidxcomposeuiunitDp$minWidth$0$inlined, inspectorInfo.getProperties(), "minWidth", inspectorInfo), "minHeight", inspectorInfo), "maxWidth", inspectorInfo).set("maxHeight", Dp.m7609boximpl(this.f44$$v$c$androidxcomposeuiunitDp$maxHeight$0$inlined));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
