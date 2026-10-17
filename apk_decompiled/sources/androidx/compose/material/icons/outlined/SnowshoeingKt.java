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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnowshoeingKt {
    private static ImageVector _snowshoeing;

    public static final ImageVector getSnowshoeing(Icons.Outlined outlined) {
        ImageVector imageVector = _snowshoeing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Snowshoeing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 3.5f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(12.5f, 4.6f, 12.5f, 3.5f);
        k4.x(b, 6.32f, 19.03f, -1.14f, -1.47f);
        b.lineTo(4.0f, 18.5f);
        b.lineToRelative(2.38f, 3.04f);
        b.curveToRelative(0.51f, 0.65f, 1.16f, 1.15f, 1.88f, 1.41f);
        b.curveToRelative(0.28f, 0.1f, 0.53f, 0.04f, 0.72f, -0.11f);
        b.curveToRelative(0.3f, -0.23f, 0.42f, -0.7f, 0.12f, -1.07f);
        b.curveToRelative(-0.08f, -0.1f, -0.2f, -0.17f, -0.31f, -0.22f);
        b.curveToRelative(-0.43f, -0.18f, -0.82f, -0.45f, -1.14f, -0.83f);
        b.lineToRelative(-0.08f, -0.1f);
        b.lineTo(11.0f, 18.2f);
        b.lineToRelative(0.89f, -3.22f);
        r6.A(b, 2.11f, 2.0f, 4.52f, -2.0f);
        b.verticalLineTo(23.0f);
        b.horizontalLineToRelative(3.87f);
        b.curveToRelative(0.82f, 0.0f, 1.61f, -0.21f, 2.26f, -0.61f);
        b.curveToRelative(0.26f, -0.16f, 0.37f, -0.39f, 0.37f, -0.64f);
        b.curveToRelative(0.0f, -0.38f, -0.3f, -0.75f, -0.77f, -0.75f);
        b.curveToRelative(-0.13f, 0.0f, -0.26f, 0.04f, -0.37f, 0.1f);
        b.curveToRelative(-0.4f, 0.23f, -0.87f, 0.37f, -1.36f, 0.4f);
        b.lineToRelative(0.0f, -6.02f);
        b.lineToRelative(-2.11f, -2.0f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveTo(15.79f, 11.98f, 17.8f, 13.0f, 20.0f, 13.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-1.9f, 0.0f, -3.51f, -1.02f, -4.31f, -2.42f);
        b.lineToRelative(-1.0f, -1.58f);
        b.curveToRelative(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        b.curveTo(12.24f, 6.0f, 11.58f, 6.34f, 7.0f, 8.28f);
        uf.z(b, 13.0f, 2.0f, 9.58f);
        b.lineToRelative(1.79f, -0.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 9.2f, 17.0f, 6.32f, 19.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowshoeing = build;
        build.getClass();
        return build;
    }
}
