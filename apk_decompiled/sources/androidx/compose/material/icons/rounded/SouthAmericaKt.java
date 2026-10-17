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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SouthAmericaKt {
    private static ImageVector _southAmerica;

    public static final ImageVector getSouthAmerica(Icons.Rounded rounded) {
        ImageVector imageVector = _southAmerica;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SouthAmerica", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.moveTo(4.0f, 12.0f);
        b.curveToRelative(0.0f, -1.95f, 0.7f, -3.74f, 1.87f, -5.13f);
        b.lineTo(9.0f, 10.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.verticalLineToRelative(5.59f);
        b.curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f);
        b.lineTo(12.0f, 20.0f);
        b.curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f);
        bv.g(b, 13.0f, 19.94f, 18.0f);
        b.lineToRelative(3.75f, -5.62f);
        b.curveToRelative(0.16f, -0.25f, 0.25f, -0.54f, 0.25f, -0.83f);
        b.verticalLineTo(10.5f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-1.5f);
        b.lineToRelative(-1.4f, -1.75f);
        b.curveTo(12.72f, 7.28f, 12.15f, 7.0f, 11.54f, 7.0f);
        b.horizontalLineTo(8.0f);
        b.verticalLineTo(5.07f);
        b.curveTo(9.18f, 4.39f, 10.54f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b.curveTo(20.0f, 16.07f, 16.94f, 19.44f, 13.0f, 19.94f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _southAmerica = build;
        build.getClass();
        return build;
    }
}
