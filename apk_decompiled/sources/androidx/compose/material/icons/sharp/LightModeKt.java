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
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LightModeKt {
    private static ImageVector _lightMode;

    public static final ImageVector getLightMode(Icons.Sharp sharp) {
        ImageVector imageVector = _lightMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LightMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f);
        uo.l(b, 12.0f, 7.0f, 11.0f, 1.0f);
        bv.x(b, 4.0f, 2.0f, 1.0f);
        uo.l(b, 11.0f, 1.0f, 11.0f, 19.0f);
        kf0.z(b, 4.0f, 2.0f, -4.0f);
        uo.l(b, 11.0f, 19.0f, 23.0f, 11.0f);
        b.lineToRelative(-4.0f, 0.0f);
        uo.z(b, 2.0f, 4.0f, 0.0f, 11.0f);
        b.moveTo(5.0f, 11.0f);
        b.lineToRelative(-4.0f, 0.0f);
        b.lineToRelative(0.0f, 2.0f);
        gy.B(b, 4.0f, 0.0f, 5.0f, 11.0f);
        b.moveTo(16.24f, 17.66f);
        b.lineToRelative(2.47f, 2.47f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, -2.47f, -2.47f, 16.24f, 17.66f);
        b.moveTo(3.87f, 5.28f);
        b.lineToRelative(2.47f, 2.47f);
        b.lineToRelative(1.41f, -1.41f);
        r6.C(b, 5.28f, 3.87f, 3.87f, 5.28f);
        b.moveTo(6.34f, 16.24f);
        b.lineToRelative(-2.47f, 2.47f);
        b.lineToRelative(1.41f, 1.41f);
        gy.B(b, 2.47f, -2.47f, 6.34f, 16.24f);
        b.moveTo(18.72f, 3.87f);
        b.lineToRelative(-2.47f, 2.47f);
        b.lineToRelative(1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 2.47f, -2.47f, 18.72f, 3.87f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightMode = build;
        build.getClass();
        return build;
    }
}
