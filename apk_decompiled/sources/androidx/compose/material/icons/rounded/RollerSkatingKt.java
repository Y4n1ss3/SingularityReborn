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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RollerSkatingKt {
    private static ImageVector _rollerSkating;

    public static final ImageVector getRollerSkating(Icons.Rounded rounded) {
        ImageVector imageVector = _rollerSkating;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RollerSkating", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 16.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineToRelative(0.0f, -0.88f);
        b.curveToRelative(0.0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f);
        b.lineToRelative(-2.7f, -0.67f);
        b.curveTo(13.4f, 8.35f, 12.7f, 7.76f, 12.32f, 7.0f);
        b.horizontalLineTo(9.5f);
        b.curveTo(9.22f, 7.0f, 9.0f, 6.78f, 9.0f, 6.5f);
        b.reflectiveCurveTo(9.22f, 6.0f, 9.5f, 6.0f);
        kf0.A(b, 2.52f, 12.0f, 5.0f, 9.5f);
        b.curveTo(9.22f, 5.0f, 9.0f, 4.78f, 9.0f, 4.5f);
        b.curveTo(9.0f, 4.22f, 9.22f, 4.0f, 9.5f, 4.0f);
        b.horizontalLineTo(12.0f);
        b.verticalLineTo(3.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(6.0f);
        b.curveTo(4.9f, 1.0f, 4.0f, 1.9f, 4.0f, 3.0f);
        b.verticalLineToRelative(11.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.w(b, 18.0f, 5.0f, 23.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        b.reflectiveCurveTo(6.66f, 23.0f, 5.0f, 23.0f);
        b.close();
        b.moveTo(19.0f, 23.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        b.reflectiveCurveTo(20.66f, 23.0f, 19.0f, 23.0f);
        b.close();
        b.moveTo(12.0f, 23.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.66f, 23.0f, 12.0f, 23.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rollerSkating = build;
        build.getClass();
        return build;
    }
}
