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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CookieKt {
    private static ImageVector _cookie;

    public static final ImageVector getCookie(Icons.Sharp sharp) {
        ImageVector imageVector = _cookie;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Cookie", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.95f, 10.99f);
        b.curveToRelative(-1.79f, -0.03f, -3.7f, -1.95f, -2.68f, -4.22f);
        b.curveToRelative(-2.98f, 1.0f, -5.77f, -1.59f, -5.19f, -4.56f);
        b.curveTo(6.95f, 0.71f, 2.0f, 6.58f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.curveTo(17.89f, 22.0f, 22.54f, 16.92f, 21.95f, 10.99f);
        b.close();
        b.moveTo(8.5f, 15.0f);
        b.curveTo(7.67f, 15.0f, 7.0f, 14.33f, 7.0f, 13.5f);
        b.reflectiveCurveTo(7.67f, 12.0f, 8.5f, 12.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(9.33f, 15.0f, 8.5f, 15.0f);
        b.close();
        b.moveTo(10.5f, 10.0f);
        b.curveTo(9.67f, 10.0f, 9.0f, 9.33f, 9.0f, 8.5f);
        b.reflectiveCurveTo(9.67f, 7.0f, 10.5f, 7.0f);
        b.reflectiveCurveTo(12.0f, 7.67f, 12.0f, 8.5f);
        b.reflectiveCurveTo(11.33f, 10.0f, 10.5f, 10.0f);
        b.close();
        b.moveTo(15.0f, 16.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.curveTo(16.0f, 15.55f, 15.55f, 16.0f, 15.0f, 16.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cookie = build;
        build.getClass();
        return build;
    }
}
