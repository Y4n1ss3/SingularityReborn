package androidx.compose.material.icons.outlined;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LoyaltyKt {
    private static ImageVector _loyalty;

    public static final ImageVector getLoyalty(Icons.Outlined outlined) {
        ImageVector imageVector = _loyalty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Loyalty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.41f, 11.58f, -9.0f, -9.0f);
        e.curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        e.horizontalLineTo(4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(7.0f);
        e.curveToRelative(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        e.lineToRelative(9.0f, 9.0f);
        e.curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        e.reflectiveCurveToRelative(1.05f, -0.22f, 1.41f, -0.59f);
        e.lineToRelative(7.0f, -7.0f);
        e.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        e.reflectiveCurveToRelative(-0.23f, -1.06f, -0.59f, -1.42f);
        k4.r(e, 13.0f, 20.01f, 4.0f, 11.0f);
        kf0.r(e, 4.0f, 7.0f, -0.01f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 9.0f, 9.0f, -7.0f, 7.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(6.5f, 6.5f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(8.9f, 12.55f);
        b2.curveToRelative(0.0f, 0.57f, 0.23f, 1.07f, 0.6f, 1.45f);
        b2.lineToRelative(3.5f, 3.5f);
        b2.lineToRelative(3.5f, -3.5f);
        b2.curveToRelative(0.37f, -0.37f, 0.6f, -0.89f, 0.6f, -1.45f);
        b2.curveToRelative(0.0f, -1.13f, -0.92f, -2.05f, -2.05f, -2.05f);
        b2.curveToRelative(-0.57f, 0.0f, -1.08f, 0.23f, -1.45f, 0.6f);
        b2.lineToRelative(-0.6f, 0.6f);
        b2.lineToRelative(-0.6f, -0.59f);
        b2.curveToRelative(-0.37f, -0.38f, -0.89f, -0.61f, -1.45f, -0.61f);
        b2.curveToRelative(-1.13f, 0.0f, -2.05f, 0.92f, -2.05f, 2.05f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loyalty = build;
        build.getClass();
        return build;
    }
}
