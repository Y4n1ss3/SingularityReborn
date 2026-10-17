package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ModifierLocalProviderKt {
    public static final <T> Modifier modifierLocalProvider(Modifier modifier, ProvidableModifierLocal<T> providableModifierLocal, iy iyVar) {
        return modifier.then(new ModifierLocalProviderKt$modifierLocalProvider$1(providableModifierLocal, iyVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1(providableModifierLocal, iyVar) : InspectableValueKt.getNoInspectorInfo()));
    }
}
