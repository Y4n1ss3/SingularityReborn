package androidx.compose.foundation.pager;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.ne0;
import defpackage.oe0;
import defpackage.oy;
import defpackage.p01;
import defpackage.qe0;
import defpackage.un;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f1  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1002HorizontalPager8jOkeI(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, oy oyVar, Composer composer, int i2, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Vertical vertical2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer composer2;
        PaddingValues paddingValues2;
        PageSize pageSize2;
        boolean z3;
        boolean z4;
        ky kyVar2;
        NestedScrollConnection nestedScrollConnection2;
        SnapPosition snapPosition2;
        float f3;
        Modifier modifier3;
        Alignment.Vertical vertical3;
        TargetedFlingBehavior targetedFlingBehavior3;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        PagerState pagerState2;
        ?? r4;
        int i22;
        int i23;
        NestedScrollConnection nestedScrollConnection3;
        int i24;
        ky kyVar3;
        NestedScrollConnection nestedScrollConnection4;
        int i25;
        PaddingValues paddingValues3;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z5;
        int i26;
        float f4;
        int i27;
        boolean z6;
        SnapPosition snapPosition3;
        Modifier modifier4;
        OverscrollEffect overscrollEffect3;
        int i28;
        int i29;
        Composer startRestartGroup = composer.startRestartGroup(1860873769);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i30 = i4 & 2;
        if (i30 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                int i31 = Fields.RotationZ;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    int i32 = Fields.Clip;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            vertical2 = vertical;
                        } else {
                            vertical2 = vertical;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(vertical2) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & Fields.SpotShadowColor) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i29 = GroupFlagsKt.IsNodeFlag;
                                    i5 |= i29;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i29 = 4194304;
                            i5 |= i29;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & Fields.RotationX;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i13 = i4 & Fields.RotationY;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & Fields.RotationZ;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & Fields.CameraDistance) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i28 = 32;
                                i17 |= i28;
                            }
                            i28 = 16;
                            i17 |= i28;
                        } else {
                            i18 = i16;
                        }
                        int i33 = i17;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 != 0) {
                            i20 = i33 | 384;
                        } else {
                            i20 = i33;
                            if ((i3 & 384) == 0) {
                                i20 |= startRestartGroup.changed(snapPosition) ? Fields.RotationX : Fields.SpotShadowColor;
                                if ((i3 & 3072) == 0) {
                                    if ((i4 & 8192) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                        i31 = 2048;
                                    }
                                    i20 |= i31;
                                }
                                if ((i3 & 24576) == 0) {
                                    if (!startRestartGroup.changedInstance(oyVar)) {
                                        i32 = 8192;
                                    }
                                    i20 |= i32;
                                }
                                i21 = i20;
                                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    pageSize2 = pageSize;
                                    z3 = z;
                                    z4 = z2;
                                    kyVar2 = kyVar;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapPosition2 = snapPosition;
                                    f3 = f2;
                                    modifier3 = modifier2;
                                    vertical3 = vertical2;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    overscrollEffect2 = overscrollEffect;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i30 != 0 ? Modifier.Companion : modifier2;
                                        PaddingValues m755PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues;
                                        PageSize pageSize4 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                        int i34 = i8 != 0 ? 0 : i9;
                                        float m7611constructorimpl = i10 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                        if (i11 != 0) {
                                            vertical2 = Alignment.Companion.getCenterVertically();
                                        }
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            int i35 = (i15 & 14) | 196608;
                                            i22 = i19;
                                            i23 = i21;
                                            pagerState2 = pagerState;
                                            i15 &= -29360129;
                                            r4 = 0;
                                            targetedFlingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, startRestartGroup, i35, 30);
                                        } else {
                                            pagerState2 = pagerState;
                                            r4 = 0;
                                            i22 = i19;
                                            i23 = i21;
                                        }
                                        boolean z7 = i12 == 0 ? z : true;
                                        boolean z8 = i14 != 0 ? r4 : z2;
                                        ky kyVar4 = i18 != 0 ? null : kyVar;
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            nestedScrollConnection3 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Horizontal, startRestartGroup, (i15 & 14) | 432);
                                            i24 = i23 & (-113);
                                        } else {
                                            nestedScrollConnection3 = nestedScrollConnection;
                                            i24 = i23;
                                        }
                                        SnapPosition snapPosition4 = i22 != 0 ? SnapPosition.Start.INSTANCE : snapPosition;
                                        if ((i4 & 8192) != 0) {
                                            SnapPosition snapPosition5 = snapPosition4;
                                            overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, r4);
                                            i25 = i24 & (-7169);
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            snapPosition3 = snapPosition5;
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                            composer2 = startRestartGroup;
                                            paddingValues3 = m755PaddingValues0680j_4;
                                            pageSize3 = pageSize4;
                                            z5 = z7;
                                            i26 = i34;
                                            f4 = m7611constructorimpl;
                                            i27 = i15;
                                            z6 = z8;
                                            modifier4 = modifier5;
                                        } else {
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                            i25 = i24;
                                            composer2 = startRestartGroup;
                                            paddingValues3 = m755PaddingValues0680j_4;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            pageSize3 = pageSize4;
                                            z5 = z7;
                                            i26 = i34;
                                            f4 = m7611constructorimpl;
                                            i27 = i15;
                                            z6 = z8;
                                            snapPosition3 = snapPosition4;
                                            modifier4 = modifier5;
                                            overscrollEffect3 = overscrollEffect;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            i15 &= -29360129;
                                        }
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            i21 &= -113;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i21 &= -7169;
                                        }
                                        pageSize3 = pageSize;
                                        z6 = z2;
                                        kyVar3 = kyVar;
                                        nestedScrollConnection4 = nestedScrollConnection;
                                        i25 = i21;
                                        composer2 = startRestartGroup;
                                        f4 = f2;
                                        modifier4 = modifier2;
                                        i27 = i15;
                                        paddingValues3 = paddingValues;
                                        z5 = z;
                                        overscrollEffect3 = overscrollEffect;
                                        i26 = i9;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        snapPosition3 = snapPosition;
                                    }
                                    composer2.endDefaults();
                                    Modifier modifier6 = modifier4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1860873769, i27, i25, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:130)");
                                    }
                                    int i36 = i25;
                                    int i37 = i27 >> 6;
                                    int i38 = i27 << 12;
                                    int i39 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i37 & 458752) | (i37 & 3670016) | ((i36 << 12) & 29360128) | (i38 & 234881024) | (i38 & 1879048192);
                                    int i40 = ((i27 >> 9) & 14) | 3072 | (i36 & 112);
                                    int i41 = i36 << 6;
                                    LazyLayoutPagerKt.m998PagereLwUrMk(modifier6, pagerState, paddingValues3, z6, Orientation.Horizontal, targetedFlingBehavior4, z5, overscrollEffect3, i26, f4, pageSize3, nestedScrollConnection4, kyVar3, Alignment.Companion.getCenterHorizontally(), vertical2, snapPosition3, oyVar, composer2, i39, (i41 & 896) | i40 | (i37 & 57344) | ((i36 << 9) & 458752) | (i41 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    int i42 = i26;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    i9 = i42;
                                    float f5 = f4;
                                    z3 = z5;
                                    f3 = f5;
                                    Alignment.Vertical vertical4 = vertical2;
                                    overscrollEffect2 = overscrollEffect3;
                                    vertical3 = vertical4;
                                    ky kyVar5 = kyVar3;
                                    nestedScrollConnection2 = nestedScrollConnection4;
                                    kyVar2 = kyVar5;
                                    pageSize2 = pageSize3;
                                    snapPosition2 = snapPosition3;
                                    z4 = z6;
                                    paddingValues2 = paddingValues3;
                                    modifier3 = modifier6;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new qe0(pagerState, modifier3, paddingValues2, pageSize2, i9, f3, vertical3, targetedFlingBehavior3, z3, z4, kyVar2, nestedScrollConnection2, snapPosition2, overscrollEffect2, oyVar, i2, i3, i4, 1));
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        i21 = i20;
                        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & Fields.RotationX;
                    if (i12 != 0) {
                    }
                    i13 = i4 & Fields.RotationY;
                    if (i13 != 0) {
                    }
                    i16 = i4 & Fields.RotationZ;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i332 = i17;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i21 = i20;
                    if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                int i322 = Fields.Clip;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & Fields.RotationX;
                if (i12 != 0) {
                }
                i13 = i4 & Fields.RotationY;
                if (i13 != 0) {
                }
                i16 = i4 & Fields.RotationZ;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i3322 = i17;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i21 = i20;
                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            int i312 = Fields.RotationZ;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            int i3222 = Fields.Clip;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & Fields.RotationX;
            if (i12 != 0) {
            }
            i13 = i4 & Fields.RotationY;
            if (i13 != 0) {
            }
            i16 = i4 & Fields.RotationZ;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i33222 = i17;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i21 = i20;
            if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i3122 = Fields.RotationZ;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        int i32222 = Fields.Clip;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & Fields.RotationX;
        if (i12 != 0) {
        }
        i13 = i4 & Fields.RotationY;
        if (i13 != 0) {
        }
        i16 = i4 & Fields.RotationZ;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i332222 = i17;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i21 = i20;
        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1003HorizontalPageroI3XNZo(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, oy oyVar, Composer composer, int i2, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Vertical vertical2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        PaddingValues paddingValues2;
        PageSize pageSize2;
        boolean z3;
        boolean z4;
        ky kyVar2;
        NestedScrollConnection nestedScrollConnection2;
        Modifier modifier3;
        Alignment.Vertical vertical3;
        TargetedFlingBehavior targetedFlingBehavior3;
        SnapPosition snapPosition2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i22;
        PagerState pagerState2;
        int i23;
        Composer composer2;
        int i24;
        NestedScrollConnection nestedScrollConnection3;
        SnapPosition snapPosition3;
        boolean z5;
        ky kyVar3;
        NestedScrollConnection nestedScrollConnection4;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z6;
        float f3;
        PaddingValues paddingValues3;
        int i25;
        int i26;
        int i27;
        Composer startRestartGroup = composer.startRestartGroup(1163833967);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i28 = i4 & 2;
        if (i28 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                int i29 = Fields.RotationZ;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? Fields.Clip : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            vertical2 = vertical;
                        } else {
                            vertical2 = vertical;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(vertical2) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & Fields.SpotShadowColor) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i27 = GroupFlagsKt.IsNodeFlag;
                                    i5 |= i27;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i27 = 4194304;
                            i5 |= i27;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & Fields.RotationX;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i13 = i4 & Fields.RotationY;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & Fields.RotationZ;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & Fields.CameraDistance) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i26 = 32;
                                i17 |= i26;
                            }
                            i26 = 16;
                            i17 |= i26;
                        } else {
                            i18 = i16;
                        }
                        int i30 = i17;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 != 0) {
                            i20 = i30 | 384;
                        } else {
                            i20 = i30;
                            if ((i3 & 384) == 0) {
                                i20 |= startRestartGroup.changed(snapPosition) ? Fields.RotationX : Fields.SpotShadowColor;
                                if ((i3 & 3072) == 0) {
                                    if (startRestartGroup.changedInstance(oyVar)) {
                                        i29 = 2048;
                                    }
                                    i20 |= i29;
                                }
                                i21 = i20;
                                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                                    startRestartGroup.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    pageSize2 = pageSize;
                                    z3 = z;
                                    z4 = z2;
                                    kyVar2 = kyVar;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    modifier3 = modifier2;
                                    vertical3 = vertical2;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    snapPosition2 = snapPosition;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        modifier4 = i28 != 0 ? Modifier.Companion : modifier2;
                                        PaddingValues m755PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues;
                                        PageSize pageSize4 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                        i22 = i8 != 0 ? 0 : i9;
                                        float m7611constructorimpl = i10 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                        if (i11 != 0) {
                                            vertical2 = Alignment.Companion.getCenterVertically();
                                        }
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            int i31 = (i15 & 14) | 196608;
                                            composer2 = startRestartGroup;
                                            i24 = i21;
                                            pagerState2 = pagerState;
                                            i15 &= -29360129;
                                            i23 = 0;
                                            targetedFlingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, composer2, i31, 30);
                                        } else {
                                            pagerState2 = pagerState;
                                            i23 = 0;
                                            composer2 = startRestartGroup;
                                            i24 = i21;
                                        }
                                        boolean z7 = i12 == 0 ? z : true;
                                        boolean z8 = i14 != 0 ? i23 == true ? 1 : 0 : z2;
                                        ky kyVar4 = i18 != 0 ? null : kyVar;
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            nestedScrollConnection3 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Horizontal, composer2, (i15 & 14) | 432);
                                            i24 &= -113;
                                        } else {
                                            nestedScrollConnection3 = nestedScrollConnection;
                                        }
                                        if (i19 != 0) {
                                            z5 = z8;
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                            snapPosition3 = SnapPosition.Start.INSTANCE;
                                        } else {
                                            snapPosition3 = snapPosition;
                                            z5 = z8;
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                        }
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        pageSize3 = pageSize4;
                                        z6 = z7;
                                        f3 = m7611constructorimpl;
                                        paddingValues3 = m755PaddingValues0680j_4;
                                        i25 = i15;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            i15 &= -29360129;
                                        }
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            i21 &= -113;
                                        }
                                        pagerState2 = pagerState;
                                        z6 = z;
                                        z5 = z2;
                                        kyVar3 = kyVar;
                                        nestedScrollConnection4 = nestedScrollConnection;
                                        snapPosition3 = snapPosition;
                                        i23 = 0;
                                        i22 = i9;
                                        f3 = f2;
                                        modifier4 = modifier2;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        composer2 = startRestartGroup;
                                        i25 = i15;
                                        pageSize3 = pageSize;
                                        i24 = i21;
                                        paddingValues3 = paddingValues;
                                    }
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1163833967, i25, i24, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:170)");
                                        i23 = 0;
                                    }
                                    OverscrollEffect rememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(composer2, i23);
                                    int i32 = i25 & 2147483646;
                                    int i33 = (i24 & 1022) | ((i24 << 3) & 57344);
                                    PagerState pagerState3 = pagerState2;
                                    startRestartGroup = composer2;
                                    Alignment.Vertical vertical4 = vertical2;
                                    Modifier modifier5 = modifier4;
                                    int i34 = i22;
                                    m1002HorizontalPager8jOkeI(pagerState3, modifier5, paddingValues3, pageSize3, i34, f3, vertical4, targetedFlingBehavior4, z6, z5, kyVar3, nestedScrollConnection4, snapPosition3, rememberOverscrollEffect, oyVar, startRestartGroup, i32, i33, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    snapPosition2 = snapPosition3;
                                    nestedScrollConnection2 = nestedScrollConnection4;
                                    kyVar2 = kyVar3;
                                    z4 = z5;
                                    z3 = z6;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    vertical3 = vertical4;
                                    f2 = f3;
                                    i9 = i34;
                                    pageSize2 = pageSize3;
                                    paddingValues2 = paddingValues3;
                                    modifier3 = modifier5;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new oe0(pagerState, modifier3, paddingValues2, pageSize2, i9, f2, vertical3, targetedFlingBehavior3, z3, z4, kyVar2, nestedScrollConnection2, snapPosition2, oyVar, i2, i3, i4, 1));
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        i21 = i20;
                        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & Fields.RotationX;
                    if (i12 != 0) {
                    }
                    i13 = i4 & Fields.RotationY;
                    if (i13 != 0) {
                    }
                    i16 = i4 & Fields.RotationZ;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i302 = i17;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    i21 = i20;
                    if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & Fields.RotationX;
                if (i12 != 0) {
                }
                i13 = i4 & Fields.RotationY;
                if (i13 != 0) {
                }
                i16 = i4 & Fields.RotationZ;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i3022 = i17;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                i21 = i20;
                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            int i292 = Fields.RotationZ;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & Fields.RotationX;
            if (i12 != 0) {
            }
            i13 = i4 & Fields.RotationY;
            if (i13 != 0) {
            }
            i16 = i4 & Fields.RotationZ;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i30222 = i17;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            i21 = i20;
            if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i2922 = Fields.RotationZ;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & Fields.RotationX;
        if (i12 != 0) {
        }
        i13 = i4 & Fields.RotationY;
        if (i13 != 0) {
        }
        i16 = i4 & Fields.RotationZ;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i302222 = i17;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i21 = i20;
        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalPager__8jOkeI$lambda$0(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, oy oyVar, int i2, int i3, int i4, Composer composer, int i5) {
        m1002HorizontalPager8jOkeI(pagerState, modifier, paddingValues, pageSize, i, f, vertical, targetedFlingBehavior, z, z2, kyVar, nestedScrollConnection, snapPosition, overscrollEffect, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalPager_oI3XNZo$lambda$0(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, oy oyVar, int i2, int i3, int i4, Composer composer, int i5) {
        m1003HorizontalPageroI3XNZo(pagerState, modifier, paddingValues, pageSize, i, f, vertical, targetedFlingBehavior, z, z2, kyVar, nestedScrollConnection, snapPosition, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f1  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* renamed from: VerticalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1004VerticalPager8jOkeI(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, oy oyVar, Composer composer, int i2, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Horizontal horizontal2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer composer2;
        PaddingValues paddingValues2;
        PageSize pageSize2;
        boolean z3;
        boolean z4;
        ky kyVar2;
        NestedScrollConnection nestedScrollConnection2;
        SnapPosition snapPosition2;
        float f3;
        Modifier modifier3;
        Alignment.Horizontal horizontal3;
        TargetedFlingBehavior targetedFlingBehavior3;
        OverscrollEffect overscrollEffect2;
        ScopeUpdateScope endRestartGroup;
        PagerState pagerState2;
        ?? r4;
        int i22;
        int i23;
        NestedScrollConnection nestedScrollConnection3;
        int i24;
        ky kyVar3;
        NestedScrollConnection nestedScrollConnection4;
        int i25;
        PaddingValues paddingValues3;
        Alignment.Horizontal horizontal4;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z5;
        int i26;
        float f4;
        int i27;
        boolean z6;
        SnapPosition snapPosition3;
        Modifier modifier4;
        OverscrollEffect overscrollEffect3;
        int i28;
        int i29;
        Composer startRestartGroup = composer.startRestartGroup(-1590376023);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i30 = i4 & 2;
        if (i30 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                int i31 = Fields.RotationZ;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    int i32 = Fields.Clip;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            horizontal2 = horizontal;
                        } else {
                            horizontal2 = horizontal;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(horizontal2) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & Fields.SpotShadowColor) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i29 = GroupFlagsKt.IsNodeFlag;
                                    i5 |= i29;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i29 = 4194304;
                            i5 |= i29;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & Fields.RotationX;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i13 = i4 & Fields.RotationY;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & Fields.RotationZ;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & Fields.CameraDistance) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i28 = 32;
                                i17 |= i28;
                            }
                            i28 = 16;
                            i17 |= i28;
                        } else {
                            i18 = i16;
                        }
                        int i33 = i17;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 != 0) {
                            i20 = i33 | 384;
                        } else {
                            i20 = i33;
                            if ((i3 & 384) == 0) {
                                i20 |= startRestartGroup.changed(snapPosition) ? Fields.RotationX : Fields.SpotShadowColor;
                                if ((i3 & 3072) == 0) {
                                    if ((i4 & 8192) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                        i31 = 2048;
                                    }
                                    i20 |= i31;
                                }
                                if ((i3 & 24576) == 0) {
                                    if (!startRestartGroup.changedInstance(oyVar)) {
                                        i32 = 8192;
                                    }
                                    i20 |= i32;
                                }
                                i21 = i20;
                                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    pageSize2 = pageSize;
                                    z3 = z;
                                    z4 = z2;
                                    kyVar2 = kyVar;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapPosition2 = snapPosition;
                                    f3 = f2;
                                    modifier3 = modifier2;
                                    horizontal3 = horizontal2;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    overscrollEffect2 = overscrollEffect;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i30 != 0 ? Modifier.Companion : modifier2;
                                        PaddingValues m755PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues;
                                        PageSize pageSize4 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                        int i34 = i8 != 0 ? 0 : i9;
                                        float m7611constructorimpl = i10 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                        if (i11 != 0) {
                                            horizontal2 = Alignment.Companion.getCenterHorizontally();
                                        }
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            int i35 = (i15 & 14) | 196608;
                                            i22 = i19;
                                            i23 = i21;
                                            pagerState2 = pagerState;
                                            i15 &= -29360129;
                                            r4 = 0;
                                            targetedFlingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, startRestartGroup, i35, 30);
                                        } else {
                                            pagerState2 = pagerState;
                                            r4 = 0;
                                            i22 = i19;
                                            i23 = i21;
                                        }
                                        boolean z7 = i12 == 0 ? z : true;
                                        boolean z8 = i14 != 0 ? r4 : z2;
                                        ky kyVar4 = i18 != 0 ? null : kyVar;
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            nestedScrollConnection3 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Vertical, startRestartGroup, (i15 & 14) | 432);
                                            i24 = i23 & (-113);
                                        } else {
                                            nestedScrollConnection3 = nestedScrollConnection;
                                            i24 = i23;
                                        }
                                        SnapPosition snapPosition4 = i22 != 0 ? SnapPosition.Start.INSTANCE : snapPosition;
                                        if ((i4 & 8192) != 0) {
                                            SnapPosition snapPosition5 = snapPosition4;
                                            overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, r4);
                                            i25 = i24 & (-7169);
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            snapPosition3 = snapPosition5;
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                            composer2 = startRestartGroup;
                                            paddingValues3 = m755PaddingValues0680j_4;
                                            horizontal4 = horizontal2;
                                            pageSize3 = pageSize4;
                                            z5 = z7;
                                            i26 = i34;
                                            f4 = m7611constructorimpl;
                                            i27 = i15;
                                            z6 = z8;
                                            modifier4 = modifier5;
                                        } else {
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                            i25 = i24;
                                            composer2 = startRestartGroup;
                                            paddingValues3 = m755PaddingValues0680j_4;
                                            horizontal4 = horizontal2;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            pageSize3 = pageSize4;
                                            z5 = z7;
                                            i26 = i34;
                                            f4 = m7611constructorimpl;
                                            i27 = i15;
                                            z6 = z8;
                                            snapPosition3 = snapPosition4;
                                            modifier4 = modifier5;
                                            overscrollEffect3 = overscrollEffect;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            i15 &= -29360129;
                                        }
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            i21 &= -113;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i21 &= -7169;
                                        }
                                        pageSize3 = pageSize;
                                        z6 = z2;
                                        kyVar3 = kyVar;
                                        nestedScrollConnection4 = nestedScrollConnection;
                                        i25 = i21;
                                        composer2 = startRestartGroup;
                                        f4 = f2;
                                        modifier4 = modifier2;
                                        horizontal4 = horizontal2;
                                        i27 = i15;
                                        paddingValues3 = paddingValues;
                                        z5 = z;
                                        overscrollEffect3 = overscrollEffect;
                                        i26 = i9;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        snapPosition3 = snapPosition;
                                    }
                                    composer2.endDefaults();
                                    Modifier modifier6 = modifier4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1590376023, i27, i25, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:260)");
                                    }
                                    int i36 = i25;
                                    int i37 = i27 >> 6;
                                    int i38 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i37 & 458752) | (i37 & 3670016) | ((i36 << 12) & 29360128);
                                    int i39 = i27 << 12;
                                    int i40 = i38 | (i39 & 234881024) | (i39 & 1879048192);
                                    int i41 = i27 >> 9;
                                    int i42 = (i41 & 14) | 24576 | (i36 & 112);
                                    int i43 = i36 << 6;
                                    LazyLayoutPagerKt.m998PagereLwUrMk(modifier6, pagerState, paddingValues3, z6, Orientation.Vertical, targetedFlingBehavior4, z5, overscrollEffect3, i26, f4, pageSize3, nestedScrollConnection4, kyVar3, horizontal4, Alignment.Companion.getCenterVertically(), snapPosition3, oyVar, composer2, i40, i42 | (i43 & 896) | (i41 & 7168) | ((i36 << 9) & 458752) | (i43 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    int i44 = i26;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    i9 = i44;
                                    float f5 = f4;
                                    z3 = z5;
                                    f3 = f5;
                                    ky kyVar5 = kyVar3;
                                    nestedScrollConnection2 = nestedScrollConnection4;
                                    kyVar2 = kyVar5;
                                    overscrollEffect2 = overscrollEffect3;
                                    pageSize2 = pageSize3;
                                    horizontal3 = horizontal4;
                                    snapPosition2 = snapPosition3;
                                    z4 = z6;
                                    paddingValues2 = paddingValues3;
                                    modifier3 = modifier6;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new qe0(pagerState, modifier3, paddingValues2, pageSize2, i9, f3, horizontal3, targetedFlingBehavior3, z3, z4, kyVar2, nestedScrollConnection2, snapPosition2, overscrollEffect2, oyVar, i2, i3, i4, 0));
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        i21 = i20;
                        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & Fields.RotationX;
                    if (i12 != 0) {
                    }
                    i13 = i4 & Fields.RotationY;
                    if (i13 != 0) {
                    }
                    i16 = i4 & Fields.RotationZ;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i332 = i17;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i21 = i20;
                    if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                int i322 = Fields.Clip;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & Fields.RotationX;
                if (i12 != 0) {
                }
                i13 = i4 & Fields.RotationY;
                if (i13 != 0) {
                }
                i16 = i4 & Fields.RotationZ;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i3322 = i17;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i21 = i20;
                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            int i312 = Fields.RotationZ;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            int i3222 = Fields.Clip;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & Fields.RotationX;
            if (i12 != 0) {
            }
            i13 = i4 & Fields.RotationY;
            if (i13 != 0) {
            }
            i16 = i4 & Fields.RotationZ;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i33222 = i17;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i21 = i20;
            if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i3122 = Fields.RotationZ;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        int i32222 = Fields.Clip;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & Fields.RotationX;
        if (i12 != 0) {
        }
        i13 = i4 & Fields.RotationY;
        if (i13 != 0) {
        }
        i16 = i4 & Fields.RotationZ;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i332222 = i17;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i21 = i20;
        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1005VerticalPageroI3XNZo(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, oy oyVar, Composer composer, int i2, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Horizontal horizontal2;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        PaddingValues paddingValues2;
        PageSize pageSize2;
        boolean z3;
        boolean z4;
        ky kyVar2;
        NestedScrollConnection nestedScrollConnection2;
        Modifier modifier3;
        Alignment.Horizontal horizontal3;
        TargetedFlingBehavior targetedFlingBehavior3;
        SnapPosition snapPosition2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i22;
        PagerState pagerState2;
        int i23;
        Composer composer2;
        int i24;
        NestedScrollConnection nestedScrollConnection3;
        SnapPosition snapPosition3;
        boolean z5;
        ky kyVar3;
        NestedScrollConnection nestedScrollConnection4;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z6;
        float f3;
        PaddingValues paddingValues3;
        int i25;
        int i26;
        int i27;
        Composer startRestartGroup = composer.startRestartGroup(-1474550033);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i28 = i4 & 2;
        if (i28 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                int i29 = Fields.RotationZ;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? Fields.Clip : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            horizontal2 = horizontal;
                        } else {
                            horizontal2 = horizontal;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(horizontal2) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & Fields.SpotShadowColor) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i27 = GroupFlagsKt.IsNodeFlag;
                                    i5 |= i27;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i27 = 4194304;
                            i5 |= i27;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & Fields.RotationX;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i13 = i4 & Fields.RotationY;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & Fields.RotationZ;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(kyVar) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & Fields.CameraDistance) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i26 = 32;
                                i17 |= i26;
                            }
                            i26 = 16;
                            i17 |= i26;
                        } else {
                            i18 = i16;
                        }
                        int i30 = i17;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 != 0) {
                            i20 = i30 | 384;
                        } else {
                            i20 = i30;
                            if ((i3 & 384) == 0) {
                                i20 |= startRestartGroup.changed(snapPosition) ? Fields.RotationX : Fields.SpotShadowColor;
                                if ((i3 & 3072) == 0) {
                                    if (startRestartGroup.changedInstance(oyVar)) {
                                        i29 = 2048;
                                    }
                                    i20 |= i29;
                                }
                                i21 = i20;
                                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                                    startRestartGroup.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    pageSize2 = pageSize;
                                    z3 = z;
                                    z4 = z2;
                                    kyVar2 = kyVar;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    modifier3 = modifier2;
                                    horizontal3 = horizontal2;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    snapPosition2 = snapPosition;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        modifier4 = i28 != 0 ? Modifier.Companion : modifier2;
                                        PaddingValues m755PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)) : paddingValues;
                                        PageSize pageSize4 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                        i22 = i8 != 0 ? 0 : i9;
                                        float m7611constructorimpl = i10 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                                        if (i11 != 0) {
                                            horizontal2 = Alignment.Companion.getCenterHorizontally();
                                        }
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            int i31 = (i15 & 14) | 196608;
                                            composer2 = startRestartGroup;
                                            i24 = i21;
                                            pagerState2 = pagerState;
                                            i15 &= -29360129;
                                            i23 = 0;
                                            targetedFlingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, composer2, i31, 30);
                                        } else {
                                            pagerState2 = pagerState;
                                            i23 = 0;
                                            composer2 = startRestartGroup;
                                            i24 = i21;
                                        }
                                        boolean z7 = i12 == 0 ? z : true;
                                        boolean z8 = i14 != 0 ? i23 == true ? 1 : 0 : z2;
                                        ky kyVar4 = i18 != 0 ? null : kyVar;
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            nestedScrollConnection3 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Vertical, composer2, (i15 & 14) | 432);
                                            i24 &= -113;
                                        } else {
                                            nestedScrollConnection3 = nestedScrollConnection;
                                        }
                                        if (i19 != 0) {
                                            z5 = z8;
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                            snapPosition3 = SnapPosition.Start.INSTANCE;
                                        } else {
                                            snapPosition3 = snapPosition;
                                            z5 = z8;
                                            kyVar3 = kyVar4;
                                            nestedScrollConnection4 = nestedScrollConnection3;
                                        }
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        pageSize3 = pageSize4;
                                        z6 = z7;
                                        f3 = m7611constructorimpl;
                                        paddingValues3 = m755PaddingValues0680j_4;
                                        i25 = i15;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & Fields.SpotShadowColor) != 0) {
                                            i15 &= -29360129;
                                        }
                                        if ((i4 & Fields.CameraDistance) != 0) {
                                            i21 &= -113;
                                        }
                                        pagerState2 = pagerState;
                                        z6 = z;
                                        z5 = z2;
                                        kyVar3 = kyVar;
                                        nestedScrollConnection4 = nestedScrollConnection;
                                        snapPosition3 = snapPosition;
                                        i23 = 0;
                                        i22 = i9;
                                        f3 = f2;
                                        modifier4 = modifier2;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        composer2 = startRestartGroup;
                                        i25 = i15;
                                        pageSize3 = pageSize;
                                        i24 = i21;
                                        paddingValues3 = paddingValues;
                                    }
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1474550033, i25, i24, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:300)");
                                        i23 = 0;
                                    }
                                    OverscrollEffect rememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(composer2, i23);
                                    int i32 = i25 & 2147483646;
                                    int i33 = (i24 & 1022) | ((i24 << 3) & 57344);
                                    PagerState pagerState3 = pagerState2;
                                    startRestartGroup = composer2;
                                    Alignment.Horizontal horizontal4 = horizontal2;
                                    Modifier modifier5 = modifier4;
                                    int i34 = i22;
                                    m1004VerticalPager8jOkeI(pagerState3, modifier5, paddingValues3, pageSize3, i34, f3, horizontal4, targetedFlingBehavior4, z6, z5, kyVar3, nestedScrollConnection4, snapPosition3, rememberOverscrollEffect, oyVar, startRestartGroup, i32, i33, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    snapPosition2 = snapPosition3;
                                    nestedScrollConnection2 = nestedScrollConnection4;
                                    kyVar2 = kyVar3;
                                    z4 = z5;
                                    z3 = z6;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    horizontal3 = horizontal4;
                                    f2 = f3;
                                    i9 = i34;
                                    pageSize2 = pageSize3;
                                    paddingValues2 = paddingValues3;
                                    modifier3 = modifier5;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new oe0(pagerState, modifier3, paddingValues2, pageSize2, i9, f2, horizontal3, targetedFlingBehavior3, z3, z4, kyVar2, nestedScrollConnection2, snapPosition2, oyVar, i2, i3, i4, 0));
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        i21 = i20;
                        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & Fields.RotationX;
                    if (i12 != 0) {
                    }
                    i13 = i4 & Fields.RotationY;
                    if (i13 != 0) {
                    }
                    i16 = i4 & Fields.RotationZ;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i302 = i17;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    i21 = i20;
                    if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & Fields.RotationX;
                if (i12 != 0) {
                }
                i13 = i4 & Fields.RotationY;
                if (i13 != 0) {
                }
                i16 = i4 & Fields.RotationZ;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i3022 = i17;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                i21 = i20;
                if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            int i292 = Fields.RotationZ;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & Fields.RotationX;
            if (i12 != 0) {
            }
            i13 = i4 & Fields.RotationY;
            if (i13 != 0) {
            }
            i16 = i4 & Fields.RotationZ;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i30222 = i17;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            i21 = i20;
            if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i2922 = Fields.RotationZ;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & Fields.RotationX;
        if (i12 != 0) {
        }
        i13 = i4 & Fields.RotationY;
        if (i13 != 0) {
        }
        i16 = i4 & Fields.RotationZ;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i302222 = i17;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i21 = i20;
        if (startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170, i15 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalPager__8jOkeI$lambda$0(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, oy oyVar, int i2, int i3, int i4, Composer composer, int i5) {
        m1004VerticalPager8jOkeI(pagerState, modifier, paddingValues, pageSize, i, f, horizontal, targetedFlingBehavior, z, z2, kyVar, nestedScrollConnection, snapPosition, overscrollEffect, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalPager_oI3XNZo$lambda$0(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, oy oyVar, int i2, int i3, int i4, Composer composer, int i5) {
        m1005VerticalPageroI3XNZo(pagerState, modifier, paddingValues, pageSize, i, f, horizontal, targetedFlingBehavior, z, z2, kyVar, nestedScrollConnection, snapPosition, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    public static final int currentPageOffset(SnapPosition snapPosition, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return y80.P(snapPosition.position(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    public static final Modifier pagerSemantics(Modifier modifier, PagerState pagerState, boolean z, un unVar, boolean z2) {
        return z2 ? modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new ne0(z, pagerState, unVar), 1, null)) : modifier.then(Modifier.Companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 pagerSemantics$lambda$0(boolean z, final PagerState pagerState, final un unVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        final int i = 1;
        if (z) {
            final int i2 = 0;
            SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new iy() { // from class: pe0
                @Override // defpackage.iy
                public final Object invoke() {
                    boolean pagerSemantics$performBackwardPaging;
                    int i3 = i2;
                    un unVar2 = unVar;
                    PagerState pagerState2 = pagerState;
                    switch (i3) {
                        case 0:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        case 1:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                        case 2:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        default:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                    }
                    return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                }
            }, 1, null);
            SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new iy() { // from class: pe0
                @Override // defpackage.iy
                public final Object invoke() {
                    boolean pagerSemantics$performBackwardPaging;
                    int i3 = i;
                    un unVar2 = unVar;
                    PagerState pagerState2 = pagerState;
                    switch (i3) {
                        case 0:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        case 1:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                        case 2:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        default:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                    }
                    return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                }
            }, 1, null);
        } else {
            final int i3 = 2;
            SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new iy() { // from class: pe0
                @Override // defpackage.iy
                public final Object invoke() {
                    boolean pagerSemantics$performBackwardPaging;
                    int i32 = i3;
                    un unVar2 = unVar;
                    PagerState pagerState2 = pagerState;
                    switch (i32) {
                        case 0:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        case 1:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                        case 2:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        default:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                    }
                    return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                }
            }, 1, null);
            final int i4 = 3;
            SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new iy() { // from class: pe0
                @Override // defpackage.iy
                public final Object invoke() {
                    boolean pagerSemantics$performBackwardPaging;
                    int i32 = i4;
                    un unVar2 = unVar;
                    PagerState pagerState2 = pagerState;
                    switch (i32) {
                        case 0:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        case 1:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                        case 2:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(pagerState2, unVar2);
                            break;
                        default:
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performForwardPaging(pagerState2, unVar2);
                            break;
                    }
                    return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                }
            }, 1, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, un unVar) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        p01.t(unVar, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, un unVar) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        p01.t(unVar, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3);
        return true;
    }

    private static final void debugLog(iy iyVar) {
    }
}
