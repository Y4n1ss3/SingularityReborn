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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.Outlined outlined) {
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Motorcycle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(12.72f, 11.0f, -2.0f, 2.0f, -0.77f);
        b.lineToRelative(-0.25f, -0.69f);
        b.curveToRelative(-0.18f, -0.48f, -0.42f, -0.92f, -0.72f, -1.31f);
        b.horizontalLineToRelative(3.74f);
        b.moveToRelative(2.69f, -6.0f);
        b.horizontalLineTo(11.0f);
        gy.C(b, 2.0f, 3.59f, 2.0f, 2.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        b.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        b.horizontalLineToRelative(1.65f);
        b.lineToRelative(2.77f, -2.77f);
        b.curveToRelative(-0.21f, 0.54f, -0.32f, 1.14f, -0.32f, 1.77f);
        b.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        b.curveToRelative(0.0f, -2.65f, -1.97f, -4.77f, -4.56f, -4.97f);
        uo.l(b, 15.41f, 5.0f, 19.0f, 17.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        b.close();
        b.moveTo(5.0f, 17.0f);
        b.curveToRelative(-1.63f, 0.0f, -3.0f, -1.37f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.37f, -3.0f, 3.0f, -3.0f);
        b.curveToRelative(1.28f, 0.0f, 2.4f, 0.85f, 2.82f, 2.0f);
        af0.u(b, 5.0f, 2.0f, 2.82f);
        b.curveTo(7.4f, 16.15f, 6.28f, 17.0f, 5.0f, 17.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = build;
        build.getClass();
        return build;
    }
}
