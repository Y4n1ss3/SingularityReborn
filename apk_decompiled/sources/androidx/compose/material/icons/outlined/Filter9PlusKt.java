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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Filter9PlusKt {
    private static ImageVector _filter9Plus;

    public static final ImageVector getFilter9Plus(Icons.Outlined outlined) {
        ImageVector imageVector = _filter9Plus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Filter9Plus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(3.0f, 5.0f, 1.0f, 5.0f, 16.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(s, 16.0f, -2.0f, 3.0f, 21.0f);
        uo.l(s, 3.0f, 5.0f, 14.0f, 12.0f);
        s.lineTo(14.0f, 8.0f);
        s.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.horizontalLineToRelative(-1.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        s.verticalLineToRelative(1.0f);
        s.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(s, 1.0f, 1.0f, 9.0f, 12.0f);
        s.verticalLineToRelative(2.0f);
        s.horizontalLineToRelative(3.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        k4.r(s, 11.0f, 9.0f, 11.0f, 8.0f);
        j50.n(s, 1.0f, 1.0f, -1.0f);
        s.moveTo(21.0f, 1.0f);
        s.lineTo(7.0f, 1.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.verticalLineToRelative(14.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(23.0f, 3.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.l(s, 21.0f, 9.0f, -2.0f);
        fc.w(s, 19.0f, 7.0f, -2.0f, 2.0f);
        af0.v(s, -2.0f, 2.0f, 2.0f, 2.0f);
        af0.v(s, 2.0f, -2.0f, 2.0f, 6.0f);
        s.lineTo(7.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(s, 7.0f, 3.0f, 14.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filter9Plus = build;
        build.getClass();
        return build;
    }
}
