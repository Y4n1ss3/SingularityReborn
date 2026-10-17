package androidx.compose.material3;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import defpackage.dq;
import defpackage.iy;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1600AlertDialogOix01E0(final iy iyVar, final my myVar, Modifier modifier, my myVar2, my myVar3, my myVar4, my myVar5, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        my myVar6;
        int i8;
        my myVar7;
        int i9;
        my myVar8;
        Shape shape2;
        int i10;
        long j5;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final my myVar9;
        final float f2;
        final DialogProperties dialogProperties2;
        final Shape shape3;
        final Modifier modifier3;
        final long j6;
        final long j7;
        final my myVar10;
        final my myVar11;
        final my myVar12;
        final long j8;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        long j10;
        long j11;
        long j12;
        long j13;
        DialogProperties dialogProperties3;
        float f3;
        my myVar13;
        my myVar14;
        Shape shape4;
        Modifier modifier4;
        int i14;
        my myVar15;
        my myVar16;
        long j14;
        long j15;
        int i15;
        int i16;
        long j16;
        long j17;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(94478519);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 8;
                int i18 = Fields.RotationZ;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        myVar6 = myVar3;
                        i4 |= startRestartGroup.changedInstance(myVar6) ? Fields.Clip : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            myVar7 = myVar4;
                        } else {
                            myVar7 = myVar4;
                            if ((i & 196608) == 0) {
                                i4 |= startRestartGroup.changedInstance(myVar7) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            myVar8 = myVar5;
                        } else {
                            myVar8 = myVar5;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changedInstance(myVar8) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0) {
                                shape2 = shape;
                                if (startRestartGroup.changed(shape2)) {
                                    i17 = GroupFlagsKt.IsNodeFlag;
                                    i4 |= i17;
                                }
                            } else {
                                shape2 = shape;
                            }
                            i17 = 4194304;
                            i4 |= i17;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 100663296) == 0) {
                            i4 |= ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(j)) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if ((805306368 & i) == 0) {
                            i4 |= ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if ((i2 & 6) == 0) {
                            i10 = i2 | (((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(j3)) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            j5 = j4;
                            i10 |= ((i3 & Fields.CameraDistance) == 0 && startRestartGroup.changed(j5)) ? 32 : 16;
                        } else {
                            j5 = j4;
                        }
                        i11 = i3 & Fields.TransformOrigin;
                        if (i11 != 0) {
                            i10 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i10 |= startRestartGroup.changed(f) ? Fields.RotationX : Fields.SpotShadowColor;
                            i12 = i3 & 8192;
                            if (i12 == 0) {
                                i10 |= 3072;
                                i13 = i12;
                            } else {
                                i13 = i12;
                                if ((i2 & 3072) == 0) {
                                    if (startRestartGroup.changed(dialogProperties)) {
                                        i18 = 2048;
                                    }
                                    i10 |= i18;
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 1171) != 1170, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            if (i5 != 0) {
                                                modifier2 = Modifier.Companion;
                                            }
                                            my myVar17 = i6 != 0 ? null : myVar2;
                                            if (i7 != 0) {
                                                myVar6 = null;
                                            }
                                            if (i8 != 0) {
                                                myVar7 = null;
                                            }
                                            if (i9 != 0) {
                                                myVar8 = null;
                                            }
                                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                                i4 &= -29360129;
                                                shape2 = AlertDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                            }
                                            if ((i3 & Fields.RotationX) != 0) {
                                                j10 = AlertDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                                i4 &= -234881025;
                                            } else {
                                                j10 = j;
                                            }
                                            if ((i3 & Fields.RotationY) != 0) {
                                                j11 = AlertDialogDefaults.INSTANCE.getIconContentColor(startRestartGroup, 6);
                                                i4 &= -1879048193;
                                            } else {
                                                j11 = j2;
                                            }
                                            if ((i3 & Fields.RotationZ) != 0) {
                                                j12 = AlertDialogDefaults.INSTANCE.getTitleContentColor(startRestartGroup, 6);
                                                i10 &= -15;
                                            } else {
                                                j12 = j3;
                                            }
                                            if ((i3 & Fields.CameraDistance) != 0) {
                                                j13 = AlertDialogDefaults.INSTANCE.getTextContentColor(startRestartGroup, 6);
                                                i10 &= -113;
                                            } else {
                                                j13 = j5;
                                            }
                                            float m1592getTonalElevationD9Ej5fM = i11 != 0 ? AlertDialogDefaults.INSTANCE.m1592getTonalElevationD9Ej5fM() : f;
                                            if (i13 != 0) {
                                                f3 = m1592getTonalElevationD9Ej5fM;
                                                dialogProperties3 = new DialogProperties(false, false, false, 7, (dq) null);
                                            } else {
                                                dialogProperties3 = dialogProperties;
                                                f3 = m1592getTonalElevationD9Ej5fM;
                                            }
                                            myVar13 = myVar7;
                                            myVar14 = myVar8;
                                            shape4 = shape2;
                                            modifier4 = modifier2;
                                            i14 = 94478519;
                                            int i19 = i4;
                                            myVar15 = myVar6;
                                            myVar16 = myVar17;
                                            j14 = j10;
                                            j15 = j13;
                                            i15 = i19;
                                            i16 = i10;
                                            j16 = j11;
                                            j17 = j12;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                                i4 &= -29360129;
                                            }
                                            if ((i3 & Fields.RotationX) != 0) {
                                                i4 &= -234881025;
                                            }
                                            if ((i3 & Fields.RotationY) != 0) {
                                                i4 &= -1879048193;
                                            }
                                            if ((i3 & Fields.RotationZ) != 0) {
                                                i10 &= -15;
                                            }
                                            if ((i3 & Fields.CameraDistance) != 0) {
                                                i10 &= -113;
                                            }
                                            j17 = j3;
                                            f3 = f;
                                            dialogProperties3 = dialogProperties;
                                            j15 = j5;
                                            i15 = i4;
                                            myVar13 = myVar7;
                                            myVar14 = myVar8;
                                            shape4 = shape2;
                                            i16 = i10;
                                            modifier4 = modifier2;
                                            i14 = 94478519;
                                            j14 = j;
                                            j16 = j2;
                                            myVar15 = myVar6;
                                            myVar16 = myVar2;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(i14, i15, i16, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)");
                                        }
                                        composer2 = startRestartGroup;
                                        AlertDialogKt.m1595AlertDialogImplwrnwzgE(iyVar, myVar, modifier4, myVar16, myVar15, myVar13, myVar14, shape4, j14, j16, j17, j15, f3, dialogProperties3, composer2, i15 & 2147483646, i16 & 8190);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        myVar9 = myVar16;
                                        myVar10 = myVar15;
                                        myVar11 = myVar13;
                                        myVar12 = myVar14;
                                        shape3 = shape4;
                                        j8 = j14;
                                        j9 = j16;
                                        j6 = j17;
                                        j7 = j15;
                                        f2 = f3;
                                        dialogProperties2 = dialogProperties3;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        myVar9 = myVar2;
                                        f2 = f;
                                        dialogProperties2 = dialogProperties;
                                        shape3 = shape2;
                                        modifier3 = modifier2;
                                        j6 = j3;
                                        j7 = j5;
                                        myVar10 = myVar6;
                                        myVar11 = myVar7;
                                        myVar12 = myVar8;
                                        j8 = j;
                                        j9 = j2;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new my() { // from class: a5
                                            @Override // defpackage.my
                                            public final Object invoke(Object obj, Object obj2) {
                                                w01 AlertDialog_Oix01E0$lambda$0;
                                                int intValue = ((Integer) obj2).intValue();
                                                AlertDialog_Oix01E0$lambda$0 = AndroidAlertDialog_androidKt.AlertDialog_Oix01E0$lambda$0(iy.this, myVar, modifier3, myVar9, myVar10, myVar11, myVar12, shape3, j8, j9, j6, j7, f2, dialogProperties2, i, i2, i3, (Composer) obj, intValue);
                                                return AlertDialog_Oix01E0$lambda$0;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 1171) != 1170, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i3 & 8192;
                        if (i12 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 1171) != 1170, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    myVar6 = myVar3;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((805306368 & i) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    i11 = i3 & Fields.TransformOrigin;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 1171) != 1170, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                myVar6 = myVar3;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((805306368 & i) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                i11 = i3 & Fields.TransformOrigin;
                if (i11 != 0) {
                }
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 1171) != 1170, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            int i182 = Fields.RotationZ;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            myVar6 = myVar3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i11 = i3 & Fields.TransformOrigin;
            if (i11 != 0) {
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        int i1822 = Fields.RotationZ;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        myVar6 = myVar3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i11 = i3 & Fields.TransformOrigin;
        if (i11 != 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AlertDialog_Oix01E0$lambda$0(iy iyVar, my myVar, Modifier modifier, my myVar2, my myVar3, my myVar4, my myVar5, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, int i, int i2, int i3, Composer composer, int i4) {
        m1600AlertDialogOix01E0(iyVar, myVar, modifier, myVar2, myVar3, myVar4, myVar5, shape, j, j2, j3, j4, f, dialogProperties, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }
}
