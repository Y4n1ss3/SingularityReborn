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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NfcKt {
    private static ImageVector _nfc;

    public static final ImageVector getNfc(Icons.Sharp sharp) {
        ImageVector imageVector = _nfc;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Nfc", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(22.0f, 2.0f, 2.0f, 2.0f, 20.0f);
        gy.n(s, 20.0f, 22.0f, 2.0f);
        s.moveTo(20.0f, 20.0f);
        s.lineTo(4.0f, 20.0f);
        r6.m(s, 4.0f, 4.0f, 16.0f, 16.0f);
        k4.C(s, 18.0f, 6.0f, -7.0f, 4.28f);
        s.curveToRelative(-0.6f, 0.35f, -1.0f, 0.98f, -1.0f, 1.72f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        s.curveToRelative(0.0f, -0.74f, -0.4f, -1.38f, -1.0f, -1.72f);
        fc.w(s, 13.0f, 8.0f, 3.0f, 8.0f);
        s.lineTo(8.0f, 16.0f);
        s.lineTo(8.0f, 8.0f);
        s.horizontalLineToRelative(2.0f);
        s.lineTo(10.0f, 6.0f);
        af0.m(s, 6.0f, 6.0f, 12.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(s, 18.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nfc = build;
        build.getClass();
        return build;
    }
}
