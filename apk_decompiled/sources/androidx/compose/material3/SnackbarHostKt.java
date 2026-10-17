package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.util.ListUtilsKt;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.sn0;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarHostKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FadeInFadeOutWithScale(SnackbarData snackbarData, Modifier modifier, final ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-977568115);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-977568115, i3, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
                }
                Strings.Companion companion = Strings.Companion;
                String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_snackbar_pane_title), startRestartGroup, 0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new FadeInFadeOutState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                FadeInFadeOutState fadeInFadeOutState = (FadeInFadeOutState) rememberedValue;
                if (q10.b(snackbarData, fadeInFadeOutState.getCurrent())) {
                    startRestartGroup.startReplaceGroup(1443908949);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1154891761);
                    fadeInFadeOutState.setCurrent(snackbarData);
                    List items = fadeInFadeOutState.getItems();
                    ArrayList arrayList = new ArrayList(items.size());
                    int size = items.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) items.get(i5)).getKey());
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (!arrayList2.contains(snackbarData)) {
                        arrayList2.add(snackbarData);
                    }
                    fadeInFadeOutState.getItems().clear();
                    List fastFilterNotNull = ListUtilsKt.fastFilterNotNull(arrayList2);
                    List items2 = fadeInFadeOutState.getItems();
                    int size2 = fastFilterNotNull.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        SnackbarData snackbarData2 = (SnackbarData) fastFilterNotNull.get(i6);
                        items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.rememberComposableLambda(-1952400805, true, new SnackbarHostKt$FadeInFadeOutWithScale$1$1(snackbarData2, snackbarData, fadeInFadeOutState, m2983getString2EP1pXo), startRestartGroup, 54)));
                        i6++;
                        m2983getString2EP1pXo = m2983getString2EP1pXo;
                    }
                    startRestartGroup.endReplaceGroup();
                }
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                iy constructor = companion2.getConstructor();
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
                my b = k4.b(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                }
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0));
                startRestartGroup.startReplaceGroup(-1888182177);
                List items3 = fadeInFadeOutState.getItems();
                int size3 = items3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) items3.get(i7);
                    final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem.component1();
                    ny component2 = fadeInFadeOutAnimationItem.component2();
                    startRestartGroup.startMovableGroup(1325010085, snackbarData3);
                    component2.invoke(ComposableLambdaKt.rememberComposableLambda(-1893791890, true, new my() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        public final void invoke(Composer composer2, int i8) {
                            if (!composer2.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1893791890, i8, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:382)");
                            }
                            ny nyVar2 = ny.this;
                            SnackbarData snackbarData4 = snackbarData3;
                            snackbarData4.getClass();
                            nyVar2.invoke(snackbarData4, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, startRestartGroup, 54), startRestartGroup, 6);
                    startRestartGroup.endMovableGroup();
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new defpackage.g1(snackbarData, modifier3, nyVar, i, i2, 10));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FadeInFadeOutWithScale$lambda$7(SnackbarData snackbarData, Modifier modifier, ny nyVar, int i, int i2, Composer composer, int i3) {
        FadeInFadeOutWithScale(snackbarData, modifier, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final void SnackbarHost(SnackbarHostState snackbarHostState, Modifier modifier, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ny nyVar2;
        Composer startRestartGroup = composer.startRestartGroup(-1077081618);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                nyVar = ComposableSingletons$SnackbarHostKt.INSTANCE.m1840getLambda$1548712596$material3();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1077081618, i3, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:220)");
            }
            SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            AccessibilityManager accessibilityManager = (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager());
            boolean changed = startRestartGroup.changed(currentSnackbarData) | startRestartGroup.changedInstance(accessibilityManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(currentSnackbarData, (my) rememberedValue, startRestartGroup, 0);
            ny nyVar3 = nyVar;
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier3, nyVar3, startRestartGroup, i3 & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            nyVar2 = nyVar3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            nyVar2 = nyVar;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new defpackage.g1(snackbarHostState, modifier2, nyVar2, i, i2, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SnackbarHost$lambda$1(SnackbarHostState snackbarHostState, Modifier modifier, ny nyVar, int i, int i2, Composer composer, int i3) {
        SnackbarHost(snackbarHostState, modifier, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, iy iyVar, Composer composer, int i, int i2) {
        int i3 = 3;
        if ((i2 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new sn0(i3);
                composer.updateRememberedValue(rememberedValue);
            }
            iyVar = (iy) rememberedValue;
        }
        iy iyVar2 = iyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1431889134, i, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:405)");
        }
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        Animatable animatable = (Animatable) rememberedValue2;
        Boolean valueOf = Boolean.valueOf(z);
        boolean changedInstance = composer.changedInstance(animatable) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32) | composer.changedInstance(animationSpec) | ((((i & 896) ^ 384) > 256 && composer.changed(iyVar2)) || (i & 384) == 256);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            Object snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, z, animationSpec, iyVar2, null);
            composer.updateRememberedValue(snackbarHostKt$animatedOpacity$2$1);
            rememberedValue3 = snackbarHostKt$animatedOpacity$2$1;
        }
        EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue3, composer, (i >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1966809761, i, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:415)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        Boolean valueOf = Boolean.valueOf(z);
        boolean changedInstance = composer.changedInstance(animatable) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32) | composer.changedInstance(animationSpec);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnackbarHostKt$animatedScale$1$1(animatable, z, animationSpec, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue2, composer, (i >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j;
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = SnapshotId_jvmKt.SnapshotIdMax;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                defpackage.o.n();
                return 0L;
            }
            j = 4000;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }
}
