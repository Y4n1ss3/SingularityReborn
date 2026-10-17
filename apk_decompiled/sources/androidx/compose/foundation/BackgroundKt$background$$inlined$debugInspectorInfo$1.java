package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BackgroundKt$background$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ float $alpha$inlined;
    final /* synthetic */ Brush $brush$inlined;
    final /* synthetic */ Shape $shape$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundKt$background$$inlined$debugInspectorInfo$1(float f, Brush brush, Shape shape) {
        super(1);
        this.$alpha$inlined = f;
        this.$brush$inlined = brush;
        this.$shape$inlined = shape;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("background");
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("brush", this.$brush$inlined);
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
