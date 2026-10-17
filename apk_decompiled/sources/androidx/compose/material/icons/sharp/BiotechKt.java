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
import defpackage.af0;
import defpackage.bv;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BiotechKt {
    private static ImageVector _biotech;

    public static final ImageVector getBiotech(Icons.Sharp sharp) {
        ImageVector imageVector = _biotech;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Biotech", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(13.0f, 19.0f, -2.0f, 5.0f, -2.0f);
        s.horizontalLineToRelative(-8.0f);
        s.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        s.curveToRelative(0.0f, -1.09f, 0.59f, -2.04f, 1.46f, -2.56f);
        s.curveTo(8.17f, 9.03f, 8.0f, 8.54f, 8.0f, 8.0f);
        s.curveToRelative(0.0f, -0.21f, 0.04f, -0.42f, 0.09f, -0.62f);
        s.curveTo(6.28f, 8.13f, 5.0f, 9.92f, 5.0f, 12.0f);
        s.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        af0.B(s, 2.0f, 5.0f, 2.0f, 14.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(s, -2.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.56f, 5.51f);
        b.curveTo(11.91f, 5.54f, 13.0f, 6.64f, 13.0f, 8.0f);
        b.curveToRelative(0.0f, 0.75f, -0.33f, 1.41f, -0.85f, 1.87f);
        b.lineToRelative(0.59f, 1.62f);
        b.lineToRelative(0.94f, -0.34f);
        b.lineToRelative(0.34f, 0.94f);
        b.lineToRelative(1.88f, -0.68f);
        b.lineToRelative(-0.34f, -0.94f);
        b.lineToRelative(0.94f, -0.34f);
        b.lineTo(13.76f, 2.6f);
        b.lineToRelative(-0.94f, 0.34f);
        b.lineTo(12.48f, 2.0f);
        b.lineTo(10.6f, 2.68f);
        b.lineToRelative(0.34f, 0.94f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 10.0f, 3.97f, 10.56f, 5.51f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(10.5f, 8.0f, -1.5f, 0.0f);
        b2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _biotech = build;
        build.getClass();
        return build;
    }
}
