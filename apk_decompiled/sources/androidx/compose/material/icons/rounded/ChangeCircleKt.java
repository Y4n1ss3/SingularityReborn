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
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.Rounded rounded) {
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ChangeCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.moveTo(12.91f, 18.15f);
        b.curveToRelative(-0.31f, 0.31f, -0.85f, 0.09f, -0.85f, -0.35f);
        b.verticalLineToRelative(-0.8f);
        b.curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f);
        b.curveToRelative(-1.28f, 0.0f, -2.56f, -0.49f, -3.54f, -1.46f);
        b.curveToRelative(-1.43f, -1.43f, -1.81f, -3.52f, -1.14f, -5.3f);
        b.curveToRelative(0.19f, -0.51f, 0.86f, -0.64f, 1.24f, -0.25f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.22f, 0.22f, 0.27f, 0.54f, 0.17f, 0.82f);
        b.curveToRelative(-0.46f, 1.24f, -0.2f, 2.68f, 0.8f, 3.68f);
        b.curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f);
        b.verticalLineToRelative(-0.94f);
        b.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        b.lineToRelative(1.62f, 1.62f);
        b.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        uo.l(b, 12.91f, 18.15f, 15.44f, 14.02f);
        b.lineTo(15.44f, 14.02f);
        b.curveToRelative(-0.22f, -0.22f, -0.27f, -0.54f, -0.17f, -0.82f);
        b.curveToRelative(0.46f, -1.24f, 0.2f, -2.68f, -0.8f, -3.68f);
        b.curveToRelative(-0.7f, -0.7f, -1.62f, -1.04f, -2.53f, -1.02f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.verticalLineToRelative(0.94f);
        b.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        b.lineTo(9.46f, 8.18f);
        b.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        b.lineToRelative(1.62f, -1.62f);
        b.curveToRelative(0.31f, -0.31f, 0.85f, -0.09f, 0.85f, 0.35f);
        b.verticalLineToRelative(0.81f);
        b.curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f);
        b.curveToRelative(1.43f, 1.43f, 1.81f, 3.52f, 1.14f, 5.3f);
        b.curveTo(16.48f, 14.28f, 15.82f, 14.41f, 15.44f, 14.02f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeCircle = build;
        build.getClass();
        return build;
    }
}
