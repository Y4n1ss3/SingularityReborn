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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RocketLaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(Icons.Filled filled) {
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RocketLaunch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.19f, 6.35f);
        b.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        b.lineTo(2.0f, 10.69f);
        b.lineToRelative(4.05f, -4.05f);
        b.curveToRelative(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
        r6.C(b, 9.19f, 6.35f, 9.19f, 6.35f);
        b.moveTo(11.17f, 17.0f);
        b.curveToRelative(0.0f, 0.0f, 3.74f, -1.55f, 5.89f, -3.7f);
        b.curveToRelative(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f);
        b.curveToRelative(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f);
        b.curveTo(8.55f, 9.09f, 7.0f, 12.83f, 7.0f, 12.83f);
        uo.l(b, 11.17f, 17.0f, 17.65f, 14.81f);
        b.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        b.lineTo(13.31f, 22.0f);
        b.lineToRelative(4.05f, -4.05f);
        b.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        r6.C(b, 17.65f, 14.81f, 17.65f, 14.81f);
        b.moveTo(9.0f, 18.0f);
        b.curveToRelative(0.0f, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f);
        b.curveTo(6.94f, 21.3f, 2.0f, 22.0f, 2.0f, 22.0f);
        b.reflectiveCurveToRelative(0.7f, -4.94f, 1.88f, -6.12f);
        b.curveTo(4.42f, 15.34f, 5.17f, 15.0f, 6.0f, 15.0f);
        b.curveTo(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f);
        b.close();
        b.moveTo(13.0f, 9.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.0f, 10.1f, 13.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocketLaunch = build;
        build.getClass();
        return build;
    }
}
