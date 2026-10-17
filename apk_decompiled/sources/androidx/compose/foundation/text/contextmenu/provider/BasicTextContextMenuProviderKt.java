package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.h;
import defpackage.i3;
import defpackage.iy;
import defpackage.j3;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p2;
import defpackage.py;
import defpackage.q8;
import defpackage.uo;
import defpackage.w01;
import defpackage.z5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTextContextMenuProviderKt {
    public static final void ProvideBasicTextContextMenu(Modifier modifier, ProvidableCompositionLocal<TextContextMenuProvider> providableCompositionLocal, py pyVar, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-714464401);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(providableCompositionLocal) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(pyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-714464401, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:80)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BasicTextContextMenuProvider basicTextContextMenuProvider = basicTextContextMenuProvider(pyVar, startRestartGroup, (i2 >> 6) & 14);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(basicTextContextMenuProvider), ComposableLambdaKt.rememberComposableLambda(274270255, true, new q8(modifier, (MutableState) rememberedValue, myVar, basicTextContextMenuProvider, 1), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p2(modifier, providableCompositionLocal, pyVar, myVar, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideBasicTextContextMenu$lambda$0(ProvidableCompositionLocal providableCompositionLocal, py pyVar, my myVar, int i, Composer composer, int i2) {
        ProvideBasicTextContextMenu(providableCompositionLocal, pyVar, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final LayoutCoordinates ProvideBasicTextContextMenu$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideBasicTextContextMenu$lambda$4(Modifier modifier, MutableState mutableState, my myVar, BasicTextContextMenuProvider basicTextContextMenuProvider, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274270255, i, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu.<anonymous> (BasicTextContextMenuProvider.kt:87)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new i3(mutableState, 4);
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (ky) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onGloballyPositioned);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
            uo.h(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            myVar.invoke(composer, 0);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new j3(mutableState, 5);
                composer.updateRememberedValue(rememberedValue2);
            }
            basicTextContextMenuProvider.ContextMenu((iy) rememberedValue2, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideBasicTextContextMenu$lambda$4$0$0(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates ProvideBasicTextContextMenu$lambda$4$1$0$0(MutableState mutableState) {
        LayoutCoordinates ProvideBasicTextContextMenu$lambda$2 = ProvideBasicTextContextMenu$lambda$2(mutableState);
        if (ProvideBasicTextContextMenu$lambda$2 != null) {
            return ProvideBasicTextContextMenu$lambda$2;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        o.j();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideBasicTextContextMenu$lambda$5(Modifier modifier, ProvidableCompositionLocal providableCompositionLocal, py pyVar, my myVar, int i, Composer composer, int i2) {
        ProvideBasicTextContextMenu(modifier, providableCompositionLocal, pyVar, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final BasicTextContextMenuProvider basicTextContextMenuProvider(py pyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(100861460, i, -1, "androidx.compose.foundation.text.contextmenu.provider.basicTextContextMenuProvider (BasicTextContextMenuProvider.kt:106)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(pyVar)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BasicTextContextMenuProvider(pyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        BasicTextContextMenuProvider basicTextContextMenuProvider = (BasicTextContextMenuProvider) rememberedValue;
        boolean changed = composer.changed(basicTextContextMenuProvider);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new h(basicTextContextMenuProvider, 5);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(basicTextContextMenuProvider, (ky) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTextContextMenuProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult basicTextContextMenuProvider$lambda$1$0(final BasicTextContextMenuProvider basicTextContextMenuProvider, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$basicTextContextMenuProvider$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                BasicTextContextMenuProvider.this.cancel();
            }
        };
    }

    public static final void ProvideBasicTextContextMenu(ProvidableCompositionLocal<TextContextMenuProvider> providableCompositionLocal, py pyVar, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2072681886);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(providableCompositionLocal) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(pyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2072681886, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:64)");
            }
            int i3 = i2 << 3;
            ProvideBasicTextContextMenu(Modifier.Companion, providableCompositionLocal, pyVar, myVar, startRestartGroup, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 3, providableCompositionLocal, pyVar, myVar));
        }
    }
}
