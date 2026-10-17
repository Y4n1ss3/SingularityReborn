package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.internal.DraggableAnchorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import defpackage.b6;
import defpackage.er;
import defpackage.fo0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.m70;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.rn0;
import defpackage.ud;
import defpackage.w01;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeToDismissBoxKt {
    private static final float DismissVelocityThreshold = Dp.m7611constructorimpl(125.0f);

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f3, code lost:
    
        if (defpackage.q10.b(r10.rememberedValue(), java.lang.Integer.valueOf(r5)) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0266, code lost:
    
        if (defpackage.q10.b(r11.rememberedValue(), java.lang.Integer.valueOf(r14)) == false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismissBox(final SwipeToDismissBoxState swipeToDismissBoxState, final ny nyVar, Modifier modifier, boolean z, boolean z2, boolean z3, ky kyVar, final ny nyVar2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        final ky kyVar2;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope endRestartGroup;
        ky kyVar3;
        boolean z9;
        TargetedFlingBehavior targetedFlingBehavior;
        Alignment.Companion companion;
        ky kyVar4;
        ky kyVar5;
        Composer startRestartGroup = composer.startRestartGroup(-741495334);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(swipeToDismissBoxState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 196608) == 0) {
                            i3 |= startRestartGroup.changed(z5) ? Fields.RenderEffect : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        kyVar2 = kyVar;
                    } else {
                        kyVar2 = kyVar;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(kyVar2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z6 = z4;
                        z7 = z5;
                        z8 = z2;
                    } else {
                        Modifier modifier4 = i8 != 0 ? Modifier.Companion : modifier2;
                        boolean z10 = i4 != 0 ? true : z4;
                        boolean z11 = i5 != 0 ? true : z2;
                        boolean z12 = i6 != 0 ? true : z5;
                        if (i7 != 0) {
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new fo0(10);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            kyVar3 = (ky) rememberedValue;
                        } else {
                            kyVar3 = kyVar2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                        }
                        AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState$material3 = swipeToDismissBoxState.getAnchoredDraggableState$material3();
                        Orientation orientation = Orientation.Horizontal;
                        boolean z13 = z12 && swipeToDismissBoxState.getSettledValue() == SwipeToDismissBoxValue.Settled;
                        if (swipeToDismissBoxState.getUseFlingBehavior$material3()) {
                            startRestartGroup.startReplaceGroup(387581105);
                            z9 = true;
                            TargetedFlingBehavior flingBehavior = AnchoredDraggableDefaults.INSTANCE.flingBehavior(swipeToDismissBoxState.getAnchoredDraggableState$material3(), swipeToDismissBoxState.getPositionalThreshold$material3(), null, startRestartGroup, AnchoredDraggableDefaults.$stable << 9, 4);
                            startRestartGroup.endReplaceGroup();
                            targetedFlingBehavior = flingBehavior;
                        } else {
                            z9 = true;
                            startRestartGroup.startReplaceGroup(-869685853);
                            startRestartGroup.endReplaceGroup();
                            targetedFlingBehavior = null;
                        }
                        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modifier4, anchoredDraggableState$material3, orientation, z13, null, null, targetedFlingBehavior, 24, null);
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), z9);
                        boolean z14 = z12;
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        iy constructor = companion3.getConstructor();
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
                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting()) {
                            companion = companion2;
                        } else {
                            companion = companion2;
                        }
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion4 = Modifier.Companion;
                        Modifier matchParentSize = boxScopeInstance.matchParentSize(companion4);
                        int i9 = (i3 << 6) & 7168;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), startRestartGroup, 0);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, matchParentSize);
                        iy constructor2 = companion3.getConstructor();
                        if (startRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                        my b2 = k4.b(companion3, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        if (m3878constructorimpl2.getInserting()) {
                            kyVar4 = kyVar3;
                        } else {
                            kyVar4 = kyVar3;
                        }
                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        nyVar.invoke(rowScopeInstance, startRestartGroup, Integer.valueOf(((i9 >> 6) & 112) | 6));
                        startRestartGroup.endNode();
                        AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState$material32 = swipeToDismissBoxState.getAnchoredDraggableState$material3();
                        boolean changedInstance = ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(swipeToDismissBoxState);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new m70(swipeToDismissBoxState, z10, z11, 1);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        Modifier draggableAnchorsV2 = DraggableAnchorsKt.draggableAnchorsV2(companion4, anchoredDraggableState$material32, orientation, (my) rememberedValue2);
                        int i10 = (i3 >> 12) & 7168;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), startRestartGroup, 0);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, draggableAnchorsV2);
                        iy constructor3 = companion3.getConstructor();
                        if (startRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
                        my b3 = k4.b(companion3, m3878constructorimpl3, rowMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                        if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                        }
                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion3.getSetModifier());
                        nyVar2.invoke(rowScopeInstance, startRestartGroup, Integer.valueOf(((i10 >> 6) & 112) | 6));
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        SwipeToDismissBoxValue settledValue = swipeToDismissBoxState.getSettledValue();
                        boolean changedInstance2 = startRestartGroup.changedInstance(swipeToDismissBoxState) | ((3670016 & i3) == 1048576);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            kyVar5 = kyVar4;
                            rememberedValue3 = new SwipeToDismissBoxKt$SwipeToDismissBox$3$1(swipeToDismissBoxState, kyVar5, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            kyVar5 = kyVar4;
                        }
                        EffectsKt.LaunchedEffect(settledValue, kyVar5, (my) rememberedValue3, startRestartGroup, (i3 >> 15) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z8 = z11;
                        kyVar2 = kyVar5;
                        modifier3 = modifier4;
                        z7 = z14;
                        z6 = z10;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: ws0
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 SwipeToDismissBox$lambda$13;
                                int intValue = ((Integer) obj2).intValue();
                                SwipeToDismissBox$lambda$13 = SwipeToDismissBoxKt.SwipeToDismissBox$lambda$13(SwipeToDismissBoxState.this, nyVar, modifier3, z6, z8, z7, kyVar2, nyVar2, i, i2, (Composer) obj, intValue);
                                return SwipeToDismissBox$lambda$13;
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xe0 SwipeToDismissBox$lambda$11$lambda$10$lambda$9(SwipeToDismissBoxState swipeToDismissBoxState, boolean z, boolean z2, IntSize intSize, Constraints constraints) {
        return new xe0(AnchoredDraggableKt.DraggableAnchors(new b6(intSize, z, z2, 1)), swipeToDismissBoxState.getTargetValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwipeToDismissBox$lambda$11$lambda$10$lambda$9$lambda$8(IntSize intSize, boolean z, boolean z2, DraggableAnchorsConfig draggableAnchorsConfig) {
        float m7786unboximpl = (int) (intSize.m7786unboximpl() >> 32);
        draggableAnchorsConfig.at(SwipeToDismissBoxValue.Settled, 0.0f);
        if (z) {
            draggableAnchorsConfig.at(SwipeToDismissBoxValue.StartToEnd, m7786unboximpl);
        }
        if (z2) {
            draggableAnchorsConfig.at(SwipeToDismissBoxValue.EndToStart, -m7786unboximpl);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwipeToDismissBox$lambda$13(SwipeToDismissBoxState swipeToDismissBoxState, ny nyVar, Modifier modifier, boolean z, boolean z2, boolean z3, ky kyVar, ny nyVar2, int i, int i2, Composer composer, int i3) {
        SwipeToDismissBox(swipeToDismissBoxState, nyVar, modifier, z, z2, z3, kyVar, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwipeToDismissBox$lambda$15$lambda$14(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwipeToDismissBox$lambda$16(SwipeToDismissBoxState swipeToDismissBoxState, ny nyVar, Modifier modifier, boolean z, boolean z2, boolean z3, ny nyVar2, int i, int i2, Composer composer, int i3) {
        SwipeToDismissBox(swipeToDismissBoxState, nyVar, modifier, z, z2, z3, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwipeToDismissBox$lambda$7$lambda$6(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return w01.a;
    }

    @er
    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, ky kyVar, ky kyVar2, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        }
        SwipeToDismissBoxValue swipeToDismissBoxValue2 = swipeToDismissBoxValue;
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new fo0(8);
                composer.updateRememberedValue(rememberedValue);
            }
            kyVar = (ky) rememberedValue;
        }
        ky kyVar3 = kyVar;
        if ((i2 & 4) != 0) {
            kyVar2 = SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold(composer, 6);
        }
        ky kyVar4 = kyVar2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-246335487, i, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:273)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = new Object[0];
        Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver = SwipeToDismissBoxState.Companion.Saver(kyVar3, kyVar4, density);
        boolean z = true;
        boolean changed = (((6 ^ (i & 14)) > 4 && composer.changed(swipeToDismissBoxValue2.ordinal())) || (i & 6) == 4) | composer.changed(density) | ((((i & 112) ^ 48) > 32 && composer.changed(kyVar3)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(kyVar4)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = changed | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            Object udVar = new ud(swipeToDismissBoxValue2, density, kyVar3, kyVar4, 6);
            composer.updateRememberedValue(udVar);
            rememberedValue2 = udVar;
        }
        SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return swipeToDismissBoxState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState$lambda$1$lambda$0(SwipeToDismissBoxValue swipeToDismissBoxValue, ky kyVar) {
        return new SwipeToDismissBoxState(swipeToDismissBoxValue, kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberSwipeToDismissBoxState$lambda$3$lambda$2(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState$lambda$5$lambda$4(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, ky kyVar, ky kyVar2) {
        return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, kyVar, kyVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0065  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SwipeToDismissBox(final SwipeToDismissBoxState swipeToDismissBoxState, final ny nyVar, Modifier modifier, boolean z, boolean z2, boolean z3, final ny nyVar2, Composer composer, final int i, final int i2) {
        SwipeToDismissBoxState swipeToDismissBoxState2;
        int i3;
        ny nyVar3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        Composer composer2;
        final boolean z5;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1807005299);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            swipeToDismissBoxState2 = swipeToDismissBoxState;
        } else {
            swipeToDismissBoxState2 = swipeToDismissBoxState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(swipeToDismissBoxState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            nyVar3 = nyVar;
        } else {
            nyVar3 = nyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar3) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar2) ? 1048576 : Fields.BlendMode;
                            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                Modifier modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                                boolean z8 = i4 != 0 ? true : z4;
                                boolean z9 = i5 != 0 ? true : z2;
                                boolean z10 = i6 != 0 ? true : z3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1807005299, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                                }
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new fo0(9);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                composer2 = startRestartGroup;
                                SwipeToDismissBox(swipeToDismissBoxState2, nyVar3, modifier4, z8, z9, z10, (ky) rememberedValue, nyVar2, composer2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z6 = z8;
                                z5 = z9;
                                z7 = z10;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                z5 = z2;
                                modifier3 = modifier2;
                                z6 = z4;
                                z7 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: vs0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 SwipeToDismissBox$lambda$16;
                                        int intValue = ((Integer) obj2).intValue();
                                        SwipeToDismissBox$lambda$16 = SwipeToDismissBoxKt.SwipeToDismissBox$lambda$16(SwipeToDismissBoxState.this, nyVar, modifier3, z6, z5, z7, nyVar2, i, i2, (Composer) obj, intValue);
                                        return SwipeToDismissBox$lambda$16;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        }
        if ((i2 & 2) != 0) {
            kyVar = SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold(composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-470572556, i, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:243)");
        }
        Object[] objArr = new Object[0];
        Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver = SwipeToDismissBoxState.Companion.Saver(kyVar);
        int i3 = 1;
        boolean z = ((((i & 112) ^ 48) > 32 && composer.changed(kyVar)) || (i & 48) == 32) | (((6 ^ (i & 14)) > 4 && composer.changed(swipeToDismissBoxValue.ordinal())) || (i & 6) == 4);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new rn0(i3, swipeToDismissBoxValue, kyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return swipeToDismissBoxState;
    }
}
