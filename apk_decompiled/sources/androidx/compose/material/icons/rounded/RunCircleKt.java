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
public final class RunCircleKt {
    private static ImageVector _runCircle;

    public static final ImageVector getRunCircle(Icons.Rounded rounded) {
        ImageVector imageVector = _runCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RunCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.moveTo(13.5f, 6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f);
        b.close();
        b.moveTo(15.41f, 11.91f);
        b.curveToRelative(-0.71f, -0.2f, -1.63f, -0.74f, -2.32f, -1.66f);
        b.lineToRelative(-0.41f, 2.35f);
        b.lineToRelative(1.19f, 1.3f);
        b.curveTo(13.95f, 13.98f, 14.0f, 14.1f, 14.0f, 14.22f);
        b.verticalLineToRelative(3.28f);
        b.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        b.verticalLineToRelative(-3.08f);
        b.lineToRelative(-1.11f, -1.21f);
        b.lineToRelative(-0.43f, 2.15f);
        b.curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f);
        b.lineToRelative(-2.78f, -0.57f);
        b.curveToRelative(-0.27f, -0.06f, -0.45f, -0.32f, -0.39f, -0.59f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.06f, -0.27f, 0.32f, -0.44f, 0.59f, -0.39f);
        b.lineToRelative(2.29f, 0.47f);
        b.lineToRelative(0.96f, -4.89f);
        b.lineTo(10.0f, 10.35f);
        b.verticalLineToRelative(1.15f);
        b.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        b.horizontalLineToRelative(0.0f);
        b.curveTo(9.22f, 12.0f, 9.0f, 11.78f, 9.0f, 11.5f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -0.21f, 0.13f, -0.4f, 0.33f, -0.47f);
        b.lineToRelative(2.95f, -1.09f);
        b.curveToRelative(0.49f, -0.18f, 1.02f, 0.04f, 1.25f, 0.51f);
        b.curveToRelative(0.65f, 1.35f, 1.55f, 1.85f, 2.1f, 2.0f);
        b.curveTo(15.85f, 11.0f, 16.0f, 11.18f, 16.0f, 11.4f);
        b.verticalLineToRelative(0.04f);
        b.curveTo(16.0f, 11.75f, 15.71f, 11.99f, 15.41f, 11.91f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runCircle = build;
        build.getClass();
        return build;
    }
}
