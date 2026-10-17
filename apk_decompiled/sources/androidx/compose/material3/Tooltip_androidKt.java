package androidx.compose.material3;

import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.bw0;
import defpackage.er;
import defpackage.my;
import defpackage.w01;
import defpackage.yv0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void PlainTooltip(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j4;
        int i4;
        float f4;
        Shape shape2;
        long j5;
        int i5;
        int i6;
        float f5;
        int i7;
        int i8;
        int i9;
        Modifier modifier3;
        long j6;
        float f6;
        Shape shape3;
        Composer composer2;
        long j7;
        long j8;
        float f7;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j9;
        float m2782getPlainTooltipMaxWidthD9Ej5fM;
        Shape shape4;
        long j10;
        long j11;
        long j12;
        Shape shape5;
        long j13;
        int i10;
        float m7611constructorimpl;
        float f8;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1456881596);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 2) == 0) {
                    j4 = j;
                    if (startRestartGroup.changed(j4)) {
                        i12 = Fields.RotationX;
                        i3 |= i12;
                    }
                } else {
                    j4 = j;
                }
                i12 = Fields.SpotShadowColor;
                i3 |= i12;
            } else {
                j4 = j;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f;
                i3 |= startRestartGroup.changed(f4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    j5 = j2;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j5)) ? Fields.RenderEffect : 65536;
                } else {
                    j5 = j2;
                }
                if ((1572864 & i) == 0) {
                    i5 = i3 | (((i2 & 32) == 0 && startRestartGroup.changed(j3)) ? 1048576 : Fields.BlendMode);
                } else {
                    i5 = i3;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i5 |= 12582912;
                    f5 = f2;
                } else {
                    f5 = f2;
                    if ((i & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(f5) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i5 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    int i14 = 805306368;
                    if ((i2 & Fields.RotationX) == 0) {
                        if ((i & 805306368) != 0) {
                            i9 = i5;
                            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier4 = i13 != 0 ? Modifier.Companion : modifier2;
                                    if ((i2 & 2) != 0) {
                                        j9 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                                        i9 &= -897;
                                    } else {
                                        j9 = j4;
                                    }
                                    m2782getPlainTooltipMaxWidthD9Ej5fM = i4 != 0 ? TooltipDefaults.INSTANCE.m2782getPlainTooltipMaxWidthD9Ej5fM() : f4;
                                    if ((i2 & 8) != 0) {
                                        shape4 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                                        i9 &= -57345;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        j10 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                                        i9 &= -458753;
                                    } else {
                                        j10 = j5;
                                    }
                                    if ((i2 & 32) != 0) {
                                        j11 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                                        i9 &= -3670017;
                                    } else {
                                        j11 = j3;
                                    }
                                    float m7611constructorimpl2 = i6 != 0 ? Dp.m7611constructorimpl(0.0f) : f5;
                                    if (i8 != 0) {
                                        f5 = m7611constructorimpl2;
                                        i10 = i9;
                                        m7611constructorimpl = Dp.m7611constructorimpl(0.0f);
                                        j12 = j9;
                                        shape5 = shape4;
                                        j13 = j11;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            f8 = m7611constructorimpl;
                                        } else {
                                            f8 = m7611constructorimpl;
                                            ComposerKt.traceEventStart(1456881596, i10, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                                        }
                                        int i15 = 2147482750 & i10;
                                        long j14 = j12;
                                        float f9 = m2782getPlainTooltipMaxWidthD9Ej5fM;
                                        long j15 = j10;
                                        float f10 = f5;
                                        float f11 = f8;
                                        TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, modifier4, TooltipDefaults.INSTANCE.m2780caretShapeEaSLcWc(j12), f9, shape5, j15, j13, f10, f11, myVar, startRestartGroup, i15, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        f5 = f10;
                                        composer2 = startRestartGroup;
                                        f7 = f11;
                                        j8 = j13;
                                        j7 = j15;
                                        f6 = f9;
                                        shape3 = shape5;
                                        j6 = j14;
                                    } else {
                                        f5 = m7611constructorimpl2;
                                        j12 = j9;
                                        shape5 = shape4;
                                        j13 = j11;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i9 &= -897;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i9 &= -57345;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i9 &= -458753;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i9 &= -3670017;
                                    }
                                    modifier4 = modifier2;
                                    j12 = j4;
                                    m2782getPlainTooltipMaxWidthD9Ej5fM = f4;
                                    shape5 = shape2;
                                    j10 = j5;
                                    j13 = j3;
                                }
                                i10 = i9;
                                m7611constructorimpl = f3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i152 = 2147482750 & i10;
                                long j142 = j12;
                                float f92 = m2782getPlainTooltipMaxWidthD9Ej5fM;
                                long j152 = j10;
                                float f102 = f5;
                                float f112 = f8;
                                TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, modifier4, TooltipDefaults.INSTANCE.m2780caretShapeEaSLcWc(j12), f92, shape5, j152, j13, f102, f112, myVar, startRestartGroup, i152, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                f5 = f102;
                                composer2 = startRestartGroup;
                                f7 = f112;
                                j8 = j13;
                                j7 = j152;
                                f6 = f92;
                                shape3 = shape5;
                                j6 = j142;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                j6 = j4;
                                f6 = f4;
                                shape3 = shape2;
                                composer2 = startRestartGroup;
                                j7 = j5;
                                j8 = j3;
                                f7 = f3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new bw0(tooltipScope, modifier3, j6, f6, shape3, j7, j8, f5, f7, myVar, i, i2, 1));
                                return;
                            }
                            return;
                        }
                        i14 = startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i5 |= i14;
                    i9 = i5;
                    if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                int i142 = 805306368;
                if ((i2 & Fields.RotationX) == 0) {
                }
                i5 |= i142;
                i9 = i5;
                if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f4 = f;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            int i1422 = 805306368;
            if ((i2 & Fields.RotationX) == 0) {
            }
            i5 |= i1422;
            i9 = i5;
            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        int i14222 = 805306368;
        if ((i2 & Fields.RotationX) == 0) {
        }
        i5 |= i14222;
        i9 = i5;
        if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PlainTooltipAndroid_7QI4Sbk$lambda$0(TooltipScope tooltipScope, Modifier modifier, long j, Shape shape, long j2, long j3, float f, float f2, my myVar, int i, int i2, Composer composer, int i3) {
        PlainTooltip(tooltipScope, modifier, j, shape, j2, j3, f, f2, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PlainTooltipAndroid_m9Er_Xc$lambda$1(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, my myVar, int i, int i2, Composer composer, int i3) {
        PlainTooltip(tooltipScope, modifier, j, f, shape, j2, j3, f2, f3, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void RichTooltip(TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, my myVar3, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        my myVar4;
        int i6;
        my myVar5;
        long j2;
        int i7;
        float f4;
        RichTooltipColors richTooltipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        float f5;
        Modifier modifier3;
        my myVar6;
        Composer composer2;
        float f6;
        float f7;
        RichTooltipColors richTooltipColors3;
        my myVar7;
        long j3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j4;
        Shape shape3;
        int i13;
        my myVar8;
        float f8;
        float f9;
        float f10;
        RichTooltipColors richTooltipColors4;
        long j5;
        my myVar9;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-905938553);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar;
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 4;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i3 & 8) == 0) {
                            j2 = j;
                            if (startRestartGroup.changed(j2)) {
                                i14 = Fields.Clip;
                                i4 |= i14;
                            }
                        } else {
                            j2 = j;
                        }
                        i14 = 8192;
                        i4 |= i14;
                    } else {
                        j2 = j;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 196608;
                        f4 = f;
                    } else {
                        f4 = f;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(f4) ? Fields.RenderEffect : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) != 0) {
                        richTooltipColors2 = richTooltipColors;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(richTooltipColors2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    } else {
                        richTooltipColors2 = richTooltipColors;
                    }
                    i8 = i3 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i10 = i3 & Fields.RotationX;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i3 & Fields.RotationY) == 0) {
                                i12 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i12 = i2 | (startRestartGroup.changedInstance(myVar3) ? 4 : 2);
                            } else {
                                i12 = i2;
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                shape2 = shape;
                                f5 = f2;
                                modifier3 = modifier2;
                                myVar6 = myVar4;
                                composer2 = startRestartGroup;
                                f6 = f3;
                                f7 = f4;
                                richTooltipColors3 = richTooltipColors2;
                                myVar7 = myVar5;
                                j3 = j2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
                                    if (i5 != 0) {
                                        myVar4 = null;
                                    }
                                    my myVar10 = i6 == 0 ? myVar5 : null;
                                    if ((i3 & 8) != 0) {
                                        j4 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                                        i4 &= -57345;
                                    } else {
                                        j4 = j2;
                                    }
                                    if (i7 != 0) {
                                        f4 = TooltipDefaults.INSTANCE.m2783getRichTooltipMaxWidthD9Ej5fM();
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape3 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                        i4 &= -3670017;
                                    } else {
                                        shape3 = shape;
                                    }
                                    if ((i3 & 64) != 0) {
                                        richTooltipColors2 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                        i4 = (-29360129) & i4;
                                    }
                                    float m3254getLevel0D9Ej5fM = i9 != 0 ? ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM() : f2;
                                    if (i11 != 0) {
                                        long j6 = j4;
                                        f10 = m3254getLevel0D9Ej5fM;
                                        richTooltipColors4 = richTooltipColors2;
                                        myVar9 = myVar4;
                                        f9 = RichTooltipTokens.INSTANCE.m3597getContainerElevationD9Ej5fM();
                                        i13 = i4;
                                        myVar8 = myVar10;
                                        f8 = f4;
                                        j5 = j6;
                                    } else {
                                        i13 = i4;
                                        myVar8 = myVar10;
                                        f8 = f4;
                                        my myVar11 = myVar4;
                                        f9 = f3;
                                        long j7 = j4;
                                        f10 = m3254getLevel0D9Ej5fM;
                                        richTooltipColors4 = richTooltipColors2;
                                        j5 = j7;
                                        myVar9 = myVar11;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -29360129;
                                    }
                                    my myVar12 = myVar5;
                                    i13 = i4;
                                    myVar8 = myVar12;
                                    shape3 = shape;
                                    f10 = f2;
                                    f8 = f4;
                                    modifier4 = modifier2;
                                    myVar9 = myVar4;
                                    f9 = f3;
                                    richTooltipColors4 = richTooltipColors2;
                                    j5 = j2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-905938553, i13, i12, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                                }
                                long j8 = j5;
                                float f11 = f8;
                                Shape shape4 = shape3;
                                TooltipKt.m2791RichTooltipEkvW5A0(tooltipScope, modifier4, myVar9, myVar8, TooltipDefaults.INSTANCE.m2780caretShapeEaSLcWc(j5), f11, shape4, richTooltipColors4, f10, f9, myVar3, startRestartGroup, i13 & 2147426302, i12 & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                myVar7 = myVar8;
                                f5 = f10;
                                composer2 = startRestartGroup;
                                myVar6 = myVar9;
                                shape2 = shape4;
                                f6 = f9;
                                modifier3 = modifier4;
                                richTooltipColors3 = richTooltipColors4;
                                f7 = f11;
                                j3 = j8;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new yv0(tooltipScope, modifier3, myVar6, myVar7, j3, f7, shape2, richTooltipColors3, f5, f6, myVar3, i, i2, i3, 1));
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if ((i3 & Fields.RotationY) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i3 & Fields.RotationX;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & Fields.RotationY) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar5 = myVar2;
                if ((i & 24576) != 0) {
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & Fields.RotationX;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & Fields.RotationY) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar4 = myVar;
            i6 = i3 & 4;
            if (i6 != 0) {
            }
            myVar5 = myVar2;
            if ((i & 24576) != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationX;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & Fields.RotationY) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        myVar4 = myVar;
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        myVar5 = myVar2;
        if ((i & 24576) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationX;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & Fields.RotationY) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RichTooltipAndroid_ZuUcA3Q$lambda$3(TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, my myVar3, int i, int i2, int i3, Composer composer, int i4) {
        RichTooltip(tooltipScope, modifier, myVar, myVar2, j, f, shape, richTooltipColors, f2, f3, myVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RichTooltipAndroid_yDvdmqw$lambda$2(TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, long j, Shape shape, RichTooltipColors richTooltipColors, float f, float f2, my myVar3, int i, int i2, Composer composer, int i3) {
        RichTooltip(tooltipScope, modifier, myVar, myVar2, j, shape, richTooltipColors, f, f2, myVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void PlainTooltip(final TooltipScope tooltipScope, Modifier modifier, long j, Shape shape, long j2, long j3, float f, float f2, final my myVar, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j4;
        Shape shape2;
        long j5;
        long j6;
        int i4;
        float f3;
        int i5;
        final float f4;
        final long j7;
        final long j8;
        final float f5;
        final Modifier modifier3;
        final Shape shape3;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        int i6;
        long j10;
        Shape shape4;
        long j11;
        float f6;
        float f7;
        Modifier modifier4;
        long j12;
        long j13;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(2114904198);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 2) == 0) {
                    j4 = j;
                    if (startRestartGroup.changed(j4)) {
                        i9 = Fields.RotationX;
                        i3 |= i9;
                    }
                } else {
                    j4 = j;
                }
                i9 = Fields.SpotShadowColor;
                i3 |= i9;
            } else {
                j4 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = Fields.CameraDistance;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = Fields.RotationZ;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 8) == 0) {
                    j5 = j2;
                    if (startRestartGroup.changed(j5)) {
                        i7 = Fields.Clip;
                        i3 |= i7;
                    }
                } else {
                    j5 = j2;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j5 = j2;
            }
            if ((196608 & i) != 0) {
                j6 = j3;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j6)) ? Fields.RenderEffect : 65536;
            } else {
                j6 = j3;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 1048576 : Fields.BlendMode;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -458753;
                        }
                        i6 = i3;
                        modifier4 = modifier2;
                        shape4 = shape2;
                        j13 = j5;
                        f6 = f2;
                        f7 = f3;
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if ((i2 & 2) != 0) {
                            j4 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                            i3 &= -897;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                            shape2 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            j5 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            j6 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                            i3 &= -458753;
                        }
                        float m7611constructorimpl = i4 != 0 ? Dp.m7611constructorimpl(0.0f) : f3;
                        if (i5 != 0) {
                            shape4 = shape2;
                            j13 = j5;
                            f6 = Dp.m7611constructorimpl(0.0f);
                            f7 = m7611constructorimpl;
                            i6 = i3;
                            modifier4 = modifier2;
                        } else {
                            i6 = i3;
                            j10 = j4;
                            shape4 = shape2;
                            j11 = j6;
                            long j14 = j5;
                            f6 = f2;
                            f7 = m7611constructorimpl;
                            modifier4 = modifier2;
                            j12 = j14;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2114904198, i6, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:61)");
                            }
                            TooltipDefaults tooltipDefaults = TooltipDefaults.INSTANCE;
                            long j15 = j10;
                            Shape m2780caretShapeEaSLcWc = tooltipDefaults.m2780caretShapeEaSLcWc(j15);
                            float m2782getPlainTooltipMaxWidthD9Ej5fM = tooltipDefaults.m2782getPlainTooltipMaxWidthD9Ej5fM();
                            int i11 = (i6 & 14) | 3072 | (i6 & 112);
                            int i12 = i6 << 3;
                            TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, modifier4, m2780caretShapeEaSLcWc, m2782getPlainTooltipMaxWidthD9Ej5fM, shape4, j12, j11, f7, f6, myVar, startRestartGroup, (i12 & 1879048192) | i11 | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            f4 = f6;
                            f5 = f7;
                            j9 = j11;
                            j8 = j12;
                            shape3 = shape4;
                            j7 = j15;
                        }
                    }
                    j10 = j4;
                    j12 = j13;
                    j11 = j6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TooltipDefaults tooltipDefaults2 = TooltipDefaults.INSTANCE;
                    long j152 = j10;
                    Shape m2780caretShapeEaSLcWc2 = tooltipDefaults2.m2780caretShapeEaSLcWc(j152);
                    float m2782getPlainTooltipMaxWidthD9Ej5fM2 = tooltipDefaults2.m2782getPlainTooltipMaxWidthD9Ej5fM();
                    int i112 = (i6 & 14) | 3072 | (i6 & 112);
                    int i122 = i6 << 3;
                    TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, modifier4, m2780caretShapeEaSLcWc2, m2782getPlainTooltipMaxWidthD9Ej5fM2, shape4, j12, j11, f7, f6, myVar, startRestartGroup, (i122 & 1879048192) | i112 | (i122 & 57344) | (i122 & 458752) | (i122 & 3670016) | (i122 & 29360128) | (i122 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    f4 = f6;
                    f5 = f7;
                    j9 = j11;
                    j8 = j12;
                    shape3 = shape4;
                    j7 = j152;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f4 = f2;
                    j7 = j4;
                    j8 = j5;
                    f5 = f3;
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j9 = j6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: dw0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 PlainTooltipAndroid_7QI4Sbk$lambda$0;
                            int intValue = ((Integer) obj2).intValue();
                            PlainTooltipAndroid_7QI4Sbk$lambda$0 = Tooltip_androidKt.PlainTooltipAndroid_7QI4Sbk$lambda$0(TooltipScope.this, modifier3, j7, shape3, j8, j9, f5, f4, myVar, i, i2, (Composer) obj, intValue);
                            return PlainTooltipAndroid_7QI4Sbk$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void RichTooltip(final TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, long j, Shape shape, RichTooltipColors richTooltipColors, float f, float f2, final my myVar3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        my myVar5;
        long j2;
        Shape shape2;
        int i6;
        RichTooltipColors richTooltipColors2;
        int i7;
        float f3;
        int i8;
        int i9;
        final my myVar6;
        final my myVar7;
        final RichTooltipColors richTooltipColors3;
        final Shape shape3;
        final float f4;
        final float f5;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        float m3597getContainerElevationD9Ej5fM;
        int i10;
        my myVar8;
        float f6;
        Modifier modifier4;
        my myVar9;
        RichTooltipColors richTooltipColors4;
        long j4;
        Shape shape4;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-244908363);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar5 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        j2 = j;
                        i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? Fields.Clip : 8192;
                    } else {
                        j2 = j;
                    }
                    if ((i & 196608) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i11 = Fields.RenderEffect;
                                i3 |= i11;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) != 0) {
                        i6 = 196608;
                        richTooltipColors2 = richTooltipColors;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(richTooltipColors2)) ? 1048576 : Fields.BlendMode;
                    } else {
                        i6 = 196608;
                        richTooltipColors2 = richTooltipColors;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        f3 = f;
                    } else {
                        f3 = f;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i8 = i2 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationX) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i12 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i4 != 0) {
                                        myVar4 = null;
                                    }
                                    if (i5 != 0) {
                                        myVar5 = null;
                                    }
                                    if ((i2 & 8) != 0) {
                                        j2 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -458753;
                                        shape2 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                    }
                                    if ((i2 & 32) != 0) {
                                        richTooltipColors2 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                        i3 = (-3670017) & i3;
                                    }
                                    if (i7 != 0) {
                                        f3 = ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM();
                                    }
                                    if (i9 != 0) {
                                        my myVar10 = myVar5;
                                        m3597getContainerElevationD9Ej5fM = RichTooltipTokens.INSTANCE.m3597getContainerElevationD9Ej5fM();
                                        i10 = i3;
                                        myVar8 = myVar10;
                                        f6 = f3;
                                        modifier4 = modifier2;
                                        myVar9 = myVar4;
                                        richTooltipColors4 = richTooltipColors2;
                                        j4 = j2;
                                        shape4 = shape2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-244908363, i10, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                                        }
                                        TooltipDefaults tooltipDefaults = TooltipDefaults.INSTANCE;
                                        long j5 = j4;
                                        int i13 = i10 << 3;
                                        TooltipKt.m2791RichTooltipEkvW5A0(tooltipScope, modifier4, myVar9, myVar8, tooltipDefaults.m2780caretShapeEaSLcWc(j5), tooltipDefaults.m2783getRichTooltipMaxWidthD9Ej5fM(), shape4, richTooltipColors4, f6, m3597getContainerElevationD9Ej5fM, myVar3, startRestartGroup, (i10 & 14) | i6 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), (i10 >> 27) & 14, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        myVar7 = myVar8;
                                        f4 = m3597getContainerElevationD9Ej5fM;
                                        myVar6 = myVar9;
                                        f5 = f6;
                                        modifier3 = modifier4;
                                        richTooltipColors3 = richTooltipColors4;
                                        shape3 = shape4;
                                        j3 = j5;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -458753;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -3670017;
                                    }
                                }
                                f6 = f3;
                                i10 = i3;
                                modifier4 = modifier2;
                                myVar9 = myVar4;
                                myVar8 = myVar5;
                                richTooltipColors4 = richTooltipColors2;
                                j4 = j2;
                                shape4 = shape2;
                                m3597getContainerElevationD9Ej5fM = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                TooltipDefaults tooltipDefaults2 = TooltipDefaults.INSTANCE;
                                long j52 = j4;
                                int i132 = i10 << 3;
                                TooltipKt.m2791RichTooltipEkvW5A0(tooltipScope, modifier4, myVar9, myVar8, tooltipDefaults2.m2780caretShapeEaSLcWc(j52), tooltipDefaults2.m2783getRichTooltipMaxWidthD9Ej5fM(), shape4, richTooltipColors4, f6, m3597getContainerElevationD9Ej5fM, myVar3, startRestartGroup, (i10 & 14) | i6 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i132 & 3670016) | (i132 & 29360128) | (i132 & 234881024) | (i132 & 1879048192), (i10 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                myVar7 = myVar8;
                                f4 = m3597getContainerElevationD9Ej5fM;
                                myVar6 = myVar9;
                                f5 = f6;
                                modifier3 = modifier4;
                                richTooltipColors3 = richTooltipColors4;
                                shape3 = shape4;
                                j3 = j52;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                myVar6 = myVar4;
                                myVar7 = myVar5;
                                richTooltipColors3 = richTooltipColors2;
                                shape3 = shape2;
                                f4 = f2;
                                f5 = f3;
                                modifier3 = modifier2;
                                j3 = j2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: cw0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 RichTooltipAndroid_yDvdmqw$lambda$2;
                                        int intValue = ((Integer) obj2).intValue();
                                        RichTooltipAndroid_yDvdmqw$lambda$2 = Tooltip_androidKt.RichTooltipAndroid_yDvdmqw$lambda$2(TooltipScope.this, modifier3, myVar6, myVar7, j3, shape3, richTooltipColors3, f5, f4, myVar3, i, i2, (Composer) obj, intValue);
                                        return RichTooltipAndroid_yDvdmqw$lambda$2;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    if ((i2 & Fields.RotationX) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar5 = myVar2;
                if ((i & 24576) != 0) {
                }
                if ((i & 196608) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & Fields.RotationX) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar4 = myVar;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            myVar5 = myVar2;
            if ((i & 24576) != 0) {
            }
            if ((i & 196608) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & Fields.RotationX) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        myVar4 = myVar;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        myVar5 = myVar2;
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & Fields.RotationX) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
