package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RawOnKt {
    private static ImageVector _rawOn;

    public static final ImageVector getRawOn(Icons.Filled filled) {
        ImageVector imageVector = _rawOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RawOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(6.5f, 9.0f, 3.0f, 6.0f, 1.5f);
        gy.C(i, -2.0f, 1.1f, 0.9f, 2.0f);
        i.horizontalLineTo(8.0f);
        i.lineToRelative(-0.9f, -2.1f);
        i.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        i.verticalLineToRelative(-1.0f);
        i.curveTo(8.0f, 9.7f, 7.3f, 9.0f, 6.5f, 9.0f);
        r6.B(i, 6.5f, 11.5f, -2.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 2.0f, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(10.25f, 9.0f, -1.5f, 6.0f, 1.5f);
        b.lineToRelative(0.38f, -1.5f);
        kf0.B(b, 1.75f, 0.37f, 1.5f, 1.5f);
        gy.w(b, -1.5f, -6.0f, 10.25f);
        b.moveTo(11.0f, 12.0f);
        b.lineToRelative(0.25f, -1.0f);
        b.horizontalLineToRelative(0.5f);
        b.lineTo(12.0f, 12.0f);
        b.horizontalLineTo(11.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.98f, 9.0f, -0.74f, 3.0f);
        e.lineToRelative(-0.74f, -3.0f);
        e.lineToRelative(-1.52f, 0.0f);
        e.lineToRelative(-0.74f, 3.0f);
        e.lineToRelative(-0.74f, -3.0f);
        e.lineToRelative(-1.5f, 0.0f);
        e.lineToRelative(1.5f, 6.0f);
        e.lineToRelative(1.48f, 0.0f);
        e.lineToRelative(0.76f, -3.04f);
        e.lineToRelative(0.76f, 3.04f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.48f, 0.0f, 1.5f, -6.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rawOn = build;
        build.getClass();
        return build;
    }
}
