package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import defpackage.er;
import defpackage.fi0;
import defpackage.iy;
import defpackage.my;
import defpackage.ny;
import defpackage.qi;
import defpackage.ri;
import defpackage.si;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClickableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToDownIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToUp(IndirectPointerInputChange indirectPointerInputChange) {
        return (indirectPointerInputChange.isConsumed() || !indirectPointerInputChange.getPreviousPressed() || indirectPointerInputChange.getPressed()) ? false : true;
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m257clickableO2vRcR0(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final iy iyVar) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, false, z, str, role, iyVar, null);
        } else if (indication == null) {
            composed$default = new ClickableElement(mutableInteractionSource, null, false, z, str, role, iyVar, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ClickableElement(mutableInteractionSource, null, false, z, str, role, iyVar, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new ny() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new ClickableElement(mutableInteractionSource2, null, false, z, str, role, iyVar, null));
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

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m258clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, iy iyVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m257clickableO2vRcR0(modifier, mutableInteractionSource, indication, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : role, iyVar);
    }

    @er
    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m259clickableXHw0xAI(Modifier modifier, boolean z, String str, Role role, iy iyVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z, str, role, iyVar) : InspectableValueKt.getNoInspectorInfo(), new si(z, str, role, iyVar));
    }

    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m260clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m259clickableXHw0xAI(modifier, z, str, role, iyVar);
    }

    /* renamed from: clickable-oSLSa3U, reason: not valid java name */
    public static final Modifier m261clickableoSLSa3U(Modifier modifier, boolean z, String str, Role role, MutableInteractionSource mutableInteractionSource, iy iyVar) {
        return modifier.then(new ClickableElement(mutableInteractionSource, null, true, z, str, role, iyVar, null));
    }

    /* renamed from: clickable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m262clickableoSLSa3U$default(Modifier modifier, boolean z, String str, Role role, MutableInteractionSource mutableInteractionSource, iy iyVar, int i, Object obj) {
        MutableInteractionSource mutableInteractionSource2;
        iy iyVar2;
        String str2;
        Role role2;
        Modifier modifier2;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        if ((i & 8) != 0) {
            mutableInteractionSource2 = null;
            str2 = str;
            iyVar2 = iyVar;
            modifier2 = modifier;
            role2 = role;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            iyVar2 = iyVar;
            str2 = str;
            role2 = role;
            modifier2 = modifier;
        }
        return m261clickableoSLSa3U(modifier2, z, str2, role2, mutableInteractionSource2, iyVar2);
    }

    public static final Modifier clickableWithIndicationIfNeeded(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final my myVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? (Modifier) myVar.invoke(mutableInteractionSource, indication) : indication == null ? (Modifier) myVar.invoke(mutableInteractionSource, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then((Modifier) myVar.invoke(mutableInteractionSource, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new ny() { // from class: androidx.compose.foundation.ClickableKt$clickableWithIndicationIfNeeded$1
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
                Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then((Modifier) myVar.invoke(mutableInteractionSource2, null));
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
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier clickable_XHw0xAI$lambda$1(boolean z, String str, Role role, iy iyVar, Modifier modifier, Composer composer, int i) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-756081143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-756081143, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:141)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(-1604682242);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(-1604549624);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceGroup();
        }
        Modifier m257clickableO2vRcR0 = m257clickableO2vRcR0(Modifier.Companion, mutableInteractionSource, indication, z, str, role, iyVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m257clickableO2vRcR0;
    }

    @er
    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final /* synthetic */ Modifier m263combinedClickableXVZzFYc(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final String str2, final iy iyVar, final iy iyVar2, final iy iyVar3) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, false, z, str, role, iyVar3, str2, iyVar, iyVar2, true, null);
        } else if (indication == null) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, iyVar3, str2, iyVar, iyVar2, true, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, iyVar3, str2, iyVar, iyVar2, true, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new ny() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new CombinedClickableElement(mutableInteractionSource2, null, false, z, str, role, iyVar3, str2, iyVar, iyVar2, true, null));
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

    /* renamed from: combinedClickable-XVZzFYc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m264combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, iy iyVar3, int i, Object obj) {
        iy iyVar4;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        iy iyVar5;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str3 = (i & 8) != 0 ? null : str;
        Role role2 = (i & 16) != 0 ? null : role;
        String str4 = (i & 32) != 0 ? null : str2;
        iy iyVar6 = (i & 64) != 0 ? null : iyVar;
        if ((i & Fields.SpotShadowColor) != 0) {
            iyVar4 = null;
            modifier2 = modifier;
            indication2 = indication;
            iyVar5 = iyVar3;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            iyVar4 = iyVar2;
            modifier2 = modifier;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            iyVar5 = iyVar3;
        }
        return m263combinedClickableXVZzFYc(modifier2, mutableInteractionSource2, indication2, z2, str3, role2, str4, iyVar6, iyVar4, iyVar5);
    }

    /* renamed from: combinedClickable-auXiCPI, reason: not valid java name */
    public static final Modifier m265combinedClickableauXiCPI(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final String str2, final iy iyVar, final iy iyVar2, final boolean z2, final iy iyVar3) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, false, z, str, role, iyVar3, str2, iyVar, iyVar2, z2, null);
        } else if (indication == null) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, iyVar3, str2, iyVar, iyVar2, z2, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, iyVar3, str2, iyVar, iyVar2, z2, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new ny() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new CombinedClickableElement(mutableInteractionSource2, null, false, z, str, role, iyVar3, str2, iyVar, iyVar2, z2, null));
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

    /* renamed from: combinedClickable-auXiCPI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m266combinedClickableauXiCPI$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, boolean z2, iy iyVar3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            role = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            iyVar = null;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            iyVar2 = null;
        }
        if ((i & Fields.RotationX) != 0) {
            z2 = true;
        }
        return m265combinedClickableauXiCPI(modifier, mutableInteractionSource, indication, z, str, role, str2, iyVar, iyVar2, z2, iyVar3);
    }

    @er
    /* renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final /* synthetic */ Modifier m267combinedClickablecJG_KMw(Modifier modifier, boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, iy iyVar3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1(z, str, role, iyVar3, iyVar2, iyVar, str2) : InspectableValueKt.getNoInspectorInfo(), new qi(z, str, role, iyVar, iyVar2, iyVar3, str2));
    }

    /* renamed from: combinedClickable-cJG_KMw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m268combinedClickablecJG_KMw$default(Modifier modifier, boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, iy iyVar3, int i, Object obj) {
        iy iyVar4;
        iy iyVar5;
        String str3;
        iy iyVar6;
        String str4;
        Role role2;
        Modifier modifier2;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            iyVar = null;
        }
        if ((i & 32) != 0) {
            iyVar4 = null;
            str3 = str2;
            iyVar5 = iyVar3;
            str4 = str;
            iyVar6 = iyVar;
            modifier2 = modifier;
            role2 = role;
        } else {
            iyVar4 = iyVar2;
            iyVar5 = iyVar3;
            str3 = str2;
            iyVar6 = iyVar;
            str4 = str;
            role2 = role;
            modifier2 = modifier;
        }
        return m267combinedClickablecJG_KMw(modifier2, z, str4, role2, str3, iyVar6, iyVar4, iyVar5);
    }

    @er
    /* renamed from: combinedClickable-f5TDLPQ, reason: not valid java name */
    public static final /* synthetic */ Modifier m269combinedClickablef5TDLPQ(Modifier modifier, final boolean z, final String str, final Role role, final String str2, final iy iyVar, final iy iyVar2, final boolean z2, final iy iyVar3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickablef5TDLPQ$$inlined$debugInspectorInfo$1(z, str, role, iyVar3, iyVar2, iyVar, str2, z2) : InspectableValueKt.getNoInspectorInfo(), new ny() { // from class: pi
            @Override // defpackage.ny
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier combinedClickable_f5TDLPQ$lambda$1;
                int intValue = ((Integer) obj3).intValue();
                combinedClickable_f5TDLPQ$lambda$1 = ClickableKt.combinedClickable_f5TDLPQ$lambda$1(z, str, role, str2, iyVar, iyVar2, z2, iyVar3, (Modifier) obj, (Composer) obj2, intValue);
                return combinedClickable_f5TDLPQ$lambda$1;
            }
        });
    }

    /* renamed from: combinedClickable-f5TDLPQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m270combinedClickablef5TDLPQ$default(Modifier modifier, boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, boolean z2, iy iyVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            iyVar = null;
        }
        if ((i & 32) != 0) {
            iyVar2 = null;
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        return m269combinedClickablef5TDLPQ(modifier, z, str, role, str2, iyVar, iyVar2, z2, iyVar3);
    }

    /* renamed from: combinedClickable-hoGz1lA, reason: not valid java name */
    public static final Modifier m271combinedClickablehoGz1lA(Modifier modifier, boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, boolean z2, MutableInteractionSource mutableInteractionSource, iy iyVar3) {
        return modifier.then(new CombinedClickableElement(mutableInteractionSource, null, true, z, str, role, iyVar3, str2, iyVar, iyVar2, z2, null));
    }

    /* renamed from: combinedClickable-hoGz1lA$default, reason: not valid java name */
    public static /* synthetic */ Modifier m272combinedClickablehoGz1lA$default(Modifier modifier, boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, boolean z2, MutableInteractionSource mutableInteractionSource, iy iyVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            iyVar = null;
        }
        if ((i & 32) != 0) {
            iyVar2 = null;
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            mutableInteractionSource = null;
        }
        return m271combinedClickablehoGz1lA(modifier, z, str, role, str2, iyVar, iyVar2, z2, mutableInteractionSource, iyVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier combinedClickable_cJG_KMw$lambda$1(boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, iy iyVar3, Modifier modifier, Composer composer, int i) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(1969174843);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1969174843, i, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:471)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(-1270399604);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(-1270266986);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceGroup();
        }
        Modifier m265combinedClickableauXiCPI = m265combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z, str, role, str2, iyVar, iyVar2, true, iyVar3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m265combinedClickableauXiCPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier combinedClickable_f5TDLPQ$lambda$1(boolean z, String str, Role role, String str2, iy iyVar, iy iyVar2, boolean z2, iy iyVar3, Modifier modifier, Composer composer, int i) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-1534186401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1534186401, i, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:350)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(2095040488);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(2095173106);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceGroup();
        }
        Modifier m265combinedClickableauXiCPI = m265combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z, str, role, str2, iyVar, iyVar2, z2, iyVar3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m265combinedClickableauXiCPI;
    }

    public static final boolean hasScrollableContainer(TraversableNode traversableNode) {
        fi0 fi0Var = new fi0();
        TraversableNodeKt.traverseAncestors(traversableNode, ScrollableContainerNode.TraverseKey, new ri(fi0Var, 0));
        return fi0Var.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasScrollableContainer$lambda$0(fi0 fi0Var, TraversableNode traversableNode) {
        boolean z;
        if (!fi0Var.d) {
            traversableNode.getClass();
            if (!((ScrollableContainerNode) traversableNode).getEnabled()) {
                z = false;
                fi0Var.d = z;
                return !z;
            }
        }
        z = true;
        fi0Var.d = z;
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m273isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5930getKeyUpCS__XNY()) && m274isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m274isEnterZmokQxo(KeyEvent keyEvent) {
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        return Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5685getDirectionCenterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5699getEnterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5796getNumPadEnterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5847getSpacebarEK5gGoQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMovingIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m275isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5929getKeyDownCS__XNY()) && m274isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsupportedIndicationExceptionMessage(Indication indication) {
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + indication;
    }
}
