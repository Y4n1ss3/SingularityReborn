package androidx.compose.foundation.lazy.grid;

import android.os.Trace;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollableAreaKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
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
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, final boolean z2, FlingBehavior flingBehavior, final boolean z3, final OverscrollEffect overscrollEffect, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final ky kyVar, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z4;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Modifier modifier3;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        boolean z6;
        PaddingValues paddingValues4;
        int i8;
        FlingBehavior flingBehavior4;
        boolean z7;
        Modifier modifier5;
        Composer startRestartGroup = composer.startRestartGroup(708740370);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(lazyGridSlotsProvider) : startRestartGroup.changedInstance(lazyGridSlotsProvider) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? Fields.CameraDistance : Fields.RotationZ;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z;
                i4 |= startRestartGroup.changed(z4) ? Fields.Clip : 8192;
                if ((i & 196608) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                }
                if ((i & 1572864) == 0) {
                    flingBehavior2 = flingBehavior;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : Fields.BlendMode;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(overscrollEffect) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(vertical) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                if ((i2 & 6) == 0) {
                    i6 = i2 | (startRestartGroup.changed(horizontal) ? 4 : 2);
                } else {
                    i6 = i2;
                }
                if ((i2 & 48) == 0) {
                    i6 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
                }
                i7 = i6;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier4 = i9 != 0 ? Modifier.Companion : modifier2;
                        if (i10 != 0) {
                            paddingValues2 = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f));
                        }
                        boolean z8 = i5 == 0 ? z4 : false;
                        if ((i3 & 64) != 0) {
                            paddingValues4 = paddingValues2;
                            flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                            i8 = i4 & (-3670017);
                            z6 = 18;
                        } else {
                            z6 = 18;
                            paddingValues4 = paddingValues2;
                            i8 = i4;
                            flingBehavior4 = flingBehavior2;
                        }
                        z7 = z8;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        boolean z9 = z4;
                        z6 = 18;
                        z7 = z9;
                        paddingValues4 = paddingValues2;
                        modifier4 = modifier2;
                        i8 = i4;
                        flingBehavior4 = flingBehavior2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(708740370, i8, i7, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    int i11 = (i8 >> 3) & 14;
                    iy rememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, kyVar, startRestartGroup, (i7 & 112) | i11);
                    int i12 = i8 >> 9;
                    LazyLayoutSemanticState rememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z7, startRestartGroup, (i12 & 112) | i11);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Modifier modifier6 = modifier4;
                    int i13 = i8;
                    LazyLayoutMeasurePolicy rememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(rememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValues4, z7, z2, horizontal, vertical, (un) rememberedValue, (GraphicsContext) startRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) startRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? StickyItemsPlacement.Companion.getStickToTopPlacement() : null, startRestartGroup, (i8 & 524272) | ((i7 << 18) & 3670016) | ((i8 >> 6) & 29360128), 0);
                    boolean z10 = z7;
                    PaddingValues paddingValues5 = paddingValues4;
                    Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
                    if (z3) {
                        startRestartGroup.startReplaceGroup(27281635);
                        modifier5 = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, startRestartGroup, i11), lazyGridState.getBeyondBoundsInfo$foundation(), z10, orientation);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(27577840);
                        startRestartGroup.endReplaceGroup();
                        modifier5 = Modifier.Companion;
                    }
                    FlingBehavior flingBehavior5 = flingBehavior4;
                    LazyLayoutKt.LazyLayout(rememberLazyGridItemProviderLambda, ScrollableAreaKt.scrollableArea$default(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier6.then(lazyGridState.getRemeasurementModifier$foundation()).then(lazyGridState.getAwaitLayoutModifier$foundation()), rememberLazyGridItemProviderLambda, rememberLazyGridSemanticState, orientation, z3, z10, startRestartGroup, (i12 & 57344) | (458752 & (i13 << 3))).then(modifier5).then(lazyGridState.getItemAnimator$foundation().getModifier()), lazyGridState, orientation, overscrollEffect, z3, z10, flingBehavior5, lazyGridState.getInternalInteractionSource$foundation(), null, Fields.SpotShadowColor, null), lazyGridState.getPrefetchState$foundation(), rememberLazyGridMeasurePolicy, startRestartGroup, 0, 0);
                    startRestartGroup = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    flingBehavior3 = flingBehavior5;
                    paddingValues3 = paddingValues5;
                    modifier3 = modifier6;
                    z5 = z10;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    paddingValues3 = paddingValues2;
                    z5 = z4;
                    modifier3 = modifier2;
                    flingBehavior3 = flingBehavior2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: o30
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 LazyGrid$lambda$0;
                            int intValue = ((Integer) obj2).intValue();
                            LazyGrid$lambda$0 = LazyGridKt.LazyGrid$lambda$0(Modifier.this, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, overscrollEffect, vertical, horizontal, kyVar, i, i2, i3, (Composer) obj, intValue);
                            return LazyGrid$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            z4 = z;
            if ((i & 196608) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i7 = i6;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z;
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i7 = i6;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyGrid$lambda$0(Modifier modifier, LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, boolean z2, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, ky kyVar, int i, int i2, int i3, Composer composer, int i4) {
        LazyGrid(modifier, lazyGridState, lazyGridSlotsProvider, paddingValues, z, z2, flingBehavior, z3, overscrollEffect, vertical, horizontal, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keepAroundItems(CacheWindowLogic cacheWindowLogic, Orientation orientation, List<LazyGridMeasuredItem> list, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (cacheWindowLogic.hasValidBounds() && !list.isEmpty()) {
                int lineIndex = LazyGridItemInfoKt.lineIndex((LazyGridItemInfo) yi.p0(list), orientation);
                int lineIndex2 = LazyGridItemInfoKt.lineIndex((LazyGridItemInfo) yi.v0(list), orientation);
                for (int prefetchWindowStartLine$foundation = cacheWindowLogic.getPrefetchWindowStartLine$foundation(); prefetchWindowStartLine$foundation < lineIndex; prefetchWindowStartLine$foundation++) {
                    lazyGridMeasuredLineProvider.keepAround(prefetchWindowStartLine$foundation);
                }
                int i = lineIndex2 + 1;
                int prefetchWindowEndLine$foundation = cacheWindowLogic.getPrefetchWindowEndLine$foundation();
                if (i <= prefetchWindowEndLine$foundation) {
                    while (true) {
                        lazyGridMeasuredLineProvider.keepAround(i);
                        if (i == prefetchWindowEndLine$foundation) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r29.changed(r3) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyLayoutMeasurePolicy rememberLazyGridMeasurePolicy(iy iyVar, LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, un unVar, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Composer composer, int i, int i2) {
        boolean z3;
        boolean z4;
        boolean changed;
        Object rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030995717, i, i2, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)");
        }
        boolean z5 = ((((i & 112) ^ 48) > 32 && composer.changed(lazyGridState)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(lazyGridSlotsProvider)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(paddingValues)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(z)) || (i & 24576) == 16384);
        if (((458752 & i) ^ 196608) > 131072) {
            z3 = z2;
        } else {
            z3 = z2;
        }
        if ((196608 & i) != 131072) {
            z4 = false;
            changed = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
            rememberedValue = composer.rememberedValue();
            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                LazyGridKt$rememberLazyGridMeasurePolicy$1$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(lazyGridState, z3, paddingValues, z, iyVar, lazyGridSlotsProvider, vertical, horizontal, unVar, graphicsContext, stickyItemsPlacement);
                composer.updateRememberedValue(lazyGridKt$rememberLazyGridMeasurePolicy$1$1);
                rememberedValue = lazyGridKt$rememberLazyGridMeasurePolicy$1$1;
            }
            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (LazyLayoutMeasurePolicy) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return lazyLayoutMeasurePolicy;
        }
        z4 = true;
        if (((29360128 & i) ^ 12582912) > 8388608) {
            changed = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            LazyGridKt$rememberLazyGridMeasurePolicy$1$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$12 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(lazyGridState, z3, paddingValues, z, iyVar, lazyGridSlotsProvider, vertical, horizontal, unVar, graphicsContext, stickyItemsPlacement);
            composer.updateRememberedValue(lazyGridKt$rememberLazyGridMeasurePolicy$1$12);
            rememberedValue = lazyGridKt$rememberLazyGridMeasurePolicy$1$12;
            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (LazyLayoutMeasurePolicy) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
            }
            return lazyLayoutMeasurePolicy2;
        }
        changed = z5 | z4 | ((((3670016 & i) ^ 1572864) <= 1048576 && composer.changed(horizontal)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) || (i & 12582912) == 8388608) | composer.changed(graphicsContext);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        LazyGridKt$rememberLazyGridMeasurePolicy$1$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$122 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(lazyGridState, z3, paddingValues, z, iyVar, lazyGridSlotsProvider, vertical, horizontal, unVar, graphicsContext, stickyItemsPlacement);
        composer.updateRememberedValue(lazyGridKt$rememberLazyGridMeasurePolicy$1$122);
        rememberedValue = lazyGridKt$rememberLazyGridMeasurePolicy$1$122;
        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22 = (LazyLayoutMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
        }
        return lazyLayoutMeasurePolicy22;
    }
}
