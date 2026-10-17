package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1 extends f30 implements ky {

    /* renamed from: $$v$c$androidx-compose-ui-unit-TextUnit$-after$0$inlined, reason: not valid java name */
    final /* synthetic */ long f23$$v$c$androidxcomposeuiunitTextUnit$after$0$inlined;

    /* renamed from: $$v$c$androidx-compose-ui-unit-TextUnit$-before$0$inlined, reason: not valid java name */
    final /* synthetic */ long f24$$v$c$androidxcomposeuiunitTextUnit$before$0$inlined;
    final /* synthetic */ AlignmentLine $alignmentLine$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(AlignmentLine alignmentLine, long j, long j2) {
        super(1);
        this.$alignmentLine$inlined = alignmentLine;
        this.f24$$v$c$androidxcomposeuiunitTextUnit$before$0$inlined = j;
        this.f23$$v$c$androidxcomposeuiunitTextUnit$after$0$inlined = j2;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paddingFrom");
        inspectorInfo.getProperties().set("alignmentLine", this.$alignmentLine$inlined);
        inspectorInfo.getProperties().set("before", TextUnit.m7795boximpl(this.f24$$v$c$androidxcomposeuiunitTextUnit$before$0$inlined));
        inspectorInfo.getProperties().set("after", TextUnit.m7795boximpl(this.f23$$v$c$androidxcomposeuiunitTextUnit$after$0$inlined));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
