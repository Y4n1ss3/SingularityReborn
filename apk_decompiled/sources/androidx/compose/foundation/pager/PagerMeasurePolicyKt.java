package androidx.compose.foundation.pager;

import android.os.Trace;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import defpackage.iy;
import defpackage.un;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    private static final boolean DebugEnabled = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keepAroundItems(LazyLayoutMeasureScope lazyLayoutMeasureScope, CacheWindowLogic cacheWindowLogic, List<? extends PageInfo> list) {
        Trace.beginSection("compose:pager:cache_window:keepAroundItems");
        try {
            if (cacheWindowLogic.hasValidBounds() && !list.isEmpty()) {
                int index = ((PageInfo) yi.p0(list)).getIndex();
                int index2 = ((PageInfo) yi.v0(list)).getIndex();
                for (int prefetchWindowStartLine$foundation = cacheWindowLogic.getPrefetchWindowStartLine$foundation(); prefetchWindowStartLine$foundation < index; prefetchWindowStartLine$foundation++) {
                    lazyLayoutMeasureScope.compose(prefetchWindowStartLine$foundation);
                }
                int i = index2 + 1;
                int prefetchWindowEndLine$foundation = cacheWindowLogic.getPrefetchWindowEndLine$foundation();
                if (i <= prefetchWindowEndLine$foundation) {
                    while (true) {
                        lazyLayoutMeasureScope.compose(i);
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r34.changed(r4) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r34.changed(r9) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r34.changed(r12) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if (r34.changed(r13) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        if (r34.changed(r14) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
    
        if (r34.changed(r3) == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a7  */
    /* renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyLayoutMeasurePolicy m1009rememberPagerMeasurePolicy8u0NR3k(iy iyVar, PagerState pagerState, PaddingValues paddingValues, boolean z, Orientation orientation, int i, float f, PageSize pageSize, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, un unVar, iy iyVar2, Composer composer, int i2, int i3) {
        Alignment.Horizontal horizontal2;
        boolean z2;
        Alignment.Vertical vertical2;
        boolean z3;
        float f2;
        boolean z4;
        PageSize pageSize2;
        boolean z5;
        SnapPosition snapPosition2;
        boolean z6;
        int i4;
        boolean z7;
        boolean changed;
        Object rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1294131537, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:61)");
        }
        boolean z8 = ((((i2 & 112) ^ 48) > 32 && composer.changed(pagerState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(orientation.ordinal())) || (i2 & 24576) == 16384);
        if (((234881024 & i2) ^ 100663296) > 67108864) {
            horizontal2 = horizontal;
        } else {
            horizontal2 = horizontal;
        }
        if ((100663296 & i2) != 67108864) {
            z2 = false;
            boolean z9 = z8 | z2;
            if (((1879048192 & i2) ^ 805306368) <= 536870912) {
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
            }
            if ((805306368 & i2) != 536870912) {
                z3 = false;
                boolean z10 = z9 | z3;
                if (((3670016 & i2) ^ 1572864) > 1048576) {
                    f2 = f;
                } else {
                    f2 = f;
                }
                if ((1572864 & i2) != 1048576) {
                    z4 = false;
                    boolean z11 = z10 | z4;
                    if (((29360128 & i2) ^ 12582912) <= 8388608) {
                        pageSize2 = pageSize;
                    } else {
                        pageSize2 = pageSize;
                    }
                    if ((12582912 & i2) != 8388608) {
                        z5 = false;
                        boolean z12 = z11 | z5;
                        if (((i3 & 14) ^ 6) > 4) {
                            snapPosition2 = snapPosition;
                        } else {
                            snapPosition2 = snapPosition;
                        }
                        if ((i3 & 6) != 4) {
                            z6 = false;
                            boolean z13 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(iyVar2)) || (i3 & 384) == 256) | z12 | z6;
                            if (((458752 & i2) ^ 196608) <= 131072) {
                                i4 = i;
                            } else {
                                i4 = i;
                            }
                            if ((i2 & 196608) != 131072) {
                                z7 = false;
                                changed = z13 | z7 | composer.changed(unVar);
                                rememberedValue = composer.rememberedValue();
                                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f2, pageSize2, iyVar, iyVar2, vertical2, horizontal2, i4, snapPosition2, unVar);
                                    composer.updateRememberedValue(pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1);
                                    rememberedValue = pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;
                                }
                                LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (LazyLayoutMeasurePolicy) rememberedValue;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                return lazyLayoutMeasurePolicy;
                            }
                            z7 = true;
                            changed = z13 | z7 | composer.changed(unVar);
                            rememberedValue = composer.rememberedValue();
                            if (!changed) {
                            }
                            PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$12 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f2, pageSize2, iyVar, iyVar2, vertical2, horizontal2, i4, snapPosition2, unVar);
                            composer.updateRememberedValue(pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$12);
                            rememberedValue = pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$12;
                            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (LazyLayoutMeasurePolicy) rememberedValue;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            return lazyLayoutMeasurePolicy2;
                        }
                        z6 = true;
                        boolean z132 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(iyVar2)) || (i3 & 384) == 256) | z12 | z6;
                        if (((458752 & i2) ^ 196608) <= 131072) {
                        }
                        if ((i2 & 196608) != 131072) {
                        }
                        z7 = true;
                        changed = z132 | z7 | composer.changed(unVar);
                        rememberedValue = composer.rememberedValue();
                        if (!changed) {
                        }
                        PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$122 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f2, pageSize2, iyVar, iyVar2, vertical2, horizontal2, i4, snapPosition2, unVar);
                        composer.updateRememberedValue(pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$122);
                        rememberedValue = pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$122;
                        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22 = (LazyLayoutMeasurePolicy) rememberedValue;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        return lazyLayoutMeasurePolicy22;
                    }
                    z5 = true;
                    boolean z122 = z11 | z5;
                    if (((i3 & 14) ^ 6) > 4) {
                    }
                    if ((i3 & 6) != 4) {
                    }
                    z6 = true;
                    boolean z1322 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(iyVar2)) || (i3 & 384) == 256) | z122 | z6;
                    if (((458752 & i2) ^ 196608) <= 131072) {
                    }
                    if ((i2 & 196608) != 131072) {
                    }
                    z7 = true;
                    changed = z1322 | z7 | composer.changed(unVar);
                    rememberedValue = composer.rememberedValue();
                    if (!changed) {
                    }
                    PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1222 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f2, pageSize2, iyVar, iyVar2, vertical2, horizontal2, i4, snapPosition2, unVar);
                    composer.updateRememberedValue(pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1222);
                    rememberedValue = pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1222;
                    LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222 = (LazyLayoutMeasurePolicy) rememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    return lazyLayoutMeasurePolicy222;
                }
                z4 = true;
                boolean z112 = z10 | z4;
                if (((29360128 & i2) ^ 12582912) <= 8388608) {
                }
                if ((12582912 & i2) != 8388608) {
                }
                z5 = true;
                boolean z1222 = z112 | z5;
                if (((i3 & 14) ^ 6) > 4) {
                }
                if ((i3 & 6) != 4) {
                }
                z6 = true;
                boolean z13222 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(iyVar2)) || (i3 & 384) == 256) | z1222 | z6;
                if (((458752 & i2) ^ 196608) <= 131072) {
                }
                if ((i2 & 196608) != 131072) {
                }
                z7 = true;
                changed = z13222 | z7 | composer.changed(unVar);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$12222 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f2, pageSize2, iyVar, iyVar2, vertical2, horizontal2, i4, snapPosition2, unVar);
                composer.updateRememberedValue(pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$12222);
                rememberedValue = pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$12222;
                LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2222 = (LazyLayoutMeasurePolicy) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                }
                return lazyLayoutMeasurePolicy2222;
            }
            z3 = true;
            boolean z102 = z9 | z3;
            if (((3670016 & i2) ^ 1572864) > 1048576) {
            }
            if ((1572864 & i2) != 1048576) {
            }
            z4 = true;
            boolean z1122 = z102 | z4;
            if (((29360128 & i2) ^ 12582912) <= 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            z5 = true;
            boolean z12222 = z1122 | z5;
            if (((i3 & 14) ^ 6) > 4) {
            }
            if ((i3 & 6) != 4) {
            }
            z6 = true;
            boolean z132222 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(iyVar2)) || (i3 & 384) == 256) | z12222 | z6;
            if (((458752 & i2) ^ 196608) <= 131072) {
            }
            if ((i2 & 196608) != 131072) {
            }
            z7 = true;
            changed = z132222 | z7 | composer.changed(unVar);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$122222 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f2, pageSize2, iyVar, iyVar2, vertical2, horizontal2, i4, snapPosition2, unVar);
            composer.updateRememberedValue(pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$122222);
            rememberedValue = pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$122222;
            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22222 = (LazyLayoutMeasurePolicy) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
            }
            return lazyLayoutMeasurePolicy22222;
        }
        z2 = true;
        boolean z92 = z8 | z2;
        if (((1879048192 & i2) ^ 805306368) <= 536870912) {
        }
        if ((805306368 & i2) != 536870912) {
        }
        z3 = true;
        boolean z1022 = z92 | z3;
        if (((3670016 & i2) ^ 1572864) > 1048576) {
        }
        if ((1572864 & i2) != 1048576) {
        }
        z4 = true;
        boolean z11222 = z1022 | z4;
        if (((29360128 & i2) ^ 12582912) <= 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        z5 = true;
        boolean z122222 = z11222 | z5;
        if (((i3 & 14) ^ 6) > 4) {
        }
        if ((i3 & 6) != 4) {
        }
        z6 = true;
        boolean z1322222 = ((((i3 & 896) ^ 384) <= 256 && composer.changed(iyVar2)) || (i3 & 384) == 256) | z122222 | z6;
        if (((458752 & i2) ^ 196608) <= 131072) {
        }
        if ((i2 & 196608) != 131072) {
        }
        z7 = true;
        changed = z1322222 | z7 | composer.changed(unVar);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1222222 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f2, pageSize2, iyVar, iyVar2, vertical2, horizontal2, i4, snapPosition2, unVar);
        composer.updateRememberedValue(pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1222222);
        rememberedValue = pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1222222;
        LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222222 = (LazyLayoutMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
        }
        return lazyLayoutMeasurePolicy222222;
    }

    private static final void debugLog(iy iyVar) {
    }
}
