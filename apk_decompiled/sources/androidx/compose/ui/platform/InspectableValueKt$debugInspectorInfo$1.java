package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InspectableValueKt$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ ky $definitions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectableValueKt$debugInspectorInfo$1(ky kyVar) {
        super(1);
        this.$definitions = kyVar;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        this.$definitions.invoke(inspectorInfo);
    }
}
