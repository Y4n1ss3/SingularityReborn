package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.i3;
import defpackage.iy;
import defpackage.j3;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.l6;
import defpackage.my;
import defpackage.o;
import defpackage.om;
import defpackage.sq;
import defpackage.uo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlatformDefaultTextContextMenuProviders_androidKt {
    private static final void ProvideBothDefaultProviders(Modifier modifier, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(790527681);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(790527681, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders (PlatformDefaultTextContextMenuProviders.android.kt:58)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new j3(mutableState, 17);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            iy iyVar = (iy) rememberedValue2;
            BasicTextContextMenuProvider defaultTextContextMenuDropdown = DefaultTextContextMenuDropdownProvider_androidKt.defaultTextContextMenuDropdown(startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextContextMenuProviderKt.getLocalTextContextMenuToolbarProvider().provides(AndroidTextContextMenuToolbarProvider_androidKt.platformTextContextMenuToolbarProvider(iyVar, null, startRestartGroup, 6, 2)), TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider().provides(defaultTextContextMenuDropdown)}, ComposableLambdaKt.rememberComposableLambda(1070596993, true, new om(modifier, mutableState, myVar, defaultTextContextMenuDropdown, iyVar), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new sq(modifier, myVar, i, i3));
        }
    }

    private static final LayoutCoordinates ProvideBothDefaultProviders$lambda$1(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates ProvideBothDefaultProviders$lambda$3$0(MutableState mutableState) {
        LayoutCoordinates ProvideBothDefaultProviders$lambda$1 = ProvideBothDefaultProviders$lambda$1(mutableState);
        if (ProvideBothDefaultProviders$lambda$1 != null) {
            return ProvideBothDefaultProviders$lambda$1;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        o.j();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideBothDefaultProviders$lambda$4(Modifier modifier, MutableState mutableState, my myVar, BasicTextContextMenuProvider basicTextContextMenuProvider, iy iyVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1070596993, i, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders.<anonymous> (PlatformDefaultTextContextMenuProviders.android.kt:76)");
            }
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new i3(mutableState, 19);
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (ky) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onGloballyPositioned);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
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
            uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            myVar.invoke(composer, 0);
            basicTextContextMenuProvider.ContextMenu(iyVar, composer, 6);
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
    public static final w01 ProvideBothDefaultProviders$lambda$4$0$0(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideBothDefaultProviders$lambda$5(Modifier modifier, my myVar, int i, Composer composer, int i2) {
        ProvideBothDefaultProviders(modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void ProvideDefaultPlatformTextContextMenuProviders(Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(155925518);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155925518, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultPlatformTextContextMenuProviders (PlatformDefaultTextContextMenuProviders.android.kt:37)");
            }
            boolean z = startRestartGroup.consume(TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider()) != null;
            boolean z2 = startRestartGroup.consume(TextContextMenuProviderKt.getLocalTextContextMenuToolbarProvider()) != null;
            if (z && z2) {
                startRestartGroup.startReplaceGroup(-1977187922);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                kf0.f(myVar, startRestartGroup, (i3 >> 3) & 14);
            } else if (z) {
                startRestartGroup.startReplaceGroup(-1976997706);
                AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar(modifier, myVar, startRestartGroup, i3 & 126, 0);
                startRestartGroup.endReplaceGroup();
            } else if (z2) {
                startRestartGroup.startReplaceGroup(-1976846922);
                DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown(modifier, myVar, startRestartGroup, i3 & 126);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1976716505);
                ProvideBothDefaultProviders(modifier, myVar, startRestartGroup, i3 & 126);
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
            endRestartGroup.updateScope(new l6(modifier2, myVar, i, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideDefaultPlatformTextContextMenuProviders$lambda$1(Modifier modifier, my myVar, int i, int i2, Composer composer, int i3) {
        ProvideDefaultPlatformTextContextMenuProviders(modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
