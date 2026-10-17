package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import defpackage.fc;
import defpackage.iy;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Group(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, my myVar, Composer composer, int i, int i2) {
        String str2;
        int i3;
        float f8;
        int i4;
        float f9;
        int i5;
        float f10;
        int i6;
        float f11;
        int i7;
        int i8;
        int i9;
        int i10;
        float f12;
        float f13;
        List<? extends PathNode> list2;
        float f14;
        float f15;
        ScopeUpdateScope endRestartGroup;
        float f16;
        float f17;
        float f18;
        Object rememberedValue;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1851426205);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (startRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f8 = f;
            i3 |= startRestartGroup.changed(f8) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f9 = f2;
                i3 |= startRestartGroup.changed(f9) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f10 = f3;
                    i3 |= startRestartGroup.changed(f10) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f11 = f4;
                        i3 |= startRestartGroup.changed(f11) ? Fields.Clip : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= startRestartGroup.changed(f5) ? Fields.RenderEffect : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f6) ? 1048576 : Fields.BlendMode;
                        }
                        i9 = i2 & Fields.SpotShadowColor;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i10 = i9;
                            i3 |= startRestartGroup.changed(f7) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            if ((i & 100663296) == 0) {
                                if ((i2 & Fields.RotationX) == 0 && startRestartGroup.changedInstance(list)) {
                                    i11 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                    i3 |= i11;
                                }
                                i11 = GroupFlagsKt.HasAuxSlotFlag;
                                i3 |= i11;
                            }
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                f12 = f6;
                                f13 = f7;
                                list2 = list;
                                f14 = f8;
                                f15 = f5;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i12 != 0) {
                                        str2 = "";
                                    }
                                    if (i13 != 0) {
                                        f8 = 0.0f;
                                    }
                                    if (i4 != 0) {
                                        f9 = 0.0f;
                                    }
                                    if (i5 != 0) {
                                        f10 = 0.0f;
                                    }
                                    if (i6 != 0) {
                                        f11 = 1.0f;
                                    }
                                    f16 = i7 == 0 ? f5 : 1.0f;
                                    f12 = i8 != 0 ? 0.0f : f6;
                                    f17 = i10 == 0 ? f7 : 0.0f;
                                    if ((i2 & Fields.RotationX) != 0) {
                                        list2 = VectorKt.getEmptyPath();
                                        i3 &= -234881025;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            f18 = f17;
                                        } else {
                                            f18 = f17;
                                            ComposerKt.traceEventStart(-1851426205, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
                                        }
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = VectorComposeKt$Group$1$1.INSTANCE;
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        iy iyVar = (iy) rememberedValue;
                                        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        startRestartGroup.startNode();
                                        if (startRestartGroup.getInserting()) {
                                            startRestartGroup.useNode();
                                        } else {
                                            startRestartGroup.createNode(iyVar);
                                        }
                                        Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                                        Updater.m3886setimpl(m3878constructorimpl, str2, VectorComposeKt$Group$2$1.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f8), VectorComposeKt$Group$2$2.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f9), VectorComposeKt$Group$2$3.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f10), VectorComposeKt$Group$2$4.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f16), VectorComposeKt$Group$2$6.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f12), VectorComposeKt$Group$2$7.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f18), VectorComposeKt$Group$2$8.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, list2, VectorComposeKt$Group$2$9.INSTANCE);
                                        if (fc.l(myVar, startRestartGroup, (i3 >> 27) & 14)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        f13 = f18;
                                        f14 = f8;
                                        f15 = f16;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & Fields.RotationX) != 0) {
                                        i3 &= -234881025;
                                    }
                                    f16 = f5;
                                    f12 = f6;
                                    f17 = f7;
                                }
                                list2 = list;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                }
                                iy iyVar2 = (iy) rememberedValue;
                                if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                }
                                startRestartGroup.startNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                                Updater.m3886setimpl(m3878constructorimpl2, str2, VectorComposeKt$Group$2$1.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, Float.valueOf(f8), VectorComposeKt$Group$2$2.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, Float.valueOf(f9), VectorComposeKt$Group$2$3.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, Float.valueOf(f10), VectorComposeKt$Group$2$4.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, Float.valueOf(f16), VectorComposeKt$Group$2$6.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, Float.valueOf(f12), VectorComposeKt$Group$2$7.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, Float.valueOf(f18), VectorComposeKt$Group$2$8.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, list2, VectorComposeKt$Group$2$9.INSTANCE);
                                if (fc.l(myVar, startRestartGroup, (i3 >> 27) & 14)) {
                                }
                                f13 = f18;
                                f14 = f8;
                                f15 = f16;
                            }
                            float f19 = f10;
                            float f20 = f11;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new VectorComposeKt$Group$4(str2, f14, f9, f19, f20, f15, f12, f13, list2, myVar, i, i2));
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        if ((i & 100663296) == 0) {
                        }
                        if ((i & 805306368) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        float f192 = f10;
                        float f202 = f11;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f11 = f4;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & Fields.SpotShadowColor;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    float f1922 = f10;
                    float f2022 = f11;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f10 = f3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f11 = f4;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & Fields.SpotShadowColor;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                float f19222 = f10;
                float f20222 = f11;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f9 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f10 = f3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f11 = f4;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & Fields.SpotShadowColor;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            float f192222 = f10;
            float f202222 = f11;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f8 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f9 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f10 = f3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f11 = f4;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & Fields.SpotShadowColor;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        float f1922222 = f10;
        float f2022222 = f11;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00db  */
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
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5506Path9cdaXJ4(List<? extends PathNode> list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, Composer composer, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Brush brush3;
        int i11;
        float f8;
        int i12;
        Brush brush4;
        int i13;
        float f9;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        String str2;
        float f10;
        float f11;
        float f12;
        Composer composer2;
        Brush brush5;
        float f13;
        Brush brush6;
        int i27;
        float f14;
        int i28;
        int i29;
        float f15;
        float f16;
        ScopeUpdateScope endRestartGroup;
        int i30;
        Composer startRestartGroup = composer.startRestartGroup(-1478270750);
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 = i;
            i7 |= startRestartGroup.changed(i8) ? 32 : 16;
            i9 = i6 & 4;
            if (i9 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= startRestartGroup.changed(str) ? Fields.RotationX : Fields.SpotShadowColor;
                i10 = i6 & 8;
                int i32 = Fields.RotationZ;
                if (i10 != 0) {
                    i7 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    brush3 = brush;
                    i7 |= startRestartGroup.changed(brush3) ? 2048 : 1024;
                    i11 = i6 & 16;
                    if (i11 == 0) {
                        i7 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        f8 = f;
                        i7 |= startRestartGroup.changed(f8) ? Fields.Clip : 8192;
                        i12 = i6 & 32;
                        if (i12 != 0) {
                            i7 |= 196608;
                            brush4 = brush2;
                        } else {
                            brush4 = brush2;
                            if ((i4 & 196608) == 0) {
                                i7 |= startRestartGroup.changed(brush4) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i13 = i6 & 64;
                        if (i13 != 0) {
                            i7 |= 1572864;
                            f9 = f2;
                        } else {
                            f9 = f2;
                            if ((i4 & 1572864) == 0) {
                                i7 |= startRestartGroup.changed(f9) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        i14 = i6 & Fields.SpotShadowColor;
                        if (i14 != 0) {
                            i7 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i7 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        i15 = i6 & Fields.RotationX;
                        if (i15 != 0) {
                            i7 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            i16 = i15;
                            i7 |= startRestartGroup.changed(i2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i17 = i6 & Fields.RotationY;
                            if (i17 == 0) {
                                i7 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                i18 = i17;
                                i7 |= startRestartGroup.changed(i3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                i19 = i6 & Fields.RotationZ;
                                if (i19 != 0) {
                                    i21 = i5 | 6;
                                    i20 = i19;
                                } else if ((i5 & 6) == 0) {
                                    i20 = i19;
                                    i21 = i5 | (startRestartGroup.changed(f4) ? 4 : 2);
                                } else {
                                    i20 = i19;
                                    i21 = i5;
                                }
                                i22 = i6 & Fields.CameraDistance;
                                if (i22 != 0) {
                                    i21 |= 48;
                                    i23 = i22;
                                } else if ((i5 & 48) == 0) {
                                    i23 = i22;
                                    i21 |= startRestartGroup.changed(f5) ? 32 : 16;
                                } else {
                                    i23 = i22;
                                }
                                int i33 = i21;
                                i24 = i6 & Fields.TransformOrigin;
                                if (i24 != 0) {
                                    i25 = i33 | 384;
                                } else {
                                    int i34 = i33;
                                    if ((i5 & 384) == 0) {
                                        i34 |= startRestartGroup.changed(f6) ? Fields.RotationX : Fields.SpotShadowColor;
                                    }
                                    i25 = i34;
                                }
                                i26 = i6 & 8192;
                                if (i26 != 0) {
                                    i25 |= 3072;
                                } else if ((i5 & 3072) == 0) {
                                    if (startRestartGroup.changed(f7)) {
                                        i32 = 2048;
                                    }
                                    i25 |= i32;
                                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
                                        startRestartGroup.skipToGroupEnd();
                                        str2 = str;
                                        f10 = f3;
                                        f11 = f5;
                                        f12 = f7;
                                        composer2 = startRestartGroup;
                                        brush5 = brush3;
                                        f13 = f8;
                                        brush6 = brush4;
                                        i27 = i8;
                                        f14 = f9;
                                        i28 = i2;
                                        i29 = i3;
                                        f15 = f4;
                                        f16 = f6;
                                    } else {
                                        int defaultFillType = i31 != 0 ? VectorKt.getDefaultFillType() : i8;
                                        String str3 = i9 != 0 ? "" : str;
                                        if (i10 != 0) {
                                            brush3 = null;
                                        }
                                        if (i11 != 0) {
                                            f8 = 1.0f;
                                        }
                                        Brush brush7 = i12 == 0 ? brush4 : null;
                                        if (i13 != 0) {
                                            f9 = 1.0f;
                                        }
                                        float f17 = i14 != 0 ? 0.0f : f3;
                                        int defaultStrokeLineCap = i16 != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
                                        int defaultStrokeLineJoin = i18 != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
                                        float f18 = i20 != 0 ? 4.0f : f4;
                                        float f19 = i23 != 0 ? 0.0f : f5;
                                        float f20 = i24 == 0 ? f6 : 1.0f;
                                        float f21 = i26 == 0 ? f7 : 0.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                            i30 = defaultFillType;
                                            ComposerKt.traceEventStart(-1478270750, i7, i25, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
                                        } else {
                                            i30 = defaultFillType;
                                        }
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = VectorComposeKt$Path$1$1.INSTANCE;
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        iy iyVar = (iy) rememberedValue;
                                        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        startRestartGroup.startNode();
                                        if (startRestartGroup.getInserting()) {
                                            startRestartGroup.createNode(iyVar);
                                        } else {
                                            startRestartGroup.useNode();
                                        }
                                        Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                                        Updater.m3886setimpl(m3878constructorimpl, str3, VectorComposeKt$Path$2$1.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, list, VectorComposeKt$Path$2$2.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, PathFillType.m5050boximpl(i30), VectorComposeKt$Path$2$3.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, brush3, VectorComposeKt$Path$2$4.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f8), VectorComposeKt$Path$2$5.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, brush7, VectorComposeKt$Path$2$6.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f9), VectorComposeKt$Path$2$7.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f17), VectorComposeKt$Path$2$8.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, StrokeJoin.m5138boximpl(defaultStrokeLineJoin), VectorComposeKt$Path$2$9.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, StrokeCap.m5128boximpl(defaultStrokeLineCap), VectorComposeKt$Path$2$10.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f18), VectorComposeKt$Path$2$11.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f19), VectorComposeKt$Path$2$12.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f20), VectorComposeKt$Path$2$13.INSTANCE);
                                        Updater.m3886setimpl(m3878constructorimpl, Float.valueOf(f21), VectorComposeKt$Path$2$14.INSTANCE);
                                        startRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str2 = str3;
                                        composer2 = startRestartGroup;
                                        brush5 = brush3;
                                        brush6 = brush7;
                                        f13 = f8;
                                        f10 = f17;
                                        f14 = f9;
                                        i28 = defaultStrokeLineCap;
                                        f11 = f19;
                                        i27 = i30;
                                        f12 = f21;
                                        f16 = f20;
                                        i29 = defaultStrokeLineJoin;
                                        f15 = f18;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new VectorComposeKt$Path$3(list, i27, str2, brush5, f13, brush6, f14, f10, i28, i29, f15, f11, f16, f12, i4, i5, i6));
                                        return;
                                    }
                                    return;
                                }
                                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i18 = i17;
                            i19 = i6 & Fields.RotationZ;
                            if (i19 != 0) {
                            }
                            i22 = i6 & Fields.CameraDistance;
                            if (i22 != 0) {
                            }
                            int i332 = i21;
                            i24 = i6 & Fields.TransformOrigin;
                            if (i24 != 0) {
                            }
                            i26 = i6 & 8192;
                            if (i26 != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i16 = i15;
                        i17 = i6 & Fields.RotationY;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        i19 = i6 & Fields.RotationZ;
                        if (i19 != 0) {
                        }
                        i22 = i6 & Fields.CameraDistance;
                        if (i22 != 0) {
                        }
                        int i3322 = i21;
                        i24 = i6 & Fields.TransformOrigin;
                        if (i24 != 0) {
                        }
                        i26 = i6 & 8192;
                        if (i26 != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f8 = f;
                    i12 = i6 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i6 & Fields.SpotShadowColor;
                    if (i14 != 0) {
                    }
                    i15 = i6 & Fields.RotationX;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i6 & Fields.RotationY;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i6 & Fields.RotationZ;
                    if (i19 != 0) {
                    }
                    i22 = i6 & Fields.CameraDistance;
                    if (i22 != 0) {
                    }
                    int i33222 = i21;
                    i24 = i6 & Fields.TransformOrigin;
                    if (i24 != 0) {
                    }
                    i26 = i6 & 8192;
                    if (i26 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                brush3 = brush;
                i11 = i6 & 16;
                if (i11 == 0) {
                }
                f8 = f;
                i12 = i6 & 32;
                if (i12 != 0) {
                }
                i13 = i6 & 64;
                if (i13 != 0) {
                }
                i14 = i6 & Fields.SpotShadowColor;
                if (i14 != 0) {
                }
                i15 = i6 & Fields.RotationX;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i6 & Fields.RotationY;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i6 & Fields.RotationZ;
                if (i19 != 0) {
                }
                i22 = i6 & Fields.CameraDistance;
                if (i22 != 0) {
                }
                int i332222 = i21;
                i24 = i6 & Fields.TransformOrigin;
                if (i24 != 0) {
                }
                i26 = i6 & 8192;
                if (i26 != 0) {
                }
                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i10 = i6 & 8;
            int i322 = Fields.RotationZ;
            if (i10 != 0) {
            }
            brush3 = brush;
            i11 = i6 & 16;
            if (i11 == 0) {
            }
            f8 = f;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            if (i13 != 0) {
            }
            i14 = i6 & Fields.SpotShadowColor;
            if (i14 != 0) {
            }
            i15 = i6 & Fields.RotationX;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & Fields.RotationY;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i6 & Fields.RotationZ;
            if (i19 != 0) {
            }
            i22 = i6 & Fields.CameraDistance;
            if (i22 != 0) {
            }
            int i3322222 = i21;
            i24 = i6 & Fields.TransformOrigin;
            if (i24 != 0) {
            }
            i26 = i6 & 8192;
            if (i26 != 0) {
            }
            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i;
        i9 = i6 & 4;
        if (i9 == 0) {
        }
        i10 = i6 & 8;
        int i3222 = Fields.RotationZ;
        if (i10 != 0) {
        }
        brush3 = brush;
        i11 = i6 & 16;
        if (i11 == 0) {
        }
        f8 = f;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        if (i13 != 0) {
        }
        i14 = i6 & Fields.SpotShadowColor;
        if (i14 != 0) {
        }
        i15 = i6 & Fields.RotationX;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & Fields.RotationY;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i6 & Fields.RotationZ;
        if (i19 != 0) {
        }
        i22 = i6 & Fields.CameraDistance;
        if (i22 != 0) {
        }
        int i33222222 = i21;
        i24 = i6 & Fields.TransformOrigin;
        if (i24 != 0) {
        }
        i26 = i6 & 8192;
        if (i26 != 0) {
        }
        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
