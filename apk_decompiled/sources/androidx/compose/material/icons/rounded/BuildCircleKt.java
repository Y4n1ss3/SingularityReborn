package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BuildCircleKt {
    private static ImageVector _buildCircle;

    public static final ImageVector getBuildCircle(Icons.Rounded rounded) {
        ImageVector imageVector = _buildCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BuildCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 16.54f, 15.85f, -0.69f, 0.69f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.lineToRelative(-3.05f, -3.05f);
        b.curveToRelative(-1.22f, 0.43f, -2.64f, 0.17f, -3.62f, -0.81f);
        b.curveToRelative(-1.11f, -1.11f, -1.3f, -2.79f, -0.59f, -4.1f);
        b.lineToRelative(2.35f, 2.35f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineTo(8.58f, 7.17f);
        b.curveToRelative(1.32f, -0.71f, 2.99f, -0.52f, 4.1f, 0.59f);
        b.curveToRelative(0.98f, 0.98f, 1.24f, 2.4f, 0.81f, 3.62f);
        b.lineToRelative(3.05f, 3.05f);
        b.curveTo(16.93f, 14.82f, 16.93f, 15.46f, 16.54f, 15.85f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _buildCircle = build;
        build.getClass();
        return build;
    }
}
