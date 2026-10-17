package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ TabPosition $currentTabPosition$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(TabPosition tabPosition) {
        super(1);
        this.$currentTabPosition$inlined = tabPosition;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("tabIndicatorOffset");
        inspectorInfo.setValue(this.$currentTabPosition$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
