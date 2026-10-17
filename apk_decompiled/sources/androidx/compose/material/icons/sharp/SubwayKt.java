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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SubwayKt {
    private static ImageVector _subway;

    public static final ImageVector getSubway(Icons.Sharp sharp) {
        ImageVector imageVector = _subway;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Subway", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(8.5f, 16.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(15.5f, 16.0f, -1.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(7.01f, 9.0f, 10.0f, 5.0f, -10.0f);
        q.moveTo(17.8f, 2.8f);
        q.curveTo(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f);
        q.reflectiveCurveToRelative(-4.0f, 0.09f, -5.8f, 0.8f);
        q.curveTo(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f);
        q.lineTo(2.0f, 22.0f);
        q.horizontalLineToRelative(20.0f);
        q.lineTo(22.0f, 8.86f);
        q.curveToRelative(0.0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f);
        q.close();
        q.moveTo(18.0f, 15.5f);
        q.curveToRelative(0.0f, 1.54f, -1.16f, 2.79f, -2.65f, 2.96f);
        q.lineToRelative(1.15f, 1.16f);
        q.lineTo(16.5f, 20.0f);
        kf0.B(q, -1.67f, -1.5f, -1.5f, -2.66f);
        q.lineTo(9.17f, 20.0f);
        q.lineTo(7.5f, 20.0f);
        q.verticalLineToRelative(-0.38f);
        q.lineToRelative(1.15f, -1.16f);
        q.curveTo(7.16f, 18.29f, 6.0f, 17.04f, 6.0f, 15.5f);
        q.lineTo(6.0f, 9.0f);
        q.curveToRelative(0.0f, -2.63f, 3.0f, -3.0f, 6.0f, -3.0f);
        q.reflectiveCurveToRelative(6.0f, 0.37f, 6.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(q, 6.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subway = build;
        build.getClass();
        return build;
    }
}
