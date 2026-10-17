package androidx.compose.ui.modifier;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ ProvidableModifierLocal $key$inlined;
    final /* synthetic */ iy $value$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1(ProvidableModifierLocal providableModifierLocal, iy iyVar) {
        super(1);
        this.$key$inlined = providableModifierLocal;
        this.$value$inlined = iyVar;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("modifierLocalProvider");
        inspectorInfo.getProperties().set("key", this.$key$inlined);
        inspectorInfo.getProperties().set("value", this.$value$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
