package androidx.compose.foundation.lazy;

import android.os.Trace;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollableAreaKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, final OverscrollEffect overscrollEffect, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final ky kyVar, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final Arrangement.Horizontal horizontal4;
        final int i12;
        final Alignment.Vertical vertical4;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Alignment.Horizontal horizontal5;
        Arrangement.Vertical vertical5;
        Alignment.Vertical vertical6;
        int i14;
        int i15;
        Arrangement.Horizontal horizontal6;
        Object rememberedValue;
        Modifier modifier2;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(924924659);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        int i17 = i2 & 384;
        int i18 = Fields.SpotShadowColor;
        if (i17 == 0) {
            paddingValues2 = paddingValues;
            i5 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        int i19 = i2 & 3072;
        int i20 = Fields.RotationZ;
        if (i19 == 0) {
            i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= startRestartGroup.changed(flingBehavior) ? Fields.RenderEffect : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changed(z3) ? 1048576 : Fields.BlendMode;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(overscrollEffect) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if ((i4 & Fields.RotationX) == 0) {
                i6 = i;
                if (startRestartGroup.changed(i6)) {
                    i16 = GroupFlagsKt.IsRecompositionRequiredFlag;
                    i5 |= i16;
                }
            } else {
                i6 = i;
            }
            i16 = GroupFlagsKt.HasAuxSlotFlag;
            i5 |= i16;
        } else {
            i6 = i;
        }
        int i21 = i4 & Fields.RotationY;
        if (i21 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changed(horizontal) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i22 = i4 & Fields.RotationZ;
        if (i22 != 0) {
            i8 = i3 | 6;
            i7 = i22;
        } else if ((i3 & 6) == 0) {
            i7 = i22;
            i8 = i3 | (startRestartGroup.changed(vertical) ? 4 : 2);
        } else {
            i7 = i22;
            i8 = i3;
        }
        int i23 = i4 & Fields.CameraDistance;
        if (i23 != 0) {
            i8 |= 48;
            i9 = i23;
        } else if ((i3 & 48) == 0) {
            i9 = i23;
            i8 |= startRestartGroup.changed(vertical2) ? 32 : 16;
        } else {
            i9 = i23;
        }
        int i24 = i8;
        int i25 = i4 & Fields.TransformOrigin;
        if (i25 != 0) {
            i10 = i24 | 384;
        } else {
            i10 = i24;
            if ((i3 & 384) == 0) {
                if (startRestartGroup.changed(horizontal2)) {
                    i18 = 256;
                }
                i10 |= i18;
                if ((i3 & 3072) == 0) {
                    if (startRestartGroup.changedInstance(kyVar)) {
                        i20 = 2048;
                    }
                    i10 |= i20;
                }
                i11 = i10;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i11 & 1171) != 1170, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    horizontal3 = horizontal;
                    vertical3 = vertical;
                    horizontal4 = horizontal2;
                    i12 = i6;
                    vertical4 = vertical2;
                } else {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if ((i4 & Fields.RotationX) != 0) {
                            i13 = LazyList_androidKt.defaultLazyListBeyondBoundsItemCount(startRestartGroup, 0);
                            i5 &= -234881025;
                        } else {
                            i13 = i6;
                        }
                        horizontal5 = i21 != 0 ? null : horizontal;
                        vertical5 = i7 != 0 ? null : vertical;
                        vertical6 = i9 != 0 ? null : vertical2;
                        i14 = i13;
                        i15 = i5;
                        if (i25 != 0) {
                            horizontal6 = null;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(924924659, i15, i11, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                            }
                            int i26 = (i15 >> 3) & 14;
                            iy rememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, kyVar, startRestartGroup, i26 | ((i11 >> 6) & 112));
                            int i27 = i15 >> 9;
                            LazyLayoutSemanticState rememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i26 | (i27 & 112));
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            int i28 = (65520 & i15) | (i27 & 458752) | (i27 & 3670016);
                            int i29 = i11 << 18;
                            int i30 = i28 | (i29 & 29360128) | (i29 & 234881024) | ((i11 << 27) & 1879048192);
                            int i31 = i15;
                            LazyLayoutMeasurePolicy rememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda, lazyListState, paddingValues2, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, (un) rememberedValue, (GraphicsContext) startRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), ((Boolean) startRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? null : StickyItemsPlacement.Companion.getStickToTopPlacement(), startRestartGroup, i30, 0);
                            int i32 = i14;
                            Alignment.Horizontal horizontal7 = horizontal5;
                            Alignment.Vertical vertical7 = vertical6;
                            Arrangement.Horizontal horizontal8 = horizontal6;
                            Arrangement.Vertical vertical8 = vertical5;
                            Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                            if (z3) {
                                startRestartGroup.startReplaceGroup(-2076718545);
                                startRestartGroup.endReplaceGroup();
                                modifier2 = Modifier.Companion;
                            } else {
                                startRestartGroup.startReplaceGroup(-2077147368);
                                modifier2 = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i32, startRestartGroup, i26 | ((i31 >> 21) & 112)), lazyListState.getBeyondBoundsInfo$foundation(), z, orientation);
                                startRestartGroup.endReplaceGroup();
                            }
                            LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda, ScrollableAreaKt.scrollableArea$default(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier$foundation()).then(lazyListState.getAwaitLayoutModifier$foundation()), rememberLazyListItemProviderLambda, rememberLazyListSemanticState, orientation, z3, z, startRestartGroup, ((i31 >> 6) & 57344) | ((i31 << 6) & 458752)).then(modifier2).then(lazyListState.getItemAnimator$foundation().getModifier()), lazyListState, orientation, overscrollEffect, z3, z, flingBehavior, lazyListState.getInternalInteractionSource$foundation(), null, Fields.SpotShadowColor, null), lazyListState.getPrefetchState$foundation(), rememberLazyListMeasurePolicy, startRestartGroup, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i12 = i32;
                            horizontal3 = horizontal7;
                            vertical4 = vertical7;
                            horizontal4 = horizontal8;
                            vertical3 = vertical8;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & Fields.RotationX) != 0) {
                            i5 &= -234881025;
                        }
                        horizontal5 = horizontal;
                        vertical5 = vertical;
                        vertical6 = vertical2;
                        i15 = i5;
                        i14 = i6;
                    }
                    horizontal6 = horizontal2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i262 = (i15 >> 3) & 14;
                    iy rememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, kyVar, startRestartGroup, i262 | ((i11 >> 6) & 112));
                    int i272 = i15 >> 9;
                    LazyLayoutSemanticState rememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, startRestartGroup, i262 | (i272 & 112));
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    int i282 = (65520 & i15) | (i272 & 458752) | (i272 & 3670016);
                    int i292 = i11 << 18;
                    int i302 = i282 | (i292 & 29360128) | (i292 & 234881024) | ((i11 << 27) & 1879048192);
                    int i312 = i15;
                    LazyLayoutMeasurePolicy rememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(rememberLazyListItemProviderLambda2, lazyListState, paddingValues2, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, (un) rememberedValue, (GraphicsContext) startRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), ((Boolean) startRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() ? null : StickyItemsPlacement.Companion.getStickToTopPlacement(), startRestartGroup, i302, 0);
                    int i322 = i14;
                    Alignment.Horizontal horizontal72 = horizontal5;
                    Alignment.Vertical vertical72 = vertical6;
                    Arrangement.Horizontal horizontal82 = horizontal6;
                    Arrangement.Vertical vertical82 = vertical5;
                    Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                    if (z3) {
                    }
                    LazyLayoutKt.LazyLayout(rememberLazyListItemProviderLambda2, ScrollableAreaKt.scrollableArea$default(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier$foundation()).then(lazyListState.getAwaitLayoutModifier$foundation()), rememberLazyListItemProviderLambda2, rememberLazyListSemanticState2, orientation2, z3, z, startRestartGroup, ((i312 >> 6) & 57344) | ((i312 << 6) & 458752)).then(modifier2).then(lazyListState.getItemAnimator$foundation().getModifier()), lazyListState, orientation2, overscrollEffect, z3, z, flingBehavior, lazyListState.getInternalInteractionSource$foundation(), null, Fields.SpotShadowColor, null), lazyListState.getPrefetchState$foundation(), rememberLazyListMeasurePolicy2, startRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i12 = i322;
                    horizontal3 = horizontal72;
                    vertical4 = vertical72;
                    horizontal4 = horizontal82;
                    vertical3 = vertical82;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new my() { // from class: a40
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 LazyList$lambda$0;
                            int intValue = ((Integer) obj2).intValue();
                            LazyList$lambda$0 = LazyListKt.LazyList$lambda$0(Modifier.this, lazyListState, paddingValues, z, z2, flingBehavior, z3, overscrollEffect, i12, horizontal3, vertical3, vertical4, horizontal4, kyVar, i2, i3, i4, (Composer) obj, intValue);
                            return LazyList$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
        }
        if ((i3 & 3072) == 0) {
        }
        i11 = i10;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i11 & 1171) != 1170, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyList$lambda$0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, boolean z2, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, ky kyVar, int i2, int i3, int i4, Composer composer, int i5) {
        LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, overscrollEffect, i, horizontal, vertical, vertical2, horizontal2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keepAroundItems(CacheWindowLogic cacheWindowLogic, List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (cacheWindowLogic.hasValidBounds() && !list.isEmpty()) {
                int index = ((LazyListMeasuredItem) yi.p0(list)).getIndex();
                int index2 = ((LazyListMeasuredItem) yi.v0(list)).getIndex();
                for (int prefetchWindowStartLine$foundation = cacheWindowLogic.getPrefetchWindowStartLine$foundation(); prefetchWindowStartLine$foundation < index; prefetchWindowStartLine$foundation++) {
                    lazyListMeasuredItemProvider.keepAround(prefetchWindowStartLine$foundation);
                }
                int i = index2 + 1;
                int prefetchWindowEndLine$foundation = cacheWindowLogic.getPrefetchWindowEndLine$foundation();
                if (i <= prefetchWindowEndLine$foundation) {
                    while (true) {
                        lazyListMeasuredItemProvider.keepAround(i);
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r34.changed(r4) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r34.changed(r9) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (r34.changed(r12) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        if (r34.changed(r13) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        if (r34.changed(r5) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        if (r34.changed(r6) == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyLayoutMeasurePolicy rememberLazyListMeasurePolicy(iy iyVar, LazyListState lazyListState, PaddingValues paddingValues, boolean z, boolean z2, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, un unVar, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Composer composer, int i2, int i3) {
        boolean z3;
        boolean z4;
        Alignment.Horizontal horizontal3;
        boolean z5;
        Alignment.Vertical vertical3;
        boolean z6;
        Arrangement.Horizontal horizontal4;
        boolean z7;
        Arrangement.Vertical vertical4;
        boolean z8;
        StickyItemsPlacement stickyItemsPlacement2;
        boolean z9;
        boolean z10;
        Object rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(406165748, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
        }
        boolean z11 = ((((i2 & 112) ^ 48) > 32 && composer.changed(lazyListState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            z3 = z2;
        } else {
            z3 = z2;
        }
        if ((i2 & 24576) != 16384) {
            z4 = false;
            boolean z12 = z11 | z4 | ((((458752 & i2) ^ 196608) <= 131072 && composer.changed(i)) || (i2 & 196608) == 131072);
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
                horizontal3 = horizontal;
            } else {
                horizontal3 = horizontal;
            }
            if ((1572864 & i2) != 1048576) {
                z5 = false;
                boolean z13 = z12 | z5;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    vertical3 = vertical;
                } else {
                    vertical3 = vertical;
                }
                if ((12582912 & i2) != 8388608) {
                    z6 = false;
                    boolean z14 = z13 | z6;
                    if (((234881024 & i2) ^ 100663296) <= 67108864) {
                        horizontal4 = horizontal2;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if ((100663296 & i2) != 67108864) {
                        z7 = false;
                        boolean z15 = z14 | z7;
                        if (((1879048192 & i2) ^ 805306368) > 536870912) {
                            vertical4 = vertical2;
                        } else {
                            vertical4 = vertical2;
                        }
                        if ((i2 & 805306368) != 536870912) {
                            z8 = false;
                            boolean changed = z8 | z15 | composer.changed(graphicsContext);
                            if (((i3 & 896) ^ 384) <= 256) {
                                stickyItemsPlacement2 = stickyItemsPlacement;
                            } else {
                                stickyItemsPlacement2 = stickyItemsPlacement;
                            }
                            if ((i3 & 384) != 256) {
                                z9 = false;
                                z10 = changed | z9;
                                rememberedValue = composer.rememberedValue();
                                if (!z10 || rememberedValue == Composer.Companion.getEmpty()) {
                                    LazyListKt$rememberLazyListMeasurePolicy$1$1 lazyListKt$rememberLazyListMeasurePolicy$1$1 = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z3, paddingValues, z, iyVar, vertical4, horizontal4, i, unVar, graphicsContext, stickyItemsPlacement2, horizontal3, vertical3);
                                    composer.updateRememberedValue(lazyListKt$rememberLazyListMeasurePolicy$1$1);
                                    rememberedValue = lazyListKt$rememberLazyListMeasurePolicy$1$1;
                                }
                                LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (LazyLayoutMeasurePolicy) rememberedValue;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                return lazyLayoutMeasurePolicy;
                            }
                            z9 = true;
                            z10 = changed | z9;
                            rememberedValue = composer.rememberedValue();
                            if (!z10) {
                            }
                            LazyListKt$rememberLazyListMeasurePolicy$1$1 lazyListKt$rememberLazyListMeasurePolicy$1$12 = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z3, paddingValues, z, iyVar, vertical4, horizontal4, i, unVar, graphicsContext, stickyItemsPlacement2, horizontal3, vertical3);
                            composer.updateRememberedValue(lazyListKt$rememberLazyListMeasurePolicy$1$12);
                            rememberedValue = lazyListKt$rememberLazyListMeasurePolicy$1$12;
                            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (LazyLayoutMeasurePolicy) rememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            return lazyLayoutMeasurePolicy2;
                        }
                        z8 = true;
                        boolean changed2 = z8 | z15 | composer.changed(graphicsContext);
                        if (((i3 & 896) ^ 384) <= 256) {
                        }
                        if ((i3 & 384) != 256) {
                        }
                        z9 = true;
                        z10 = changed2 | z9;
                        rememberedValue = composer.rememberedValue();
                        if (!z10) {
                        }
                        LazyListKt$rememberLazyListMeasurePolicy$1$1 lazyListKt$rememberLazyListMeasurePolicy$1$122 = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z3, paddingValues, z, iyVar, vertical4, horizontal4, i, unVar, graphicsContext, stickyItemsPlacement2, horizontal3, vertical3);
                        composer.updateRememberedValue(lazyListKt$rememberLazyListMeasurePolicy$1$122);
                        rememberedValue = lazyListKt$rememberLazyListMeasurePolicy$1$122;
                        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22 = (LazyLayoutMeasurePolicy) rememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        return lazyLayoutMeasurePolicy22;
                    }
                    z7 = true;
                    boolean z152 = z14 | z7;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    }
                    if ((i2 & 805306368) != 536870912) {
                    }
                    z8 = true;
                    boolean changed22 = z8 | z152 | composer.changed(graphicsContext);
                    if (((i3 & 896) ^ 384) <= 256) {
                    }
                    if ((i3 & 384) != 256) {
                    }
                    z9 = true;
                    z10 = changed22 | z9;
                    rememberedValue = composer.rememberedValue();
                    if (!z10) {
                    }
                    LazyListKt$rememberLazyListMeasurePolicy$1$1 lazyListKt$rememberLazyListMeasurePolicy$1$1222 = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z3, paddingValues, z, iyVar, vertical4, horizontal4, i, unVar, graphicsContext, stickyItemsPlacement2, horizontal3, vertical3);
                    composer.updateRememberedValue(lazyListKt$rememberLazyListMeasurePolicy$1$1222);
                    rememberedValue = lazyListKt$rememberLazyListMeasurePolicy$1$1222;
                    LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222 = (LazyLayoutMeasurePolicy) rememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    return lazyLayoutMeasurePolicy222;
                }
                z6 = true;
                boolean z142 = z13 | z6;
                if (((234881024 & i2) ^ 100663296) <= 67108864) {
                }
                if ((100663296 & i2) != 67108864) {
                }
                z7 = true;
                boolean z1522 = z142 | z7;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                }
                if ((i2 & 805306368) != 536870912) {
                }
                z8 = true;
                boolean changed222 = z8 | z1522 | composer.changed(graphicsContext);
                if (((i3 & 896) ^ 384) <= 256) {
                }
                if ((i3 & 384) != 256) {
                }
                z9 = true;
                z10 = changed222 | z9;
                rememberedValue = composer.rememberedValue();
                if (!z10) {
                }
                LazyListKt$rememberLazyListMeasurePolicy$1$1 lazyListKt$rememberLazyListMeasurePolicy$1$12222 = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z3, paddingValues, z, iyVar, vertical4, horizontal4, i, unVar, graphicsContext, stickyItemsPlacement2, horizontal3, vertical3);
                composer.updateRememberedValue(lazyListKt$rememberLazyListMeasurePolicy$1$12222);
                rememberedValue = lazyListKt$rememberLazyListMeasurePolicy$1$12222;
                LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2222 = (LazyLayoutMeasurePolicy) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                }
                return lazyLayoutMeasurePolicy2222;
            }
            z5 = true;
            boolean z132 = z12 | z5;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            z6 = true;
            boolean z1422 = z132 | z6;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
            }
            if ((100663296 & i2) != 67108864) {
            }
            z7 = true;
            boolean z15222 = z1422 | z7;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
            }
            if ((i2 & 805306368) != 536870912) {
            }
            z8 = true;
            boolean changed2222 = z8 | z15222 | composer.changed(graphicsContext);
            if (((i3 & 896) ^ 384) <= 256) {
            }
            if ((i3 & 384) != 256) {
            }
            z9 = true;
            z10 = changed2222 | z9;
            rememberedValue = composer.rememberedValue();
            if (!z10) {
            }
            LazyListKt$rememberLazyListMeasurePolicy$1$1 lazyListKt$rememberLazyListMeasurePolicy$1$122222 = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z3, paddingValues, z, iyVar, vertical4, horizontal4, i, unVar, graphicsContext, stickyItemsPlacement2, horizontal3, vertical3);
            composer.updateRememberedValue(lazyListKt$rememberLazyListMeasurePolicy$1$122222);
            rememberedValue = lazyListKt$rememberLazyListMeasurePolicy$1$122222;
            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22222 = (LazyLayoutMeasurePolicy) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
            }
            return lazyLayoutMeasurePolicy22222;
        }
        z4 = true;
        boolean z122 = z11 | z4 | ((((458752 & i2) ^ 196608) <= 131072 && composer.changed(i)) || (i2 & 196608) == 131072);
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) != 1048576) {
        }
        z5 = true;
        boolean z1322 = z122 | z5;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        z6 = true;
        boolean z14222 = z1322 | z6;
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) != 67108864) {
        }
        z7 = true;
        boolean z152222 = z14222 | z7;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
        }
        if ((i2 & 805306368) != 536870912) {
        }
        z8 = true;
        boolean changed22222 = z8 | z152222 | composer.changed(graphicsContext);
        if (((i3 & 896) ^ 384) <= 256) {
        }
        if ((i3 & 384) != 256) {
        }
        z9 = true;
        z10 = changed22222 | z9;
        rememberedValue = composer.rememberedValue();
        if (!z10) {
        }
        LazyListKt$rememberLazyListMeasurePolicy$1$1 lazyListKt$rememberLazyListMeasurePolicy$1$1222222 = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z3, paddingValues, z, iyVar, vertical4, horizontal4, i, unVar, graphicsContext, stickyItemsPlacement2, horizontal3, vertical3);
        composer.updateRememberedValue(lazyListKt$rememberLazyListMeasurePolicy$1$1222222);
        rememberedValue = lazyListKt$rememberLazyListMeasurePolicy$1$1222222;
        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222222 = (LazyLayoutMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
        }
        return lazyLayoutMeasurePolicy222222;
    }
}
