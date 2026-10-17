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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FreeCancellationKt {
    private static ImageVector _freeCancellation;

    public static final ImageVector getFreeCancellation(Icons.Outlined outlined) {
        ImageVector imageVector = _freeCancellation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FreeCancellation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(11.21f, 20.0f, 5.0f, 10.0f, 14.0f);
        k4.z(f, 4.38f, 2.0f, -2.0f, 6.0f);
        f.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.q(f, -1.0f, 2.0f, -2.0f, 2.0f);
        gy.x(f, 8.0f, 2.0f, 6.0f, 2.0f);
        f.horizontalLineTo(5.0f);
        f.curveTo(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        f.lineTo(3.0f, 20.0f);
        f.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        gy.n(f, 8.21f, 11.21f, 20.0f);
        k4.C(f, 5.0f, 6.0f, 14.0f, 2.0f);
        bv.s(f, 5.0f, 6.0f, 16.54f, 22.5f);
        f.lineTo(13.0f, 18.96f);
        f.lineToRelative(1.41f, -1.41f);
        f.lineToRelative(2.12f, 2.12f);
        f.lineToRelative(4.24f, -4.24f);
        gy.B(f, 1.41f, 1.41f, 16.54f, 22.5f);
        f.moveTo(10.41f, 14.0f);
        f.lineTo(12.0f, 15.59f);
        f.lineTo(10.59f, 17.0f);
        f.lineTo(9.0f, 15.41f);
        f.lineTo(7.41f, 17.0f);
        f.lineTo(6.0f, 15.59f);
        f.lineTo(7.59f, 14.0f);
        f.lineTo(6.0f, 12.41f);
        f.lineTo(7.41f, 11.0f);
        f.lineTo(9.0f, 12.59f);
        f.lineTo(10.59f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(f, 12.0f, 12.41f, 10.41f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _freeCancellation = build;
        build.getClass();
        return build;
    }
}
