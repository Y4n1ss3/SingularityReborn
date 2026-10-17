package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InspectableValueKt {
    private static final ky NoInspectorInfo = InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    private static boolean isDebugInspectorInfoEnabled;

    public static final ky debugInspectorInfo(ky kyVar) {
        return isDebugInspectorInfoEnabled() ? new InspectableValueKt$debugInspectorInfo$1(kyVar) : getNoInspectorInfo();
    }

    public static final ky getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @er
    public static final Modifier inspectable(Modifier modifier, ky kyVar, ky kyVar2) {
        return inspectableWrapper(modifier, kyVar, (Modifier) kyVar2.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, ky kyVar, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(kyVar);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }
}
