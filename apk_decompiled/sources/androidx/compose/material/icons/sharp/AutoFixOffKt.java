package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoFixOffKt {
    private static ImageVector _autoFixOff;

    public static final ImageVector getAutoFixOff(Icons.Sharp sharp) {
        ImageVector imageVector = _autoFixOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AutoFixOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 7.0f, 0.94f, -2.06f);
        e.lineToRelative(2.06f, -0.94f);
        e.lineToRelative(-2.06f, -0.94f);
        e.lineToRelative(-0.94f, -2.06f);
        e.lineToRelative(-0.94f, 2.06f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -2.06f, 0.94f, 2.06f, 0.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(14.17f, 8.42f, 1.41f, 1.41f);
        e2.lineToRelative(-1.46f, 1.46f);
        e2.lineToRelative(1.42f, 1.42f);
        e2.lineToRelative(2.87f, -2.88f);
        e2.lineToRelative(-4.24f, -4.24f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, -2.88f, 2.87f, 1.42f, 1.42f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e3 = k4.e(1.39f, 4.22f, 7.07f, 7.07f);
        e3.lineToRelative(-6.87f, 6.88f);
        e3.lineToRelative(4.24f, 4.24f);
        e3.lineToRelative(6.88f, -6.87f);
        e3.lineToRelative(7.07f, 7.07f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e3, 1.41f, -1.42f, -18.38f, -18.38f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixOff = build;
        build.getClass();
        return build;
    }
}
