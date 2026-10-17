package androidx.compose.material.icons.filled;

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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.Filled filled) {
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ChangeCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        bv.v(b, 12.06f, 19.0f, -2.01f);
        b.curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f);
        b.curveToRelative(-1.28f, 0.0f, -2.56f, -0.49f, -3.54f, -1.46f);
        b.curveToRelative(-1.71f, -1.71f, -1.92f, -4.35f, -0.64f, -6.29f);
        b.lineToRelative(1.1f, 1.1f);
        b.curveToRelative(-0.71f, 1.33f, -0.53f, 3.01f, 0.59f, 4.13f);
        b.curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f);
        b.verticalLineToRelative(-2.14f);
        gy.B(b, 2.83f, 2.83f, 12.06f, 19.0f);
        b.moveTo(16.17f, 14.76f);
        b.lineToRelative(-1.1f, -1.1f);
        b.curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f);
        b.curveTo(13.79f, 8.84f, 12.9f, 8.5f, 12.0f, 8.5f);
        b.curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f);
        b.verticalLineToRelative(2.15f);
        b.lineTo(9.11f, 7.83f);
        b.lineTo(11.94f, 5.0f);
        b.verticalLineToRelative(2.02f);
        b.curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f);
        b.curveTo(17.24f, 10.17f, 17.45f, 12.82f, 16.17f, 14.76f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeCircle = build;
        build.getClass();
        return build;
    }
}
