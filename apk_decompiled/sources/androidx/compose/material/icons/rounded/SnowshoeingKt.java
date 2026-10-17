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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnowshoeingKt {
    private static ImageVector _snowshoeing;

    public static final ImageVector getSnowshoeing(Icons.Rounded rounded) {
        ImageVector imageVector = _snowshoeing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Snowshoeing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 3.5f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(12.5f, 4.6f, 12.5f, 3.5f);
        b.close();
        b.moveTo(20.0f, 11.91f);
        b.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f);
        b.curveToRelative(-1.53f, -0.25f, -2.79f, -1.16f, -3.47f, -2.35f);
        b.lineToRelative(-1.0f, -1.58f);
        b.curveToRelative(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        b.curveToRelative(-0.68f, 0.0f, -1.28f, 0.28f, -4.77f, 1.76f);
        b.curveTo(7.49f, 8.07f, 7.0f, 8.8f, 7.0f, 9.6f);
        b.verticalLineTo(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(9.58f);
        b.lineToRelative(1.79f, -0.7f);
        b.lineTo(9.2f, 17.0f);
        b.lineToRelative(-2.88f, 2.03f);
        b.lineToRelative(-1.14f, -1.47f);
        b.lineTo(4.0f, 18.5f);
        b.lineToRelative(2.38f, 3.04f);
        b.curveToRelative(0.51f, 0.65f, 1.16f, 1.15f, 1.88f, 1.41f);
        b.curveToRelative(0.28f, 0.1f, 0.53f, 0.04f, 0.72f, -0.11f);
        b.curveToRelative(0.3f, -0.23f, 0.42f, -0.7f, 0.12f, -1.07f);
        b.curveToRelative(-0.08f, -0.1f, -0.2f, -0.17f, -0.31f, -0.22f);
        b.curveToRelative(-0.43f, -0.18f, -0.82f, -0.45f, -1.14f, -0.83f);
        b.lineToRelative(-0.08f, -0.1f);
        b.lineToRelative(2.85f, -2.01f);
        b.curveToRelative(0.38f, -0.27f, 0.65f, -0.66f, 0.77f, -1.1f);
        b.lineToRelative(0.7f, -2.53f);
        r6.A(b, 2.11f, 2.0f, 4.52f, -2.0f);
        b.verticalLineTo(23.0f);
        b.horizontalLineToRelative(3.87f);
        b.curveToRelative(0.82f, 0.0f, 1.61f, -0.21f, 2.26f, -0.61f);
        b.curveToRelative(0.26f, -0.16f, 0.37f, -0.39f, 0.37f, -0.64f);
        b.curveToRelative(0.0f, -0.38f, -0.3f, -0.75f, -0.77f, -0.75f);
        b.curveToRelative(-0.13f, 0.0f, -0.26f, 0.04f, -0.37f, 0.1f);
        b.curveToRelative(-0.4f, 0.23f, -0.87f, 0.37f, -1.36f, 0.4f);
        b.lineToRelative(0.0f, -5.16f);
        b.curveToRelative(0.0f, -0.55f, -0.23f, -1.07f, -0.62f, -1.45f);
        b.lineToRelative(-1.49f, -1.41f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.07f, 1.24f, 2.63f, 2.15f, 4.37f, 2.43f);
        b.curveTo(19.46f, 13.01f, 20.0f, 12.52f, 20.0f, 11.91f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowshoeing = build;
        build.getClass();
        return build;
    }
}
