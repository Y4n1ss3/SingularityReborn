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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CabinKt {
    private static ImageVector _cabin;

    public static final ImageVector getCabin(Icons.Rounded rounded) {
        ImageVector imageVector = _cabin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cabin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.37f, 3.55f);
        b.curveTo(4.89f, 2.62f, 5.87f, 2.0f, 7.0f, 2.0f);
        b.curveToRelative(0.38f, 0.0f, 0.72f, -0.22f, 0.89f, -0.53f);
        b.curveTo(8.04f, 1.16f, 8.39f, 1.0f, 8.73f, 1.0f);
        b.curveToRelative(0.74f, 0.0f, 1.26f, 0.8f, 0.9f, 1.45f);
        b.curveTo(9.11f, 3.38f, 8.13f, 4.0f, 7.0f, 4.0f);
        b.curveTo(6.62f, 4.0f, 6.28f, 4.22f, 6.11f, 4.53f);
        b.curveTo(5.96f, 4.84f, 5.61f, 5.0f, 5.27f, 5.0f);
        b.curveTo(4.53f, 5.0f, 4.01f, 4.2f, 4.37f, 3.55f);
        b.close();
        b.moveTo(22.39f, 12.19f);
        b.curveToRelative(-0.34f, 0.44f, -0.96f, 0.52f, -1.4f, 0.19f);
        b.lineTo(20.0f, 11.62f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-8.38f);
        b.lineToRelative(-0.99f, 0.76f);
        b.curveToRelative(-0.44f, 0.34f, -1.07f, 0.25f, -1.4f, -0.19f);
        b.curveToRelative(-0.33f, -0.44f, -0.25f, -1.07f, 0.19f, -1.4f);
        b.lineTo(4.0f, 9.11f);
        b.verticalLineTo(7.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(0.58f);
        b.lineToRelative(5.39f, -4.12f);
        b.curveToRelative(0.36f, -0.27f, 0.86f, -0.27f, 1.21f, 0.0f);
        b.lineToRelative(9.6f, 7.33f);
        b.curveTo(22.64f, 11.13f, 22.73f, 11.76f, 22.39f, 12.19f);
        af0.l(b, 10.06f, 7.0f, 3.89f);
        r6.C(b, 12.0f, 5.52f, 10.06f, 7.0f);
        kp0.t(b, 6.0f, 10.1f, 11.0f, 12.0f);
        kf0.s(b, -0.9f, 16.56f, 9.0f, 7.44f);
        uo.l(b, 6.0f, 10.1f, 6.0f, 13.0f);
        fc.y(b, 2.0f, 12.0f, -2.0f, 6.0f);
        uf.D(b, 18.0f, 19.0f, -2.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(b, 2.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cabin = build;
        build.getClass();
        return build;
    }
}
