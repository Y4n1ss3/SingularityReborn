package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.Sharp sharp) {
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Motorcycle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(19.44f, 9.03f, 15.41f, 5.0f, 11.0f);
        gy.C(p, 2.0f, 3.59f, 2.0f, 2.0f);
        p.horizontalLineTo(5.0f);
        p.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        p.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        p.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        p.horizontalLineToRelative(1.65f);
        p.lineToRelative(2.77f, -2.77f);
        p.curveToRelative(-0.21f, 0.54f, -0.32f, 1.14f, -0.32f, 1.77f);
        p.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        p.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        p.curveToRelative(0.0f, -2.65f, -1.97f, -4.77f, -4.56f, -4.97f);
        p.close();
        p.moveTo(7.82f, 15.0f);
        p.curveTo(7.4f, 16.15f, 6.28f, 17.0f, 5.0f, 17.0f);
        p.curveToRelative(-1.63f, 0.0f, -3.0f, -1.37f, -3.0f, -3.0f);
        p.reflectiveCurveToRelative(1.37f, -3.0f, 3.0f, -3.0f);
        p.curveToRelative(1.28f, 0.0f, 2.4f, 0.85f, 2.82f, 2.0f);
        p.horizontalLineTo(5.0f);
        p.verticalLineToRelative(2.0f);
        p.horizontalLineToRelative(2.82f);
        p.close();
        p.moveTo(19.0f, 17.0f);
        p.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        p.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        p.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(p, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = build;
        build.getClass();
        return build;
    }
}
