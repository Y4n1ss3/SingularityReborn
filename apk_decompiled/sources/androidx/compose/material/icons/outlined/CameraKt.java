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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Outlined outlined) {
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Camera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.25f, 2.26f, -0.08f, -0.04f);
        e.lineToRelative(-0.01f, 0.02f);
        e.curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f);
        e.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        e.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        e.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        e.curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f);
        af0.l(e, 19.41f, 9.0f, -7.99f);
        e.lineToRelative(2.71f, -4.7f);
        e.curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f);
        k4.r(e, 13.1f, 4.08f, 10.27f, 9.0f);
        e.lineToRelative(-1.15f, 2.0f);
        e.lineTo(6.4f, 6.3f);
        e.curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f);
        e.curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f);
        k4.r(e, 5.7f, 7.09f, 8.54f, 12.0f);
        e.lineToRelative(1.15f, 2.0f);
        e.lineTo(4.26f, 14.0f);
        e.curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        e.curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f);
        af0.l(e, 4.59f, 15.0f, 7.98f);
        e.lineToRelative(-2.71f, 4.7f);
        e.curveToRelative(-2.4f, -0.67f, -4.34f, -2.42f, -5.27f, -4.7f);
        k4.r(e, 10.9f, 19.91f, 14.89f, 13.0f);
        e.lineToRelative(2.72f, 4.7f);
        e.curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f);
        e.curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f);
        k4.x(e, 18.3f, 16.91f, -4.0f, -6.91f);
        e.horizontalLineToRelative(5.43f);
        e.curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f);
        e.curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = build;
        build.getClass();
        return build;
    }
}
