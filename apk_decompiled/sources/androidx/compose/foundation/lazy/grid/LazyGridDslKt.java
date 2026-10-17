package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.i30;
import defpackage.j30;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.oy;
import defpackage.py;
import defpackage.r4;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyHorizontalGrid(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        LazyGridState lazyGridState2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        Arrangement.Vertical vertical2;
        int i9;
        int i10;
        Composer composer2;
        Arrangement.Horizontal horizontal2;
        boolean z4;
        Modifier modifier3;
        LazyGridState lazyGridState3;
        PaddingValues paddingValues3;
        boolean z5;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior2;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        LazyGridState lazyGridState4;
        Arrangement.Horizontal horizontal3;
        Arrangement.Vertical top;
        FlingBehavior flingBehavior3;
        OverscrollEffect overscrollEffect3;
        Modifier modifier4;
        LazyGridState lazyGridState5;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal4;
        FlingBehavior flingBehavior4;
        boolean z6;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(635941664);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    if (startRestartGroup.changed(lazyGridState2)) {
                        i14 = Fields.RotationX;
                        i4 |= i14;
                    }
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i14 = Fields.SpotShadowColor;
                i4 |= i14;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= startRestartGroup.changed(paddingValues2) ? Fields.CameraDistance : Fields.RotationZ;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i4 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                    if ((i & 196608) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(horizontal)) ? Fields.RenderEffect : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i8 = 196608;
                        vertical2 = vertical;
                        i4 |= startRestartGroup.changed(vertical2) ? 1048576 : Fields.BlendMode;
                        if ((i & 12582912) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i13 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i13;
                            }
                            i13 = 4194304;
                            i4 |= i13;
                        }
                        i9 = i3 & Fields.RotationX;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                i12 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i12;
                            }
                            i12 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i12;
                        }
                        if ((i2 & 6) == 0) {
                            i10 = i2 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.Companion : modifier2;
                                if ((i3 & 4) != 0) {
                                    lazyGridState4 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i4 &= -897;
                                } else {
                                    lazyGridState4 = lazyGridState2;
                                }
                                PaddingValues m755PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                if ((i3 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal3 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                    i4 &= -458753;
                                } else {
                                    horizontal3 = horizontal;
                                }
                                top = i7 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i4 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                boolean z8 = i9 == 0 ? z2 : true;
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                } else {
                                    overscrollEffect3 = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyGridState5 = lazyGridState4;
                                paddingValues4 = m755PaddingValues0680j_4;
                                horizontal4 = horizontal3;
                                flingBehavior4 = flingBehavior3;
                                z6 = z3;
                                z7 = z8;
                                i11 = 635941664;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                }
                                horizontal4 = horizontal;
                                flingBehavior4 = flingBehavior;
                                z7 = z2;
                                overscrollEffect3 = overscrollEffect;
                                lazyGridState5 = lazyGridState2;
                                paddingValues4 = paddingValues2;
                                z6 = z3;
                                top = vertical2;
                                i11 = 635941664;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i11, i4, i10, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:168)");
                            }
                            int i16 = i4 >> 15;
                            int i17 = i4 >> 3;
                            composer2 = startRestartGroup;
                            Arrangement.Vertical vertical4 = top;
                            LazyGridKt.LazyGrid(modifier4, lazyGridState5, rememberRowHeightSums(gridCells, top, startRestartGroup, (i4 & 14) | (i16 & 112)), paddingValues4, z6, false, flingBehavior4, z7, overscrollEffect3, vertical4, horizontal4, kyVar, composer2, (i17 & 234881024) | (i17 & 14) | i8 | (i17 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i17) | (29360128 & i17) | ((i4 << 9) & 1879048192), (i16 & 14) | ((i10 << 3) & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            lazyGridState3 = lazyGridState5;
                            paddingValues3 = paddingValues4;
                            z5 = z6;
                            flingBehavior2 = flingBehavior4;
                            z4 = z7;
                            overscrollEffect2 = overscrollEffect3;
                            vertical3 = vertical4;
                            horizontal2 = horizontal4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            horizontal2 = horizontal;
                            z4 = z2;
                            modifier3 = modifier2;
                            lazyGridState3 = lazyGridState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            vertical3 = vertical2;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new j30(gridCells, modifier3, lazyGridState3, paddingValues3, z5, horizontal2, vertical3, flingBehavior2, z4, overscrollEffect2, kyVar, i, i2, i3));
                            return;
                        }
                        return;
                    }
                    i8 = 196608;
                    vertical2 = vertical;
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 != 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z;
                if ((i & 196608) == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = 196608;
                vertical2 = vertical;
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            if ((i & 196608) == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = 196608;
            vertical2 = vertical;
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        if ((i & 196608) == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = 196608;
        vertical2 = vertical;
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyHorizontalGrid$lambda$0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, int i, int i2, int i3, Composer composer, int i4) {
        LazyHorizontalGrid(gridCells, modifier, lazyGridState, paddingValues, z, horizontal, vertical, flingBehavior, z2, overscrollEffect, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyHorizontalGrid$lambda$1(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyHorizontalGrid(gridCells, modifier, lazyGridState, paddingValues, z, horizontal, vertical, flingBehavior, z2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyVerticalGrid(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        LazyGridState lazyGridState2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        Arrangement.Horizontal horizontal2;
        int i9;
        int i10;
        Composer composer2;
        Arrangement.Vertical vertical2;
        boolean z4;
        Modifier modifier3;
        LazyGridState lazyGridState3;
        PaddingValues paddingValues3;
        boolean z5;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior2;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        LazyGridState lazyGridState4;
        Arrangement.Vertical vertical3;
        Arrangement.Horizontal start;
        FlingBehavior flingBehavior3;
        OverscrollEffect overscrollEffect3;
        Modifier modifier4;
        LazyGridState lazyGridState5;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        FlingBehavior flingBehavior4;
        boolean z6;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-2072102870);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    if (startRestartGroup.changed(lazyGridState2)) {
                        i14 = Fields.RotationX;
                        i4 |= i14;
                    }
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i14 = Fields.SpotShadowColor;
                i4 |= i14;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= startRestartGroup.changed(paddingValues2) ? Fields.CameraDistance : Fields.RotationZ;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i4 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                    if ((i & 196608) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(vertical)) ? Fields.RenderEffect : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i8 = 196608;
                        horizontal2 = horizontal;
                        i4 |= startRestartGroup.changed(horizontal2) ? 1048576 : Fields.BlendMode;
                        if ((i & 12582912) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i13 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i13;
                            }
                            i13 = 4194304;
                            i4 |= i13;
                        }
                        i9 = i3 & Fields.RotationX;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                i12 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i12;
                            }
                            i12 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i12;
                        }
                        if ((i2 & 6) == 0) {
                            i10 = i2 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.Companion : modifier2;
                                if ((i3 & 4) != 0) {
                                    lazyGridState4 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i4 &= -897;
                                } else {
                                    lazyGridState4 = lazyGridState2;
                                }
                                PaddingValues m755PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                if ((i3 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical3 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                    i4 &= -458753;
                                } else {
                                    vertical3 = vertical;
                                }
                                start = i7 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i4 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                boolean z8 = i9 == 0 ? z2 : true;
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                } else {
                                    overscrollEffect3 = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyGridState5 = lazyGridState4;
                                paddingValues4 = m755PaddingValues0680j_4;
                                vertical4 = vertical3;
                                flingBehavior4 = flingBehavior3;
                                z6 = z3;
                                z7 = z8;
                                i11 = -2072102870;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                }
                                vertical4 = vertical;
                                flingBehavior4 = flingBehavior;
                                z7 = z2;
                                overscrollEffect3 = overscrollEffect;
                                lazyGridState5 = lazyGridState2;
                                paddingValues4 = paddingValues2;
                                z6 = z3;
                                start = horizontal2;
                                i11 = -2072102870;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i11, i4, i10, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                            }
                            int i16 = i4 >> 3;
                            composer2 = startRestartGroup;
                            Arrangement.Horizontal horizontal4 = start;
                            LazyGridKt.LazyGrid(modifier4, lazyGridState5, rememberColumnWidthSums(gridCells, start, startRestartGroup, (i4 & 14) | ((i4 >> 15) & 112)), paddingValues4, z6, true, flingBehavior4, z7, overscrollEffect3, vertical4, horizontal4, kyVar, composer2, (i16 & 234881024) | (i16 & 14) | i8 | (i16 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i16) | (29360128 & i16) | ((i4 << 12) & 1879048192), ((i4 >> 18) & 14) | ((i10 << 3) & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            lazyGridState3 = lazyGridState5;
                            paddingValues3 = paddingValues4;
                            z5 = z6;
                            flingBehavior2 = flingBehavior4;
                            z4 = z7;
                            overscrollEffect2 = overscrollEffect3;
                            vertical2 = vertical4;
                            horizontal3 = horizontal4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            vertical2 = vertical;
                            z4 = z2;
                            modifier3 = modifier2;
                            lazyGridState3 = lazyGridState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            horizontal3 = horizontal2;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new j30(gridCells, modifier3, lazyGridState3, paddingValues3, z5, vertical2, horizontal3, flingBehavior2, z4, overscrollEffect2, kyVar, i, i2, i3));
                            return;
                        }
                        return;
                    }
                    i8 = 196608;
                    horizontal2 = horizontal;
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 != 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z;
                if ((i & 196608) == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = 196608;
                horizontal2 = horizontal;
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            if ((i & 196608) == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = 196608;
            horizontal2 = horizontal;
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        if ((i & 196608) == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = 196608;
        horizontal2 = horizontal;
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyVerticalGrid$lambda$0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, int i, int i2, int i3, Composer composer, int i4) {
        LazyVerticalGrid(gridCells, modifier, lazyGridState, paddingValues, z, vertical, horizontal, flingBehavior, z2, overscrollEffect, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyVerticalGrid$lambda$1(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyVerticalGrid(gridCells, modifier, lazyGridState, paddingValues, z, vertical, horizontal, flingBehavior, z2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> list, ky kyVar, my myVar, ky kyVar2, oy oyVar) {
        lazyGridScope.items(list.size(), kyVar != null ? new LazyGridDslKt$items$2(kyVar, list) : null, myVar != null ? new LazyGridDslKt$items$3(myVar, list) : null, new LazyGridDslKt$items$4(kyVar2, list), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new LazyGridDslKt$items$5(oyVar, list)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, ky kyVar, my myVar, ky kyVar2, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            myVar = null;
        }
        if ((i & 8) != 0) {
            kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$1
                @Override // defpackage.ky
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(list.size(), kyVar != null ? new LazyGridDslKt$items$2(kyVar, list) : null, myVar != null ? new LazyGridDslKt$items$3(myVar, list) : null, new LazyGridDslKt$items$4(kyVar2, list), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new LazyGridDslKt$items$5(oyVar, list)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> list, my myVar, ny nyVar, my myVar2, py pyVar) {
        lazyGridScope.items(list.size(), myVar != null ? new LazyGridDslKt$itemsIndexed$2(myVar, list) : null, nyVar != null ? new LazyGridDslKt$itemsIndexed$3(nyVar, list) : null, new LazyGridDslKt$itemsIndexed$4(myVar2, list), ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new LazyGridDslKt$itemsIndexed$5(pyVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, my myVar, ny nyVar, my myVar2, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        if ((i & 4) != 0) {
            nyVar = null;
        }
        if ((i & 8) != 0) {
            myVar2 = new my() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$1
                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }

                public final Void invoke(int i2, Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(list.size(), myVar != null ? new LazyGridDslKt$itemsIndexed$2(myVar, list) : null, nyVar != null ? new LazyGridDslKt$itemsIndexed$3(nyVar, list) : null, new LazyGridDslKt$itemsIndexed$4(myVar2, list), ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new LazyGridDslKt$itemsIndexed$5(pyVar, list)));
    }

    private static final LazyGridSlotsProvider rememberColumnWidthSums(GridCells gridCells, Arrangement.Horizontal horizontal, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-76500289, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        int i2 = 6;
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new r4(i2, gridCells, horizontal));
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSlots rememberColumnWidthSums$lambda$0$0(GridCells gridCells, Arrangement.Horizontal horizontal, Density density, Constraints constraints) {
        if (Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl()) == Integer.MAX_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
        }
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl());
        int[] H0 = yi.H0(gridCells.calculateCrossAxisCellSizes(density, m7564getMaxWidthimpl, density.mo361roundToPx0680j_4(horizontal.mo653getSpacingD9Ej5fM())));
        int[] iArr = new int[H0.length];
        horizontal.arrange(density, m7564getMaxWidthimpl, H0, LayoutDirection.Ltr, iArr);
        return new LazyGridSlots(H0, iArr);
    }

    private static final LazyGridSlotsProvider rememberRowHeightSums(GridCells gridCells, Arrangement.Vertical vertical, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-150818144, i, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:245)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new r4(7, gridCells, vertical));
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridSlots rememberRowHeightSums$lambda$0$0(GridCells gridCells, Arrangement.Vertical vertical, Density density, Constraints constraints) {
        if (Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl()) == Integer.MAX_VALUE) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
        }
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl());
        int[] H0 = yi.H0(gridCells.calculateCrossAxisCellSizes(density, m7563getMaxHeightimpl, density.mo361roundToPx0680j_4(vertical.mo653getSpacingD9Ej5fM())));
        int[] iArr = new int[H0.length];
        vertical.arrange(density, m7563getMaxHeightimpl, H0, iArr);
        return new LazyGridSlots(H0, iArr);
    }

    public static final <T> void items(LazyGridScope lazyGridScope, T[] tArr, ky kyVar, my myVar, ky kyVar2, oy oyVar) {
        lazyGridScope.items(tArr.length, kyVar != null ? new LazyGridDslKt$items$7(kyVar, tArr) : null, myVar != null ? new LazyGridDslKt$items$8(myVar, tArr) : null, new LazyGridDslKt$items$9(kyVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1179065086, true, new LazyGridDslKt$items$10(oyVar, tArr)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] tArr, my myVar, ny nyVar, my myVar2, py pyVar) {
        lazyGridScope.items(tArr.length, myVar != null ? new LazyGridDslKt$itemsIndexed$7(myVar, tArr) : null, nyVar != null ? new LazyGridDslKt$itemsIndexed$8(nyVar, tArr) : null, new LazyGridDslKt$itemsIndexed$9(myVar2, tArr), ComposableLambdaKt.composableLambdaInstance(49283819, true, new LazyGridDslKt$itemsIndexed$10(pyVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, ky kyVar, my myVar, ky kyVar2, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            myVar = null;
        }
        if ((i & 8) != 0) {
            kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$6
                @Override // defpackage.ky
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(objArr.length, kyVar != null ? new LazyGridDslKt$items$7(kyVar, objArr) : null, myVar != null ? new LazyGridDslKt$items$8(myVar, objArr) : null, new LazyGridDslKt$items$9(kyVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1179065086, true, new LazyGridDslKt$items$10(oyVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, my myVar, ny nyVar, my myVar2, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        if ((i & 4) != 0) {
            nyVar = null;
        }
        if ((i & 8) != 0) {
            myVar2 = new my() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$6
                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }

                public final Void invoke(int i2, Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(objArr.length, myVar != null ? new LazyGridDslKt$itemsIndexed$7(myVar, objArr) : null, nyVar != null ? new LazyGridDslKt$itemsIndexed$8(nyVar, objArr) : null, new LazyGridDslKt$itemsIndexed$9(myVar2, objArr), ComposableLambdaKt.composableLambdaInstance(49283819, true, new LazyGridDslKt$itemsIndexed$10(pyVar, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyHorizontalGrid(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyGridState lazyGridState2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i6;
        Arrangement.Vertical vertical2;
        int i7;
        int i8;
        Composer composer2;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        LazyGridState lazyGridState3;
        PaddingValues paddingValues3;
        boolean z4;
        Arrangement.Horizontal horizontal3;
        Arrangement.Vertical vertical3;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        Arrangement.Horizontal horizontal4;
        FlingBehavior flingBehavior3;
        boolean z6;
        Modifier modifier3;
        LazyGridState lazyGridState4;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal5;
        Arrangement.Vertical vertical4;
        boolean z7;
        FlingBehavior flingBehavior4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(2123608858);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    if (startRestartGroup.changed(lazyGridState2)) {
                        i12 = Fields.RotationX;
                        i3 |= i12;
                    }
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i12 = Fields.SpotShadowColor;
                i3 |= i12;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            horizontal2 = horizontal;
                            if (startRestartGroup.changed(horizontal2)) {
                                i11 = Fields.RenderEffect;
                                i3 |= i11;
                            }
                        } else {
                            horizontal2 = horizontal;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        vertical2 = vertical;
                        i3 |= startRestartGroup.changed(vertical2) ? 1048576 : Fields.BlendMode;
                        if ((i & 12582912) == 0) {
                            if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i10 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i10;
                            }
                            i10 = 4194304;
                            i3 |= i10;
                        }
                        i7 = i2 & Fields.RotationX;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i3 &= -29360129;
                                    }
                                    modifier3 = modifier;
                                    flingBehavior4 = flingBehavior;
                                    z6 = z2;
                                    paddingValues4 = paddingValues2;
                                    z7 = z3;
                                    horizontal5 = horizontal2;
                                    vertical4 = vertical2;
                                    i9 = 2123608858;
                                    lazyGridState4 = lazyGridState2;
                                } else {
                                    Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                    if ((i2 & 4) != 0) {
                                        lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                        i3 &= -897;
                                    }
                                    PaddingValues m755PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                    if (i5 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 32) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        horizontal4 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                        i3 &= -458753;
                                    } else {
                                        horizontal4 = horizontal2;
                                    }
                                    Arrangement.Vertical top = i6 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        flingBehavior3 = flingBehavior;
                                    }
                                    if (i8 != 0) {
                                        modifier3 = modifier4;
                                        lazyGridState4 = lazyGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        vertical4 = top;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        z6 = true;
                                        i9 = 2123608858;
                                        horizontal5 = horizontal4;
                                    } else {
                                        z6 = z2;
                                        modifier3 = modifier4;
                                        lazyGridState4 = lazyGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        horizontal5 = horizontal4;
                                        vertical4 = top;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        i9 = 2123608858;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:199)");
                                }
                                composer2 = startRestartGroup;
                                LazyHorizontalGrid(gridCells, modifier3, lazyGridState4, paddingValues4, z7, horizontal5, vertical4, flingBehavior4, z6, OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), kyVar, composer2, i3 & 268435454, (i3 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyGridState3 = lazyGridState4;
                                paddingValues3 = paddingValues4;
                                z4 = z7;
                                horizontal3 = horizontal5;
                                vertical3 = vertical4;
                                flingBehavior2 = flingBehavior4;
                                z5 = z6;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                flingBehavior2 = flingBehavior;
                                lazyGridState3 = lazyGridState2;
                                paddingValues3 = paddingValues2;
                                z4 = z3;
                                horizontal3 = horizontal2;
                                vertical3 = vertical2;
                                z5 = z2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new i30(gridCells, modifier2, lazyGridState3, paddingValues3, z4, horizontal3, vertical3, flingBehavior2, z5, kyVar, i, i2));
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        if ((i & 805306368) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    vertical2 = vertical;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    if ((i & 805306368) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                vertical2 = vertical;
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            vertical2 = vertical;
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        vertical2 = vertical;
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyVerticalGrid(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyGridState lazyGridState2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i6;
        Arrangement.Horizontal horizontal2;
        int i7;
        int i8;
        Composer composer2;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        LazyGridState lazyGridState3;
        PaddingValues paddingValues3;
        boolean z4;
        Arrangement.Vertical vertical3;
        Arrangement.Horizontal horizontal3;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        Arrangement.Vertical vertical4;
        FlingBehavior flingBehavior3;
        boolean z6;
        Modifier modifier3;
        LazyGridState lazyGridState4;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical5;
        Arrangement.Horizontal horizontal4;
        boolean z7;
        FlingBehavior flingBehavior4;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1485410512);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    if (startRestartGroup.changed(lazyGridState2)) {
                        i12 = Fields.RotationX;
                        i3 |= i12;
                    }
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i12 = Fields.SpotShadowColor;
                i3 |= i12;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            vertical2 = vertical;
                            if (startRestartGroup.changed(vertical2)) {
                                i11 = Fields.RenderEffect;
                                i3 |= i11;
                            }
                        } else {
                            vertical2 = vertical;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        vertical2 = vertical;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        horizontal2 = horizontal;
                        i3 |= startRestartGroup.changed(horizontal2) ? 1048576 : Fields.BlendMode;
                        if ((i & 12582912) == 0) {
                            if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i10 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i10;
                            }
                            i10 = 4194304;
                            i3 |= i10;
                        }
                        i7 = i2 & Fields.RotationX;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i3 &= -29360129;
                                    }
                                    modifier3 = modifier;
                                    flingBehavior4 = flingBehavior;
                                    z6 = z2;
                                    paddingValues4 = paddingValues2;
                                    z7 = z3;
                                    vertical5 = vertical2;
                                    horizontal4 = horizontal2;
                                    i9 = 1485410512;
                                    lazyGridState4 = lazyGridState2;
                                } else {
                                    Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                    if ((i2 & 4) != 0) {
                                        lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                        i3 &= -897;
                                    }
                                    PaddingValues m755PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                    if (i5 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 32) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        vertical4 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                        i3 &= -458753;
                                    } else {
                                        vertical4 = vertical2;
                                    }
                                    Arrangement.Horizontal start = i6 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        flingBehavior3 = flingBehavior;
                                    }
                                    if (i8 != 0) {
                                        modifier3 = modifier4;
                                        lazyGridState4 = lazyGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        horizontal4 = start;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        z6 = true;
                                        i9 = 1485410512;
                                        vertical5 = vertical4;
                                    } else {
                                        z6 = z2;
                                        modifier3 = modifier4;
                                        lazyGridState4 = lazyGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        vertical5 = vertical4;
                                        horizontal4 = start;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        i9 = 1485410512;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:110)");
                                }
                                composer2 = startRestartGroup;
                                LazyVerticalGrid(gridCells, modifier3, lazyGridState4, paddingValues4, z7, vertical5, horizontal4, flingBehavior4, z6, OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), kyVar, composer2, i3 & 268435454, (i3 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyGridState3 = lazyGridState4;
                                paddingValues3 = paddingValues4;
                                z4 = z7;
                                vertical3 = vertical5;
                                horizontal3 = horizontal4;
                                flingBehavior2 = flingBehavior4;
                                z5 = z6;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                flingBehavior2 = flingBehavior;
                                lazyGridState3 = lazyGridState2;
                                paddingValues3 = paddingValues2;
                                z4 = z3;
                                vertical3 = vertical2;
                                horizontal3 = horizontal2;
                                z5 = z2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new i30(gridCells, modifier2, lazyGridState3, paddingValues3, z4, vertical3, horizontal3, flingBehavior2, z5, kyVar, i, i2));
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        if ((i & 805306368) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    horizontal2 = horizontal;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    if ((i & 805306368) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                horizontal2 = horizontal;
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            horizontal2 = horizontal;
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        horizontal2 = horizontal;
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
