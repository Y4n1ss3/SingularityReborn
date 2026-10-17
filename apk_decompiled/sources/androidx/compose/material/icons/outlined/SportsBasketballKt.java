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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsBasketballKt {
    private static ImageVector _sportsBasketball;

    public static final ImageVector getSportsBasketball(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsBasketball;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsBasketball", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(5.23f, 7.75f);
        b.curveTo(6.1f, 8.62f, 6.7f, 9.74f, 6.91f, 11.0f);
        b.horizontalLineTo(4.07f);
        b.curveTo(4.22f, 9.82f, 4.63f, 8.72f, 5.23f, 7.75f);
        af0.l(b, 4.07f, 13.0f, 2.84f);
        b.curveToRelative(-0.21f, 1.26f, -0.81f, 2.38f, -1.68f, 3.25f);
        b.curveTo(4.63f, 15.28f, 4.22f, 14.18f, 4.07f, 13.0f);
        b.close();
        b.moveTo(11.0f, 19.93f);
        b.curveToRelative(-1.73f, -0.22f, -3.29f, -1.0f, -4.49f, -2.14f);
        b.curveToRelative(1.3f, -1.24f, 2.19f, -2.91f, 2.42f, -4.79f);
        bv.s(b, 11.0f, 19.93f, 11.0f, 11.0f);
        b.horizontalLineTo(8.93f);
        b.curveTo(8.69f, 9.12f, 7.81f, 7.44f, 6.5f, 6.2f);
        b.curveTo(7.71f, 5.06f, 9.27f, 4.29f, 11.0f, 4.07f);
        k4.D(b, 11.0f, 19.93f, 11.0f, -2.84f);
        b.curveToRelative(0.21f, -1.26f, 0.81f, -2.38f, 1.68f, -3.25f);
        b.curveTo(19.37f, 8.72f, 19.78f, 9.82f, 19.93f, 11.0f);
        b.close();
        b.moveTo(13.0f, 4.07f);
        b.curveToRelative(1.73f, 0.22f, 3.29f, 0.99f, 4.5f, 2.13f);
        b.curveToRelative(-1.31f, 1.24f, -2.19f, 2.92f, -2.43f, 4.8f);
        bv.s(b, 13.0f, 4.07f, 13.0f, 19.93f);
        b.verticalLineTo(13.0f);
        b.horizontalLineToRelative(2.07f);
        b.curveToRelative(0.24f, 1.88f, 1.12f, 3.55f, 2.42f, 4.79f);
        b.curveTo(16.29f, 18.93f, 14.73f, 19.71f, 13.0f, 19.93f);
        b.close();
        b.moveTo(18.77f, 16.25f);
        b.curveToRelative(-0.87f, -0.86f, -1.46f, -1.99f, -1.68f, -3.25f);
        b.horizontalLineToRelative(2.84f);
        b.curveTo(19.78f, 14.18f, 19.37f, 15.28f, 18.77f, 16.25f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBasketball = build;
        build.getClass();
        return build;
    }
}
