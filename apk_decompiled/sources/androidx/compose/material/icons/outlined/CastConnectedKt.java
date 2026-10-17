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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastConnectedKt {
    private static ImageVector _castConnected;

    public static final ImageVector getCastConnected(Icons.Outlined outlined) {
        ImageVector imageVector = _castConnected;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CastConnected", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(1.0f, 18.0f, 3.0f, 3.0f);
        m.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        bv.v(m, 1.0f, 14.0f, 2.0f);
        m.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        m.horizontalLineToRelative(2.0f);
        m.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        bv.v(m, 1.0f, 10.0f, 2.0f);
        m.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        m.horizontalLineToRelative(2.0f);
        m.curveToRelative(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
        k4.r(m, 21.0f, 3.0f, 3.0f, 3.0f);
        m.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.B(m, 3.0f, 2.0f, 3.0f, 5.0f);
        af0.v(m, 18.0f, 14.0f, -7.0f, 2.0f);
        m.horizontalLineToRelative(7.0f);
        m.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        m.lineTo(23.0f, 5.0f);
        m.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.C(m, 5.0f, 7.0f, 2.0f, 12.0f);
        r6.D(m, 6.0f, -3.0f, 2.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(m, 19.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castConnected = build;
        build.getClass();
        return build;
    }
}
