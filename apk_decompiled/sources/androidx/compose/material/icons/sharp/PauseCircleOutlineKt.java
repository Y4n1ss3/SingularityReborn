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
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PauseCircleOutlineKt {
    private static ImageVector _pauseCircleOutline;

    public static final ImageVector getPauseCircleOutline(Icons.Sharp sharp) {
        ImageVector imageVector = _pauseCircleOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PauseCircleOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(9.0f, 16.0f, 2.0f, 11.0f, 8.0f);
        bv.r(p, 9.0f, 8.0f, 8.0f);
        p.moveTo(12.0f, 2.0f);
        p.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        p.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        p.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        p.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        p.close();
        p.moveTo(12.0f, 20.0f);
        p.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        p.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        p.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        p.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        af0.l(p, 13.0f, 16.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(p, 15.0f, 8.0f, -2.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pauseCircleOutline = build;
        build.getClass();
        return build;
    }
}
