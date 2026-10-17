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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlenderKt {
    private static ImageVector _blender;

    public static final ImageVector getBlender(Icons.Rounded rounded) {
        ImageVector imageVector = _blender;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Blender", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.13f, 15.13f, 1.69f, -10.98f);
        e.curveTo(17.92f, 3.55f, 17.45f, 3.0f, 16.83f, 3.0f);
        e.horizontalLineTo(14.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-2.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(0.0f);
        e.horizontalLineTo(5.0f);
        e.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        e.verticalLineToRelative(4.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(2.23f);
        e.lineToRelative(0.64f, 4.13f);
        e.curveTo(6.74f, 16.05f, 6.0f, 17.43f, 6.0f, 19.0f);
        e.verticalLineToRelative(1.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(8.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-1.0f);
        e.curveTo(18.0f, 17.43f, 17.26f, 16.05f, 16.13f, 15.13f);
        fc.A(e, 5.0f, 9.0f, 5.0f, 1.31f);
        gy.w(e, 0.62f, 4.0f, 5.0f);
        e.moveTo(12.0f, 19.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveTo(12.55f, 19.0f, 12.0f, 19.0f);
        r6.g(e, 14.29f, 14.0f, 9.72f);
        e.lineTo(8.33f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(e, 7.34f, 14.29f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blender = build;
        build.getClass();
        return build;
    }
}
