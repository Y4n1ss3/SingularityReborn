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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Filter8Kt {
    private static ImageVector _filter8;

    public static final ImageVector getFilter8(Icons.Outlined outlined) {
        ImageVector imageVector = _filter8;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Filter8", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(3.0f, 5.0f, 1.0f, 5.0f, 16.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(s, 16.0f, -2.0f, 3.0f, 21.0f);
        uo.l(s, 3.0f, 5.0f, 21.0f, 1.0f);
        s.lineTo(7.0f, 1.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.verticalLineToRelative(14.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(23.0f, 3.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(s, 21.0f, 17.0f, 7.0f, 17.0f);
        r6.m(s, 7.0f, 3.0f, 14.0f, 14.0f);
        s.moveTo(13.0f, 15.0f);
        s.horizontalLineToRelative(2.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        s.verticalLineToRelative(-1.5f);
        s.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        s.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        s.lineTo(17.0f, 7.0f);
        s.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.horizontalLineToRelative(-2.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        s.verticalLineToRelative(1.5f);
        s.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        s.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        s.lineTo(11.0f, 13.0f);
        s.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        r6.B(s, 13.0f, 7.0f, 2.0f, 2.0f);
        gy.n(s, -2.0f, 13.0f, 7.0f);
        k4.C(s, 13.0f, 11.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(s, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filter8 = build;
        build.getClass();
        return build;
    }
}
