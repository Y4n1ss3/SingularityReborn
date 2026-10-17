package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ModifierLocalConsumerKt {
    public static final Modifier modifierLocalConsumer(Modifier modifier, ky kyVar) {
        return modifier.then(new ModifierLocalConsumerImpl(kyVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1(kyVar) : InspectableValueKt.getNoInspectorInfo()));
    }
}
