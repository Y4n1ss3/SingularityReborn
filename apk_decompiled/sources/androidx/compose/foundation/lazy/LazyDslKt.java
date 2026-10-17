package androidx.compose.foundation.lazy;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import defpackage.b00;
import defpackage.er;
import defpackage.h30;
import defpackage.kg;
import defpackage.ky;
import defpackage.my;
import defpackage.oy;
import defpackage.py;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:127:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        Modifier modifier2;
        boolean z4;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        boolean z5;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        Arrangement.Vertical vertical4;
        FlingBehavior flingBehavior4;
        OverscrollEffect overscrollEffect3;
        Modifier modifier3;
        LazyListState lazyListState4;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical5;
        Alignment.Horizontal horizontal4;
        boolean z6;
        boolean z7;
        int i8;
        FlingBehavior flingBehavior5;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(53695811);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i12 = 32;
                    i3 |= i12;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i12 = 16;
            i3 |= i12;
        } else {
            lazyListState2 = lazyListState;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i10 = Fields.BlendMode;
                        i3 |= i10;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if ((i & 100663296) == 0) {
                            if ((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                i9 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                i3 |= i9;
                            }
                            i9 = GroupFlagsKt.HasAuxSlotFlag;
                            i3 |= i9;
                        }
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                }
                                PaddingValues m755PaddingValues0680j_4 = i14 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical4 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -57345;
                                } else {
                                    vertical4 = vertical2;
                                }
                                Alignment.Horizontal start = i5 != 0 ? Alignment.Companion.getStart() : horizontal2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior4 = flingBehavior2;
                                }
                                boolean z8 = i7 == 0 ? z2 : true;
                                if ((i2 & Fields.RotationX) != 0) {
                                    i3 &= -234881025;
                                    modifier3 = modifier4;
                                    overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                } else {
                                    overscrollEffect3 = overscrollEffect;
                                    modifier3 = modifier4;
                                }
                                lazyListState4 = lazyListState2;
                                paddingValues4 = m755PaddingValues0680j_4;
                                vertical5 = vertical4;
                                horizontal4 = start;
                                z6 = z3;
                                z7 = z8;
                                i8 = 53695811;
                                flingBehavior5 = flingBehavior4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    i3 &= -234881025;
                                }
                                modifier3 = modifier;
                                z7 = z2;
                                overscrollEffect3 = overscrollEffect;
                                z6 = z3;
                                vertical5 = vertical2;
                                horizontal4 = horizontal2;
                                flingBehavior5 = flingBehavior2;
                                i8 = 53695811;
                                lazyListState4 = lazyListState2;
                                paddingValues4 = paddingValues2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                            }
                            int i15 = i3 >> 3;
                            composer2 = startRestartGroup;
                            LazyListKt.LazyList(modifier3, lazyListState4, paddingValues4, z6, true, flingBehavior5, z7, overscrollEffect3, 0, horizontal4, vertical5, null, null, kyVar, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i15) | (3670016 & i15) | (i15 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            lazyListState3 = lazyListState4;
                            paddingValues3 = paddingValues4;
                            z5 = z6;
                            flingBehavior3 = flingBehavior5;
                            z4 = z7;
                            overscrollEffect2 = overscrollEffect3;
                            horizontal3 = horizontal4;
                            vertical3 = vertical5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z2;
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            vertical3 = vertical2;
                            horizontal3 = horizontal2;
                            flingBehavior3 = flingBehavior2;
                            overscrollEffect2 = overscrollEffect;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new h30(modifier2, lazyListState3, paddingValues3, z5, vertical3, horizontal3, flingBehavior3, z4, overscrollEffect2, kyVar, i, i2, 0));
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyColumn$lambda$0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, overscrollEffect, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyColumn$lambda$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyColumn$lambda$2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        Modifier modifier2;
        boolean z4;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        boolean z5;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        Arrangement.Horizontal horizontal4;
        FlingBehavior flingBehavior4;
        OverscrollEffect overscrollEffect3;
        Modifier modifier3;
        LazyListState lazyListState4;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal5;
        Alignment.Vertical vertical4;
        boolean z6;
        boolean z7;
        int i8;
        FlingBehavior flingBehavior5;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1884325601);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i12 = 32;
                    i3 |= i12;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i12 = 16;
            i3 |= i12;
        } else {
            lazyListState2 = lazyListState;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i10 = Fields.BlendMode;
                        i3 |= i10;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if ((i & 100663296) == 0) {
                            if ((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                i9 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                i3 |= i9;
                            }
                            i9 = GroupFlagsKt.HasAuxSlotFlag;
                            i3 |= i9;
                        }
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                }
                                PaddingValues m755PaddingValues0680j_4 = i14 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal4 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -57345;
                                } else {
                                    horizontal4 = horizontal2;
                                }
                                Alignment.Vertical top = i5 != 0 ? Alignment.Companion.getTop() : vertical2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior4 = flingBehavior2;
                                }
                                boolean z8 = i7 == 0 ? z2 : true;
                                if ((i2 & Fields.RotationX) != 0) {
                                    i3 &= -234881025;
                                    modifier3 = modifier4;
                                    overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                } else {
                                    overscrollEffect3 = overscrollEffect;
                                    modifier3 = modifier4;
                                }
                                lazyListState4 = lazyListState2;
                                paddingValues4 = m755PaddingValues0680j_4;
                                horizontal5 = horizontal4;
                                vertical4 = top;
                                z6 = z3;
                                z7 = z8;
                                i8 = -1884325601;
                                flingBehavior5 = flingBehavior4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    i3 &= -234881025;
                                }
                                modifier3 = modifier;
                                z7 = z2;
                                overscrollEffect3 = overscrollEffect;
                                z6 = z3;
                                horizontal5 = horizontal2;
                                vertical4 = vertical2;
                                flingBehavior5 = flingBehavior2;
                                i8 = -1884325601;
                                lazyListState4 = lazyListState2;
                                paddingValues4 = paddingValues2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                            }
                            int i15 = i3 >> 3;
                            composer2 = startRestartGroup;
                            LazyListKt.LazyList(modifier3, lazyListState4, paddingValues4, z6, false, flingBehavior5, z7, overscrollEffect3, 0, null, null, vertical4, horizontal5, kyVar, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i15) | (3670016 & i15) | (i15 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            lazyListState3 = lazyListState4;
                            paddingValues3 = paddingValues4;
                            z5 = z6;
                            flingBehavior3 = flingBehavior5;
                            z4 = z7;
                            overscrollEffect2 = overscrollEffect3;
                            vertical3 = vertical4;
                            horizontal3 = horizontal5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z2;
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                            flingBehavior3 = flingBehavior2;
                            overscrollEffect2 = overscrollEffect;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new h30(modifier2, lazyListState3, paddingValues3, z5, horizontal3, vertical3, flingBehavior3, z4, overscrollEffect2, kyVar, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyRow$lambda$0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z2, overscrollEffect, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyRow$lambda$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyRow$lambda$2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, ky kyVar, int i, int i2, Composer composer, int i3) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, ky kyVar, ky kyVar2, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            kyVar2 = LazyDslKt$items$1.INSTANCE;
        }
        lazyListScope.items(list.size(), kyVar != null ? new LazyDslKt$items$2(kyVar, list) : null, new LazyDslKt$items$3(kyVar2, list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new LazyDslKt$items$4(oyVar, list)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, my myVar, my myVar2, py pyVar) {
        lazyListScope.items(list.size(), myVar != null ? new LazyDslKt$itemsIndexed$2(myVar, list) : null, new LazyDslKt$itemsIndexed$3(myVar2, list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new LazyDslKt$itemsIndexed$4(pyVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, my myVar, my myVar2, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        if ((i & 4) != 0) {
            myVar2 = new my() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1
                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }

                public final Void invoke(int i2, Object obj2) {
                    return null;
                }
            };
        }
        lazyListScope.items(list.size(), myVar != null ? new LazyDslKt$itemsIndexed$2(myVar, list) : null, new LazyDslKt$itemsIndexed$3(myVar2, list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new LazyDslKt$itemsIndexed$4(pyVar, list)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, my myVar, my myVar2, py pyVar) {
        lazyListScope.items(tArr.length, myVar != null ? new LazyDslKt$itemsIndexed$6(myVar, tArr) : null, new LazyDslKt$itemsIndexed$7(myVar2, tArr), ComposableLambdaKt.composableLambdaInstance(1763000017, true, new LazyDslKt$itemsIndexed$8(pyVar, tArr)));
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, ky kyVar, ky kyVar2, oy oyVar) {
        lazyListScope.items(tArr.length, kyVar != null ? new LazyDslKt$items$6(kyVar, tArr) : null, new LazyDslKt$items$7(kyVar2, tArr), ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new LazyDslKt$items$8(oyVar, tArr)));
    }

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, ky kyVar, ky kyVar2, oy oyVar) {
        lazyListScope.items(list.size(), kyVar != null ? new LazyDslKt$items$2(kyVar, list) : null, new LazyDslKt$items$3(kyVar2, list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new LazyDslKt$items$4(oyVar, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, ky kyVar, ky kyVar2, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            kyVar2 = LazyDslKt$items$5.INSTANCE;
        }
        lazyListScope.items(objArr.length, kyVar != null ? new LazyDslKt$items$6(kyVar, objArr) : null, new LazyDslKt$items$7(kyVar2, objArr), ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new LazyDslKt$items$8(oyVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, my myVar, my myVar2, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        if ((i & 4) != 0) {
            myVar2 = new my() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5
                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }

                public final Void invoke(int i2, Object obj2) {
                    return null;
                }
            };
        }
        lazyListScope.items(objArr.length, myVar != null ? new LazyDslKt$itemsIndexed$6(myVar, objArr) : null, new LazyDslKt$itemsIndexed$7(myVar2, objArr), ComposableLambdaKt.composableLambdaInstance(1763000017, true, new LazyDslKt$itemsIndexed$8(pyVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, ky kyVar, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        lazyListScope.items(list.size(), kyVar != null ? new LazyDslKt$items$2(kyVar, list) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new LazyDslKt$items$4(oyVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, my myVar, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        lazyListScope.items(list.size(), myVar != null ? new LazyDslKt$itemsIndexed$2(myVar, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new LazyDslKt$itemsIndexed$4(pyVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, my myVar, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        lazyListScope.items(objArr.length, myVar != null ? new LazyDslKt$itemsIndexed$6(myVar, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1763000017, true, new LazyDslKt$itemsIndexed$8(pyVar, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, ky kyVar, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        lazyListScope.items(objArr.length, kyVar != null ? new LazyDslKt$items$6(kyVar, objArr) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new LazyDslKt$items$8(oyVar, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        Modifier modifier2;
        boolean z4;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        boolean z5;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        Arrangement.Horizontal horizontal4;
        FlingBehavior flingBehavior4;
        boolean z6;
        LazyListState lazyListState4;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal5;
        Alignment.Vertical vertical4;
        boolean z7;
        FlingBehavior flingBehavior5;
        Modifier modifier3;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1724297413);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            lazyListState2 = lazyListState;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i9 = Fields.BlendMode;
                        i3 |= i9;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                z6 = z2;
                                lazyListState4 = lazyListState2;
                                horizontal5 = horizontal2;
                                vertical4 = vertical2;
                                flingBehavior5 = flingBehavior2;
                                i8 = -1724297413;
                                modifier3 = modifier;
                                paddingValues4 = paddingValues2;
                                z7 = z3;
                            } else {
                                Modifier modifier4 = i12 != 0 ? Modifier.Companion : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                }
                                PaddingValues m755PaddingValues0680j_4 = i13 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal4 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -57345;
                                } else {
                                    horizontal4 = horizontal2;
                                }
                                Alignment.Vertical top = i5 != 0 ? Alignment.Companion.getTop() : vertical2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior4 = flingBehavior2;
                                }
                                if (i7 != 0) {
                                    lazyListState4 = lazyListState2;
                                    paddingValues4 = m755PaddingValues0680j_4;
                                    horizontal5 = horizontal4;
                                    vertical4 = top;
                                    z7 = z3;
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                    lazyListState4 = lazyListState2;
                                    paddingValues4 = m755PaddingValues0680j_4;
                                    horizontal5 = horizontal4;
                                    vertical4 = top;
                                    z7 = z3;
                                }
                                flingBehavior5 = flingBehavior4;
                                modifier3 = modifier4;
                                i8 = -1724297413;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:482)");
                            }
                            composer2 = startRestartGroup;
                            LazyRow(modifier3, lazyListState4, paddingValues4, z7, horizontal5, vertical4, flingBehavior5, z6, OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), kyVar, composer2, (33554430 & i3) | ((i3 << 3) & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            lazyListState3 = lazyListState4;
                            paddingValues3 = paddingValues4;
                            z5 = z7;
                            horizontal3 = horizontal5;
                            vertical3 = vertical4;
                            flingBehavior3 = flingBehavior5;
                            z4 = z6;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z2;
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                            flingBehavior3 = flingBehavior2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new b00(modifier2, lazyListState3, paddingValues3, z5, horizontal3, vertical3, flingBehavior3, z4, kyVar, i, i2, 2));
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if ((i & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        Composer composer2;
        Modifier modifier2;
        boolean z4;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        boolean z5;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        Arrangement.Vertical vertical4;
        FlingBehavior flingBehavior4;
        boolean z6;
        LazyListState lazyListState4;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical5;
        Alignment.Horizontal horizontal4;
        boolean z7;
        FlingBehavior flingBehavior5;
        Modifier modifier3;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-740714857);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            lazyListState2 = lazyListState;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i9 = Fields.BlendMode;
                        i3 |= i9;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                z6 = z2;
                                lazyListState4 = lazyListState2;
                                vertical5 = vertical2;
                                horizontal4 = horizontal2;
                                flingBehavior5 = flingBehavior2;
                                i8 = -740714857;
                                modifier3 = modifier;
                                paddingValues4 = paddingValues2;
                                z7 = z3;
                            } else {
                                Modifier modifier4 = i12 != 0 ? Modifier.Companion : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                }
                                PaddingValues m755PaddingValues0680j_4 = i13 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i4 != 0) {
                                    z3 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical4 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -57345;
                                } else {
                                    vertical4 = vertical2;
                                }
                                Alignment.Horizontal start = i5 != 0 ? Alignment.Companion.getStart() : horizontal2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior4 = flingBehavior2;
                                }
                                if (i7 != 0) {
                                    lazyListState4 = lazyListState2;
                                    paddingValues4 = m755PaddingValues0680j_4;
                                    vertical5 = vertical4;
                                    horizontal4 = start;
                                    z7 = z3;
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                    lazyListState4 = lazyListState2;
                                    paddingValues4 = m755PaddingValues0680j_4;
                                    vertical5 = vertical4;
                                    horizontal4 = start;
                                    z7 = z3;
                                }
                                flingBehavior5 = flingBehavior4;
                                modifier3 = modifier4;
                                i8 = -740714857;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:428)");
                            }
                            composer2 = startRestartGroup;
                            LazyColumn(modifier3, lazyListState4, paddingValues4, z7, vertical5, horizontal4, flingBehavior5, z6, OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), kyVar, composer2, (33554430 & i3) | ((i3 << 3) & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            lazyListState3 = lazyListState4;
                            paddingValues3 = paddingValues4;
                            z5 = z7;
                            vertical3 = vertical5;
                            horizontal3 = horizontal4;
                            flingBehavior3 = flingBehavior5;
                            z4 = z6;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z2;
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            vertical3 = vertical2;
                            horizontal3 = horizontal2;
                            flingBehavior3 = flingBehavior2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new b00(modifier2, lazyListState3, paddingValues3, z5, vertical3, horizontal3, flingBehavior3, z4, kyVar, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if ((i & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        Composer composer2;
        Modifier modifier2;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        boolean z3;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        PaddingValues paddingValues4;
        Alignment.Vertical vertical4;
        FlingBehavior flingBehavior4;
        boolean z4;
        Arrangement.Horizontal horizontal4;
        Modifier modifier3;
        LazyListState lazyListState4;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(407929823);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            lazyListState2 = lazyListState;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i7 = Fields.Clip;
                            i3 |= i7;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i6 = 1048576;
                                i3 |= i6;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i6 = Fields.BlendMode;
                        i3 |= i6;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            paddingValues4 = paddingValues2;
                            vertical4 = vertical2;
                            flingBehavior4 = flingBehavior2;
                            z4 = z2;
                            horizontal4 = horizontal2;
                            modifier3 = modifier;
                        } else {
                            Modifier modifier4 = i9 != 0 ? Modifier.Companion : modifier;
                            if ((i2 & 2) != 0) {
                                lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            }
                            PaddingValues m755PaddingValues0680j_4 = i10 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                Arrangement arrangement = Arrangement.INSTANCE;
                                i3 &= -57345;
                                horizontal2 = !z2 ? arrangement.getStart() : arrangement.getEnd();
                            }
                            if (i5 != 0) {
                                vertical2 = Alignment.Companion.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                paddingValues4 = m755PaddingValues0680j_4;
                                horizontal4 = horizontal2;
                                vertical4 = vertical2;
                                lazyListState4 = lazyListState2;
                                z4 = z2;
                                modifier3 = modifier4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:509)");
                                }
                                composer2 = startRestartGroup;
                                LazyRow(modifier3, lazyListState4, paddingValues4, z4, horizontal4, vertical4, flingBehavior4, true, null, kyVar, composer2, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 6) & 1879048192), Fields.RotationX);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyListState3 = lazyListState4;
                                paddingValues3 = paddingValues4;
                                z3 = z4;
                                horizontal3 = horizontal4;
                                vertical3 = vertical4;
                                flingBehavior3 = flingBehavior4;
                            } else {
                                paddingValues4 = m755PaddingValues0680j_4;
                                vertical4 = vertical2;
                                flingBehavior4 = flingBehavior2;
                                z4 = z2;
                                horizontal4 = horizontal2;
                                modifier3 = modifier4;
                            }
                        }
                        lazyListState4 = lazyListState2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        LazyRow(modifier3, lazyListState4, paddingValues4, z4, horizontal4, vertical4, flingBehavior4, true, null, kyVar, composer2, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 6) & 1879048192), Fields.RotationX);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        lazyListState3 = lazyListState4;
                        paddingValues3 = paddingValues4;
                        z3 = z4;
                        horizontal3 = horizontal4;
                        vertical3 = vertical4;
                        flingBehavior3 = flingBehavior4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        lazyListState3 = lazyListState2;
                        paddingValues3 = paddingValues2;
                        z3 = z2;
                        horizontal3 = horizontal2;
                        vertical3 = vertical2;
                        flingBehavior3 = flingBehavior2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kg(modifier2, lazyListState3, paddingValues3, z3, horizontal3, vertical3, flingBehavior3, kyVar, i, i2, 6));
                        return;
                    }
                    return;
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        Composer composer2;
        Modifier modifier2;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        boolean z3;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        PaddingValues paddingValues4;
        Alignment.Horizontal horizontal4;
        FlingBehavior flingBehavior4;
        boolean z4;
        Arrangement.Vertical vertical4;
        Modifier modifier3;
        LazyListState lazyListState4;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-563353797);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            lazyListState2 = lazyListState;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i7 = Fields.Clip;
                            i3 |= i7;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i6 = 1048576;
                                i3 |= i6;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i6 = Fields.BlendMode;
                        i3 |= i6;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            paddingValues4 = paddingValues2;
                            horizontal4 = horizontal2;
                            flingBehavior4 = flingBehavior2;
                            z4 = z2;
                            vertical4 = vertical2;
                            modifier3 = modifier;
                        } else {
                            Modifier modifier4 = i9 != 0 ? Modifier.Companion : modifier;
                            if ((i2 & 2) != 0) {
                                lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            }
                            PaddingValues m755PaddingValues0680j_4 = i10 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                Arrangement arrangement = Arrangement.INSTANCE;
                                i3 &= -57345;
                                vertical2 = !z2 ? arrangement.getTop() : arrangement.getBottom();
                            }
                            if (i5 != 0) {
                                horizontal2 = Alignment.Companion.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior4 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                paddingValues4 = m755PaddingValues0680j_4;
                                vertical4 = vertical2;
                                horizontal4 = horizontal2;
                                lazyListState4 = lazyListState2;
                                z4 = z2;
                                modifier3 = modifier4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:455)");
                                }
                                composer2 = startRestartGroup;
                                LazyColumn(modifier3, lazyListState4, paddingValues4, z4, vertical4, horizontal4, flingBehavior4, true, null, kyVar, composer2, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 6) & 1879048192), Fields.RotationX);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyListState3 = lazyListState4;
                                paddingValues3 = paddingValues4;
                                z3 = z4;
                                vertical3 = vertical4;
                                horizontal3 = horizontal4;
                                flingBehavior3 = flingBehavior4;
                            } else {
                                paddingValues4 = m755PaddingValues0680j_4;
                                horizontal4 = horizontal2;
                                flingBehavior4 = flingBehavior2;
                                z4 = z2;
                                vertical4 = vertical2;
                                modifier3 = modifier4;
                            }
                        }
                        lazyListState4 = lazyListState2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        LazyColumn(modifier3, lazyListState4, paddingValues4, z4, vertical4, horizontal4, flingBehavior4, true, null, kyVar, composer2, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 6) & 1879048192), Fields.RotationX);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        lazyListState3 = lazyListState4;
                        paddingValues3 = paddingValues4;
                        z3 = z4;
                        vertical3 = vertical4;
                        horizontal3 = horizontal4;
                        flingBehavior3 = flingBehavior4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        lazyListState3 = lazyListState2;
                        paddingValues3 = paddingValues2;
                        z3 = z2;
                        vertical3 = vertical2;
                        horizontal3 = horizontal2;
                        flingBehavior3 = flingBehavior2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kg(modifier2, lazyListState3, paddingValues3, z3, vertical3, horizontal3, flingBehavior3, kyVar, i, i2, 5));
                        return;
                    }
                    return;
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
