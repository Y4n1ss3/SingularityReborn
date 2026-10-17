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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PropaneTankKt {
    private static ImageVector _propaneTank;

    public static final ImageVector getPropaneTank(Icons.Outlined outlined) {
        ImageVector imageVector = _propaneTank;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PropaneTank", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(17.0f, 6.14f, 4.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(9.0f);
        d.curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f);
        d.verticalLineToRelative(2.14f);
        d.curveToRelative(-1.72f, 0.45f, -3.0f, 2.0f, -3.0f, 3.86f);
        d.verticalLineToRelative(8.0f);
        d.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        d.horizontalLineToRelative(8.0f);
        d.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        d.verticalLineToRelative(-8.0f);
        d.curveTo(20.0f, 8.14f, 18.72f, 6.59f, 17.0f, 6.14f);
        r6.B(d, 9.0f, 4.0f, 6.0f, 2.0f);
        d.horizontalLineToRelative(-2.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        bv.s(d, 9.0f, 4.0f, 8.0f, 8.0f);
        d.horizontalLineToRelative(8.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        r6.s(d, 3.0f, 6.0f, -3.0f);
        d.curveTo(6.0f, 8.9f, 6.9f, 8.0f, 8.0f, 8.0f);
        r6.g(d, 16.0f, 20.0f, 8.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        kf0.z(d, -3.0f, 12.0f, 3.0f);
        d.curveTo(18.0f, 19.1f, 17.1f, 20.0f, 16.0f, 20.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _propaneTank = build;
        build.getClass();
        return build;
    }
}
