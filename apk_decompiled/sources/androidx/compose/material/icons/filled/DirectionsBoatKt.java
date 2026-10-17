package androidx.compose.material.icons.filled;

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
import defpackage.bv;
import defpackage.j50;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsBoatKt {
    private static ImageVector _directionsBoat;

    public static final ImageVector getDirectionsBoat(Icons.Filled filled) {
        ImageVector imageVector = _directionsBoat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DirectionsBoat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.lineToRelative(1.89f, -6.68f);
        b.curveToRelative(0.08f, -0.26f, 0.06f, -0.54f, -0.06f, -0.78f);
        b.reflectiveCurveToRelative(-0.34f, -0.42f, -0.6f, -0.5f);
        b.lineTo(20.0f, 10.62f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.p(b, -3.0f, 1.0f, 9.0f, 3.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(4.62f);
        b.lineToRelative(-1.29f, 0.42f);
        b.curveToRelative(-0.26f, 0.08f, -0.48f, 0.26f, -0.6f, 0.5f);
        b.reflectiveCurveToRelative(-0.15f, 0.52f, -0.06f, 0.78f);
        uo.l(b, 3.95f, 19.0f, 6.0f, 6.0f);
        bv.C(b, 12.0f, 3.97f, 12.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 6.0f, 9.97f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBoat = build;
        build.getClass();
        return build;
    }
}
