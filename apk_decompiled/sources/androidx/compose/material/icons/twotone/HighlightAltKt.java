package androidx.compose.material.icons.twotone;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HighlightAltKt {
    private static ImageVector _highlightAlt;

    public static final ImageVector getHighlightAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _highlightAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HighlightAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(17.0f, 5.0f, -2.0f, 3.0f, 2.0f);
        kf0.D(n, 5.0f, 15.0f, 15.0f, 6.0f);
        n.lineToRelative(2.29f, -2.29f);
        n.lineTo(19.59f, 21.0f);
        n.lineTo(21.0f, 19.59f);
        n.lineToRelative(-2.29f, -2.29f);
        kf0.h(n, 21.0f, 15.0f, 15.0f);
        j50.y(n, 19.0f, 9.0f, 2.0f, 7.0f);
        uo.r(n, -2.0f, 9.0f, 19.0f, 13.0f);
        bv.l(n, 2.0f, -2.0f, -2.0f, 13.0f);
        k4.C(n, 11.0f, 21.0f, 2.0f, -2.0f);
        uo.r(n, -2.0f, 21.0f, 7.0f, 5.0f);
        kf0.i(n, 2.0f, 3.0f, 7.0f, 5.0f);
        k4.C(n, 3.0f, 17.0f, 2.0f, -2.0f);
        bv.s(n, 3.0f, 17.0f, 5.0f, 21.0f);
        n.verticalLineToRelative(-2.0f);
        n.horizontalLineTo(3.0f);
        n.curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f);
        uo.C(n, 19.0f, 3.0f, 2.0f, 2.0f);
        n.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        af0.r(n, 11.0f, 5.0f, 2.0f, 3.0f);
        uo.r(n, -2.0f, 5.0f, 3.0f, 9.0f);
        kf0.i(n, 2.0f, 7.0f, 3.0f, 9.0f);
        k4.C(n, 7.0f, 21.0f, 2.0f, -2.0f);
        bv.s(n, 7.0f, 21.0f, 3.0f, 13.0f);
        gy.t(n, 2.0f, -2.0f, 3.0f, 13.0f);
        j50.y(n, 3.0f, 5.0f, 2.0f, 3.0f);
        n.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlightAlt = build;
        build.getClass();
        return build;
    }
}
