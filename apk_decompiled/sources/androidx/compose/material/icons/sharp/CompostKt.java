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
public final class CompostKt {
    private static ImageVector _compost;

    public static final ImageVector getCompost(Icons.Sharp sharp) {
        ImageVector imageVector = _compost;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Compost", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.87f, 11.81f);
        b.curveToRelative(-0.23f, -0.38f, -0.37f, -0.83f, -0.37f, -1.31f);
        b.curveTo(12.5f, 9.12f, 13.62f, 8.0f, 15.0f, 8.0f);
        b.lineToRelative(1.0f, 0.0f);
        b.curveToRelative(1.51f, 0.0f, 2.0f, -1.0f, 2.0f, -1.0f);
        b.reflectiveCurveToRelative(0.55f, 6.0f, -3.0f, 6.0f);
        b.curveToRelative(-0.49f, 0.0f, -0.94f, -0.14f, -1.32f, -0.38f);
        b.curveToRelative(-0.24f, 0.64f, -0.59f, 1.76f, -0.76f, 2.96f);
        b.curveToRelative(1.26f, 0.22f, 2.28f, 0.89f, 2.77f, 1.77f);
        b.curveToRelative(1.69f, -1.17f, 2.81f, -3.13f, 2.81f, -5.35f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 5.24f, -4.26f, 9.5f, -9.5f, 9.5f);
        b.reflectiveCurveTo(2.5f, 17.24f, 2.5f, 12.0f);
        b.reflectiveCurveTo(6.76f, 2.5f, 12.0f, 2.5f);
        b.verticalLineTo(0.0f);
        b.lineToRelative(4.0f, 4.0f);
        b.lineToRelative(-4.0f, 4.0f);
        b.verticalLineTo(5.5f);
        b.curveToRelative(-3.58f, 0.0f, -6.5f, 2.92f, -6.5f, 6.5f);
        b.curveToRelative(0.0f, 2.21f, 1.11f, 4.17f, 2.81f, 5.35f);
        b.curveToRelative(0.51f, -0.92f, 1.63f, -1.62f, 2.98f, -1.8f);
        b.curveToRelative(-0.09f, -0.69f, -0.26f, -1.42f, -0.49f, -2.03f);
        b.curveTo(10.45f, 13.82f, 10.0f, 14.0f, 9.5f, 14.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineToRelative(-0.99f);
        b.curveToRelative(0.0f, -0.56f, -0.19f, -1.09f, -0.5f, -1.51f);
        b.curveToRelative(0.0f, 0.0f, 4.45f, -0.23f, 4.5f, 2.5f);
        b.curveToRelative(0.0f, 0.29f, -0.06f, 0.56f, -0.17f, 0.8f);
        b.curveTo(10.91f, 12.48f, 10.47f, 12.2f, 10.0f, 12.0f);
        b.curveToRelative(0.58f, 0.43f, 1.37f, 1.37f, 2.0f, 2.6f);
        b.curveToRelative(0.67f, -1.62f, 1.68f, -3.27f, 3.0f, -4.6f);
        b.curveTo(14.24f, 10.52f, 13.53f, 11.12f, 12.87f, 11.81f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compost = build;
        build.getClass();
        return build;
    }
}
