package androidx.compose.ui.graphics;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsSpec;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        float minValue;
        float maxValue;
        int i4;
        int i5;
        int i6;
        int i7;
        float minValue2;
        float maxValue2;
        int i8;
        int i9;
        int i10;
        if (colorSpace.isSrgb()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            return Color.m4757constructorimpl((i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32);
        }
        if (!(colorSpace.getComponentCount() == 3)) {
            InlineClassHelperKt.throwIllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int id$ui_graphics = colorSpace.getId$ui_graphics();
        if (!(id$ui_graphics != -1)) {
            InlineClassHelperKt.throwIllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float minValue3 = colorSpace.getMinValue(0);
        float maxValue3 = colorSpace.getMaxValue(0);
        if (f >= minValue3) {
            minValue3 = f;
        }
        if (minValue3 <= maxValue3) {
            maxValue3 = minValue3;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(maxValue3);
        int i14 = floatToRawIntBits >>> 31;
        int i15 = (floatToRawIntBits >>> 23) & 255;
        int i16 = floatToRawIntBits & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
        if (i15 == 255) {
            i2 = i16 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i15 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i17 = i16 >> 13;
                if ((floatToRawIntBits & Fields.TransformOrigin) != 0) {
                    i3 = (((i << 10) | i17) + 1) | (i14 << 15);
                    short s = (short) i3;
                    minValue = colorSpace.getMinValue(1);
                    maxValue = colorSpace.getMaxValue(1);
                    if (f2 >= minValue) {
                        minValue = f2;
                    }
                    if (minValue <= maxValue) {
                        maxValue = minValue;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(maxValue);
                    int i18 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i19 = floatToRawIntBits2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
                    if (i4 != 255) {
                        i6 = i19 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i20 = i19 >> 13;
                            if ((floatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                i7 = (((i5 << 10) | i20) + 1) | (i18 << 15);
                                short s2 = (short) i7;
                                minValue2 = colorSpace.getMinValue(2);
                                maxValue2 = colorSpace.getMaxValue(2);
                                if (f3 >= minValue2) {
                                    minValue2 = f3;
                                }
                                if (minValue2 <= maxValue2) {
                                    maxValue2 = minValue2;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(maxValue2);
                                int i21 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i22 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i22 != 0 ? 512 : 0;
                                    r9 = 31;
                                } else {
                                    int i23 = i8 - 112;
                                    if (i23 >= 31) {
                                        i9 = 0;
                                        r9 = 49;
                                    } else if (i23 > 0) {
                                        int i24 = i22 >> 13;
                                        if ((floatToRawIntBits3 & Fields.TransformOrigin) != 0) {
                                            i10 = (((i23 << 10) | i24) + 1) | (i21 << 15);
                                            return Color.m4757constructorimpl((id$ui_graphics & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6));
                                        }
                                        i9 = i24;
                                        r9 = i23;
                                    } else if (i23 >= -10) {
                                        int i25 = (i22 | GroupFlagsKt.IsNodeFlag) >> (1 - i23);
                                        if ((i25 & Fields.TransformOrigin) != 0) {
                                            i25 += 8192;
                                        }
                                        i9 = i25 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i21 << 15) | (r9 << 10);
                                if (f4 >= 0.0f) {
                                }
                                return Color.m4757constructorimpl((id$ui_graphics & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6));
                            }
                            i6 = i20;
                        } else if (i5 >= -10) {
                            int i26 = (i19 | GroupFlagsKt.IsNodeFlag) >> (1 - i5);
                            if ((i26 & Fields.TransformOrigin) != 0) {
                                i26 += 8192;
                            }
                            i6 = i26 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i18 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    minValue2 = colorSpace.getMinValue(2);
                    maxValue2 = colorSpace.getMaxValue(2);
                    if (f3 >= minValue2) {
                    }
                    if (minValue2 <= maxValue2) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(maxValue2);
                    int i212 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i222 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i212 << 15) | (r9 << 10);
                    if (f4 >= 0.0f) {
                    }
                    return Color.m4757constructorimpl((id$ui_graphics & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6));
                }
                i2 = i17;
            } else if (i >= -10) {
                int i27 = (i16 | GroupFlagsKt.IsNodeFlag) >> (1 - i);
                if ((i27 & Fields.TransformOrigin) != 0) {
                    i27 += 8192;
                }
                i2 = i27 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i14 << 15) | (i << 10);
        short s3 = (short) i3;
        minValue = colorSpace.getMinValue(1);
        maxValue = colorSpace.getMaxValue(1);
        if (f2 >= minValue) {
        }
        if (minValue <= maxValue) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(maxValue);
        int i182 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i192 = floatToRawIntBits22 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
        if (i4 != 255) {
        }
        i7 = i6 | (i182 << 15) | (i5 << 10);
        short s222 = (short) i7;
        minValue2 = colorSpace.getMinValue(2);
        maxValue2 = colorSpace.getMaxValue(2);
        if (f3 >= minValue2) {
        }
        if (minValue2 <= maxValue2) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(maxValue2);
        int i2122 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2222 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2122 << 15) | (r9 << 10);
        if (f4 >= 0.0f) {
        }
        return Color.m4757constructorimpl((id$ui_graphics & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6));
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long UncheckedColor(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (colorSpace.isSrgb()) {
            return Color.m4757constructorimpl(((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32);
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & 255;
        int i12 = floatToRawIntBits & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
        int i13 = 49;
        int i14 = Fields.RotationY;
        int i15 = 0;
        if (i11 == 255) {
            i2 = i12 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i11 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i12 >> 13;
                if ((floatToRawIntBits & Fields.TransformOrigin) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i10 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i17 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i18 = floatToRawIntBits2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((floatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i20 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    if (i21 == 0) {
                                        i14 = 0;
                                    }
                                    i15 = i14;
                                    i13 = 31;
                                } else {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((floatToRawIntBits3 & Fields.TransformOrigin) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                                return Color.m4757constructorimpl(((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId$ui_graphics() & 63));
                                            }
                                            i13 = i22;
                                        } else if (i22 >= -10) {
                                            int i23 = (i21 | GroupFlagsKt.IsNodeFlag) >> (1 - i22);
                                            if ((i23 & Fields.TransformOrigin) != 0) {
                                                i23 += 8192;
                                            }
                                            i13 = 0;
                                            i15 = i23 >> 13;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                }
                                i9 = (i20 << 15) | (i13 << 10) | i15;
                                return Color.m4757constructorimpl(((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId$ui_graphics() & 63));
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i24 = (i18 | GroupFlagsKt.IsNodeFlag) >> (1 - i5);
                            if ((i24 & Fields.TransformOrigin) != 0) {
                                i24 += 8192;
                            }
                            i6 = i24 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i202 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i202 << 15) | (i13 << 10) | i15;
                    return Color.m4757constructorimpl(((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId$ui_graphics() & 63));
                }
                i2 = i16;
            } else if (i >= -10) {
                int i25 = (i12 | GroupFlagsKt.IsNodeFlag) >> (1 - i);
                if ((i25 & Fields.TransformOrigin) != 0) {
                    i25 += 8192;
                }
                i2 = i25 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i10 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i172 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i182 = floatToRawIntBits22 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i2022 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i2022 << 15) | (i13 << 10) | i15;
        return Color.m4757constructorimpl(((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId$ui_graphics() & 63));
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f3) * (f2 * f4)) + (f * f3)) / f5;
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m4806compositeOverOWjLjI(long j, long j2) {
        float f;
        float f2;
        long m4758convertvNxB06k = Color.m4758convertvNxB06k(j, Color.m4765getColorSpaceimpl(j2));
        float m4763getAlphaimpl = Color.m4763getAlphaimpl(j2);
        float m4763getAlphaimpl2 = Color.m4763getAlphaimpl(m4758convertvNxB06k);
        float f3 = 1.0f - m4763getAlphaimpl2;
        float f4 = (m4763getAlphaimpl * f3) + m4763getAlphaimpl2;
        float m4767getRedimpl = Color.m4767getRedimpl(m4758convertvNxB06k);
        float m4767getRedimpl2 = Color.m4767getRedimpl(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((m4767getRedimpl2 * m4763getAlphaimpl) * f3) + (m4767getRedimpl * m4763getAlphaimpl2)) / f4;
        }
        float m4766getGreenimpl = Color.m4766getGreenimpl(m4758convertvNxB06k);
        float m4766getGreenimpl2 = Color.m4766getGreenimpl(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((m4766getGreenimpl2 * m4763getAlphaimpl) * f3) + (m4766getGreenimpl * m4763getAlphaimpl2)) / f4;
        }
        float m4764getBlueimpl = Color.m4764getBlueimpl(m4758convertvNxB06k);
        float m4764getBlueimpl2 = Color.m4764getBlueimpl(j2);
        if (f4 != 0.0f) {
            f5 = (((m4764getBlueimpl2 * m4763getAlphaimpl) * f3) + (m4764getBlueimpl * m4763getAlphaimpl2)) / f4;
        }
        return UncheckedColor(f, f2, f5, f4, Color.m4765getColorSpaceimpl(j2));
    }

    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m4807getComponents8_81llA(long j) {
        return new float[]{Color.m4767getRedimpl(j), Color.m4766getGreenimpl(j), Color.m4764getBlueimpl(j), Color.m4763getAlphaimpl(j)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m4808isSpecified8_81llA(long j) {
        return j != 16;
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m4810isUnspecified8_81llA(long j) {
        return j == 16;
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m4812lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m4758convertvNxB06k = Color.m4758convertvNxB06k(j, oklab);
        long m4758convertvNxB06k2 = Color.m4758convertvNxB06k(j2, oklab);
        float m4763getAlphaimpl = Color.m4763getAlphaimpl(m4758convertvNxB06k);
        float m4767getRedimpl = Color.m4767getRedimpl(m4758convertvNxB06k);
        float m4766getGreenimpl = Color.m4766getGreenimpl(m4758convertvNxB06k);
        float m4764getBlueimpl = Color.m4764getBlueimpl(m4758convertvNxB06k);
        float m4763getAlphaimpl2 = Color.m4763getAlphaimpl(m4758convertvNxB06k2);
        float m4767getRedimpl2 = Color.m4767getRedimpl(m4758convertvNxB06k2);
        float m4766getGreenimpl2 = Color.m4766getGreenimpl(m4758convertvNxB06k2);
        float m4764getBlueimpl2 = Color.m4764getBlueimpl(m4758convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m4758convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(m4767getRedimpl, m4767getRedimpl2, f), MathHelpersKt.lerp(m4766getGreenimpl, m4766getGreenimpl2, f), MathHelpersKt.lerp(m4764getBlueimpl, m4764getBlueimpl2, f), MathHelpersKt.lerp(m4763getAlphaimpl, m4763getAlphaimpl2, f), oklab), Color.m4765getColorSpaceimpl(j2));
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m4813luminance8_81llA(long j) {
        ColorSpace m4765getColorSpaceimpl = Color.m4765getColorSpaceimpl(j);
        if (!ColorModel.m5191equalsimpl0(m4765getColorSpaceimpl.m5200getModelxdoWZVw(), ColorModel.Companion.m5198getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m5194toStringimpl(m4765getColorSpaceimpl.m5200getModelxdoWZVw())));
        }
        DoubleFunction eotfFunc$ui_graphics = ((Rgb) m4765getColorSpaceimpl).getEotfFunc$ui_graphics();
        double invoke = eotfFunc$ui_graphics.invoke(Color.m4767getRedimpl(j));
        float invoke2 = (float) ((eotfFunc$ui_graphics.invoke(Color.m4764getBlueimpl(j)) * 0.0722d) + (eotfFunc$ui_graphics.invoke(Color.m4766getGreenimpl(j)) * 0.7152d) + (invoke * 0.2126d));
        if (invoke2 < 0.0f) {
            invoke2 = 0.0f;
        }
        if (invoke2 > 1.0f) {
            return 1.0f;
        }
        return invoke2;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m4814takeOrElseDxMtmZc(long j, iy iyVar) {
        return j != 16 ? j : ((Color) iyVar.invoke()).m4771unboximpl();
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m4815toArgb8_81llA(long j) {
        return (int) (Color.m4758convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4809isSpecified8_81llA$annotations(long j) {
    }

    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4811isUnspecified8_81llA$annotations(long j) {
    }

    public static final long Color(int i) {
        return Color.m4757constructorimpl(i << 32);
    }

    public static final long Color(long j) {
        return Color.m4757constructorimpl(j << 32);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
