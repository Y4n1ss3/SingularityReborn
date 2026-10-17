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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AbcKt {
    private static ImageVector _abc;

    public static final ImageVector getAbc(Icons.Outlined outlined) {
        ImageVector imageVector = _abc;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Abc", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(21.0f, 11.0f, -1.5f, -0.5f, -2.0f);
        bv.B(n, 3.0f, 2.0f, 13.0f, 21.0f);
        n.verticalLineToRelative(1.0f);
        n.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        n.horizontalLineToRelative(-3.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        n.verticalLineToRelative(-4.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineToRelative(3.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        kf0.D(n, 11.0f, 8.0f, 10.0f, 5.0f);
        af0.g(n, 6.5f, -1.5f, -2.0f, 15.0f);
        n.horizontalLineTo(3.0f);
        n.verticalLineToRelative(-5.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineToRelative(3.0f);
        n.curveTo(7.55f, 9.0f, 8.0f, 9.45f, 8.0f, 10.0f);
        af0.r(n, 6.5f, 10.5f, -2.0f, 12.0f);
        uo.r(n, 2.0f, 10.5f, 13.5f, 12.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.verticalLineToRelative(1.0f);
        n.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        af0.f(n, -4.0f, 9.0f, 4.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.verticalLineToRelative(1.0f);
        n.curveTo(14.5f, 11.55f, 14.05f, 12.0f, 13.5f, 12.0f);
        uo.C(n, 11.0f, 10.5f, 0.75f, 2.0f);
        bv.z(n, 10.5f, 11.0f, 13.0f, 12.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(n, -2.0f, 0.75f, 2.0f, 12.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _abc = build;
        build.getClass();
        return build;
    }
}
