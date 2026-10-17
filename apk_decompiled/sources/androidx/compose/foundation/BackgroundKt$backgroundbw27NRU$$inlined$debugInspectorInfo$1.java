package androidx.compose.foundation;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 extends f30 implements ky {

    /* renamed from: $$v$c$androidx-compose-ui-graphics-Color$-color$0$inlined, reason: not valid java name */
    final /* synthetic */ long f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined;
    final /* synthetic */ Shape $shape$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(long j, Shape shape) {
        super(1);
        this.f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined = j;
        this.$shape$inlined = shape;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("background");
        inspectorInfo.setValue(Color.m4751boximpl(this.f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined));
        inspectorInfo.getProperties().set("color", Color.m4751boximpl(this.f5$$v$c$androidxcomposeuigraphicsColor$color$0$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
