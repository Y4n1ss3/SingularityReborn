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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermCameraMicKt {
    private static ImageVector _permCameraMic;

    public static final ImageVector getPermCameraMic(Icons.Sharp sharp) {
        ImageVector imageVector = _permCameraMic;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PermCameraMic", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(22.0f, 5.0f, -5.17f, 15.0f, 3.0f);
        p.lineTo(9.0f, 3.0f);
        p.lineTo(7.17f, 5.0f);
        af0.m(p, 2.0f, 5.0f, 16.0f, 9.0f);
        p.verticalLineToRelative(-2.09f);
        p.curveToRelative(-2.83f, -0.48f, -5.0f, -2.94f, -5.0f, -5.91f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        p.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        p.lineTo(13.0f, 21.0f);
        gy.n(p, 9.0f, 22.0f, 5.0f);
        p.moveTo(14.0f, 13.0f);
        p.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        p.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        p.lineTo(10.0f, 9.0f);
        p.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        p.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permCameraMic = build;
        build.getClass();
        return build;
    }
}
