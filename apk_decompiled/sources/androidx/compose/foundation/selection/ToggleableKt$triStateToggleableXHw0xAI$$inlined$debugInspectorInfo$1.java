package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.uf;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ iy $onClick$inlined;
    final /* synthetic */ Role $role$inlined;
    final /* synthetic */ ToggleableState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1(ToggleableState toggleableState, boolean z, Role role, iy iyVar) {
        super(1);
        this.$state$inlined = toggleableState;
        this.$enabled$inlined = z;
        this.$role$inlined = role;
        this.$onClick$inlined = iyVar;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("triStateToggleable");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        uf.d(this.$enabled$inlined, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("role", this.$role$inlined);
        inspectorInfo.getProperties().set("onClick", this.$onClick$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
