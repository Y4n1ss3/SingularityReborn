package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DomainAddKt {
    private static ImageVector _domainAdd;

    public static final ImageVector getDomainAdd(Icons.Rounded rounded) {
        ImageVector imageVector = _domainAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DomainAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(6.0f, 19.0f, 4.0f, -2.0f, 2.0f);
        k4.B(i, 19.0f, 6.0f, 15.0f, 4.0f);
        k4.p(i, -2.0f, 2.0f, 15.0f);
        uo.p(i, 6.0f, 11.0f, 4.0f, 9.0f);
        uo.r(i, 2.0f, 11.0f, 6.0f, 7.0f);
        uo.o(i, 4.0f, 5.0f, 2.0f, 7.0f);
        k4.A(i, 10.0f, 19.0f, 8.0f, -2.0f);
        uo.r(i, 2.0f, 19.0f, 10.0f, 15.0f);
        bv.h(i, 8.0f, -2.0f, 2.0f, 15.0f);
        uo.p(i, 10.0f, 11.0f, 8.0f, 9.0f);
        uo.r(i, 2.0f, 11.0f, 10.0f, 7.0f);
        uo.o(i, 8.0f, 5.0f, 2.0f, 7.0f);
        k4.C(i, 16.0f, 19.0f, -4.0f, -2.0f);
        af0.v(i, 2.0f, -2.0f, -2.0f, -2.0f);
        af0.w(i, 2.0f, -2.0f, -2.0f, 9.0f);
        af0.w(i, 8.0f, 6.0f, 2.0f, 8.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-9.0f);
        i.verticalLineTo(4.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineTo(3.0f);
        i.curveTo(2.45f, 3.0f, 2.0f, 3.45f, 2.0f, 4.0f);
        i.verticalLineToRelative(16.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uo.r(i, 13.0f, 19.0f, 18.0f, 11.0f);
        bv.l(i, -2.0f, 2.0f, 2.0f, 11.0f);
        k4.C(i, 18.0f, 15.0f, -2.0f, 2.0f);
        uo.r(i, 2.0f, 15.0f, 24.0f, 20.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.horizontalLineToRelative(-1.0f);
        i.verticalLineToRelative(1.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        i.verticalLineToRelative(-1.0f);
        i.horizontalLineToRelative(-1.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(1.0f);
        i.verticalLineToRelative(-1.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(1.0f);
        i.horizontalLineToRelative(1.0f);
        i.curveTo(23.55f, 19.0f, 24.0f, 19.45f, 24.0f, 20.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _domainAdd = build;
        build.getClass();
        return build;
    }
}
