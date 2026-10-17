package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import defpackage.er;
import defpackage.hn0;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;
import defpackage.si;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToggleableKt {
    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m1025toggleableO2vRcR0(Modifier modifier, final boolean z, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final ky kyVar) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new ToggleableElement(z, mutableInteractionSource, (IndicationNodeFactory) indication, false, z2, role, kyVar, null);
        } else if (indication == null) {
            composed$default = new ToggleableElement(z, mutableInteractionSource, null, false, z2, role, kyVar, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ToggleableElement(z, mutableInteractionSource, null, false, z2, role, kyVar, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new ny() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                    composer.startReplaceGroup(-1525724089);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:634)");
                    }
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new ToggleableElement(z, mutableInteractionSource2, null, false, z2, role, kyVar, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return then;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            }, 1, null);
        }
        return modifier.then(composed$default);
    }

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1026toggleableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, ky kyVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            role = null;
        }
        return m1025toggleableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, kyVar);
    }

    @er
    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m1027toggleableXHw0xAI(Modifier modifier, boolean z, boolean z2, Role role, ky kyVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, role, kyVar) : InspectableValueKt.getNoInspectorInfo(), new hn0(z, z2, role, kyVar, 1));
    }

    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1028toggleableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m1027toggleableXHw0xAI(modifier, z, z2, role, kyVar);
    }

    /* renamed from: toggleable-oSLSa3U, reason: not valid java name */
    public static final Modifier m1029toggleableoSLSa3U(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, ky kyVar) {
        return modifier.then(new ToggleableElement(z, mutableInteractionSource, null, true, z2, role, kyVar, null));
    }

    /* renamed from: toggleable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1030toggleableoSLSa3U$default(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m1029toggleableoSLSa3U(modifier, z, z2, (i & 4) != 0 ? null : role, (i & 8) != 0 ? null : mutableInteractionSource, kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier toggleable_XHw0xAI$lambda$1(boolean z, boolean z2, Role role, ky kyVar, Modifier modifier, Composer composer, int i) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(290332169);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(290332169, i, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:86)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(-778338818);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(-778206200);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceGroup();
        }
        Modifier m1025toggleableO2vRcR0 = m1025toggleableO2vRcR0(Modifier.Companion, z, mutableInteractionSource, indication, z2, role, kyVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1025toggleableO2vRcR0;
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m1031triStateToggleableO2vRcR0(Modifier modifier, final ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final Role role, final iy iyVar) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new TriStateToggleableElement(toggleableState, mutableInteractionSource, (IndicationNodeFactory) indication, false, z, role, iyVar, null);
        } else if (indication == null) {
            composed$default = new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, false, z, role, iyVar, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, false, z, role, iyVar, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new ny() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                    composer.startReplaceGroup(-1525724089);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:634)");
                    }
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource2, null, false, z, role, iyVar, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return then;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            }, 1, null);
        }
        return modifier.then(composed$default);
    }

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1032triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Role role, iy iyVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            role = null;
        }
        return m1031triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z2, role, iyVar);
    }

    @er
    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m1033triStateToggleableXHw0xAI(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, iy iyVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1(toggleableState, z, role, iyVar) : InspectableValueKt.getNoInspectorInfo(), new si(toggleableState, z, role, iyVar, 2));
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1034triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, iy iyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m1033triStateToggleableXHw0xAI(modifier, toggleableState, z, role, iyVar);
    }

    /* renamed from: triStateToggleable-oSLSa3U, reason: not valid java name */
    public static final Modifier m1035triStateToggleableoSLSa3U(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, MutableInteractionSource mutableInteractionSource, iy iyVar) {
        return modifier.then(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, true, z, role, iyVar, null));
    }

    /* renamed from: triStateToggleable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1036triStateToggleableoSLSa3U$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, MutableInteractionSource mutableInteractionSource, iy iyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m1035triStateToggleableoSLSa3U(modifier, toggleableState, z, (i & 4) != 0 ? null : role, (i & 8) != 0 ? null : mutableInteractionSource, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier triStateToggleable_XHw0xAI$lambda$1(ToggleableState toggleableState, boolean z, Role role, iy iyVar, Modifier modifier, Composer composer, int i) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-1808118329);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1808118329, i, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:393)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(1826835840);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(1826968458);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceGroup();
        }
        Modifier m1031triStateToggleableO2vRcR0 = m1031triStateToggleableO2vRcR0(Modifier.Companion, toggleableState, mutableInteractionSource, indication, z, role, iyVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1031triStateToggleableO2vRcR0;
    }
}
