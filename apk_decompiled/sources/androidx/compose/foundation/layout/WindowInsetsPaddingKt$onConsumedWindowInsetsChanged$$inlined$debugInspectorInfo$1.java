package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ ky $block$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1(ky kyVar) {
        super(1);
        this.$block$inlined = kyVar;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onConsumedWindowInsetsChanged");
        inspectorInfo.getProperties().set("block", this.$block$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
