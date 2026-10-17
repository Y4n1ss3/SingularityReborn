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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RepeatOneOnKt {
    private static ImageVector _repeatOneOn;

    public static final ImageVector getRepeatOneOn(Icons.Rounded rounded) {
        ImageVector imageVector = _repeatOneOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RepeatOneOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(21.0f, 1.0f, 3.0f);
        d.curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f);
        d.verticalLineToRelative(18.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(3.0f);
        d.curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f);
        d.close();
        d.moveTo(19.0f, 18.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineTo(7.0f);
        d.verticalLineToRelative(1.79f);
        d.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.36f);
        d.lineToRelative(-2.79f, -2.79f);
        d.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        d.lineToRelative(2.79f, -2.79f);
        d.curveTo(6.46f, 14.54f, 7.0f, 14.76f, 7.0f, 15.21f);
        kf0.r(d, 17.0f, 10.0f, -3.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(d, 18.0f, 10.75f, 10.5f);
        d.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        d.reflectiveCurveTo(10.34f, 9.0f, 10.75f, 9.0f);
        d.horizontalLineToRelative(1.5f);
        d.curveTo(12.66f, 9.0f, 13.0f, 9.34f, 13.0f, 9.75f);
        d.verticalLineToRelative(4.5f);
        d.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        d.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        bv.z(d, 10.5f, 10.75f, 20.64f, 6.35f);
        d.lineToRelative(-2.79f, 2.79f);
        d.curveTo(17.54f, 9.46f, 17.0f, 9.24f, 17.0f, 8.79f);
        r6.v(d, 7.0f, 7.0f, 3.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineTo(6.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(11.0f);
        d.verticalLineTo(3.21f);
        d.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.36f);
        d.lineToRelative(2.79f, 2.79f);
        d.curveTo(20.84f, 5.84f, 20.84f, 6.15f, 20.64f, 6.35f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repeatOneOn = build;
        build.getClass();
        return build;
    }
}
