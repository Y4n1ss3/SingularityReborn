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
import defpackage.af0;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArchitectureKt {
    private static ImageVector _architecture;

    public static final ImageVector getArchitecture(Icons.Filled filled) {
        ImageVector imageVector = _architecture;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Architecture", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(6.36f, 18.78f, 6.61f, 21.0f);
        i.lineToRelative(1.62f, -1.54f);
        i.lineToRelative(2.77f, -7.6f);
        i.curveToRelative(-0.68f, -0.17f, -1.28f, -0.51f, -1.77f, -0.98f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 6.36f, 18.78f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.77f, 10.88f);
        b.curveToRelative(-0.49f, 0.47f, -1.1f, 0.81f, -1.77f, 0.98f);
        b.lineToRelative(2.77f, 7.6f);
        b.lineTo(17.39f, 21.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 0.26f, -2.22f, 14.77f, 10.88f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(15.0f, 8.0f);
        b2.curveToRelative(0.0f, -1.3f, -0.84f, -2.4f, -2.0f, -2.82f);
        kf0.r(b2, 3.0f, -2.0f, 2.18f);
        b2.curveTo(9.84f, 5.6f, 9.0f, 6.7f, 9.0f, 8.0f);
        b2.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b2.reflectiveCurveTo(15.0f, 9.66f, 15.0f, 8.0f);
        b2.close();
        b2.moveTo(12.0f, 9.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b2.curveTo(13.0f, 8.55f, 12.55f, 9.0f, 12.0f, 9.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _architecture = build;
        build.getClass();
        return build;
    }
}
