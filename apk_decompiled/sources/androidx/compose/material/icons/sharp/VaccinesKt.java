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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VaccinesKt {
    private static ImageVector _vaccines;

    public static final ImageVector getVaccines(Icons.Sharp sharp) {
        ImageVector imageVector = _vaccines;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Vaccines", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(12.0f, 5.5f, 8.0f, 4.0f, 1.5f);
        j50.B(f, 2.0f, -5.0f, 2.0f, 6.0f);
        r6.s(f, 1.5f, 2.0f, 2.0f);
        f.curveToRelative(0.0f, 0.0f, 0.45f, 0.0f, 1.0f, 0.0f);
        kf0.r(f, 17.0f, 3.0f, 4.0f);
        fc.u(f, 2.0f, 1.5f, 17.0f, 3.0f);
        f.verticalLineTo(7.5f);
        f.curveToRelative(0.55f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f);
        k4.B(f, 5.5f, 9.0f, 9.0f, 6.5f);
        gy.A(f, 1.5f, 9.0f, 12.0f, 6.5f);
        f.verticalLineToRelative(1.5f);
        f.horizontalLineTo(9.0f);
        f.lineTo(9.0f, 15.0f);
        uo.o(f, 5.0f, 7.5f, 4.0f, 9.0f);
        kp0.t(f, 19.5f, 10.5f, 10.0f, 1.0f);
        uo.u(f, 8.0f, -7.0f, -0.01f, 2.0f);
        f.horizontalLineToRelative(1.01f);
        f.verticalLineToRelative(0.5f);
        f.curveToRelative(0.0f, 0.5f, -1.5f, 1.16f, -1.5f, 3.0f);
        kf0.r(f, 22.0f, 8.0f, -8.5f);
        f.curveTo(21.0f, 11.66f, 19.5f, 11.0f, 19.5f, 10.5f);
        fc.A(f, 16.5f, 10.5f, 10.0f, 1.0f);
        f.verticalLineToRelative(0.5f);
        f.curveToRelative(0.0f, 1.6f, 1.5f, 2.0f, 1.5f, 3.0f);
        f.verticalLineTo(14.0f);
        f.horizontalLineToRelative(-4.0f);
        f.curveToRelative(0.0f, -0.21f, 0.0f, -0.39f, 0.0f, -0.5f);
        f.curveTo(15.0f, 12.5f, 16.5f, 12.1f, 16.5f, 10.5f);
        f.close();
        f.moveTo(15.0f, 20.0f);
        f.curveToRelative(0.0f, 0.0f, 0.0f, -0.63f, 0.0f, -1.5f);
        f.horizontalLineToRelative(4.0f);
        f.verticalLineTo(20.0f);
        f.horizontalLineTo(15.0f);
        f.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, f.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vaccines = build;
        build.getClass();
        return build;
    }
}
