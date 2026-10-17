package androidx.compose.material.icons.rounded;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(Icons.Rounded rounded) {
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rocket", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.41f, 2.87f);
        b.curveToRelative(0.35f, -0.26f, 0.82f, -0.26f, 1.18f, 0.0f);
        b.curveTo(13.81f, 3.75f, 16.5f, 6.46f, 16.5f, 13.0f);
        b.curveToRelative(0.0f, 2.16f, -0.78f, 4.76f, -1.36f, 6.35f);
        b.curveTo(15.0f, 19.74f, 14.63f, 20.0f, 14.21f, 20.0f);
        b.lineToRelative(-4.41f, 0.0f);
        b.curveToRelative(-0.42f, 0.0f, -0.8f, -0.26f, -0.94f, -0.65f);
        b.curveTo(8.28f, 17.76f, 7.5f, 15.16f, 7.5f, 13.0f);
        b.curveTo(7.5f, 6.46f, 10.19f, 3.75f, 11.41f, 2.87f);
        b.close();
        b.moveTo(14.0f, 11.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f);
        b.close();
        b.moveTo(7.69f, 20.52f);
        b.curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f);
        b.lineToRelative(-1.13f, 0.75f);
        b.curveTo(4.33f, 14.78f, 4.0f, 15.4f, 4.0f, 16.07f);
        b.verticalLineToRelative(4.45f);
        b.curveToRelative(0.0f, 0.71f, 0.71f, 1.19f, 1.37f, 0.93f);
        uo.l(b, 7.69f, 20.52f, 20.0f, 20.52f);
        b.verticalLineToRelative(-4.45f);
        b.curveToRelative(0.0f, -0.67f, -0.33f, -1.29f, -0.89f, -1.66f);
        b.lineToRelative(-1.13f, -0.75f);
        b.curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f);
        b.lineToRelative(2.32f, 0.93f);
        b.curveTo(19.29f, 21.71f, 20.0f, 21.23f, 20.0f, 20.52f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocket = build;
        build.getClass();
        return build;
    }
}
