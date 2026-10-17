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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NightsStayKt {
    private static ImageVector _nightsStay;

    public static final ImageVector getNightsStay(Icons.Sharp sharp) {
        ImageVector imageVector = _nightsStay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NightsStay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.1f, 12.08f);
        b.curveTo(8.77f, 7.57f, 10.6f, 3.6f, 11.63f, 2.01f);
        b.curveTo(6.27f, 2.2f, 1.98f, 6.59f, 1.98f, 12.0f);
        b.curveToRelative(0.0f, 0.14f, 0.02f, 0.28f, 0.02f, 0.42f);
        b.curveTo(2.62f, 12.15f, 3.29f, 12.0f, 4.0f, 12.0f);
        b.curveToRelative(1.66f, 0.0f, 3.18f, 0.83f, 4.1f, 2.15f);
        b.curveTo(9.77f, 14.63f, 11.0f, 16.17f, 11.0f, 18.0f);
        b.curveToRelative(0.0f, 1.52f, -0.87f, 2.83f, -2.12f, 3.51f);
        b.curveToRelative(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f);
        b.curveToRelative(3.5f, 0.0f, 6.58f, -1.8f, 8.37f, -4.52f);
        b.curveTo(18.0f, 17.72f, 13.38f, 16.52f, 11.1f, 12.08f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(7.0f, 16.0f, -0.18f, 0.0f);
        e.curveTo(6.4f, 14.84f, 5.3f, 14.0f, 4.0f, 14.0f);
        e.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        e.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        e.curveToRelative(0.62f, 0.0f, 2.49f, 0.0f, 3.0f, 0.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.curveTo(9.0f, 16.9f, 8.1f, 16.0f, 7.0f, 16.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightsStay = build;
        build.getClass();
        return build;
    }
}
