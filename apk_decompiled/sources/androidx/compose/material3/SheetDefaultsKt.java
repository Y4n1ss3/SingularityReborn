package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import defpackage.fo0;
import defpackage.hm;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = Dp.m7611constructorimpl(22.0f);
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final ky kyVar) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            private final float offsetToFloat(long j) {
                return Float.intBitsToFloat((int) (orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
            }

            private final long toOffset(float f) {
                Orientation orientation2 = orientation;
                float f2 = orientation2 == Orientation.Horizontal ? f : 0.0f;
                if (orientation2 != Orientation.Vertical) {
                    f = 0.0f;
                }
                return Offset.m4508constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            }

            private final float velocityToFloat(long j) {
                return orientation == Orientation.Horizontal ? Velocity.m7849getXimpl(j) : Velocity.m7850getYimpl(j);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
                kyVar.invoke(new Float(velocityToFloat(j2)));
                return Velocity.m7840boximpl(j2);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
                return NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI()) ? toOffset(SheetState.this.getAnchoredDraggableState$material3().dispatchRawDelta(offsetToFloat(j2))) : Offset.Companion.m4532getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo837onPreFlingQWom1Mo(long j, hm hmVar) {
                float velocityToFloat = velocityToFloat(j);
                float requireOffset = SheetState.this.requireOffset();
                float minAnchor = SheetState.this.getAnchoredDraggableState$material3().getAnchors().minAnchor();
                if (velocityToFloat >= 0.0f || requireOffset <= minAnchor) {
                    j = Velocity.Companion.m7860getZero9UxMQ8M();
                } else {
                    kyVar.invoke(new Float(velocityToFloat));
                }
                return Velocity.m7840boximpl(j);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo838onPreScrollOzD1aCk(long j, int i) {
                float offsetToFloat = offsetToFloat(j);
                return (offsetToFloat >= 0.0f || !NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI())) ? Offset.Companion.m4532getZeroF1C5BW0() : toOffset(SheetState.this.getAnchoredDraggableState$material3().dispatchRawDelta(offsetToFloat));
            }
        };
    }

    public static final void DragHandleWithTooltip(ColumnScope columnScope, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1033612924);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i3 = i2;
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1033612924, i3, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:432)");
            }
            Strings.Companion companion = Strings.Companion;
            final String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), startRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            Alignment.Companion companion3 = Alignment.Companion;
            Modifier align = columnScope.align(companion2, companion3.getCenterHorizontally());
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, align);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            iy constructor = companion4.getConstructor();
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
            my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m2786rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.Companion.m2773getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(2059851063, true, new ny() { // from class: androidx.compose.material3.SheetDefaultsKt$DragHandleWithTooltip$1$1
                public final void invoke(TooltipScope tooltipScope, Composer composer2, int i4) {
                    int i5;
                    if ((i4 & 6) == 0) {
                        i5 = i4 | ((i4 & 8) == 0 ? composer2.changed(tooltipScope) : composer2.changedInstance(tooltipScope) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if (!composer2.shouldExecute((i5 & 19) != 18, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2059851063, i5, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
                    }
                    final String str = m2983getString2EP1pXo;
                    TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-999924215, true, new my() { // from class: androidx.compose.material3.SheetDefaultsKt$DragHandleWithTooltip$1$1.1
                        public final void invoke(Composer composer3, int i6) {
                            if (!composer3.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-999924215, i6, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
                            }
                            TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, composer2, 54), composer2, (i5 & 14) | 805306368, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((TooltipScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, myVar, startRestartGroup, ((i3 << 21) & 234881024) | 48, 248);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(columnScope, myVar, i, 27));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DragHandleWithTooltip$lambda$1(ColumnScope columnScope, my myVar, int i, Composer composer, int i2) {
        DragHandleWithTooltip(columnScope, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L57;
     */
    /* renamed from: rememberSheetState-AGcomas, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SheetState m2373rememberSheetStateAGcomas(boolean z, ky kyVar, SheetValue sheetValue, boolean z2, float f, float f2, Composer composer, int i, int i2) {
        final ky kyVar2;
        Object obj;
        final int i3 = 0;
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        final int i4 = 1;
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new fo0(i4);
                composer.updateRememberedValue(rememberedValue);
            }
            kyVar2 = (ky) rememberedValue;
        } else {
            kyVar2 = kyVar;
        }
        final SheetValue sheetValue2 = (i2 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z4 = (i2 & 8) != 0 ? false : z2;
        final float m1643getPositionalThresholdD9Ej5fM$material3 = (i2 & 16) != 0 ? BottomSheetDefaults.INSTANCE.m1643getPositionalThresholdD9Ej5fM$material3() : f;
        final float m1646getVelocityThresholdD9Ej5fM$material3 = (i2 & 32) != 0 ? BottomSheetDefaults.INSTANCE.m1646getVelocityThresholdD9Ej5fM$material3() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20307384, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:514)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(density) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(m1643getPositionalThresholdD9Ej5fM$material3)) || (i & 24576) == 16384);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new iy() { // from class: fp0
                @Override // defpackage.iy
                public final Object invoke() {
                    float mo367toPx0680j_4;
                    int i5 = i3;
                    float f3 = m1643getPositionalThresholdD9Ej5fM$material3;
                    Density density2 = density;
                    switch (i5) {
                        case 0:
                            mo367toPx0680j_4 = density2.mo367toPx0680j_4(f3);
                            break;
                        default:
                            mo367toPx0680j_4 = density2.mo367toPx0680j_4(f3);
                            break;
                    }
                    return Float.valueOf(mo367toPx0680j_4);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        final iy iyVar = (iy) rememberedValue2;
        boolean changed2 = composer.changed(density) | ((((458752 & i) ^ 196608) > 131072 && composer.changed(m1646getVelocityThresholdD9Ej5fM$material3)) || (i & 196608) == 131072);
        Object rememberedValue3 = composer.rememberedValue();
        if (!changed2) {
            obj = rememberedValue3;
        }
        Object obj2 = new iy() { // from class: fp0
            @Override // defpackage.iy
            public final Object invoke() {
                float mo367toPx0680j_4;
                int i5 = i4;
                float f3 = m1646getVelocityThresholdD9Ej5fM$material3;
                Density density2 = density;
                switch (i5) {
                    case 0:
                        mo367toPx0680j_4 = density2.mo367toPx0680j_4(f3);
                        break;
                    default:
                        mo367toPx0680j_4 = density2.mo367toPx0680j_4(f3);
                        break;
                }
                return Float.valueOf(mo367toPx0680j_4);
            }
        };
        composer.updateRememberedValue(obj2);
        obj = obj2;
        final iy iyVar2 = (iy) obj;
        Object[] objArr = {Boolean.valueOf(z3), kyVar2, Boolean.valueOf(z4)};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z3, iyVar, iyVar2, kyVar2, z4);
        int i5 = (((((i & 112) ^ 48) <= 32 || !composer.changed(kyVar2)) && (i & 48) != 32) ? 0 : 1) | (((((i & 14) ^ 6) <= 4 || !composer.changed(z3)) && (i & 6) != 4) ? 0 : 1) | (composer.changed(iyVar) ? 1 : 0) | (composer.changed(iyVar2) ? 1 : 0) | (((((i & 896) ^ 384) <= 256 || !composer.changed(sheetValue2.ordinal())) && (i & 384) != 256) ? 0 : 1);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(z4)) && (i & 3072) != 2048) {
            i4 = 0;
        }
        int i6 = i5 | i4;
        Object rememberedValue4 = composer.rememberedValue();
        if (i6 != 0 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new iy() { // from class: gp0
                @Override // defpackage.iy
                public final Object invoke() {
                    SheetState rememberSheetState_AGcomas$lambda$11$lambda$10;
                    rememberSheetState_AGcomas$lambda$11$lambda$10 = SheetDefaultsKt.rememberSheetState_AGcomas$lambda$11$lambda$10(z3, iyVar, iyVar2, sheetValue2, kyVar2, z4);
                    return rememberSheetState_AGcomas$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SheetState rememberSheetState_AGcomas$lambda$11$lambda$10(boolean z, iy iyVar, iy iyVar2, SheetValue sheetValue, ky kyVar, boolean z2) {
        return new SheetState(z, iyVar, iyVar2, sheetValue, kyVar, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberSheetState_AGcomas$lambda$3$lambda$2(SheetValue sheetValue) {
        return true;
    }
}
