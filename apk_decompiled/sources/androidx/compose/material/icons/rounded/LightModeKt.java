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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LightModeKt {
    private static ImageVector _lightMode;

    public static final ImageVector getLightMode(Icons.Rounded rounded) {
        ImageVector imageVector = _lightMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LightMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f);
        uo.l(b, 12.0f, 7.0f, 2.0f, 13.0f);
        b.lineToRelative(2.0f, 0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.lineToRelative(-2.0f, 0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveTo(1.45f, 13.0f, 2.0f, 13.0f);
        k4.x(b, 20.0f, 13.0f, 2.0f, 0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.lineToRelative(-2.0f, 0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveTo(19.45f, 13.0f, 20.0f, 13.0f);
        bv.v(b, 11.0f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveTo(11.0f, 1.45f, 11.0f, 2.0f);
        bv.v(b, 11.0f, 20.0f, 2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.curveTo(11.45f, 19.0f, 11.0f, 19.45f, 11.0f, 20.0f);
        b.close();
        b.moveTo(5.99f, 4.58f);
        b.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        b.lineToRelative(1.06f, 1.06f);
        b.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
        b.reflectiveCurveToRelative(0.39f, -1.03f, 0.0f, -1.41f);
        uo.l(b, 5.99f, 4.58f, 18.36f, 16.95f);
        b.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        b.lineToRelative(1.06f, 1.06f);
        b.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
        uo.l(b, 18.36f, 16.95f, 19.42f, 5.99f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
        b.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(-1.06f, 1.06f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        b.reflectiveCurveToRelative(1.03f, 0.39f, 1.41f, 0.0f);
        uo.l(b, 19.42f, 5.99f, 7.05f, 18.36f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.41f);
        b.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(-1.06f, 1.06f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.41f);
        b.reflectiveCurveToRelative(1.03f, 0.39f, 1.41f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 7.05f, 18.36f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightMode = build;
        build.getClass();
        return build;
    }
}
