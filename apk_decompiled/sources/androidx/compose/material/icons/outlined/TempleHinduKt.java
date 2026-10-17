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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TempleHinduKt {
    private static ImageVector _templeHindu;

    public static final ImageVector getTempleHindu(Icons.Outlined outlined) {
        ImageVector imageVector = _templeHindu;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TempleHindu", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(20.0f, 11.0f, 2.0f, -2.0f);
        fc.t(m, 15.0f, 3.0f, 1.0f, -2.0f);
        k4.l(m, 2.0f, -2.03f, 1.0f, -2.0f);
        kf0.s(m, 2.12f, 6.0f, 13.0f, 4.0f);
        af0.B(m, -2.0f, 2.0f, 11.0f, 9.0f);
        r6.D(m, -5.0f, 2.0f, 5.0f, 9.0f);
        bv.z(m, 11.0f, 20.0f, 15.31f, 11.0f);
        uo.g(m, 8.69f, 0.6f, -2.0f, 5.42f);
        uo.l(m, 15.31f, 11.0f, 14.11f, 7.0f);
        uo.g(m, 9.89f, 0.6f, -2.0f, 3.02f);
        uo.l(m, 14.11f, 7.0f, 20.0f, 20.0f);
        af0.z(m, -5.0f, -5.0f, 9.0f, 5.0f);
        af0.u(m, 4.0f, -5.0f, 3.49f);
        m.lineToRelative(0.6f, -2.0f);
        r6.t(m, 7.82f, 0.6f, 2.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(m, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _templeHindu = build;
        build.getClass();
        return build;
    }
}
