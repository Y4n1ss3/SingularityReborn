package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
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
import defpackage.c40;
import defpackage.d40;
import defpackage.er;
import defpackage.ky;
import defpackage.m6;
import defpackage.my;
import defpackage.oy;
import defpackage.py;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:123:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: LazyHorizontalStaggeredGrid-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m960LazyHorizontalStaggeredGrid121YqSk(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        Arrangement.Vertical vertical2;
        boolean z4;
        Modifier modifier3;
        LazyStaggeredGridState lazyStaggeredGridState3;
        PaddingValues paddingValues3;
        boolean z5;
        float f2;
        FlingBehavior flingBehavior2;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        LazyStaggeredGridState lazyStaggeredGridState4;
        PaddingValues m755PaddingValues0680j_4;
        Arrangement.Vertical m647spacedBy0680j_4;
        FlingBehavior flingBehavior3;
        OverscrollEffect overscrollEffect3;
        Modifier modifier4;
        LazyStaggeredGridState lazyStaggeredGridState5;
        float f3;
        FlingBehavior flingBehavior4;
        boolean z6;
        boolean z7;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-670735644);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
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
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    if (startRestartGroup.changed(lazyStaggeredGridState2)) {
                        i14 = Fields.RotationX;
                        i4 |= i14;
                    }
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i14 = Fields.SpotShadowColor;
                i4 |= i14;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
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
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changed(vertical) ? Fields.RenderEffect : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i13 = GroupFlagsKt.IsNodeFlag;
                            i4 |= i13;
                        }
                        i13 = 4194304;
                        i4 |= i13;
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                i12 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i12;
                            }
                            i12 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i12;
                        }
                        if ((i2 & 6) == 0) {
                            i11 = i2 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.Companion : modifier2;
                                if ((i3 & 4) != 0) {
                                    lazyStaggeredGridState4 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                    i4 &= -897;
                                } else {
                                    lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                }
                                m755PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                m647spacedBy0680j_4 = i7 != 0 ? Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(0.0f)) : vertical;
                                float m7611constructorimpl = i8 != 0 ? Dp.m7611constructorimpl(0.0f) : f;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i4 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                boolean z8 = i10 == 0 ? z2 : true;
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                } else {
                                    overscrollEffect3 = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyStaggeredGridState5 = lazyStaggeredGridState4;
                                f3 = m7611constructorimpl;
                                flingBehavior4 = flingBehavior3;
                                z6 = z8;
                                z7 = z3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                }
                                f3 = f;
                                flingBehavior4 = flingBehavior;
                                z6 = z2;
                                overscrollEffect3 = overscrollEffect;
                                modifier4 = modifier2;
                                lazyStaggeredGridState5 = lazyStaggeredGridState2;
                                m755PaddingValues0680j_4 = paddingValues2;
                                z7 = z3;
                                m647spacedBy0680j_4 = vertical;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-670735644, i4, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:202)");
                            }
                            int i16 = i4 >> 3;
                            int i17 = i4 << 3;
                            composer2 = startRestartGroup;
                            PaddingValues paddingValues4 = m755PaddingValues0680j_4;
                            LazyStaggeredGridKt.m966LazyStaggeredGridw41Enmo(lazyStaggeredGridState5, Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m647spacedBy0680j_4, m755PaddingValues0680j_4, startRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i16 & 896)), modifier4, paddingValues4, z7, flingBehavior4, z6, overscrollEffect3, f3, m647spacedBy0680j_4.mo653getSpacingD9Ej5fM(), kyVar, composer2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i17) | (i17 & 458752) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024) | ((i4 << 9) & 1879048192), (i11 << 3) & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical2 = m647spacedBy0680j_4;
                            lazyStaggeredGridState3 = lazyStaggeredGridState5;
                            modifier3 = modifier4;
                            paddingValues3 = paddingValues4;
                            z5 = z7;
                            flingBehavior2 = flingBehavior4;
                            z4 = z6;
                            overscrollEffect2 = overscrollEffect3;
                            f2 = f3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            vertical2 = vertical;
                            z4 = z2;
                            modifier3 = modifier2;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            f2 = f;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new c40(staggeredGridCells, modifier3, lazyStaggeredGridState3, paddingValues3, z5, vertical2, f2, flingBehavior2, z4, overscrollEffect2, kyVar, i, i2, i3));
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    if ((i & 805306368) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
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
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
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
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m961LazyHorizontalStaggeredGridcJHQLPU(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        int i6;
        Arrangement.Vertical vertical2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        LazyStaggeredGridState lazyStaggeredGridState3;
        PaddingValues paddingValues3;
        boolean z4;
        Arrangement.Vertical vertical3;
        float f2;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        FlingBehavior flingBehavior3;
        boolean z6;
        Modifier modifier3;
        LazyStaggeredGridState lazyStaggeredGridState4;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        float f3;
        boolean z7;
        FlingBehavior flingBehavior4;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-8666074);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
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
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    if (startRestartGroup.changed(lazyStaggeredGridState2)) {
                        i12 = Fields.RotationX;
                        i3 |= i12;
                    }
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i12 = Fields.SpotShadowColor;
                i3 |= i12;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
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
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        vertical2 = vertical;
                        i3 |= startRestartGroup.changed(vertical2) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i11 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i11;
                            }
                            i11 = 4194304;
                            i3 |= i11;
                        }
                        i8 = i2 & Fields.RotationX;
                        if (i8 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                flingBehavior2 = flingBehavior;
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                paddingValues3 = paddingValues2;
                                z4 = z3;
                                vertical3 = vertical2;
                                f2 = f;
                                z5 = z2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                    if ((i2 & 4) != 0) {
                                        lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                        i3 &= -897;
                                    }
                                    PaddingValues m755PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                    if (i5 != 0) {
                                        z3 = false;
                                    }
                                    Arrangement.Vertical m647spacedBy0680j_4 = i6 != 0 ? Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(0.0f)) : vertical2;
                                    float m7611constructorimpl = i7 != 0 ? Dp.m7611constructorimpl(0.0f) : f;
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        flingBehavior3 = flingBehavior;
                                    }
                                    if (i9 != 0) {
                                        modifier3 = modifier4;
                                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        f3 = m7611constructorimpl;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        z6 = true;
                                        i10 = -8666074;
                                        vertical4 = m647spacedBy0680j_4;
                                    } else {
                                        z6 = z2;
                                        modifier3 = modifier4;
                                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        vertical4 = m647spacedBy0680j_4;
                                        f3 = m7611constructorimpl;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        i10 = -8666074;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i3 &= -29360129;
                                    }
                                    f3 = f;
                                    flingBehavior4 = flingBehavior;
                                    z6 = z2;
                                    lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                    paddingValues4 = paddingValues2;
                                    z7 = z3;
                                    vertical4 = vertical2;
                                    i10 = -8666074;
                                    modifier3 = modifier;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i10, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:232)");
                                }
                                composer2 = startRestartGroup;
                                m960LazyHorizontalStaggeredGrid121YqSk(staggeredGridCells, modifier3, lazyStaggeredGridState4, paddingValues4, z7, vertical4, f3, flingBehavior4, z6, OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), kyVar, composer2, i3 & 268435454, (i3 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyStaggeredGridState3 = lazyStaggeredGridState4;
                                paddingValues3 = paddingValues4;
                                z4 = z7;
                                vertical3 = vertical4;
                                f2 = f3;
                                flingBehavior2 = flingBehavior4;
                                z5 = z6;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new d40(staggeredGridCells, modifier2, lazyStaggeredGridState3, paddingValues3, z4, vertical3, f2, flingBehavior2, z5, kyVar, i, i2));
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        if ((i & 805306368) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    vertical2 = vertical;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                vertical2 = vertical;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
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
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            vertical2 = vertical;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
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
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        vertical2 = vertical;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyHorizontalStaggeredGrid_121YqSk$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, int i, int i2, int i3, Composer composer, int i4) {
        m960LazyHorizontalStaggeredGrid121YqSk(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, vertical, f, flingBehavior, z2, overscrollEffect, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyHorizontalStaggeredGrid_cJHQLPU$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2, Composer composer, int i3) {
        m961LazyHorizontalStaggeredGridcJHQLPU(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, vertical, f, flingBehavior, z2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: LazyVerticalStaggeredGrid-6qCrX9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m962LazyVerticalStaggeredGrid6qCrX9Q(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        float f2;
        boolean z4;
        Modifier modifier3;
        LazyStaggeredGridState lazyStaggeredGridState3;
        PaddingValues paddingValues3;
        boolean z5;
        Arrangement.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        LazyStaggeredGridState lazyStaggeredGridState4;
        PaddingValues m755PaddingValues0680j_4;
        Arrangement.Horizontal m647spacedBy0680j_4;
        FlingBehavior flingBehavior3;
        OverscrollEffect overscrollEffect3;
        Modifier modifier4;
        LazyStaggeredGridState lazyStaggeredGridState5;
        float f3;
        FlingBehavior flingBehavior4;
        boolean z6;
        boolean z7;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-578931208);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
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
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    if (startRestartGroup.changed(lazyStaggeredGridState2)) {
                        i14 = Fields.RotationX;
                        i4 |= i14;
                    }
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i14 = Fields.SpotShadowColor;
                i4 |= i14;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
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
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changed(f) ? Fields.RenderEffect : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(horizontal) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i13 = GroupFlagsKt.IsNodeFlag;
                            i4 |= i13;
                        }
                        i13 = 4194304;
                        i4 |= i13;
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                i12 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i12;
                            }
                            i12 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i12;
                        }
                        if ((i2 & 6) == 0) {
                            i11 = i2 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.Companion : modifier2;
                                if ((i3 & 4) != 0) {
                                    lazyStaggeredGridState4 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                    i4 &= -897;
                                } else {
                                    lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                }
                                m755PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                float m7611constructorimpl = i7 != 0 ? Dp.m7611constructorimpl(0.0f) : f;
                                m647spacedBy0680j_4 = i8 != 0 ? Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(0.0f)) : horizontal;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i4 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                boolean z8 = i10 == 0 ? z2 : true;
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                } else {
                                    overscrollEffect3 = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyStaggeredGridState5 = lazyStaggeredGridState4;
                                f3 = m7611constructorimpl;
                                flingBehavior4 = flingBehavior3;
                                z6 = z8;
                                z7 = z3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                }
                                f3 = f;
                                flingBehavior4 = flingBehavior;
                                z6 = z2;
                                overscrollEffect3 = overscrollEffect;
                                modifier4 = modifier2;
                                lazyStaggeredGridState5 = lazyStaggeredGridState2;
                                m755PaddingValues0680j_4 = paddingValues2;
                                z7 = z3;
                                m647spacedBy0680j_4 = horizontal;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-578931208, i4, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                            }
                            int i16 = i4 >> 3;
                            int i17 = i4 << 3;
                            composer2 = startRestartGroup;
                            PaddingValues paddingValues4 = m755PaddingValues0680j_4;
                            LazyStaggeredGridKt.m966LazyStaggeredGridw41Enmo(lazyStaggeredGridState5, Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m647spacedBy0680j_4, m755PaddingValues0680j_4, startRestartGroup, (i4 & 14) | ((i4 >> 15) & 112) | (i16 & 896)), modifier4, paddingValues4, z7, flingBehavior4, z6, overscrollEffect3, f3, m647spacedBy0680j_4.mo653getSpacingD9Ej5fM(), kyVar, composer2, ((i4 >> 6) & 14) | 48 | ((i4 << 6) & 7168) | (57344 & i17) | (i17 & 458752) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024) | ((i4 << 12) & 1879048192), (i11 << 3) & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            horizontal2 = m647spacedBy0680j_4;
                            lazyStaggeredGridState3 = lazyStaggeredGridState5;
                            modifier3 = modifier4;
                            paddingValues3 = paddingValues4;
                            z5 = z7;
                            flingBehavior2 = flingBehavior4;
                            z4 = z6;
                            overscrollEffect2 = overscrollEffect3;
                            f2 = f3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            f2 = f;
                            z4 = z2;
                            modifier3 = modifier2;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            paddingValues3 = paddingValues2;
                            z5 = z3;
                            horizontal2 = horizontal;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new c40(staggeredGridCells, modifier3, lazyStaggeredGridState3, paddingValues3, z5, f2, horizontal2, flingBehavior2, z4, overscrollEffect2, kyVar, i, i2, i3));
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    if ((i & 805306368) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
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
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
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
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m963LazyVerticalStaggeredGridzadm560(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        LazyStaggeredGridState lazyStaggeredGridState3;
        PaddingValues paddingValues3;
        boolean z4;
        float f3;
        Arrangement.Horizontal horizontal2;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        FlingBehavior flingBehavior3;
        boolean z6;
        Modifier modifier3;
        LazyStaggeredGridState lazyStaggeredGridState4;
        PaddingValues paddingValues4;
        float f4;
        Arrangement.Horizontal horizontal3;
        boolean z7;
        FlingBehavior flingBehavior4;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1695323794);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
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
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    if (startRestartGroup.changed(lazyStaggeredGridState2)) {
                        i12 = Fields.RotationX;
                        i3 |= i12;
                    }
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i12 = Fields.SpotShadowColor;
                i3 |= i12;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
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
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(horizontal) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i11 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i11;
                            }
                            i11 = 4194304;
                            i3 |= i11;
                        }
                        i8 = i2 & Fields.RotationX;
                        if (i8 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(kyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                flingBehavior2 = flingBehavior;
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                paddingValues3 = paddingValues2;
                                z4 = z3;
                                f3 = f2;
                                horizontal2 = horizontal;
                                z5 = z2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                    if ((i2 & 4) != 0) {
                                        lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                        i3 &= -897;
                                    }
                                    PaddingValues m755PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues2;
                                    if (i5 != 0) {
                                        z3 = false;
                                    }
                                    float m7611constructorimpl = i6 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                    Arrangement.Horizontal m647spacedBy0680j_4 = i7 != 0 ? Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(0.0f)) : horizontal;
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        flingBehavior3 = flingBehavior;
                                    }
                                    if (i9 != 0) {
                                        modifier3 = modifier4;
                                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        horizontal3 = m647spacedBy0680j_4;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        z6 = true;
                                        i10 = 1695323794;
                                        f4 = m7611constructorimpl;
                                    } else {
                                        z6 = z2;
                                        modifier3 = modifier4;
                                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                        paddingValues4 = m755PaddingValues0680j_4;
                                        f4 = m7611constructorimpl;
                                        horizontal3 = m647spacedBy0680j_4;
                                        z7 = z3;
                                        flingBehavior4 = flingBehavior3;
                                        i10 = 1695323794;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i3 &= -29360129;
                                    }
                                    horizontal3 = horizontal;
                                    flingBehavior4 = flingBehavior;
                                    z6 = z2;
                                    lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                    paddingValues4 = paddingValues2;
                                    z7 = z3;
                                    f4 = f2;
                                    i10 = 1695323794;
                                    modifier3 = modifier;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i10, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:111)");
                                }
                                composer2 = startRestartGroup;
                                m962LazyVerticalStaggeredGrid6qCrX9Q(staggeredGridCells, modifier3, lazyStaggeredGridState4, paddingValues4, z7, f4, horizontal3, flingBehavior4, z6, OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), kyVar, composer2, i3 & 268435454, (i3 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                lazyStaggeredGridState3 = lazyStaggeredGridState4;
                                paddingValues3 = paddingValues4;
                                z4 = z7;
                                f3 = f4;
                                horizontal2 = horizontal3;
                                flingBehavior2 = flingBehavior4;
                                z5 = z6;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new d40(staggeredGridCells, modifier2, lazyStaggeredGridState3, paddingValues3, z4, f3, horizontal2, flingBehavior2, z5, kyVar, i, i2));
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        if ((i & 805306368) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
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
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
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
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyVerticalStaggeredGrid_6qCrX9Q$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, int i, int i2, int i3, Composer composer, int i4) {
        m962LazyVerticalStaggeredGrid6qCrX9Q(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, f, horizontal, flingBehavior, z2, overscrollEffect, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyVerticalStaggeredGrid_zadm560$lambda$0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2, Composer composer, int i3) {
        m963LazyVerticalStaggeredGridzadm560(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, f, horizontal, flingBehavior, z2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, ky kyVar, ky kyVar2, ky kyVar3, oy oyVar) {
        lazyStaggeredGridScope.items(list.size(), kyVar != null ? new LazyStaggeredGridDslKt$items$2$1(kyVar, list) : null, new LazyStaggeredGridDslKt$items$3(kyVar2, list), kyVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(kyVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-334987442, true, new LazyStaggeredGridDslKt$items$5(oyVar, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, ky kyVar, ky kyVar2, ky kyVar3, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$1
                @Override // defpackage.ky
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            kyVar3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), kyVar != null ? new LazyStaggeredGridDslKt$items$2$1(kyVar, list) : null, new LazyStaggeredGridDslKt$items$3(kyVar2, list), kyVar3 != null ? new LazyStaggeredGridDslKt$items$4$1(kyVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-334987442, true, new LazyStaggeredGridDslKt$items$5(oyVar, list)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, my myVar, my myVar2, my myVar3, py pyVar) {
        lazyStaggeredGridScope.items(list.size(), myVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(myVar, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(myVar2, list), myVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(myVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-1466459515, true, new LazyStaggeredGridDslKt$itemsIndexed$5(pyVar, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, my myVar, my myVar2, my myVar3, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        if ((i & 4) != 0) {
            myVar2 = new my() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$1
                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }

                public final Void invoke(int i2, Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            myVar3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), myVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(myVar, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(myVar2, list), myVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(myVar3, list) : null, ComposableLambdaKt.composableLambdaInstance(-1466459515, true, new LazyStaggeredGridDslKt$itemsIndexed$5(pyVar, list)));
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        int i2 = 4;
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new m6(paddingValues, staggeredGridCells, horizontal, i2));
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridSlots rememberColumnSlots$lambda$0$0(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, Density density, Constraints constraints) {
        if (!(Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl()) != Integer.MAX_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl()) - density.mo361roundToPx0680j_4(Dp.m7611constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues, layoutDirection)));
        int[] calculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, m7564getMaxWidthimpl, density.mo361roundToPx0680j_4(horizontal.mo653getSpacingD9Ej5fM()));
        int[] iArr = new int[calculateCrossAxisCellSizes.length];
        horizontal.arrange(density, m7564getMaxWidthimpl, calculateCrossAxisCellSizes, layoutDirection, iArr);
        return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:255)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new m6(paddingValues, staggeredGridCells, vertical, 5));
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridSlots rememberRowSlots$lambda$0$0(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, Density density, Constraints constraints) {
        if (!(Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl()) != Integer.MAX_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
        }
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl()) - density.mo361roundToPx0680j_4(Dp.m7611constructorimpl(paddingValues.mo711calculateBottomPaddingD9Ej5fM() + paddingValues.mo714calculateTopPaddingD9Ej5fM()));
        int[] calculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, m7563getMaxHeightimpl, density.mo361roundToPx0680j_4(vertical.mo653getSpacingD9Ej5fM()));
        int[] iArr = new int[calculateCrossAxisCellSizes.length];
        vertical.arrange(density, m7563getMaxHeightimpl, calculateCrossAxisCellSizes, iArr);
        return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, ky kyVar, ky kyVar2, ky kyVar3, oy oyVar) {
        lazyStaggeredGridScope.items(tArr.length, kyVar != null ? new LazyStaggeredGridDslKt$items$7$1(kyVar, tArr) : null, new LazyStaggeredGridDslKt$items$8(kyVar2, tArr), kyVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(kyVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-1775984467, true, new LazyStaggeredGridDslKt$items$10(oyVar, tArr)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, my myVar, my myVar2, my myVar3, py pyVar) {
        lazyStaggeredGridScope.items(tArr.length, myVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(myVar, tArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(myVar2, tArr), myVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(myVar3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(425846862, true, new LazyStaggeredGridDslKt$itemsIndexed$10(pyVar, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, ky kyVar, ky kyVar2, ky kyVar3, oy oyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$6
                @Override // defpackage.ky
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            kyVar3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, kyVar != null ? new LazyStaggeredGridDslKt$items$7$1(kyVar, objArr) : null, new LazyStaggeredGridDslKt$items$8(kyVar2, objArr), kyVar3 != null ? new LazyStaggeredGridDslKt$items$9$1(kyVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-1775984467, true, new LazyStaggeredGridDslKt$items$10(oyVar, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, my myVar, my myVar2, my myVar3, py pyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = null;
        }
        if ((i & 4) != 0) {
            myVar2 = new my() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$6
                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }

                public final Void invoke(int i2, Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            myVar3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, myVar != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(myVar, objArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(myVar2, objArr), myVar3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(myVar3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(425846862, true, new LazyStaggeredGridDslKt$itemsIndexed$10(pyVar, objArr)));
    }
}
