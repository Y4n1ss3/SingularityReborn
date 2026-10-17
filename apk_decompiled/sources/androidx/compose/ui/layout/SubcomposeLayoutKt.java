package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SubcomposeLayoutKt {
    private static final boolean ExtraLoggingEnabled = false;
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = new Object() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1
        public String toString() {
            return "ReusedSlotId";
        }
    };
    private static final Object UnspecifiedSlotId = new Object();

    public static final void SubcomposeLayout(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-511989831);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(subcomposeLayoutState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-511989831, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:128)");
            }
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            iy constructor$ui = LayoutNode.Companion.getConstructor$ui();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            Updater.m3886setimpl(m3878constructorimpl, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui());
            Updater.m3886setimpl(m3878constructorimpl, rememberCompositionContext, subcomposeLayoutState.getSetCompositionContext$ui());
            Updater.m3886setimpl(m3878constructorimpl, myVar, subcomposeLayoutState.getSetMeasurePolicy$ui());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
            startRestartGroup.endNode();
            if (startRestartGroup.getSkipping()) {
                startRestartGroup.startReplaceGroup(-1259187287);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1259245908);
                boolean changedInstance = startRestartGroup.changedInstance(subcomposeLayoutState);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new SubcomposeLayoutKt$SubcomposeLayout$4$1(subcomposeLayoutState);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                EffectsKt.SideEffect((iy) rememberedValue, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$5(subcomposeLayoutState, modifier2, myVar, i, i2));
        }
    }

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i) {
        return new FixedCountSubcomposeSlotReusePolicy(i);
    }

    public static final void SubcomposeLayout(Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        my myVar2;
        Composer startRestartGroup = composer.startRestartGroup(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:95)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SubcomposeLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            myVar2 = myVar;
            SubcomposeLayout((SubcomposeLayoutState) rememberedValue, modifier2, myVar2, startRestartGroup, (i3 << 3) & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            myVar2 = myVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$2(modifier, myVar2, i, i2));
        }
    }
}
