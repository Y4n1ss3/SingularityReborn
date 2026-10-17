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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CottageKt {
    private static ImageVector _cottage;

    public static final ImageVector getCottage(Icons.Rounded rounded) {
        ImageVector imageVector = _cottage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cottage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.39f, 12.19f);
        b.curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.19f, -1.4f);
        b.lineToRelative(-9.6f, -7.33f);
        b.curveToRelative(-0.36f, -0.27f, -0.86f, -0.27f, -1.21f, 0.0f);
        b.lineTo(6.0f, 7.58f);
        b.verticalLineTo(7.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveTo(4.0f, 6.45f, 4.0f, 7.0f);
        b.verticalLineToRelative(2.11f);
        b.lineToRelative(-2.21f, 1.68f);
        b.curveToRelative(-0.44f, 0.33f, -0.52f, 0.96f, -0.19f, 1.4f);
        b.curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.19f);
        b.lineTo(4.0f, 11.62f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(6.0f);
        b.verticalLineToRelative(-5.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(5.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-8.38f);
        b.lineToRelative(0.99f, 0.76f);
        b.curveTo(21.43f, 12.72f, 22.06f, 12.63f, 22.39f, 12.19f);
        b.close();
        b.moveTo(5.27f, 5.0f);
        b.curveToRelative(-0.74f, 0.0f, -1.26f, -0.8f, -0.9f, -1.45f);
        b.curveTo(4.89f, 2.62f, 5.87f, 2.0f, 7.0f, 2.0f);
        b.curveToRelative(0.38f, 0.0f, 0.72f, -0.22f, 0.89f, -0.53f);
        b.curveTo(8.04f, 1.16f, 8.39f, 1.0f, 8.73f, 1.0f);
        b.curveToRelative(0.74f, 0.0f, 1.26f, 0.8f, 0.9f, 1.45f);
        b.curveTo(9.11f, 3.38f, 8.13f, 4.0f, 7.0f, 4.0f);
        b.curveTo(6.62f, 4.0f, 6.28f, 4.22f, 6.11f, 4.53f);
        b.curveTo(5.96f, 4.84f, 5.61f, 5.0f, 5.27f, 5.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cottage = build;
        build.getClass();
        return build;
    }
}
