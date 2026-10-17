package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerKt$visible$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ boolean $visible$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$visible$$inlined$debugInspectorInfo$1(boolean z) {
        super(1);
        this.$visible$inlined = z;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("visible");
        inspectorInfo.getProperties().set("visible", Boolean.valueOf(this.$visible$inlined));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
