package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.f30;
import defpackage.j50;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1 extends f30 implements ky {

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-after$0$inlined, reason: not valid java name */
    final /* synthetic */ float f21$$v$c$androidxcomposeuiunitDp$after$0$inlined;

    /* renamed from: $$v$c$androidx-compose-ui-unit-Dp$-before$0$inlined, reason: not valid java name */
    final /* synthetic */ float f22$$v$c$androidxcomposeuiunitDp$before$0$inlined;
    final /* synthetic */ AlignmentLine $alignmentLine$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(AlignmentLine alignmentLine, float f, float f2) {
        super(1);
        this.$alignmentLine$inlined = alignmentLine;
        this.f22$$v$c$androidxcomposeuiunitDp$before$0$inlined = f;
        this.f21$$v$c$androidxcomposeuiunitDp$after$0$inlined = f2;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paddingFrom");
        inspectorInfo.getProperties().set("alignmentLine", this.$alignmentLine$inlined);
        j50.g(this.f22$$v$c$androidxcomposeuiunitDp$before$0$inlined, inspectorInfo.getProperties(), "before", inspectorInfo).set("after", Dp.m7609boximpl(this.f21$$v$c$androidxcomposeuiunitDp$after$0$inlined));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
