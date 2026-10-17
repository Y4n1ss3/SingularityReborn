package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IndicationKt$indication$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ Indication $indication$inlined;
    final /* synthetic */ InteractionSource $interactionSource$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$$inlined$debugInspectorInfo$1(InteractionSource interactionSource, Indication indication) {
        super(1);
        this.$interactionSource$inlined = interactionSource;
        this.$indication$inlined = indication;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indication");
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("indication", this.$indication$inlined);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
