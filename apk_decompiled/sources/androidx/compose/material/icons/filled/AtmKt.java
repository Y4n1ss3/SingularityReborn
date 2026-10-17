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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AtmKt {
    private static ImageVector _atm;

    public static final ImageVector getAtm(Icons.Filled filled) {
        ImageVector imageVector = _atm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Atm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(8.0f, 9.0f, 1.5f, 2.25f);
        fc.w(m, 10.25f, 15.0f, 1.5f, -4.5f);
        r6.C(m, 14.0f, 10.5f, 14.0f, 9.0f);
        m.moveTo(6.0f, 9.0f);
        m.lineTo(3.0f, 9.0f);
        m.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        r6.D(m, 5.0f, 1.5f, -1.5f, 2.0f);
        m.lineTo(5.5f, 15.0f);
        m.lineTo(7.0f, 15.0f);
        m.verticalLineToRelative(-5.0f);
        m.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        r6.B(m, 5.5f, 12.0f, -2.0f, -1.5f);
        gy.n(m, 2.0f, 5.5f, 12.0f);
        m.moveTo(21.0f, 9.0f);
        m.horizontalLineToRelative(-4.5f);
        m.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        bv.q(m, 5.0f, 17.0f, 15.0f, -4.5f);
        uo.n(m, 1.0f, 18.0f, 14.0f, 1.5f);
        uo.B(m, -3.51f, 1.0f, 20.5f, 15.0f);
        m.lineTo(22.0f, 15.0f);
        m.verticalLineToRelative(-5.0f);
        m.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        m.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, m.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _atm = build;
        build.getClass();
        return build;
    }
}
