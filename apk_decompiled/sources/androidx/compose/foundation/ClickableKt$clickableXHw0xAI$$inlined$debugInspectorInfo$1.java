package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.uf;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ iy $onClick$inlined;
    final /* synthetic */ String $onClickLabel$inlined;
    final /* synthetic */ Role $role$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z, String str, Role role, iy iyVar) {
        super(1);
        this.$enabled$inlined = z;
        this.$onClickLabel$inlined = str;
        this.$role$inlined = role;
        this.$onClick$inlined = iyVar;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clickable");
        uf.d(this.$enabled$inlined, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("onClickLabel", this.$onClickLabel$inlined);
        inspectorInfo.getProperties().set("role", this.$role$inlined);
        inspectorInfo.getProperties().set("onClick", this.$onClick$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
