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
import defpackage.af0;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CakeKt {
    private static ImageVector _cake;

    public static final ImageVector getCake(Icons.Rounded rounded) {
        ImageVector imageVector = _cake;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cake", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.68f, 5.88f);
        b.curveToRelative(0.7f, -0.24f, 1.22f, -0.9f, 1.3f, -1.64f);
        b.curveToRelative(0.05f, -0.47f, -0.05f, -0.91f, -0.28f, -1.27f);
        b.lineTo(12.42f, 0.75f);
        b.curveToRelative(-0.19f, -0.33f, -0.67f, -0.33f, -0.87f, 0.0f);
        b.lineToRelative(-1.28f, 2.22f);
        b.curveToRelative(-0.17f, 0.3f, -0.27f, 0.65f, -0.27f, 1.03f);
        b.curveToRelative(0.0f, 1.32f, 1.3f, 2.35f, 2.68f, 1.88f);
        k4.x(b, 16.53f, 15.92f, -1.0f, -1.0f);
        b.lineToRelative(-1.08f, 1.07f);
        b.curveToRelative(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0.0f);
        b.lineToRelative(-1.07f, -1.07f);
        b.lineToRelative(-1.09f, 1.07f);
        b.curveTo(6.75f, 16.64f, 5.88f, 17.0f, 4.96f, 17.0f);
        b.curveToRelative(-0.73f, 0.0f, -1.4f, -0.23f, -1.96f, -0.61f);
        b.lineTo(3.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-3.61f);
        b.curveToRelative(-0.75f, 0.51f, -1.71f, 0.75f, -2.74f, 0.52f);
        b.curveToRelative(-0.66f, -0.14f, -1.25f, -0.51f, -1.73f, -0.99f);
        af0.l(b, 18.0f, 9.0f, -5.0f);
        b.lineTo(13.0f, 8.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.0f);
        b.lineTo(6.0f, 9.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.verticalLineToRelative(1.46f);
        b.curveToRelative(0.0f, 0.85f, 0.5f, 1.67f, 1.31f, 1.94f);
        b.curveToRelative(0.73f, 0.24f, 1.52f, 0.06f, 2.03f, -0.46f);
        b.lineToRelative(2.14f, -2.13f);
        b.lineToRelative(2.13f, 2.13f);
        b.curveToRelative(0.76f, 0.76f, 2.01f, 0.76f, 2.77f, 0.0f);
        b.lineToRelative(2.14f, -2.13f);
        b.lineToRelative(2.13f, 2.13f);
        b.curveToRelative(0.43f, 0.43f, 1.03f, 0.63f, 1.65f, 0.55f);
        b.curveToRelative(0.99f, -0.13f, 1.69f, -1.06f, 1.69f, -2.06f);
        b.verticalLineToRelative(-1.42f);
        b.curveTo(21.0f, 10.34f, 19.66f, 9.0f, 18.0f, 9.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cake = build;
        build.getClass();
        return build;
    }
}
