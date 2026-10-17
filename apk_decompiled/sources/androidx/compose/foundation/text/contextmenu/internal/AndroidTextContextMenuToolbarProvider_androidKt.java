package androidx.compose.foundation.text.contextmenu.internal;

import android.view.View;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.fc;
import defpackage.g1;
import defpackage.i3;
import defpackage.iy;
import defpackage.j3;
import defpackage.k4;
import defpackage.k6;
import defpackage.ky;
import defpackage.l6;
import defpackage.m6;
import defpackage.my;
import defpackage.o;
import defpackage.uo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTextContextMenuToolbarProvider_androidKt {
    public static final void ProvidePlatformTextContextMenuToolbar(Modifier modifier, ky kyVar, my myVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(771959668);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i5 = 0;
        int i6 = 1;
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(771959668, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:83)");
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
                rememberedValue2 = new j3(mutableState, i6);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CompositionLocalKt.CompositionLocalProvider(TextContextMenuProviderKt.getLocalTextContextMenuToolbarProvider().provides(platformTextContextMenuToolbarProvider((iy) rememberedValue2, kyVar, startRestartGroup, (i3 & 112) | 6, 0)), ComposableLambdaKt.rememberComposableLambda(-291176396, true, new m6(modifier, mutableState, myVar, i5), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g1(modifier2, kyVar, myVar, i, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvidePlatformTextContextMenuToolbar$lambda$0(Modifier modifier, my myVar, int i, int i2, Composer composer, int i3) {
        ProvidePlatformTextContextMenuToolbar(modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final LayoutCoordinates ProvidePlatformTextContextMenuToolbar$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates ProvidePlatformTextContextMenuToolbar$lambda$4$0(MutableState mutableState) {
        LayoutCoordinates ProvidePlatformTextContextMenuToolbar$lambda$2 = ProvidePlatformTextContextMenuToolbar$lambda$2(mutableState);
        if (ProvidePlatformTextContextMenuToolbar$lambda$2 != null) {
            return ProvidePlatformTextContextMenuToolbar$lambda$2;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        o.j();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvidePlatformTextContextMenuToolbar$lambda$5(Modifier modifier, MutableState mutableState, my myVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-291176396, i, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar.<anonymous> (AndroidTextContextMenuToolbarProvider.android.kt:97)");
            }
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new i3(mutableState, 3);
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
            if (fc.l(myVar, composer, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvidePlatformTextContextMenuToolbar$lambda$5$0$0(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvidePlatformTextContextMenuToolbar$lambda$6(Modifier modifier, ky kyVar, my myVar, int i, int i2, Composer composer, int i3) {
        ProvidePlatformTextContextMenuToolbar(modifier, kyVar, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final TextContextMenuProvider platformTextContextMenuToolbarProvider(iy iyVar, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            kyVar = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(549805508, i, -1, "androidx.compose.foundation.text.contextmenu.internal.platformTextContextMenuToolbarProvider (AndroidTextContextMenuToolbarProvider.android.kt:110)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean changed = composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidTextContextMenuToolbarProvider(view, kyVar, iyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (AndroidTextContextMenuToolbarProvider) rememberedValue;
        boolean changedInstance = composer.changedInstance(androidTextContextMenuToolbarProvider);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new k6(androidTextContextMenuToolbarProvider, 3);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(androidTextContextMenuToolbarProvider, (ky) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidTextContextMenuToolbarProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult platformTextContextMenuToolbarProvider$lambda$1$0(final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, DisposableEffectScope disposableEffectScope) {
        androidTextContextMenuToolbarProvider.start();
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt$platformTextContextMenuToolbarProvider$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                AndroidTextContextMenuToolbarProvider.this.dispose();
            }
        };
    }

    public static final void ProvidePlatformTextContextMenuToolbar(Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(2064964257);
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
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2064964257, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:66)");
            }
            ProvidePlatformTextContextMenuToolbar(modifier3, null, myVar, startRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l6(modifier2, myVar, i, i2, 0));
        }
    }
}
