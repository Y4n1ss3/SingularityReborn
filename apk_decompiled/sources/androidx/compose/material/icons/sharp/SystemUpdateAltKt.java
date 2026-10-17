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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SystemUpdateAltKt {
    private static ImageVector _systemUpdateAlt;

    public static final ImageVector getSystemUpdateAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _systemUpdateAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SystemUpdateAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(12.0f, 16.0f, 4.0f, -4.0f, -3.0f);
        fc.w(b, 13.0f, 3.0f, -2.0f, 9.0f);
        bv.o(b, 8.0f, 12.0f, 4.0f, 4.0f);
        k4.C(b, 21.0f, 3.0f, -6.0f, 1.99f);
        bv.C(b, 6.0f, 14.03f, 3.0f, 19.02f);
        b.lineTo(3.0f, 4.99f);
        b.horizontalLineToRelative(6.0f);
        b.lineTo(9.0f, 3.0f);
        b.lineTo(3.0f, 3.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(14.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(18.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(23.0f, 5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(b, 12.0f, 16.0f, 4.0f, -4.0f);
        uo.n(b, -3.0f, 13.0f, 3.0f, -2.0f);
        b.verticalLineToRelative(9.0f);
        bv.o(b, 8.0f, 12.0f, 4.0f, 4.0f);
        k4.C(b, 23.0f, 3.0f, -8.0f, 1.99f);
        bv.C(b, 6.0f, 14.03f, 3.0f, 19.02f);
        b.lineTo(3.0f, 4.99f);
        b.horizontalLineToRelative(6.0f);
        b.lineTo(9.0f, 3.0f);
        af0.m(b, 1.0f, 3.0f, 18.0f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 23.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _systemUpdateAlt = build;
        build.getClass();
        return build;
    }
}
