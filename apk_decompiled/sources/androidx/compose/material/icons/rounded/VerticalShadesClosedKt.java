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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerticalShadesClosedKt {
    private static ImageVector _verticalShadesClosed;

    public static final ImageVector getVerticalShadesClosed(Icons.Rounded rounded) {
        ImageVector imageVector = _verticalShadesClosed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VerticalShadesClosed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 19.0f, 5.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(6.0f);
        d.curveTo(4.9f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.horizontalLineTo(3.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kp0.r(d, 20.0f, 13.0f, 5.0f, 1.5f);
        gy.s(d, 14.0f, 13.0f, 5.0f);
        uo.p(d, 11.0f, 19.0f, 9.5f, 5.0f);
        bv.s(d, 11.0f, 19.0f, 6.0f, 5.0f);
        gy.t(d, 1.5f, 14.0f, 6.0f, 5.0f);
        kp0.C(d, 16.5f, 19.0f, 5.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(d, 14.0f, 16.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verticalShadesClosed = build;
        build.getClass();
        return build;
    }
}
