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
import defpackage.er;
import defpackage.hn0;
import defpackage.iy;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectableKt {
    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m1018selectableO2vRcR0(Modifier modifier, final boolean z, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final iy iyVar) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new SelectableElement(z, mutableInteractionSource, (IndicationNodeFactory) indication, false, z2, role, iyVar, null);
        } else if (indication == null) {
            composed$default = new SelectableElement(z, mutableInteractionSource, null, false, z2, role, iyVar, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new SelectableElement(z, mutableInteractionSource, null, false, z2, role, iyVar, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new ny() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new SelectableElement(z, mutableInteractionSource2, null, false, z2, role, iyVar, null));
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

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1019selectableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, iy iyVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            role = null;
        }
        return m1018selectableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, iyVar);
    }

    @er
    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m1020selectableXHw0xAI(Modifier modifier, boolean z, boolean z2, Role role, iy iyVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, role, iyVar) : InspectableValueKt.getNoInspectorInfo(), new hn0(z, z2, role, iyVar, 0));
    }

    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1021selectableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, iy iyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m1020selectableXHw0xAI(modifier, z, z2, role, iyVar);
    }

    /* renamed from: selectable-oSLSa3U, reason: not valid java name */
    public static final Modifier m1022selectableoSLSa3U(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, iy iyVar) {
        return modifier.then(new SelectableElement(z, mutableInteractionSource, null, true, z2, role, iyVar, null));
    }

    /* renamed from: selectable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1023selectableoSLSa3U$default(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, iy iyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m1022selectableoSLSa3U(modifier, z, z2, (i & 4) != 0 ? null : role, (i & 8) != 0 ? null : mutableInteractionSource, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier selectable_XHw0xAI$lambda$1(boolean z, boolean z2, Role role, iy iyVar, Modifier modifier, Composer composer, int i) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-2124609672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124609672, i, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:82)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(686451247);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(686583865);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceGroup();
        }
        Modifier m1018selectableO2vRcR0 = m1018selectableO2vRcR0(Modifier.Companion, z, mutableInteractionSource, indication, z2, role, iyVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1018selectableO2vRcR0;
    }
}
