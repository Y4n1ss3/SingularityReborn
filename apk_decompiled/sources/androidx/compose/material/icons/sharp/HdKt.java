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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdKt {
    private static ImageVector _hd;

    public static final ImageVector getHd(Icons.Sharp sharp) {
        ImageVector imageVector = _hd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Hd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.0f, 3.0f, 3.0f, 3.0f, 18.0f);
        gy.n(s, 18.0f, 21.0f, 3.0f);
        s.moveTo(11.0f, 15.0f);
        af0.m(s, 9.5f, 15.0f, -2.0f, -2.0f);
        s.verticalLineToRelative(2.0f);
        s.lineTo(6.0f, 15.0f);
        fc.w(s, 6.0f, 9.0f, 1.5f, 2.5f);
        s.horizontalLineToRelative(2.0f);
        s.lineTo(9.5f, 9.0f);
        bv.r(s, 11.0f, 9.0f, 6.0f);
        s.moveTo(13.0f, 9.0f);
        s.horizontalLineToRelative(4.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        s.verticalLineToRelative(4.0f);
        s.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        gy.n(s, -4.0f, 13.0f, 9.0f);
        k4.C(s, 14.5f, 13.5f, 2.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(s, -2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hd = build;
        build.getClass();
        return build;
    }
}
