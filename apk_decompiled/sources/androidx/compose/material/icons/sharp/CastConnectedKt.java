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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastConnectedKt {
    private static ImageVector _castConnected;

    public static final ImageVector getCastConnected(Icons.Sharp sharp) {
        ImageVector imageVector = _castConnected;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CastConnected", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k4.r(m, 19.0f, 7.0f, 5.0f, 7.0f);
        m.verticalLineToRelative(1.63f);
        m.curveToRelative(3.96f, 1.28f, 7.09f, 4.41f, 8.37f, 8.37f);
        r6.C(m, 19.0f, 17.0f, 19.0f, 7.0f);
        m.moveTo(1.0f, 10.0f);
        m.verticalLineToRelative(2.0f);
        m.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        m.horizontalLineToRelative(2.0f);
        m.curveToRelative(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
        k4.r(m, 23.0f, 3.0f, 1.0f, 3.0f);
        uo.B(m, 5.0f, 2.0f, 3.0f, 5.0f);
        af0.v(m, 18.0f, 14.0f, -7.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(m, 9.0f, 23.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castConnected = build;
        build.getClass();
        return build;
    }
}
