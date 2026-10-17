package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollableAreaKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.st;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridKt {
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0333  */
    /* renamed from: LazyStaggeredGrid-w41Enmo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m966LazyStaggeredGridw41Enmo(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, final OverscrollEffect overscrollEffect, float f, float f2, final ky kyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        FlingBehavior flingBehavior2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        final float f3;
        Composer composer2;
        final FlingBehavior flingBehavior3;
        final boolean z4;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        final boolean z5;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        int i15;
        boolean z6;
        float m7611constructorimpl;
        Modifier modifier4;
        int i16;
        FlingBehavior flingBehavior4;
        PaddingValues paddingValues4;
        boolean z7;
        float f5;
        Orientation orientation2;
        Modifier modifier5;
        Composer startRestartGroup = composer.startRestartGroup(-1904835166);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(lazyStaggeredGridState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(orientation.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(lazyGridStaggeredGridSlotsProvider) : startRestartGroup.changedInstance(lazyGridStaggeredGridSlotsProvider) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i4 |= startRestartGroup.changed(paddingValues2) ? Fields.Clip : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                }
                if ((i & 1572864) == 0) {
                    flingBehavior2 = flingBehavior;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : Fields.BlendMode;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i4 |= 12582912;
                    z3 = z2;
                } else {
                    z3 = z2;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(overscrollEffect) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                i8 = i3 & Fields.RotationY;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i9 = i8;
                    i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i10 = i3 & Fields.RotationZ;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (startRestartGroup.changed(f2) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i12 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
                    }
                    i13 = i12;
                    i14 = i4;
                    if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        f3 = f2;
                        composer2 = startRestartGroup;
                        flingBehavior3 = flingBehavior2;
                        z4 = z3;
                        modifier3 = modifier2;
                        paddingValues3 = paddingValues2;
                        z5 = z;
                        f4 = f;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier6 = i17 != 0 ? Modifier.Companion : modifier2;
                            PaddingValues m755PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                            boolean z8 = i6 == 0 ? z : false;
                            if ((i3 & 64) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i15 = i14 & (-3670017);
                            } else {
                                i15 = i14;
                            }
                            z6 = i7 == 0 ? z3 : true;
                            m7611constructorimpl = i9 != 0 ? Dp.m7611constructorimpl(0.0f) : f;
                            if (i11 != 0) {
                                modifier4 = modifier6;
                                flingBehavior4 = flingBehavior2;
                                f5 = Dp.m7611constructorimpl(0.0f);
                                paddingValues4 = m755PaddingValues0680j_4;
                                i16 = i15;
                                z7 = z8;
                            } else {
                                modifier4 = modifier6;
                                i16 = i15;
                                flingBehavior4 = flingBehavior2;
                                paddingValues4 = m755PaddingValues0680j_4;
                                z7 = z8;
                                f5 = f2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                z7 = z;
                                m7611constructorimpl = f;
                                i16 = i14 & (-3670017);
                            } else {
                                z7 = z;
                                m7611constructorimpl = f;
                                i16 = i14;
                            }
                            flingBehavior4 = flingBehavior2;
                            z6 = z3;
                            paddingValues4 = paddingValues2;
                            f5 = f2;
                            modifier4 = modifier2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1904835166, i16, i13, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                        }
                        int i18 = i16 & 14;
                        iy rememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, kyVar, startRestartGroup, (i13 & 112) | i18);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        int i19 = i16 >> 6;
                        int i20 = i16 >> 12;
                        int i21 = i16;
                        float f6 = m7611constructorimpl;
                        LazyLayoutMeasurePolicy m977rememberStaggeredGridMeasurePolicyqKj4JfE = LazyStaggeredGridMeasurePolicyKt.m977rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda, paddingValues4, z7, orientation, f6, f5, (un) rememberedValue, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) startRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), startRestartGroup, (i19 & 7168) | (i19 & 896) | i18 | ((i16 << 9) & 57344) | (i20 & 458752) | ((i13 << 18) & 3670016) | ((i16 << 18) & 234881024));
                        PaddingValues paddingValues5 = paddingValues4;
                        float f7 = f5;
                        LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z7, startRestartGroup, (i20 & 112) | i18);
                        if (z6) {
                            startRestartGroup.startReplaceGroup(-1834596342);
                            orientation2 = orientation;
                            modifier5 = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, i18), lazyStaggeredGridState.getBeyondBoundsInfo$foundation(), z7, orientation2);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            orientation2 = orientation;
                            startRestartGroup.startReplaceGroup(-1834291488);
                            startRestartGroup.endReplaceGroup();
                            modifier5 = Modifier.Companion;
                        }
                        boolean z9 = z7;
                        boolean z10 = z6;
                        FlingBehavior flingBehavior5 = flingBehavior4;
                        LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda, ScrollableAreaKt.scrollableArea$default(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier4.then(lazyStaggeredGridState.getRemeasurementModifier$foundation()).then(lazyStaggeredGridState.getAwaitLayoutModifier$foundation()), rememberStaggeredGridItemProviderLambda, rememberLazyStaggeredGridSemanticState, orientation2, z10, z9, startRestartGroup, ((i21 << 6) & 7168) | ((i21 >> 9) & 57344) | (i21 & 458752)).then(modifier5).then(lazyStaggeredGridState.getItemAnimator$foundation().getModifier()), lazyStaggeredGridState, orientation, overscrollEffect, z10, z9, flingBehavior5, lazyStaggeredGridState.getMutableInteractionSource$foundation(), null, Fields.SpotShadowColor, null), lazyStaggeredGridState.getPrefetchState$foundation(), m977rememberStaggeredGridMeasurePolicyqKj4JfE, startRestartGroup, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        z5 = z9;
                        flingBehavior3 = flingBehavior5;
                        modifier3 = modifier4;
                        z4 = z10;
                        paddingValues3 = paddingValues5;
                        f4 = f6;
                        f3 = f7;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: e40
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 LazyStaggeredGrid_w41Enmo$lambda$0;
                                int intValue = ((Integer) obj2).intValue();
                                LazyStaggeredGrid_w41Enmo$lambda$0 = LazyStaggeredGridKt.LazyStaggeredGrid_w41Enmo$lambda$0(LazyStaggeredGridState.this, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z5, flingBehavior3, z4, overscrollEffect, f4, f3, kyVar, i, i2, i3, (Composer) obj, intValue);
                                return LazyStaggeredGrid_w41Enmo$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i9 = i8;
                i10 = i3 & Fields.RotationZ;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                i13 = i12;
                i14 = i4;
                if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & Fields.RotationY;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationZ;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i13 = i12;
            i14 = i4;
            if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & Fields.RotationY;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationZ;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i13 = i12;
        i14 = i4;
        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyStaggeredGrid_w41Enmo$lambda$0(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, float f, float f2, ky kyVar, int i, int i2, int i3, Composer composer, int i4) {
        m966LazyStaggeredGridw41Enmo(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier, paddingValues, z, flingBehavior, z2, overscrollEffect, f, f2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }
}
