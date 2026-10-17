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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness4Kt {
    private static ImageVector _brightness4;

    public static final ImageVector getBrightness4(Icons.Rounded rounded) {
        ImageVector imageVector = _brightness4;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness4", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(22.6f, 11.29f, 20.0f, 8.69f, 5.0f);
        u.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        u.horizontalLineToRelative(-3.69f);
        u.lineToRelative(-2.6f, -2.6f);
        u.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        u.lineTo(8.69f, 4.0f);
        u.horizontalLineTo(5.0f);
        u.curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f);
        u.verticalLineToRelative(3.69f);
        u.lineToRelative(-2.6f, 2.6f);
        u.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        u.lineTo(4.0f, 15.3f);
        u.verticalLineTo(19.0f);
        u.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        u.horizontalLineToRelative(3.69f);
        u.lineToRelative(2.6f, 2.6f);
        u.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        u.lineToRelative(2.6f, -2.6f);
        u.horizontalLineTo(19.0f);
        u.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        u.verticalLineToRelative(-3.69f);
        u.lineToRelative(2.6f, -2.6f);
        u.curveTo(22.99f, 12.32f, 22.99f, 11.68f, 22.6f, 11.29f);
        u.close();
        u.moveTo(17.92f, 12.98f);
        u.curveToRelative(-0.34f, 2.12f, -1.85f, 3.94f, -3.88f, 4.66f);
        u.curveToRelative(-1.21f, 0.43f, -2.41f, 0.45f, -3.5f, 0.18f);
        u.curveToRelative(-0.41f, -0.1f, -0.48f, -0.65f, -0.13f, -0.9f);
        u.curveTo(11.98f, 15.84f, 13.0f, 14.04f, 13.0f, 12.0f);
        u.reflectiveCurveToRelative(-1.02f, -3.84f, -2.58f, -4.92f);
        u.curveToRelative(-0.35f, -0.24f, -0.29f, -0.79f, 0.13f, -0.9f);
        u.curveToRelative(1.09f, -0.27f, 2.29f, -0.25f, 3.5f, 0.18f);
        u.curveToRelative(2.02f, 0.72f, 3.54f, 2.54f, 3.88f, 4.66f);
        u.curveTo(17.98f, 11.35f, 18.0f, 11.68f, 18.0f, 12.0f);
        u.curveTo(17.99f, 12.32f, 17.97f, 12.65f, 17.92f, 12.98f);
        u.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, u.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness4 = build;
        build.getClass();
        return build;
    }
}
