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
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsBoatKt {
    private static ImageVector _directionsBoat;

    public static final ImageVector getDirectionsBoat(Icons.Sharp sharp) {
        ImageVector imageVector = _directionsBoat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DirectionsBoat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 21.0f);
        b.curveToRelative(-1.39f, 0.0f, -2.78f, -0.47f, -4.0f, -1.32f);
        b.curveToRelative(-2.44f, 1.71f, -5.56f, 1.71f, -8.0f, 0.0f);
        b.curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f);
        af0.u(b, 2.0f, 2.0f, 2.0f);
        b.curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f);
        b.curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8.0f, 0.0f);
        b.curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f);
        j50.n(b, 2.0f, -2.0f, -2.0f);
        b.moveTo(3.95f, 19.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(1.6f, 0.0f, 3.02f, -0.88f, 4.0f, -2.0f);
        b.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        b.reflectiveCurveToRelative(3.02f, -0.88f, 4.0f, -2.0f);
        b.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        b.horizontalLineToRelative(0.05f);
        b.lineToRelative(2.18f, -7.65f);
        fc.u(b, -2.23f, -0.73f, 4.0f, -5.0f);
        b.verticalLineTo(1.0f);
        b.horizontalLineTo(9.0f);
        b.verticalLineToRelative(3.0f);
        b.horizontalLineTo(4.0f);
        b.verticalLineToRelative(6.62f);
        gy.B(b, -2.23f, 0.73f, 3.95f, 19.0f);
        k4.C(b, 6.0f, 6.0f, 12.0f, 3.97f);
        b.lineTo(12.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 6.0f, 9.97f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBoat = build;
        build.getClass();
        return build;
    }
}
